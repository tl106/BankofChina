
// Tests checked and modified by Yixin Shen 2020/5/1
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoCTransactionTest {

	BoCTransaction BT1;
	BoCTransaction BT2;

	@BeforeEach
	public void setup() {
		// BT1 is the instantiation of BoCTrancation by using no parameter constructor.
		BT1 = new BoCTransaction();
		BigDecimal value = new BigDecimal("10.2");
		// BT2 is the instantiation of BoCTrancation by using constructor with 3
		// parameters.
		BT2 = new BoCTransaction("buy fruit", value, 3);

	}

	// Start of tests written by Gaole Dai 2020/4/30
	@Test
	// Test the default construction with no parameters.
	void TestDefaultBoCTransaction() {
		// Test if no variables are passed, whether the category is 0, which means
		// unknown.
		assertEquals(0, BT1.transactionCategory());

		// Test whether the name of the transaction is "[Pending Transaction]".
		assertEquals("[Pending Transaction]", BT1.transactionName());

		// Test whether the value and Time of the transaction is Null, which means
		// empty.
		assertEquals(new BigDecimal("0.00"), BT1.transactionValue());
		assertNull(BT1.transactionTime());

	}

	@Test
	// Modified by Gaole Dai 2020/5/3
	// Change @Ignore to @Test
	// Add an object called BT3 and compare the current time with
	// BT4.transactionTime()
	// to reduce the time lag.
	void TestMainBoCTransaction() {

		// Test if the name, value and time of the transaction is successfully assigned.
		BigDecimal testBD = new BigDecimal("10.2");
		assertEquals("buy fruit", BT2.transactionName());
		assertEquals(testBD, BT2.transactionValue());
		assertEquals(3, BT2.transactionCategory());
		BigDecimal BD = new BigDecimal("11.2");
		BoCTransaction BT3 = new BoCTransaction("buy dress", BD, 5);
		Date date = new Date();
		assertEquals(date, BT3.transactionTime());

	}

	@Test
	// Test the get method for transaction name.
	void TesttransactionName() {
		assertEquals("buy fruit", BT2.transactionName());
	}

	@Test
	// Test the get method for transaction value.
	void TesttransactionValue() {
		BigDecimal testBD = new BigDecimal("10.2");
		assertEquals(testBD, BT2.transactionValue());
	}

	@Test
	// Test the get method for transaction category.
	void TesttransactionCategory() {
		assertEquals(3, BT2.transactionCategory());
	}

	// Modified by Gaole Dai 2020/5/3
	// Change @Ignore to @Test
	// Add an object called BT4 and compare the current time with
	// BT4.transactionTime()
	// to reduce the time lag.
	@Test
	void TesttransactionTime() {
		BigDecimal BD = new BigDecimal("12.3");
		BoCTransaction BT4 = new BoCTransaction("Buy latte", BD, 3);

		Date date = new Date();
		assertEquals(date, BT4.transactionTime());
	}
	// End of tests written by Gaole Dai 2020/4/30

	// Start of tests written by Ting Lou 2020/4/30
	// test for setTransactionName()

	@Test
	void TestsetTransactionName() {

		// test whether the name have been successfully modified
		BT1.setTransactionName("buy apple");
		assertEquals("buy apple", BT1.transactionName());
	}

	@Test
	void TestsetTransactionNameForManyTimes() {
		// test whether we can set the transactionName for many times
		BT2.setTransactionName("buy apple");
		assertNotEquals("buy apple", BT2.transactionName());
	}

	@Test
	void TestsetTransactionNameForLongString() {
		// test for whether the function will reject when the user input a string which
		// is longer than 25 chars
		BT1.setTransactionName("buy apple buy banana buy orange buy watermelon");
		assertEquals("buy apple buy banana buy ", BT1.transactionName());
	}

	// test for setTransactionValue()
	@Test
	void TestsetTransactionValue() {
		// check whether the value of the transaction have been successfully modified
		BT1.setTransactionValue(new BigDecimal("10"));
		assertEquals(new BigDecimal("10"), BT1.transactionValue());

	}

	@Test
	void TestSetTransactionValueForManyTimes() {
		// check whether the function will reject when the user modified it more than
		// once
		BT2.setTransactionValue(new BigDecimal("10"));
		assertNotEquals(new BigDecimal("10"), BT2.transactionValue());

	}

	@Test
	void TestsetTransactionValueSmallerThanZero() {
		// check whether the function will reject when user input a value which is
		// smaller than 0
		BT1.setTransactionValue(new BigDecimal("-1"));
		assertNotEquals(new BigDecimal("-1"), BT1.transactionValue());
	}

	// test for setTransactionCategory()
	@Test
	void TestsetTransactionCategory() {
		// check whether the value of the category have been successfully modified
		BT1.setTransactionCategory(1);
		assertEquals(1, BT1.transactionCategory());
	}

	@Test
	void TestsetTransactionCategorySmallerThanZero() {
		// check whether the function do not modified the value of category when the
		// parameter is smaller than 0
		BT1.setTransactionCategory(-1);
		assertNotEquals(-1, BT1.transactionCategory());
	}

	// test for setTransactionTime()
	@Test
	void TestsetTransactionTime() {
		// test whether the time will change(time should not change for the transaction
		// which created by constructor with 3 argument
		BoCTransaction BT5 = new BoCTransaction("Buy latte", new BigDecimal("0"), 3);
		Date time = new Date(0);
		BT5.setTransactionTime(time);
		assertNotEquals(time, BT5.transactionTime());
	}

	// test for toString()
	@Test
	void TesttoString() {
		assertEquals("buy fruit - ¥10.20", BT2.toString());
	}
}

// End of tests written by Ting Lou 2020/4/30