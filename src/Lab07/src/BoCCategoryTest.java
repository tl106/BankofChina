// Tests checked and modified by Linglong Hu 2020/5/2
// Tests checked and modified by Yixin Shen 2020/5/1
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BoCCategoryTest {
	private static BigDecimal input1;
	private static BigDecimal input2;
	private static BigDecimal input3;
	private static BigDecimal input4;
	private static BigDecimal input5;
	private static String title1;
	private static String title2;
	private static String title3;
	private static String name1;
	private static String name2;
	BoCCategory test = new BoCCategory();
	
	@BeforeAll
	static void setup() {
		input1 = new BigDecimal("-20.74");
		input2 = new BigDecimal("12.41");
		input3 = new BigDecimal("4.76");
		input4 = new BigDecimal("0.00");
		input5 = new BigDecimal("30.18");
		title1 = "Food";
		title2 = "Foodeatinafternoon";
		title3 = "";
		name1 = "Clothes";
		name2 = "Clothesbuyinmall";
	}
	
	// Start of tests written by Linglong Hu 2020/4/30
	@Test
	void TestDefaultCon () {
		assertEquals("New Category", test.CategoryName());
	    assertEquals(new BigDecimal("0.00"), test.CategoryBudget());
	    assertEquals(new BigDecimal("0.00"), test.CategorySpend());
	}
	// 1.test if it creates a unique name
	// 2.test if it sets budget and spend to 0
	
	@Test
	void TestMainCon () {
		    BoCCategory MainCon = new BoCCategory(title1);
			assertEquals(title1, MainCon.CategoryName());	
	}
	// test if it sets the title to the value passed when called
	
	@Test
	void TestMainConnamelength () {
		BoCCategory MainCon = new BoCCategory(title2);
		assertTrue("Title can't more than 15 char!", MainCon.CategoryName().length() <= 15);
	}
	// test if title length is > 15
	
	@Test
	void TestMainConname () {
		BoCCategory MainCon = new BoCCategory(title3);
		assertEquals("New Category", MainCon.CategoryName());
	}
	// test if title is null
	
	@Test
	void Testgetname() {
		assertEquals("New Category", test.CategoryName());	
	} 
	// test if it returns the category name
	
	@Test
	void Testgetbudget() {
		assertEquals(new BigDecimal("0.00"), test.CategoryBudget());
	}
	// test if it returns a BigDecimal of the category's budget
	
	@Test
	void Testgetspend() {
		assertEquals(new BigDecimal("0.00"), test.CategorySpend());
	}
	// test if it returns a BigDecimal of the category's current spend total
	
	@Test
	void Testsetname() {
			test.setCategoryName(name1);
			assertEquals(name1, test.CategoryName());
	}
	// test if it successfully set the category name
	
	@Test
	void Testsetnamelength() {
		test.setCategoryName(name2);
		assertTrue("Name can't more than 15 char!", test.CategoryName().length() <= 15);
	}
	// test if the name is > 15
	// End of tests written by Linglong Hu 2020/4/30
	
	
	
	// Start of tests written by Yanbing Luo 2020/4/30
	@Test
	// test the condition when the budget user want to set is larger than 0
	void TestGTZeroSetCategoryBudget() {
		test.setCategoryBudget(input5);
		assertEquals(input5, test.CategoryBudget());
	}
	
	@Test
	// test the condition when the budget user want to set is less or equal than 0
	void TestLEZeroSetCategoryBudget() {
		test.setCategoryBudget(input1);
		assertEquals(input4, test.CategoryBudget());
	}
	
	@Test
	// test the AddExpense function when some expense added 
	void TestAddExpense() {
		test.addExpense(input2);
		assertEquals(input2, test.CategorySpend());
	}
	
	@Test
	// test the RemoveExpense function when some expense removed
	void TestRemoveExpense() {
		test.addExpense(input2);
		test.removeExpense(input3);
		assertEquals(input2.subtract(input3), test.CategorySpend());
	}
	
	@Test
	// test the ResetBudgetSpend function when user reset the budget of one category
	void TestResetBudgetSpend() {
		test.resetBudgetSpend();
		assertEquals(input4, test.CategorySpend());
	}
	
	@Test
	// test the GetRemainingBudget function weather it can calculate the remaining budget
	void TestGetRemainingBudget() {
		test.setCategoryBudget(input5);
		test.addExpense(input2);
		assertEquals(input5.subtract(input2), test.getRemainingBudget());
	}
	
	@Test
	// test the condition when the remaining budget is larger than 0
	void TestGTZeroToString() {
		test.setCategoryBudget(input5);
		test.addExpense(input2);
		assertEquals("[" + test.CategoryName() + "]" + "(Budget: ¥" + test.CategoryBudget().toPlainString() + ") - ¥" + test.CategorySpend().toPlainString()
		+ " (¥" + test.getRemainingBudget().toPlainString() + " Remaining)", test.toString());
	}
	
	@Test
	// test the condition when the remaining budget is less or equal than 0
	void TestLEZeroToString() {
		test.setCategoryBudget(input3);
		test.addExpense(input2);
		assertEquals("[" + test.CategoryName() + "]" + "(Budget: ¥" + test.CategoryBudget().toPlainString() + ") - ¥" + test.CategorySpend().toPlainString()
		+ " (¥" + new BigDecimal("0.00").subtract(test.getRemainingBudget()).toPlainString() + " Overspent)", test.toString());
	}
}
	// End of tests written by Yanbing Luo 2020/4/30