
// Source code checked by Yixin Shen 2020/5/1
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BoCCategory {
	private String CategoryName;
	private BigDecimal CategoryBudget;
	private BigDecimal CategorySpend;

	public BoCCategory() {
		CategoryName = "New Category";
		CategoryBudget = new BigDecimal("0.00");
		CategorySpend = new BigDecimal("0.00");
	}

	// Created by Linglong Hu, 2020/4/30
	// because the length of category title should be less than 15 char, if its
	// length is greater than 15,
	// the function should select the first fifteen char as title; if user do not
	// enter anything, the function
	// should set the category title as "New Category"; else, set the title name as
	// what have been inputed.
	public BoCCategory(String newTitle) {
		if (newTitle.length() > 15) {
			CategoryName = newTitle.substring(0, 14);
			CategoryBudget = new BigDecimal("0.00");
			CategorySpend = new BigDecimal("0.00");
		} else if (newTitle.length() == 0) {
			CategoryName = "New Category";
			CategoryBudget = new BigDecimal("0.00");
			CategorySpend = new BigDecimal("0.00");
		} else {
			CategoryName = newTitle;
			CategoryBudget = new BigDecimal("0.00");
			CategorySpend = new BigDecimal("0.00");
		}
	}

	public String CategoryName() {
		return CategoryName;
	}

	public BigDecimal CategoryBudget() {
		return CategoryBudget;
	}

	public BigDecimal CategorySpend() {
		return CategorySpend;
	}

	// Created by Yanbing Luo, 2020/4/30
	// because the length of category title should be less than 15 char, if its
	// length is greater than 15,
	// the function should select the first fifteen char as title; if user do not
	// enter anything, the function
	// should set the category title as "New Category"; else, set the title name as
	// what have been inputed.
	public void setCategoryName(String newName) {
		if (newName.length() > 15) {
			CategoryName = newName.substring(0, 14);
		} else {
			CategoryName = newName;
		}
	}

	public void setCategoryBudget(BigDecimal newValue) {
		// 1 means bigger, -1 means smaller, 0 means same
		if (newValue.compareTo(new BigDecimal("0.00")) == 1) {
			CategoryBudget = newValue;
		}
	}

	public void addExpense(BigDecimal valueToAdd) {
		CategorySpend = CategorySpend.add(valueToAdd);
	}

	public void removeExpense(BigDecimal valueToRemove) {
		CategorySpend = CategorySpend.subtract(valueToRemove);
	}

	public void resetBudgetSpend() {
		CategorySpend = new BigDecimal("0.00");
	}

	public BigDecimal getRemainingBudget() {
		BigDecimal remainingBudget = CategoryBudget.subtract(CategorySpend);
		return remainingBudget;
	}

	// Created by Yanbing Luo, 2020/4/30
	// because it should be printed out in the following format:
	// "[Category Name](Budget: ¥xx.xx) – ¥yy.yy (¥zz.zz Remaining)"
	// - or "¥zz.zz Overspent" if overspent rather than budget left.
	// - xx.xx is budget and yy.yy is total spend.
	// the wrong source code only can handle when spend is less than budget
	// and can not Determine if the spend is greater than the budget or not
	// Modified by Gaole Dai, 2020/5/5
	// Round up the BigDecimal value, keep two decimals.
	@Override
	public String toString() {
		if (getRemainingBudget().compareTo(new BigDecimal("0.00")) == 1) {
			return "[" + CategoryName + "]" + "(Budget: ¥"
					+ CategoryBudget.setScale(2, RoundingMode.HALF_UP).toPlainString() + ") - ¥"
					+ CategorySpend.setScale(2, RoundingMode.HALF_UP).toPlainString() + " (¥"
					+ getRemainingBudget().setScale(2, RoundingMode.HALF_UP).toPlainString() + " Remaining)";
		} else {
			return "[" + CategoryName + "]" + "(Budget: ¥"
					+ CategoryBudget.setScale(2, RoundingMode.HALF_UP).toPlainString() + ") - ¥"
					+ CategorySpend.setScale(2, RoundingMode.HALF_UP).toPlainString() + " (¥" + new BigDecimal("0.00")
							.subtract(getRemainingBudget()).setScale(2, RoundingMode.HALF_UP).toPlainString()
					+ " Overspent)";
		}

	}

	// Created by Ting Lou, Linglong Hu, 2020/5/01
	// because the assertEquals is to compare the address of two parameters
	// so it needs to override the assertEquals function to let it compare two real
	// parameters
	// instead of the addresses of them
	@Override
	public boolean equals(Object o) {
		if (o instanceof BoCCategory) {
			if (CategoryName.compareTo(((BoCCategory) o).CategoryName()) == 0
					&& CategoryBudget.compareTo(((BoCCategory) o).CategoryBudget()) == 0
					&& CategorySpend.compareTo(((BoCCategory) o).CategorySpend()) == 0) {
				return true;
			}
		}
		return false;
	}
}
