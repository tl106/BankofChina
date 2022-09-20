import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BoCApp {
	public static ArrayList<BoCTransaction> UserTransactions;
	public static ArrayList<BoCCategory> UserCategories;

	public static void main(String[] args) {
		UserCategories = new ArrayList<BoCCategory>();
		UserTransactions = new ArrayList<BoCTransaction>();

		// SETUP EXAMPLE DATA //
		UserCategories.add(new BoCCategory("Unknown"));
		BoCCategory BillsCategory = new BoCCategory("Bills");
		BillsCategory.setCategoryBudget(new BigDecimal("120.00"));
		UserCategories.add(BillsCategory);
		BoCCategory Groceries = new BoCCategory("Groceries");
		Groceries.setCategoryBudget(new BigDecimal("75.00"));
		UserCategories.add(Groceries);
		BoCCategory SocialSpending = new BoCCategory("Social");
		SocialSpending.setCategoryBudget(new BigDecimal("100.00"));
		UserCategories.add(SocialSpending);

		UserTransactions.add(new BoCTransaction("Rent", new BigDecimal("850.00"), 0));
		UserTransactions.add(new BoCTransaction("Phone Bill", new BigDecimal("37.99"), 1));
		UserTransactions.add(new BoCTransaction("Electricity Bill", new BigDecimal("75.00"), 1));
		UserTransactions.add(new BoCTransaction("Sainsbury's Checkout", new BigDecimal("23.76"), 2));
		UserTransactions.add(new BoCTransaction("Tesco's Checkout", new BigDecimal("7.24"), 2));
		UserTransactions.add(new BoCTransaction("RockCity Drinks", new BigDecimal("8.50"), 3));
		UserTransactions.add(new BoCTransaction("The Mooch", new BigDecimal("13.99"), 3));

		for (int x = 0; x < UserTransactions.size(); x++) {
			BoCTransaction temp = UserTransactions.get(x);
			int utCat = temp.transactionCategory();
			BoCCategory temp2 = UserCategories.get(utCat);
			temp2.addExpense(temp.transactionValue());
			UserCategories.set(utCat, temp2);
		}

		// Add by Gaole Dai, 2020/5/4.
		// Use a prompt to increase user friendliness.
		System.out.println("Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n");

		// MAIN FUNCTION LOOP

		CategoryOverview();
		System.out.println(
				"\nWhat do you want to do?\n T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it");
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String s = in.next();
			try {
				if (s.equals("T")) {
					ListTransactions();
				} else if (s.equals("O")) {
					CategoryOverview();
				} else if (s.equals("C")) {
					ChangeTransactionCategory(in);
				} else if (s.equals("N")) {
					AddCategory(in);
				} else if (s.equals("A")) {
					AddTransaction(in);
				} else if (s.equals("SC")) {
					ChangeCategory(in);
				} else if (s.equals("ST")) {
					ChangeTransaction(in);
				} else if (s.equals("X")) {
					// Modified by Gaole Dai, 2020/5/4.
					// Use a longer prompt to increase user friendliness.
					System.out.println("Goodbye! Thank you for using our App. Have a nice day:D");
					break;
				} else if (Integer.parseInt(s) != -1) {
					ListTransactionsForCategory(Integer.parseInt(s));
				} else {
					System.out.println("Command not recognised");
				}
			} catch (Exception e) {
				System.out.println("Something went wrong: " + e.toString() + "\n");
			}

			System.out.println(
					"\nWhat do you want to do?\n T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it");
		}
		in.close();
	}

	public static void ListTransactions() {
		for (int x = 0; x < UserTransactions.size(); x++) {
			BoCTransaction temp = UserTransactions.get(x);
			System.out.println((x + 1) + ") " + temp.toString());

		}
	}

	public static void CategoryOverview() {
		for (int x = 0; x < UserCategories.size(); x++) {
			BoCCategory temp = UserCategories.get(x);
			System.out.println((x + 1) + ") " + temp.toString());
		}

	}

	// Created by Yixin Shen, 2020/5/1
	// Modified by Yixin Shen, 2020/5/5
	// For users, the index start at 1; but for computers, it start at 0, in order
	// to unify, tID need to - 1.
	public static void ListTransactionsForCategory(int chosenCategory) throws Exception {
		int flag = 0;
		if (chosenCategory > UserCategories.size() || chosenCategory <= 0) {
			throw new IndexOutOfBoundsException("Index out of bounds!");
		}
		else {
			for (int x = 0; x < UserTransactions.size(); x++) {
				BoCTransaction temp = UserTransactions.get(x);
				if (temp.transactionCategory() == chosenCategory - 1) {
					System.out.println((x + 1) + ") " + temp.toString());
					flag = 1;
				}
			}
		}
		
		if (flag == 0) {
			System.out.println("No transactions for the given category.");
		}
	}

	private static void AddTransaction(Scanner in) {
		System.out.println("What is the title of the transaction?");
		in.nextLine(); // to remove read-in bug
		String title = in.nextLine();
		// Created by Ting Lou,2020/5/5
		// if user enter a transactionName which is longer than 25, just keep the first
		// 25 characters and alert user
		if (title.length() > 25) {
			System.out.println("The length of the name should be less than 25, so it will be cut within 15 charaters!");
			title = title.substring(0, 25);
		}
		System.out.println("What is the value of the transaction?");

		// Created by Ting Lou, 2020/5/3
		// In order to have a way to use the setTransactionName() and
		// setTransactionValue() function in BoCTransaction.java, we provide a way for
		// user to invoke the constructor with no argument(just input enter twice when
		// been asked), so that new transaction which added into arrayList with no name
		// and value can set its name and value by invoking changeTransactionName() and
		// changeTransactionValue() in main function
		String tvalue = in.nextLine();

		if (isNumeric(tvalue) || tvalue.compareTo("") == 0) {
			if (title.compareTo("") == 0 && tvalue.compareTo("") == 0) {
				UserTransactions.add(new BoCTransaction());
			} else {
				BigDecimal ivalue = new BigDecimal(tvalue);
				//  Created by Ting Lou, 2020/5/2
				//  if the value of the new transaction is not greater than 0, the transaction
				//  will not been added to the arrayList
				if (ivalue.compareTo(new BigDecimal("0")) == -1 || tvalue.compareTo("") == 0) {
					System.out.println("The value of the transaction should be greater than 0!");
					return;
				}
				UserTransactions.add(new BoCTransaction(title, ivalue, 0));
			}
		} else {
			throw new NumberFormatException("Please input a number.");
		}

		System.out.println("[Transaction added]");
	}

	// Created by Ting Lou, 2020/5/3
	// The function is used to set the name and value of the transaction which is
	// created by
	// using constructor with no argument, in addition, the transactionTime will be
	// also set
	private static void ChangeTransaction(Scanner in) throws Exception {
		System.out.println("Which transaction ID?");
		in.nextLine();
		if (in.hasNextInt()) {
			int tID = Integer.parseInt(in.nextLine()) - 1;
			if (tID >= UserTransactions.size()) {
				throw new IndexOutOfBoundsException("Index out of bounds!");
			}
			System.out.println("\t- " + UserTransactions.get(tID).toString());

			// add a judgement condition here, to alert user earlier if the transaction has
			// already been set
			if (UserTransactions.get(tID).isComplete()) {
				System.out.println("The transaction has already been set!");
				return;
			}

			System.out.println("What is the new name?");
			String tName = in.nextLine();
			// Created by Ting Lou,2020/5/5
			// if user enter a transactionName which is longer than 25, just keep the first
			// 25 characters and alert user
			if (tName.length() > 25) {
				System.out.println(
						"The length of the name should be less than 25, so it will be cut within 15 charaters!");
				tName = tName.substring(0, 25);
			}
			System.out.println("What is the new value?");
			if (in.hasNextBigDecimal()) {
				String tValue = in.nextLine();
				BoCTransaction temp = UserTransactions.get(tID);
				temp.setTransactionName(tName);
				temp.setTransactionValue(new BigDecimal(tValue));
				temp.setTransactionTime(new Date());
				UserTransactions.set(tID, temp);
			} else {
				in.nextLine();
				throw new NumberFormatException("Please input a number ");
			}

		} else {
			in.nextLine();
			throw new NumberFormatException("Please input a number ");
		}

	}

	private static void ChangeTransactionCategory(Scanner in) throws Exception {
		System.out.println("Which transaction ID?");
		in.nextLine();
		// Created by Yanbing Luo, 2020/5/1
		// For users, the index start at 1; but for computers, it start at 0, in order
		// to unify, tID need to - 1.
		if (in.hasNextInt()) {
			int tID = Integer.parseInt(in.nextLine()) - 1;
			if (tID >= UserTransactions.size()) {
				throw new IndexOutOfBoundsException("Index out of bounds!");
			} else {
				System.out.println("\t- " + UserTransactions.get(tID).toString());
				System.out.println("Which category will it move to?");
				CategoryOverview();
				// Created by Yanbing Luo, 2020/5/1
				// Same reason as above
				int newCat = Integer.parseInt(in.nextLine()) - 1;
				if (newCat >= UserCategories.size()) {
					throw new IndexOutOfBoundsException("Index out of bounds!");
				} else if (newCat == 0) {
					System.out.println("Cannot move to the first category whose name is Unknown!");
				} else {
					BoCTransaction temp = UserTransactions.get(tID);
					BoCCategory temp2 = UserCategories.get(temp.transactionCategory());
					temp2.removeExpense(temp.transactionValue());
					UserCategories.set(temp.transactionCategory(), temp2);
					temp.setTransactionCategory(newCat);
					UserTransactions.set(tID, temp);
					BoCCategory temp3 = UserCategories.get(newCat);
					temp3.addExpense(temp.transactionValue());
					UserCategories.set(newCat, temp3);
				}
			}
		} else {
			in.nextLine();
			throw new NumberFormatException("Please input an integer!");
		}

	}

	// Created by Linglong Hu, 2020/5/01
	// add the alert sentences to let the users know about abnormal input
	// if the title > 15 characters, it will be cut within 15 characters
	// else if title is null, it will be set "New Category"
	// if budget < 0, it will be set 0.00
	private static void AddCategory(Scanner in) {
		System.out.println("What is the title of the category?");
		in.nextLine(); // to remove read-in bug
		String title = in.nextLine();
		if (title.length() > 15) {
			System.out.println("[Your title can't be more than 15 characters, so it will be cut within 15 charaters!]");
		} else if (title.length() == 0) {
			System.out.println(
					"[Your title can't be null, so it will be automatically given a name called \"New Category\"]");
		}
		System.out.println("What is the budget for this category?");
		// Modified by Yixin Shen, 2020/5/05
		if (in.hasNextBigDecimal()) {
			BigDecimal cbudget = new BigDecimal(in.nextLine());
			if (cbudget.compareTo(new BigDecimal("0.00")) == -1) {
				System.out.println("[Your budget can't less than 0, so it will be set to 0.00]");
			}
			BoCCategory temp = new BoCCategory(title);
			temp.setCategoryBudget(cbudget);
			UserCategories.add(temp);
			System.out.println("[Category added]");
			CategoryOverview();
		} else {
			in.nextLine();
			throw new NumberFormatException("Please input a number!");
		}

	}

	// created by Yanbing Luo, 2020/5/3
	// add a function such that user can change the category name by using the
	// setCategoryName function in BoCCategory.java
	private static void ChangeCategory(Scanner in) throws Exception {
		System.out.println("Which category ID?");
		in.nextLine();
		if (in.hasNextInt()) {
			int tID = Integer.parseInt(in.nextLine()) - 1;
			if (tID >= UserCategories.size()) {
				throw new IndexOutOfBoundsException("Index out of bounds!");
			} else if (tID == 0) {
				System.out.println("The first category whose name is Unknown cannnot be changed category name!");
			} else {
				System.out.println("\t- " + UserCategories.get(tID).toString());
				System.out.println("What do you want to do?");
				System.out.println("N = Change [N]ame, B = Change [B]udget, A = Change [A]ll");
				String s = in.nextLine();
				try {
					if (s.equals("N")) {
						System.out.println("What is the new category name?");
						String newname = in.nextLine();
						BoCCategory temp = UserCategories.get(tID);
						temp.setCategoryName(newname);
						UserCategories.set(tID, temp);
					} else if (s.equals("B")) {
						System.out.println("What is the new category budget?");
						if (in.hasNextBigDecimal()) {
							BigDecimal newbudget = new BigDecimal(in.nextLine());
							BoCCategory temp = UserCategories.get(tID);
							temp.setCategoryBudget(newbudget);
							UserCategories.set(tID, temp);
						} else {
							in.nextLine();
							throw new NumberFormatException("Please input a number!");
						}
					} else if (s.equals("A")) {
						System.out.println("What is the new category name?");
						String newname = in.nextLine();
						System.out.println("What is the new category budget?");
						if (in.hasNextBigDecimal()) {
							BigDecimal newbudget = new BigDecimal(in.nextLine());
							BoCCategory temp = UserCategories.get(tID);
							temp.setCategoryName(newname);
							temp.setCategoryBudget(newbudget);
							UserCategories.set(tID, temp);
						} else {
							in.nextLine();
							throw new NumberFormatException("Please input a number!");
						}
					} else {
						System.out.println("Command not recognised");
					}
				} catch (Exception e) {
					System.out.println("Something went wrong: " + e.toString() + "\n");
				}
			}
		} else {
			in.nextLine();
			throw new NumberFormatException("Please input an integer!");
		}
	}

	public static boolean isNumeric(String str) {
		try {
			new BigDecimal(str);
			return true;
		} catch (NumberFormatException e) {

			return false;
		}
	}

}
