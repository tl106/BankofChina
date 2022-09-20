import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoCAppTest {
	// Comments written by Gaole Dai, 2020/05/01.
	// Instantiate class ByteArrayOutputStream by creating an object named
	// outContent.
	// outContent obtains the output which system prints to the console.
	private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	BoCApp BA;

	// Set up stream before all the tests.
	// So that everything that print to the console will be stored in outContent.
	@BeforeAll
	public static void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	// Instantiate class BoCApp by creating an object named BA.
	@BeforeEach
	public void setUp() {
		BA = new BoCApp();
	}

	// Clean up the stream after finishing all the tests.
	@AfterEach
	public void cleanUp() {
		outContent.reset();
	}

	// Reset the outContent each time after test.
	@AfterAll
	public static void cleanUpStreams() {
		System.setOut(null);
	}

	// Created by Gaole Dai, 2020/5/4.
	// Test first prompt.
	// Modified most of the other tests, add code to test this prompt.
	@Test
	void TestmainPrompt() {
		// Call the main function
		BoCApp.main(null);
		// Expected output stores in String variable output.
		String output = "Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n"
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator();
		// Compare the expected output with the actual output.
		assertEquals(output, outContent.toString());
	}

	// Created by Yanbing Luo, 2020/5/2
	// main function "O" option
	@Test
	void TestmainO() {
		String input = "O\nX";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		BoCApp.main(null);
		String output = "Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n"
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Goodbye! Thank you for using our App. Have a nice day:D"
				+ System.lineSeparator();
		assertEquals(output, outContent.toString());
	}

	// Created by Yanbing Luo, 2020/5/2
	// main function "C" option
	@Test
	void TestmainC() {
		String input = "C\n1\n2\nX";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		BoCApp.main(null);
		String output = "Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n"
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Which transaction ID?" + System.lineSeparator() + "	- Rent - ¥850.00"
				+ System.lineSeparator() + "Which category will it move to?" + System.lineSeparator()
				+ "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" + System.lineSeparator()
				+ "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" + System.lineSeparator()
				+ "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" + System.lineSeparator()
				+ "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" + System.lineSeparator() + "\n"
				+ "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Goodbye! Thank you for using our App. Have a nice day:D"
				+ System.lineSeparator();
		assertEquals(output, outContent.toString());
		assertEquals(BoCApp.UserTransactions.get(0), new BoCTransaction("Rent", new BigDecimal("850"), 1));
		BoCCategory temp = new BoCCategory("Unknown");
		assertEquals(temp, BoCApp.UserCategories.get(0));
		BoCCategory temp1 = new BoCCategory("Bills");
		temp1.setCategoryBudget(new BigDecimal("120"));
		temp1.addExpense(new BigDecimal("962.99"));
		assertEquals(temp1, BoCApp.UserCategories.get(1));
	}

	// created by Yanbing Luo, 2020/5/3
	// modified by Yanbing Luo, 2020/5/5
	// main function "SC" option
	@Test
	void TestmainSC() {
		String input = "SC\n2\nA\ntitle\n1000\nX";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		BoCApp.main(null);
		String output = "Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n" + ""
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n"
				+ " A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Which category ID?" + System.lineSeparator()
				+ "	- [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" + System.lineSeparator()
				+ "What do you want to do?" + System.lineSeparator()
				+ "N = Change [N]ame, B = Change [B]udget, A = Change [A]ll" + System.lineSeparator()
				+ "What is the new category name?" + System.lineSeparator() + "What is the new category budget?"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n"
				+ " A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Goodbye! Thank you for using our App. Have a nice day:D"
				+ System.lineSeparator() + "";
		assertEquals(output, outContent.toString());
		BoCCategory temp1 = new BoCCategory("title");
		temp1.setCategoryBudget(new BigDecimal("1000"));
		temp1.addExpense(new BigDecimal("112.99"));
		assertEquals(BoCApp.UserCategories.get(1), temp1);
	}

	// Created by Yanbing Luo, 2020/5/2
	// main function "N" option
	@Test
	void TestmainN() {
		String input = "N\nFood\n12\nX";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		BoCApp.main(null);
		String output = "Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n"
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "What is the title of the category?" + System.lineSeparator()
				+ "What is the budget for this category?" + System.lineSeparator() + "[Category added]"
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "5) [Food](Budget: ¥12.00) - ¥0.00 (¥12.00 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Goodbye! Thank you for using our App. Have a nice day:D"
				+ System.lineSeparator() + "";
		assertEquals(output, outContent.toString());
		BoCCategory BC = new BoCCategory("Food");
		BC.setCategoryBudget(new BigDecimal("12"));
		// test if the list exist the new category
		assertEquals(BoCApp.UserCategories.get(BoCApp.UserCategories.size() - 1), BC);
	}

	// Created by Yanbing Luo, 2020/5/2
	// main function [Num] option
	@Test
	void TestmainNum() {
		String input = "1\nX";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		BoCApp.main(null);
		String output = "Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n"
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "1) Rent - ¥850.00" + System.lineSeparator() + "\n"
				+ "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Goodbye! Thank you for using our App. Have a nice day:D"
				+ System.lineSeparator() + "";
		assertEquals(output, outContent.toString());
	}

	@Test
	// Created by Ting Lou, 2020/5/1
	// check the ListTransaction function can run successfully invoked by main
	// function
	public void TestmainT() {

		String input = "T\nX";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		BoCApp.main(null);
		String expected = "Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n"
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "1) Rent - ¥850.00" + System.lineSeparator() + "2) Phone Bill - ¥37.99"
				+ System.lineSeparator() + "3) Electricity Bill - ¥75.00" + System.lineSeparator()
				+ "4) Sainsbury's Checkout - ¥23.76" + System.lineSeparator() + "5) Tesco's Checkout - ¥7.24"
				+ System.lineSeparator() + "6) RockCity Drinks - ¥8.50" + System.lineSeparator()
				+ "7) The Mooch - ¥13.99" + System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Goodbye! Thank you for using our App. Have a nice day:D"
				+ System.lineSeparator() + "";
		assertEquals(expected, outContent.toString());
	}

	@Test
	// Created by Ting Lou, 2020/5/1
	// check the AddTransaction function can run successfully invoked by main
	// function
	public void TestmainA() {

		String input = "A\nbuy fruit\n2.5\nX";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		BoCApp.main(null);
		assertEquals(BoCApp.UserTransactions.get(BoCApp.UserTransactions.size() - 1),
				new BoCTransaction("buy fruit", new BigDecimal("2.5"), 0));
		String expected = "Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n"
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "What is the title of the transaction?" + System.lineSeparator()
				+ "What is the value of the transaction?" + System.lineSeparator() + "[Transaction added]"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Goodbye! Thank you for using our App. Have a nice day:D"
				+ System.lineSeparator() + "";
		assertEquals(expected, outContent.toString());
	}

	// Created by Yanbing Luo, 2020/5/2
	// main function if users enter any other abnormal option
	@Test
	void TestmainOther() {
		String input = "dqw\nX";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		BoCApp.main(null);
		String output = "Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n"
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator()
				+ "Something went wrong: java.lang.NumberFormatException: For input string: \"dqw\"\n" + ""
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Goodbye! Thank you for using our App. Have a nice day:D"
				+ System.lineSeparator() + "";
		assertEquals(output, outContent.toString());
	}

	// Created by Yanbing Luo, 2020/5/2
	// main function "C" option if transaction ID out of bound
	@Test
	void TestmainCtIDabNormal() {
		String input = "C\n100\nX";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		BoCApp.main(null);
		String output = "Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n"
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Which transaction ID?" + System.lineSeparator()
				+ "Something went wrong: java.lang.IndexOutOfBoundsException: Index out of bounds!" + "\n"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Goodbye! Thank you for using our App. Have a nice day:D"
				+ System.lineSeparator() + "";
		assertEquals(output, outContent.toString());
	}

	// Created by Yanbing Luo, 2020/5/2
	// main function "C" option if category ID out of bound
	@Test
	void TestmainCcIDabNormal() {
		String input = "C\n2\n100\nX";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		BoCApp.main(null);
		String output = "Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n"
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Which transaction ID?" + System.lineSeparator() + "	- Phone Bill - ¥37.99"
				+ System.lineSeparator() + "Which category will it move to?" + System.lineSeparator()
				+ "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" + System.lineSeparator()
				+ "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" + System.lineSeparator()
				+ "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" + System.lineSeparator()
				+ "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" + System.lineSeparator()
				+ "Something went wrong: java.lang.IndexOutOfBoundsException: Index out of bounds!" + "\n"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Goodbye! Thank you for using our App. Have a nice day:D"
				+ System.lineSeparator() + "";
		assertEquals(output, outContent.toString());
	}

	// Created by Yanbing Luo, 2020/5/2
	// main function if somewhere need to input a number but input a string
	@Test
	void TestmainInputNumabNormal() {
		String input = "N\nFood\nstring\nX";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		BoCApp.main(null);
		String output = "Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n"
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "What is the title of the category?" + System.lineSeparator()
				+ "What is the budget for this category?" + System.lineSeparator()
				+ "Something went wrong: java.lang.NumberFormatException: Please input a number!" + "\n"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Goodbye! Thank you for using our App. Have a nice day:D"
				+ System.lineSeparator() + "";
		assertEquals(output, outContent.toString());
	}

	@Test
	// Created by Ting Lou, 2020/5/1
	// check the AddTransaction function can run successfully invoked by main
	// function
	public void TestmainAll() {

		String input = "A\nbuy meat\n800\nT\nN\nfood\n3000\nO\nC\n8\n5\n5\nX";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		BoCApp.main(null);
		// test if the arrayList exist the new transacion
		assertEquals(BoCApp.UserTransactions.get(BoCApp.UserTransactions.size() - 1),
				new BoCTransaction("buy meat", new BigDecimal("800"), 4));

		BoCCategory BC = new BoCCategory("food");
		BC.setCategoryBudget(new BigDecimal("3000"));
		BC.addExpense(new BigDecimal("800"));
		// test if the list exist the new category
		assertEquals(BoCApp.UserCategories.get(BoCApp.UserCategories.size() - 1), BC);

		// test whether the ouput is correct
		String expected = "Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n"
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "What is the title of the transaction?" + System.lineSeparator()
				+ "What is the value of the transaction?" + System.lineSeparator() + "[Transaction added]"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "1) Rent - ¥850.00" + System.lineSeparator() + "2) Phone Bill - ¥37.99"
				+ System.lineSeparator() + "3) Electricity Bill - ¥75.00" + System.lineSeparator()
				+ "4) Sainsbury's Checkout - ¥23.76" + System.lineSeparator() + "5) Tesco's Checkout - ¥7.24"
				+ System.lineSeparator() + "6) RockCity Drinks - ¥8.50" + System.lineSeparator()
				+ "7) The Mooch - ¥13.99" + System.lineSeparator() + "8) buy meat - ¥800.00" + System.lineSeparator()
				+ "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "What is the title of the category?" + System.lineSeparator()
				+ "What is the budget for this category?" + System.lineSeparator() + "[Category added]"
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "5) [food](Budget: ¥3000.00) - ¥0.00 (¥3000.00 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "5) [food](Budget: ¥3000.00) - ¥0.00 (¥3000.00 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Which transaction ID?" + System.lineSeparator() + "	- buy meat - ¥800.00"
				+ System.lineSeparator() + "Which category will it move to?" + System.lineSeparator()
				+ "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" + System.lineSeparator()
				+ "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" + System.lineSeparator()
				+ "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" + System.lineSeparator()
				+ "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" + System.lineSeparator()
				+ "5) [food](Budget: ¥3000.00) - ¥0.00 (¥3000.00 Remaining)" + System.lineSeparator() + "\n"
				+ "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "8) buy meat - ¥800.00" + System.lineSeparator() + "\n"
				+ "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Goodbye! Thank you for using our App. Have a nice day:D"
				+ System.lineSeparator() + "";
		assertEquals(expected, outContent.toString());
	}

	// Test the the ListTransactions function with no parameters.
	@Test
	void TestListTransactions() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException {
		// Create an array list called UserTransactions.
		// Input some transactions into the array.
		BoCApp.UserTransactions = new ArrayList<BoCTransaction>();
		BoCApp.UserTransactions.add(new BoCTransaction("Mcdonald's Lunch", new BigDecimal("88.00"), 2));
		BoCApp.UserTransactions.add(new BoCTransaction("Costco Shopping", new BigDecimal("161.32"), 2));
		BoCApp.UserTransactions.add(new BoCTransaction("Electricity Bill", new BigDecimal("75.00"), 1));
		BoCApp.UserTransactions.add(new BoCTransaction("StarBucks' Caramel Macchiato", new BigDecimal("35.00"), 1));
		BoCApp.UserTransactions.add(new BoCTransaction("karaoke", new BigDecimal("58.86"), 3));
		BoCApp.UserTransactions.add(new BoCTransaction("Keyboard", new BigDecimal("300.56"), 2));
		BoCApp.UserTransactions.add(new BoCTransaction("JK dress", new BigDecimal("128.20"), 0));

		// Because ListTransactions is a private method,
		// So I need to use reflect method to call this method.
		Method m = BoCApp.class.getDeclaredMethod("ListTransactions");

		// Set the this method accessible.
		m.setAccessible(true);

		// Call the ListTransactions method.
		m.invoke(BA);

		// compareTransactions is the string that stores the expected output.
		String compareTransactions = "1) Mcdonald's Lunch - ¥88.00" + System.lineSeparator()
				+ "2) Costco Shopping - ¥161.32" + System.lineSeparator() + "3) Electricity Bill - ¥75.00"
				+ System.lineSeparator() + "4) StarBucks' Caramel Macchiato - ¥35.00" + System.lineSeparator()
				+ "5) karaoke - ¥58.86" + System.lineSeparator() + "6) Keyboard - ¥300.56" + System.lineSeparator()
				+ "7) JK dress - ¥128.20" + System.lineSeparator();

		// Compare the expected output with the actual output stored in the outContent.
		// Convert the Byte type of outContent to String.
		assertEquals(compareTransactions, outContent.toString());
	}

	// Test the the CategoryOverview function with no parameters.
	@Test
	public void TestCategoryOverview() throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		// Create an array list called UserCategories.
		// Input some categories into the array.
		BoCApp.UserCategories = new ArrayList<BoCCategory>();
		BoCApp.UserCategories.add(new BoCCategory("Unknown"));
		BoCCategory BillsCategory = new BoCCategory("Bills");
		BillsCategory.setCategoryBudget(new BigDecimal("120.00"));
		BoCApp.UserCategories.add(BillsCategory);
		BoCCategory Groceries = new BoCCategory("Groceries");
		Groceries.setCategoryBudget(new BigDecimal("75.00"));
		BoCApp.UserCategories.add(Groceries);
		BoCCategory SocialSpending = new BoCCategory("Social");
		SocialSpending.setCategoryBudget(new BigDecimal("100.00"));
		BoCApp.UserCategories.add(SocialSpending);

		// Because CategoryOverview is a private method,
		// So I need to use reflect method to call this method.
		Method m = BoCApp.class.getDeclaredMethod("CategoryOverview");

		// Set the this method accessible.
		m.setAccessible(true);

		// Call the ListTransactions method.
		m.invoke(BA);

		// compareCategories is the string that stores the expected output.
		String compareCategories = "1) [Unknown](Budget: ¥0.00) - ¥0.00 (¥0.00 Overspent)" + System.lineSeparator()
				+ "2) [Bills](Budget: ¥120.00) - ¥0.00 (¥120.00 Remaining)" + System.lineSeparator()
				+ "3) [Groceries](Budget: ¥75.00) - ¥0.00 (¥75.00 Remaining)" + System.lineSeparator()
				+ "4) [Social](Budget: ¥100.00) - ¥0.00 (¥100.00 Remaining)" + System.lineSeparator() + "";

		// Compare the expected output with the actual output stored in the outContent.
		// Convert the Byte type of outContent to String.
		assertEquals(compareCategories, outContent.toString());
	}
	// End tests and comments written by Gaole Dai, 2020/05/01.

	// Created by Yixin Shen, 2020/5/1
	// test the ListTransactionsForCategory function
	// create two arraylists, set a input number as category number, call the
	// ListTransactionsForCategory function,
	// compare the console output with the expected outcome.
	@Test
	public void TestListTransactionsForCategory() throws Exception{
		BoCApp.UserCategories = new ArrayList<BoCCategory>();
		BoCApp.UserTransactions = new ArrayList<BoCTransaction>();

		// SETUP EXAMPLE DATA //
		BoCApp.UserCategories.add(new BoCCategory("Unknown"));
		BoCCategory BillsCategory = new BoCCategory("Bills");
		BillsCategory.setCategoryBudget(new BigDecimal("120.00"));
		BoCApp.UserCategories.add(BillsCategory);
		BoCCategory Groceries = new BoCCategory("Groceries");
		Groceries.setCategoryBudget(new BigDecimal("75.00"));
		BoCApp.UserCategories.add(Groceries);
		BoCCategory SocialSpending = new BoCCategory("Social");
		SocialSpending.setCategoryBudget(new BigDecimal("100.00"));
		BoCApp.UserCategories.add(SocialSpending);

		BoCApp.UserTransactions.add(new BoCTransaction("Rent", new BigDecimal("850.00"), 2));
		BoCApp.UserTransactions.add(new BoCTransaction("Phone Bill", new BigDecimal("37.99"), 1));
		BoCApp.UserTransactions.add(new BoCTransaction("Electricity Bill", new BigDecimal("75.00"), 1));
		BoCApp.UserTransactions.add(new BoCTransaction("Sainsbury's Checkout", new BigDecimal("23.76"), 2));
		BoCApp.UserTransactions.add(new BoCTransaction("Tesco's Checkout", new BigDecimal("7.24"), 2));
		BoCApp.UserTransactions.add(new BoCTransaction("RockCity Drinks", new BigDecimal("8.50"), 3));
		BoCApp.UserTransactions.add(new BoCTransaction("The Mooch", new BigDecimal("13.99"), 3));

		int input = 2;
		BoCApp.ListTransactionsForCategory(input);
		assertEquals("2) Phone Bill - ¥37.99" + System.lineSeparator() + "3) Electricity Bill - ¥75.00"
				+ System.lineSeparator(), outContent.toString());
		outContent.reset();
		input = 1;
		BoCApp.ListTransactionsForCategory(input);
		assertEquals("No transactions for the given category." + System.lineSeparator(), outContent.toString());
	}

	// Create by Linglong Hu, 1st May, 2020.
	// Start tests written by Linglong Hu, 2020/05/01.
	// Test the the AddCategory function with Scanner input.
	@Test
	public void TestAddCategory() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException {

		// Create a list called UserCategories
		BoCApp.UserCategories = new ArrayList<BoCCategory>();
		// give an input with name and budget
		String input = "\nFood\n12";
		// So it's an expected output for testing.
		String output = "What is the title of the category?" + System.lineSeparator()
				+ "What is the budget for this category?" + System.lineSeparator() + "[Category added]"
				+ System.lineSeparator() + "1) [Food](Budget: ¥12.00) - ¥0.00 (¥12.00 Remaining)"
				+ System.lineSeparator() + "";
		// receive the input given by users in the console
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner scan = new Scanner(System.in);
		// to deal with private function
		Method m = BoCApp.class.getDeclaredMethod("AddCategory", Scanner.class);
		m.setAccessible(true);
		m.invoke(BA, scan);
		BoCCategory BC = new BoCCategory("Food");
		BC.setCategoryBudget(new BigDecimal("12"));
		// test if the list exist the new category
		assertEquals(BoCApp.UserCategories.get(BoCApp.UserCategories.size() - 1), BC);
		// test if the output in the console exist the new category
		assertEquals(output, outContent.toString());
	}
	// End tests and comments written by Linglong Hu, 2020/05/01.

	// Created by YanbingLuo, 2020/5/1
	// test the ChangeTransactionCategory function
	@Test
	public void TestChangeTransactionCategory() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		BoCApp.UserCategories = new ArrayList<BoCCategory>();
		BoCApp.UserTransactions = new ArrayList<BoCTransaction>();

		// SETUP EXAMPLE DATA //
		BoCApp.UserCategories.add(new BoCCategory("Unknown"));
		BoCCategory BillsCategory = new BoCCategory("Bills");
		BillsCategory.setCategoryBudget(new BigDecimal("120.00"));
		BoCApp.UserCategories.add(BillsCategory);
		BoCCategory Groceries = new BoCCategory("Groceries");
		Groceries.setCategoryBudget(new BigDecimal("75.00"));
		BoCApp.UserCategories.add(Groceries);
		BoCCategory SocialSpending = new BoCCategory("Social");
		SocialSpending.setCategoryBudget(new BigDecimal("100.00"));
		BoCApp.UserCategories.add(SocialSpending);

		BoCApp.UserTransactions.add(new BoCTransaction("Rent", new BigDecimal("850.00"), 0));
		BoCApp.UserTransactions.add(new BoCTransaction("Phone Bill", new BigDecimal("37.99"), 1));
		BoCApp.UserTransactions.add(new BoCTransaction("Electricity Bill", new BigDecimal("75.00"), 1));
		BoCApp.UserTransactions.add(new BoCTransaction("Sainsbury's Checkout", new BigDecimal("23.76"), 2));
		BoCApp.UserTransactions.add(new BoCTransaction("Tesco's Checkout", new BigDecimal("7.24"), 2));
		BoCApp.UserTransactions.add(new BoCTransaction("RockCity Drinks", new BigDecimal("8.50"), 3));
		BoCApp.UserTransactions.add(new BoCTransaction("The Mooch", new BigDecimal("13.99"), 3));

		for (int x = 0; x < BoCApp.UserTransactions.size(); x++) {
			BoCTransaction temp = BoCApp.UserTransactions.get(x);
			int utCat = temp.transactionCategory();
			BoCCategory temp2 = BoCApp.UserCategories.get(utCat);
			temp2.addExpense(temp.transactionValue());
			BoCApp.UserCategories.set(utCat, temp2);
		}

		Method change = BoCApp.class.getDeclaredMethod("ChangeTransactionCategory", Scanner.class);
		change.setAccessible(true);
		String input = "\n1\n2";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner scan = new Scanner(System.in);
		change.invoke(BA, scan);
		String output = "Which transaction ID?" + System.lineSeparator() + "	- Rent - ¥850.00"
				+ System.lineSeparator() + "Which category will it move to?" + System.lineSeparator()
				+ "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" + System.lineSeparator()
				+ "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" + System.lineSeparator()
				+ "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" + System.lineSeparator()
				+ "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" + System.lineSeparator() + "";
		assertEquals(output, outContent.toString());
		assertEquals(BoCApp.UserTransactions.get(0), new BoCTransaction("Rent", new BigDecimal("850"), 1));
		BoCCategory temp = new BoCCategory("Unknown");
		assertEquals(temp, BoCApp.UserCategories.get(0));
		BoCCategory temp1 = new BoCCategory("Bills");
		temp1.setCategoryBudget(new BigDecimal("120"));
		temp1.addExpense(new BigDecimal("962.99"));
		assertEquals(temp1, BoCApp.UserCategories.get(1));
	}

	@Test
	// Created by Ting Lou, 2020/5/1
	// test for AddTransaction, check whether the BoCTransaction has been added into
	// the arraylist. In addition, compare output with expected to check whether
	// they are the same
	public void TestAddTransaction() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		BoCApp.UserCategories = new ArrayList<BoCCategory>();
		BoCApp.UserTransactions = new ArrayList<BoCTransaction>();
		String input = "\nbuy fruit\n2.5";
		InputStream in = new ByteArrayInputStream(input.getBytes());

		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		Method m = BoCApp.class.getDeclaredMethod("AddTransaction", Scanner.class);
		m.setAccessible(true);
		m.invoke(BA, sc);

		assertEquals(BoCApp.UserTransactions.get(BoCApp.UserTransactions.size() - 1),
				new BoCTransaction("buy fruit", new BigDecimal("2.5"), 0));
		assertEquals("What is the title of the transaction?" + System.lineSeparator()
				+ "What is the value of the transaction?" + System.lineSeparator() + "[Transaction added]"
				+ System.lineSeparator(), outContent.toString());
	}

	@Test
	// Created by Ting Lou, 2020/5/1
	// It is required that when the value of the transaction is smaller than 0, it
	// should not be count as a normal "transaction", so these kind of bug should be
	// handled
	public void TestAddTransactionNegativeValue() throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		BoCApp.UserCategories = new ArrayList<BoCCategory>();
		BoCApp.UserTransactions = new ArrayList<BoCTransaction>();
		String input = "\nbuy bomb\n-100";
		InputStream in = new ByteArrayInputStream(input.getBytes());

		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		Method m = BoCApp.class.getDeclaredMethod("AddTransaction", Scanner.class);
		m.setAccessible(true);
		m.invoke(BA, sc);

		assertEquals(0, BoCApp.UserTransactions.size());
		assertEquals(
				"What is the title of the transaction?" + System.lineSeparator()
						+ "What is the value of the transaction?" + System.lineSeparator()
						+ "The value of the transaction should be greater than 0!" + System.lineSeparator() + "",
				outContent.toString());
	}

	// created by YanbingLuo, 2020/5/3
	// modified by Yanbing Luo, 2020/5/5
	// test ChangeCategoryName function
	@Test
	public void TestChangeCategory() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		BoCApp.UserCategories = new ArrayList<BoCCategory>();
		BoCApp.UserTransactions = new ArrayList<BoCTransaction>();

		// SETUP EXAMPLE DATA //
		BoCApp.UserCategories.add(new BoCCategory("Unknown"));
		BoCCategory BillsCategory = new BoCCategory("Bills");
		BillsCategory.setCategoryBudget(new BigDecimal("120.00"));
		BoCApp.UserCategories.add(BillsCategory);
		BoCCategory Groceries = new BoCCategory("Groceries");
		Groceries.setCategoryBudget(new BigDecimal("75.00"));
		BoCApp.UserCategories.add(Groceries);
		BoCCategory SocialSpending = new BoCCategory("Social");
		SocialSpending.setCategoryBudget(new BigDecimal("100.00"));
		BoCApp.UserCategories.add(SocialSpending);

		BoCApp.UserTransactions.add(new BoCTransaction("Rent", new BigDecimal("850.00"), 0));
		BoCApp.UserTransactions.add(new BoCTransaction("Phone Bill", new BigDecimal("37.99"), 1));
		BoCApp.UserTransactions.add(new BoCTransaction("Electricity Bill", new BigDecimal("75.00"), 1));
		BoCApp.UserTransactions.add(new BoCTransaction("Sainsbury's Checkout", new BigDecimal("23.76"), 2));
		BoCApp.UserTransactions.add(new BoCTransaction("Tesco's Checkout", new BigDecimal("7.24"), 2));
		BoCApp.UserTransactions.add(new BoCTransaction("RockCity Drinks", new BigDecimal("8.50"), 3));
		BoCApp.UserTransactions.add(new BoCTransaction("The Mooch", new BigDecimal("13.99"), 3));

		for (int x = 0; x < BoCApp.UserTransactions.size(); x++) {
			BoCTransaction temp = BoCApp.UserTransactions.get(x);
			int utCat = temp.transactionCategory();
			BoCCategory temp2 = BoCApp.UserCategories.get(utCat);
			temp2.addExpense(temp.transactionValue());
			BoCApp.UserCategories.set(utCat, temp2);
		}

		Method change = BoCApp.class.getDeclaredMethod("ChangeCategory", Scanner.class);
		change.setAccessible(true);
		String input = "\n2\nA\ntitle\n1000";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner scan = new Scanner(System.in);
		change.invoke(BA, scan);
		String output = "Which category ID?" + System.lineSeparator()
				+ "	- [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" + System.lineSeparator()
				+ "What do you want to do?" + System.lineSeparator()
				+ "N = Change [N]ame, B = Change [B]udget, A = Change [A]ll" + System.lineSeparator()
				+ "What is the new category name?" + System.lineSeparator() + "What is the new category budget?"
				+ System.lineSeparator() + "";
		assertEquals(output, outContent.toString());
		BoCCategory temp1 = new BoCCategory("title");
		temp1.setCategoryBudget(new BigDecimal("1000"));
		temp1.addExpense(new BigDecimal("112.99"));
		assertEquals(BoCApp.UserCategories.get(1), temp1);
	}

	@Test
	// Created by Ting lou,2020/5/3
	// test whether the function can set the name and value for the transaction
	// which was created by no argument constructor
	public void TestChangeTransaction() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// it is required to have a transaction which was created by no argument
		// constructor
		BoCApp.UserTransactions = new ArrayList<BoCTransaction>();
		BoCApp.UserTransactions.add(new BoCTransaction());
		String input = "\n1\nbuy fruit\n10";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		Method m = BoCApp.class.getDeclaredMethod("ChangeTransaction", Scanner.class);
		m.setAccessible(true);
		m.invoke(BA, sc);

		assertEquals(BoCApp.UserTransactions.get(BoCApp.UserTransactions.size() - 1),
				new BoCTransaction("buy fruit", new BigDecimal("10"), 0));
		String txt = "Which transaction ID?" + System.lineSeparator() + "	- [Pending Transaction] - ¥0.00"
				+ System.lineSeparator() + "What is the new name?" + System.lineSeparator() + "What is the new value?"
				+ System.lineSeparator() + "";
		assertEquals(txt, outContent.toString());

	}

	@Test
	// Created by Ting Lou,2020/5/3
	// test whether the function can invoke in main function
	public void TestmainST() {
		String input = "A\n\n\nST\n8\nbuy clothes\n100\nX";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		BoCApp.main(null);
		assertEquals(BoCApp.UserTransactions.get(BoCApp.UserTransactions.size() - 1),
				new BoCTransaction("buy clothes", new BigDecimal("100"), 0));
		String txt = "Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n"
				+ System.lineSeparator() + "1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)"
				+ System.lineSeparator() + "2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)"
				+ System.lineSeparator() + "3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)"
				+ System.lineSeparator() + "4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n"
				+ " A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "What is the title of the transaction?" + System.lineSeparator()
				+ "What is the value of the transaction?" + System.lineSeparator() + "[Transaction added]"
				+ System.lineSeparator() + "\n" + "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n"
				+ " A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Which transaction ID?" + System.lineSeparator()
				+ "	- [Pending Transaction] - ¥0.00" + System.lineSeparator() + "What is the new name?"
				+ System.lineSeparator() + "What is the new value?" + System.lineSeparator() + "\n"
				+ "What do you want to do?\n"
				+ " T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n"
				+ " A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"
				+ System.lineSeparator() + "Goodbye! Thank you for using our App. Have a nice day:D"
				+ System.lineSeparator() + "";
		assertEquals(txt, outContent.toString());
	}

}
