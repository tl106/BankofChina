import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class BoCTransaction {
	private String transactionName;
	private BigDecimal transactionValue;
	private int transactionCategory;
	private Date transactionTime;

	// Created by Ting Lou,2020/5/3
	// It is requested that transactionName and transactionValue can only be set
	// once, so the Boolean variable should been added, which is used to check
	// whether the name and value have already been set
	// false means the name and value haven't been set
	private Boolean haveSetName = false;
	private Boolean haveSetValue = false;

	public BoCTransaction() {
		// Modified
		transactionName = "[Pending Transaction]";
		transactionValue = new BigDecimal("0.00");
		transactionCategory = 0;
		transactionTime = null;
	}

	public BoCTransaction(String tName, BigDecimal tValue, int tCat) {
		transactionName = tName;
		transactionValue = tValue;
		transactionCategory = tCat;
		transactionTime = new Date();
		// Created by Ting Lou,2020/5/3
		// When using constructor with 3 arguments, the name and value are been set and
		// it should not been modified latter
		haveSetName = true;
		haveSetValue = true;

	}

	public String transactionName() {
		return transactionName;
	}

	public BigDecimal transactionValue() {
		return transactionValue;
	}

	public int transactionCategory() {
		return transactionCategory;
	}

	public Date transactionTime() {
		return transactionTime;
	}

	public void setTransactionName(String tName) {
		// the name should only be set once
		if (tName == null) {
			System.out.println("Please input the new name!");
		} else if (isComplete() == true) {
			System.out.println("The name and value have been already set!");
		} else if (tName.length() > 25) {
			System.out.println(
					"The length of the name should be less than 25, the name will be keep the first 25 characters.");
			transactionName = tName.substring(0, 25);
			haveSetName = true;
		} else {
			transactionName = tName;
			haveSetName = true;

		}
	}

	public void setTransactionValue(BigDecimal tValue) {

		// the value should only be set once
		if (tValue == null) {
			System.out.println("Please input the new value!");
		} else if (isComplete() == true) {

		} else if (tValue.compareTo(new BigDecimal("0")) == 1) {

			transactionValue = tValue;
			haveSetValue = true;
		}
	}

	public void setTransactionCategory(int tCat) {
		if (tCat > 0) {
			transactionCategory = tCat;
		}
	}

	public void setTransactionTime(Date tTime) {
		if (isComplete()) {
			return;
		}
		if (tTime != null) {
			transactionTime = tTime;
		}
	}

	// Created by Ting Lou,2020/5/3
	// The function is used to check whether the name and value of the transaction
	// have been set
	public Boolean isComplete() {
		if (haveSetName == true && haveSetValue == true) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		// Modified by Gaole Dai, 2020/5/5
		// Round up the BigDecimal value, keep two decimals.
		return transactionName + " - ¥" + transactionValue.setScale(2, RoundingMode.HALF_UP).toString();
	}

	// Created by YanbingLuo,Ting Lou, 2020/5/1
	// override the assertequals method about two objects in junit test.
	@Override
	public boolean equals(Object o) {
		if (o instanceof BoCTransaction) {
			if (transactionName.compareTo(((BoCTransaction) o).transactionName()) == 0
					&& transactionValue.compareTo(((BoCTransaction) o).transactionValue()) == 0
					&& transactionCategory == ((BoCTransaction) o).transactionCategory()) {
				return true;
			}
		}
		return false;
	}
}
