# Lab 07 Report

|Contents|
|--------|
|[Team Management](#team-management)|
|[Test Plan](#test-plan)|
|[Class: BoCCategory](#class-boccategory)|
|[Class: BoCTransaction](#class-boctransaction)|
|[Class: BoCApp](#class-bocapp)|


## Team Management
#### Used version control

- Set the default **master branch** as the **protected branch**.
- Everyone **creates own branch** and completes code development and modification in it.
- Whenever part of the work is completed, **create a issue and a merge request**, assign to someone. Gitlab will automatically **generate a feature branch**, request to **merge with the master branch**.
- One teammate is responsible for **checking the modified file and accepting all merge requests**. 
- Whenever all work is completed for a milestone/milestones, **tag a new version**.
  - Lab07_v1.0 
    
    - Tag at April 30th, 2020
    - Submit BoCCategoryTest.java and BoCTransactionTest.java
    - Update the lab report file
    - Submit Modified source code
  - Lab07_v1.1
  
    - Tag at May 2nd, 2020
    - Submit BoCAppTest.java
    - Modify BoCCategoryTest.java and BoCTransactionTest.java
    - Update the lab report file
    - Submit Modified source code
  - Lab07_v1.2
  
    - Tag at May 3rd, 2020
    - Add two functions to BoCApp.java and modify the main function
    - Modify BoCTransacationTest.java and BoCAppTest.java
    - Update the lab report file
  - Lab07_v1.3
  
    - Tag at May 5th, 2020
    - Modify the ListTransactionsForCategory function and its test
    - Modify the ChangeTransactionCategory function and its test
    - Update the lab report file
  - Lab07_Final
    - Tag at May 7th, 2020
    - Update the lab report file



#### Organised meeting

| Time                  | Mode    | Results of Discussion                                        |
| --------------------- | ------- | ------------------------------------------------------------ |
| 2020/4/23 14:00-16:00 | Online  | · Read and understand the questions together<br>· Make sure to do most of the work together after returning to school |
| 2020/4/29 11:00-12:00 | Offline | · Make the coursework timeline<br>· Roughly divided and assigned to individuals |
| 2020/4/29 19:00-21:00 | Offline | · Discuss details of test code<br>· Complete BoCTransactionTest.java and BoCCategoryTest.java in groups of two<br>· One teammate improve the lab report |
| 2020/4/30 14:00-18:00 | Offline | · Submit the BoCTransactionTest.java<br>· Submit the BoCCategoryTest.java<br>· Submit the modified source code<br>**· Merge with the master branch** |
| 2020/5/1 14:30-22:30  | Offline | · Complete the Junit test for all functions except the main function together<br>· Check the BoCTransactionTest.java and BoCCategoryTest.java<br>· Discuss some possible problems<br>**· Merge with the master branch** |
| 2020/5/2 14:30-20:00  | Offline | · Complete the Junit test for main function<br>· Discuss the problems encountered<br>· Submit the BoCAppTest.java<br>**· Merge with the master branch** |
| 2020/5/3 15:00-22:00  | Offline | · Add two functions in BoCApp.java<br>· Adjust the test code and lab report accordingly |
| 2020/5/4 19:30-22:30  | Online  | · Modify the SetTransaction function<br>· Add the budget change feature<br>**· Merge with the master branch** |
| 2020/5/5 12:30-16:00  | Offline | · Modify some functions in BoCApp.java<br>· Modify the tests of the functions which have been changed<br>**· Merge with the master branch** |



#### Milestones

| Index | Milestone Name                | Start Date   | Due Date     | Description                                                 |
| ----- | ----------------------------- | ------------ | ------------ | ----------------------------------------------------------- |
| M1    | Initial Task                  | Apr 23, 2020 | Apr 29, 2020 | Issues that have to create before coding                    |
| M2    | BoCCategory_Test              | Apr 29, 2020 | May 1, 2020  | Test code of BoCCategory.java and test plan                 |
| M3    | BoCTransaction_Test           | Apr 29, 2020 | May 1, 2020  | Test code of BoCTransaction.java and test plan              |
| M4    | BoCApp_Test                   | May 1, 2020  | May 2, 2020  | Test code of BoCApp.java and test plan                      |
| M5    | Improving and fixing the code | Apr 29, 2020 | May 3, 2020  | Modify the java source code                                 |
| M6    | Final Task                    | May 3, 2020  | May 6, 2020  | Discussion to perfect the coursework, tag the final version |



#### Divided Work

**Make everyone except one person a “Developer” instead of a “Maintainer”* 

| Index | Task                                                         | Recipient                | Dependencies |
| ----- | ------------------------------------------------------------ | ------------------------ | ------------ |
| T1    | Assign work and improve lab report                           | Yixin Shen               | /            |
| T2    | create issues, milestones, tags and accept teammates' merge request | Yixin Shen               | T1 (M1)      |
| T3    | Develop test code of BoCTransaction.java, complete the test plan | Gaole Dai, Ting Lou      | T2           |
| T4    | Develop test code of BoCCategory.java, complete the test plan | Linglong Hu, Yanbing Luo | T2           |
| T5    | Modify code in BoCTransaction.java and check its test code   | Gaole Dai, Yixin Shen    | T3 (M2)      |
| T6    | Modify code in BoCCategory.java and check its test code      | Yanbing Luo, Yixin Shen  | T4 (M3)      |
| T7    | Develop test code of BoCApp.java, complete the test plan     | ALL                      | T5, T6 (M4)  |
| T8    | Modify code in BoCApp.java and check its test code           | ALL                      | T7 (M5)      |
| T9    | Overall inspection, detail enhancement                       | ALL                      | T8 (M6)      |



#### Used labels

1. Open: issues that have been created.
2. To Do: issues that have to do now but have not been collected by anyone.
3. Doing: issues that have been collected by someone.
4. Merging: merge requests to someone.
5. Finished Merge: merge request that have been finished.
6. Closed: issues that have been finished.



#### Issues

| Index | Issues Name                                                  | Milestone                     | Assign to               |
| ----- | ------------------------------------------------------------ | ----------------------------- | ----------------------- |
| 1     | f2f discussion                                               | Initial Task                  | All                     |
| 2     | Java Project Creation                                        | Initial Task                  | Gaole Dai               |
| 3     | Complete cw timeline                                         | Initial Task                  | Yixin Shen              |
| 4     | Improve the markdown file                                    | Initial Task                  | Yixin Shen              |
| 5     | toString_Test                                                | BoCCategory_Test              | Yanbing Luo             |
| 6     | getRemainingBudget_Test                                      | BoCCategory_Test              | Yanbing Luo             |
| 7     | resetBudgetSpend_Test                                        | BoCCategory_Test              | Yanbing Luo             |
| 8     | removeExpense_Test                                           | BoCCategory_Test              | Yanbing Luo             |
| 9     | addExpense_Test                                              | BoCCategory_Test              | Yanbing Luo             |
| 10    | setCategoryBudget_Test                                       | BoCCategory_Test              | Yanbing Luo             |
| 11    | setCategoryName_Test                                         | BoCCategory_Test              | Linglong Hu             |
| 12    | CategorySpend_Test                                           | BoCCategory_Test              | Linglong Hu             |
| 13    | CategoryBudget_Test                                          | BoCCategory_Test              | Linglong Hu             |
| 14    | CategoryName_Test                                            | BoCCategory_Test              | Linglong Hu             |
| 15    | Default BoCCategory_Test                                     | BoCCategory_Test              | Linglong Hu             |
| 16    | Main BoCCategory_Test                                        | BoCCategory_Test              | Linglong Hu             |
| 17    | isComplete_Test                                              | BoCTransaction_Test           | Ting Lou                |
| 18    | toString_Test                                                | BoCTransaction_Test           | Ting Lou                |
| 19    | setTransactionTime_Test                                      | BoCTransaction_Test           | Ting Lou                |
| 20    | setTransactionCategory_Test                                  | BoCTransaction_Test           | Ting Lou                |
| 21    | setTransactionValue_Test                                     | BoCTransaction_Test           | Ting Lou                |
| 22    | setTransactionName_Test                                      | BoCTransaction_Test           | Ting Lou                |
| 23    | transactionTime_Test                                         | BoCTransaction_Test           | Gaole  Dai              |
| 24    | transactionCategory_Test                                     | BoCTransaction_Test           | Gaole  Dai              |
| 25    | transactionValue_Test                                        | BoCTransaction_Test           | Gaole  Dai              |
| 26    | transactionName_Test                                         | BoCTransaction_Test           | Gaole  Dai              |
| 27    | Main BoCTransaction_Test                                     | BoCTransaction_Test           | Gaole  Dai              |
| 28    | Default BoCTransaction_Test                                  | BoCTransaction_Test           | Gaole  Dai              |
| 29    | main_Test_part1                                              | BoCApp_Test                   | Ting Lou                |
| 30    | main_Test_part2                                              | BoCApp_Test                   | Yanbing Luo             |
| 31    | ListTransactionsForCategory_Test                             | BoCApp_Test                   | Gaole Dai               |
| 32    | CategoryOverview_Test                                        | BoCApp_Test                   | Gaole Dai               |
| 33    | ListTransactions_Test                                        | BoCApp_Test                   | Yixin Shen              |
| 34    | AddTransaction_Test                                          | BoCApp_Test                   | Ting Lou                |
| 35    | ChangeTransactionCategory_Test                               | BoCApp_Test                   | Yanbing Luo             |
| 36    | AddCategory_Test                                             | BoCApp_Test                   | Linglong Hu             |
| 37    | Question for Bryan                                           | BoCApp_Test                   | Boon Giin Lee           |
| 38    | Bug in main function of BoCAppTest.java caused by different operation system | BoCApp_Test                   | Yanbing Luo             |
| 39    | Submit BoCTransactionTest.java                               | Improving and fixing the code | Yixin Shen, Yanbing Luo |
| 40    | Submit BoCCategoryTest.java                                  | Improving and fixing the code | Yixin Shen, Gaole Dai   |
| 41    | Check the submitted test code                                | Improving and fixing the code | Yixin Shen              |
| 42    | Submit BoCAppTest.java                                       | Improving and fixing the code | Yanbing Luo             |
| 43    | @Ignore have not been deleted                                | Final Task                    | Gaole Dai               |
| 44    | hyper link inappropriately in report                         | Final Task                    | Yixin Shen              |
| 45    | question about some function which never been used           | Final Task                    | Boon Giin Lee           |
| 46    | Some advice on ST function                                   | Final Task                    | Ting Lou                |
| 47    | Add prompt to be more user friendliness                      | Final Task                    | Gaole Dai               |
| 48    | Bugs in AddCategory function                                 | Final Task                    | Linglong Hu             |
| 49    | print with two decimal places                                | Final Task                    | Gaole Dai               |
| 50    | Modify the ListTransactionsForCategory function              | Final Task                    | Yixin Shen              |



#### Merge Request

| Time      | Issue                                           | Result                                                       |
| --------- | ----------------------------------------------- | ------------------------------------------------------------ |
| 2020/4/30 | Improve the markdown file (1)                   | · Merge the updated report                                   |
| 2020/4/30 | Submit BoCTransactionTest.java                  | · Merge the BoCTransaction.java file<br/>· Add the BoCTransactionTest.java file |
| 2020/4/30 | BoCCategoryTest.java                            | · Merge the BoCCategory.java file<br/>· Add the BoCCategoryTest.java file |
| 2020/5/1  | Check the submitted test code                   | · Check the submitted test code files<br/>· Add some necessary comments<br/>· Merge the updated report |
| 2020/5/2  | Submit BoCAppTest.java                          | · Add the BoCAppTest.java file<br>· Merge the BoCApp.java file<br>· Make some modifications in the test code uploaded yesterday |
| 2020/5/3  | @Ignore have not been deleted                   | · Delete the @ignore in BoCTransactionTest.java              |
| 2020/5/3  | hyper link inappropriately in report            | · Fix the hyperlink in report                                |
| 2020/5/4  | Some advice on ST function                      | · Modify the ST function                                     |
| 2020/5/4  | print with two decimal places                   | · Modify the tostring() functions                            |
| 2020/5/5  | Modify the ListTransactionsForCategory function | · Modify the ListTransactionsForCategory function<br>· Modify the ChangeTransactionCategory function<br>· Merge the updated report |



## Test Plan
### Class: BoCCategory

#### Function: BoCCategory()

| Date              | Test           | Inputs | Expected Outcome         | Test Outcome             | P/F  | Fail Reason(if fails) | How to Improve |
| ----------------- | -------------- | ------ | :----------------------- | ------------------------ | ---- | --------------------- | -------------- |
| Passed: 2020/4/30 | TestDefaultCon | /      | "New Category";0.00;0.00 | "New Category";0.00;0.00 | P    | /                     | /              |

#### Function: BoCCategory(String newTitle)

| Date                                   | Test                  | Inputs               | Expected Outcome  | Test Outcome         | P/F  | Fail Reason(if fails)                                        | How to Improve                                |
| -------------------------------------- | --------------------- | -------------------- | ----------------- | -------------------- | ---- | ------------------------------------------------------------ | --------------------------------------------- |
| Passed: 2020/4/30                      | TestMainCon           | "Food"               | "Food"            | "Food"               | P    | /                                                            | /                                             |
| Failed:    2020/4/30 Passed: 2020/4/30 | TestMainConnamelength | "Foodeatinafternoon" | "Foodeatinaftern" | "Foodeatinafternoon" | F    | Title more than 15 chars.                                    | cut title char <= 15                          |
| Failed:    2020/4/30 Passed: 2020/4/30 | TestMainConname       | ""                   | "New Category"    | ""                   | F    | Title can't be null, if it's null, it should be "New Category". | When title is null, let it be "New Category". |

#### Function: CategoryName()

| Date              | Test        | Inputs | Expected Outcome | Test Outcome   | P/F  | Fail Reason(if fails) | How to Improve |
| ----------------- | ----------- | ------ | ---------------- | -------------- | ---- | --------------------- | -------------- |
| Passed: 2020/4/30 | Testgetname | /      | "New Category"   | "New Category" | P    | /                     | /              |

#### Function: CategoryBudget()

| Date              | Test          | Inputs | Expected Outcome | Test Outcome | P/F  | Fail Reason(if fails) | How to Improve |
| ----------------- | ------------- | ------ | ---------------- | ------------ | ---- | --------------------- | -------------- |
| Passed: 2020/4/30 | Testgetbudget | /      | 0.00             | 0.00         | P    | /                     | /              |

#### Function: CategorySpend()

| Date              | Test         | Inputs | Expected Outcome | Test Outcome | P/F  | Fail Reason(if fails) | How to Improve |
| ----------------- | ------------ | ------ | ---------------- | ------------ | ---- | --------------------- | -------------- |
| Passed: 2020/4/30 | Testgetspend | /      | 0.00             | 0.00         | P    | /                     | /              |

#### Function: setCategoryName(String newName)

| Date                                   | Test              | Inputs             | Expected Outcome  | Test Outcome       | P/F  | Fail Reason(if fails)          | How to Improve                |
| -------------------------------------- | ----------------- | ------------------ | ----------------- | ------------------ | ---- | ------------------------------ | ----------------------------- |
| Passed: 2020/4/30                      | Testsetname       | "Clothes"          | "Clothes"         | "Clothes"          | P    | /                              | /                             |
| Failed:    2020/4/30 Passed: 2020/4/30 | Testsetnamelength | "Clothesbuyinmall" | "Clothesbuyinmal" | "Clothesbuyinmall" | F    | Name can't more than 15 chars. | cut the name char to be <= 15 |

#### Function: setCategoryBudget(BigDecimal newValue)

| Date              | Test                        | Inputs | Expected Outcome | Test Outcome | P/F  | Fail Reason(if fails) | How to Improve |
| ----------------- | --------------------------- | ------ | ---------------- | ------------ | ---- | --------------------- | -------------- |
| Passed: 2020/4/30 | TestGTZeroSetCategoryBudget | 30.18  | 30.18            | 30.18        | P    | /                     | /              |
| Passed: 2020/4/30 | TestLEZeroSetCategoryBudget | -20.74 | 0.00             | 0.00         | P    | /                     | /              |

#### Function: addExpense(BigDecimal valueToAdd)

| Date              | Test           | Inputs | Expected Outcome | Test Outcome | P/F  | Fail Reason(if fails) | How to Improve |
| ----------------- | -------------- | ------ | ---------------- | ------------ | ---- | --------------------- | -------------- |
| Passed: 2020/4/30 | TestAddExpense | 12.41  | 12.41            | 12.41        | P    | /                     | /              |

#### Function: removeExpense(BigDecimal valueToRemove)

| Date              | Test              | Inputs         | Expected Outcome | Test Outcome | P/F  | Fail Reason(if fails) | How to Improve |
| ----------------- | ----------------- | -------------- | ---------------- | ------------ | ---- | --------------------- | -------------- |
| Passed: 2020/4/30 | TestRemoveExpense | 12.41 and 4.76 | 7.65             | 7.65         | P    | /                     | /              |

#### Function: resetBudgetSpend()

| Date              | Test                 | Inputs | Expected Outcome | Test Outcome | P/F  | Fail Reason(if fails) | How to Improve |
| ----------------- | -------------------- | ------ | ---------------- | ------------ | ---- | --------------------- | -------------- |
| Passed: 2020/4/30 | TestResetBudgetSpend | /      | 0.00             | 0.00         | P    | /                     | /              |

#### Function: getRemainingBudget()

| Date              | Test                   | Inputs          | Expected Outcome | Test Outcome | P/F  | Fail Reason(if fails) | How to Improve |
| ----------------- | ---------------------- | --------------- | ---------------- | ------------ | ---- | --------------------- | -------------- |
| Passed: 2020/4/30 | TestGetRemainingBudget | 30.18 and 12.41 | 17.77            | 17.77        | P    | /                     | /              |

#### Function: toString()

| Date                                   | Test               | Inputs                      | Expected Outcome                                             | Test Outcome                                              | P/F  | Fail Reason(if fails)                                        | How to Improve                                               |
| -------------------------------------- | ------------------ | --------------------------- | ------------------------------------------------------------ | --------------------------------------------------------- | ---- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Failed:    2020/4/30 Passed: 2020/4/30 | TestGTZeroToString | Budget：30.18；spend: 12.41 | "\[New Category\] \(Budget:￥30.18\) - ￥12.41 (￥17.77 Remaining)" | "New Category(￥30.18) - Est.￥12.41 (￥17.77 Remaining)" | F    | Lack "\[]", "Budget:";do not need "Est."                     | Add "\[]", "Budget:"   in suitable position; delete "Est."   |
| Failed:    2020/4/30 Passed: 2020/4/30 | TestLEZeroToString | Budget：4.76；spend: 12.41  | "\[New Category\] \(Budget:￥4.76\) - ￥12.41 (￥7.65 Overspent)" | "New Category(￥4.76) - Est.￥12.41 (￥-7.65 Remaining)"  | F    | Lack "\[]", "Budget:";do not need "Est."; "￥-7.65" should be "￥7.65"; "Remaining" should be "Overspent" | Add "\[]", "Budget:"   in suitable position; delete "Est."; add a if/ else statement to divide "remaining" and "overspent" situation |



### Class: BoCTransaction

#### Function: BoCTransaction()

| Date                                   | Test                      | Inputs | Expected Outcome                        | Test Outcome                            | P/F  | Fail Reason(if fails)          | How to Improve                                         |
| -------------------------------------- | ------------------------- | ------ | --------------------------------------- | --------------------------------------- | ---- | ------------------------------ | ------------------------------------------------------ |
| Failed:    2020/4/30 Passed: 2020/4/30 | TestDefaultBoCTransaction | /      | 0; "[Pending Transaction]";  Null; Null | 0; "[Pending Transaction]";  Null; Null | F    | The  transactionName  is Null. | Change the transactionName   to [Pending Transaction]. |

#### Function: BoCTransaction(String tName, BigDecimal tValue, int tCat)

| Date                                  | Test                   | Inputs                                    | Expected Outcome                   | Test Outcome                       | P/F  | Fail Reason(if fails)                                        | How to Improve                                               |
| ------------------------------------- | ---------------------- | ----------------------------------------- | ---------------------------------- | ---------------------------------- | ---- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Failed:    2020/4/30 Passed: 2020/5/3 | TestMainBoCTransaction | String tName, BigDecimal tValue, int tCat | "buy fruit"; 10.2;  3;Current Time | "buy fruit"; 10.2; 3; Current Time | F    | 2020/4/30:<br>Personally I think this is because the time I run the test is slightly different from the time code runs.<br>2020/5/3:<br/>I use BT1 which is created in **@BeforeEach** to test the time it creates with the time I run the test, there exits a time lag. So I create a new object called BT3 in the test to reduece the time lag. | No need to improve the code.<br/>Need to add a new object named BT3, and compare the current time with the time of BT3. |

#### Function: transactionName()

| Date              | Test                | Inputs | Expected Outcome | Test Outcome | P/F  | Fail Reason(if fails) | How to Improve |
| ----------------- | ------------------- | ------ | ---------------- | ------------ | ---- | --------------------- | -------------- |
| Passed: 2020/4/30 | TesttransactionName | /      | "buy fruit"      | "buy fruit"  | P    | /                     | /              |

#### Function: transactionValue()

| Date              | Test                 | Inputs | Expected Outcome | Test Outcome | P/F  | Fail Reason(if fails) | How to Improve |
| ----------------- | -------------------- | ------ | ---------------- | ------------ | ---- | --------------------- | -------------- |
| Passed: 2020/4/30 | TesttransactionValue | /      | 10.2             | 10.2         | P    | /                     | /              |

#### Function: transactionCategory()

| Date              | Test                    | Inputs | Expected Outcome | Test Outcome | P/F  | Fail Reason(if fails) | How to Improve |
| ----------------- | ----------------------- | ------ | ---------------- | ------------ | ---- | --------------------- | -------------- |
| Passed: 2020/4/30 | TesttransactionCategory | /      | 3                | 3            | P    | /                     | /              |

#### Function: transactionTime()

| Date                                  | Test                | Inputs | Expected Outcome | Test Outcome | P/F  | Fail Reason(if fails)                                        | How to Improve                                               |
| ------------------------------------- | ------------------- | ------ | ---------------- | ------------ | ---- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Failed:    2020/4/30 Passed: 2020/5/3 | TesttransactionTime | /      | Current Time     | Current Time | F    | 2020/4/30:<br>Personally I think this is because the time I run the test is slightly different from the time code runs<br>2020/5/3:<br>I use BT2 which is created in **@BeforeEach** to test the time it creates with the time I run the test, there exits a time lag. So I create a new object called BT4 in the test to reduece the time lag. | No need to improve the code.<br>Need to add a new object named BT4, and compare the current time with the time of BT4. |

#### Function: setTransactionName(String tName)

| Date                                   | Test                                | Inputs                                           | Expected Outcome             | Test Outcome                                     | P/F  | Fail Reason(if fails)                                        | How to Improve                                               |
| -------------------------------------- | ----------------------------------- | ------------------------------------------------ | ---------------------------- | ------------------------------------------------ | ---- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Passed: 2020/4/30                      | TestsetTransactionName              | "buy apple"                                      | "buy apple"                  | "buy apple"                                      | P    | /                                                            | /                                                            |
| Failed:    2020/4/30 Passed: 2020/4/30 | TestsetTransactionNameForTimes      | "buy apple"                                      | "the name should not change" | "buy apple"                                      | F    | the function could not preventing user from modified the name more than once | in BoCTransactionName(),check whether it is the first time user modified the name, if not, do not modifie the name |
| Failed:    2020/4/30 Passed: 2020/4/30 | TestsetTransactionNameForLongString | "buy apple buy banana buy orange buy watermelon" | "buy apple buy banana buy"   | "buy apple buy banana buy orange buy watermelon" | F    | There is no code to   cut the string into 25 chars           | in BoCTransactionName(),check whether the length of the parameter is less the 25 chars, it not, intercepts the first 25 characters |

#### Function: setTransactionValue(BigDecimal tValue)

| Date                                   | Test                                   | Inputs | Expected Outcome            | Test Outcome             | P/F  | Fail Reason(if fails)                                        | How to Improve                                               |
| -------------------------------------- | -------------------------------------- | ------ | --------------------------- | ------------------------ | ---- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Passed: 2020/4/30                      | TestsetTransactionValue                | 10     | 10                          | 10                       | P    | /                                                            | /                                                            |
| Failed:    2020/4/30 Passed: 2020/4/30 | TestSetTransactionValueForManyTimes    | 10     | the value should not change | 10                       | F    | There is no code to prevent user from modified the value more than once | in BoCTransactionValue(),check whether it is the first time user modified the value, if not, do not modifie the value |
| Passed: 2020/4/30                      | TestsetTransactionValueSmallerThanZero | -1     | the value should not change | the value didn't changed | p    | /                                                            | /                                                            |
| Passed: 2020/4/30                      | TestsetTransactionValueEqualToZero     | 0      | the value should not change | the value didn't changed | P    | /                                                            | /                                                            |

#### Function: setTransactionCategory(int tCat)

| Date              | Test                                      | Inputs | Expected Outcome | Test Outcome                | P/F  | Fail Reason(if fails) | How to Improve |
| ----------------- | ----------------------------------------- | ------ | ---------------- | --------------------------- | ---- | --------------------- | -------------- |
| Passed: 2020/4/30 | TestsetTransactionCategory                | 1      | 1                | 1                           | P    | /                     | /              |
| Passed: 2020/4/30 | TestsetTransactionCategorySmallerThanZero | -1     | not equal to -1  | the category didn't changed | P    | /                     | /              |

#### Function: setTransactionTime(Date tTime)

| Date                                   | Test                   | Inputs      | Expected Outcome           | Test Outcome | P/F  | Fail Reason(if fails)                                   | How to Improve                                               |
| -------------------------------------- | ---------------------- | ----------- | -------------------------- | ------------ | ---- | ------------------------------------------------------- | ------------------------------------------------------------ |
| Failed:    2020/4/30 Passed: 2020/4/30 | TestsetTransactionTime | new Date(0) | the time should not change | new Date(0)  | F    | There is no code to prevent user from modified the time | in BoCTransactionTime(),  prevent the user to modify the time |

#### Function: toString()

| Date              | Test         | Inputs | Expected Outcome     | Test Outcome         | P/F  |
| ----------------- | ------------ | ------ | -------------------- | -------------------- | ---- |
| Passed: 2020/4/30 | TesttoString | /      | "buy fruit - ¥10.2"  | "buy fruit - ¥10.2"  | P    |
| Passed: 2020/5/5  | TesttoString | /      | "buy fruit - ¥10.20" | "buy fruit - ¥10.20" | P    |



### Class: BoCApp

#### Function: ListTransactions()

| Date             | Test                 | Inputs | Expected Outcome                                             | Test Outcome                                                 | P/F  | Fail Reason(if fails) | How to Improve |
| ---------------- | -------------------- | ------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ---- | --------------------- | -------------- |
| Passed: 2020/5/1 | TestListTransactions | /      | "1) Mcdonald's Lunch - ¥88.00<br/> 2) Costco Shopping - ¥161.32<br/>3) Electricity Bill - ¥75.00<br/>4) StarBucks' Caramel Macchiato - ¥35.00<br/>5) karaoke - ¥58.86<br/>6) Keyboard - ¥300.56<br/>7) JK dress - ¥128.20" | "1) Mcdonald's Lunch - ¥88.00<br/>2) Costco Shopping - ¥161.32<br/>3) Electricity Bill - ¥75.00<br/>4) StarBucks' Caramel Macchiato - ¥35.00<br/>5) karaoke - ¥58.86<br/>6) Keyboard - ¥300.56<br/>7) JK dress - ¥128.20" | P    | /                     | /              |

#### Function: CategoryOverview()

| Date             | Test                 | Inputs | Expected Outcome                                             | Test Outcome                                                 | P/F  | Fail Reason(if fails) | How to Improve |
| ---------------- | -------------------- | ------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ---- | --------------------- | -------------- |
| Passed: 2020/5/1 | TestCategoryOverview | /      | “1) \[Unknown] \(Budget: ¥0.00) -  ¥0.00 (¥0.00 Overspent)<br/>2) \[Bills] \(Budget:¥120.00) -  ¥0.00 (¥120.00 Remaining)<br/>3) \[Groceries] \(Budget: ¥75.00) - ¥0.00 (¥75.00 Remaining)<br/>4) \[Social] \(Budget: ¥100.00) - ¥0.00 (¥100.00 Remaining)” | “1) \[Unknown] \(Budget: ¥0.00) -  ¥0.00 (¥0.00 Overspent)<br/>2) \[Bills] \(Budget:¥120.00) -  ¥0.00 (¥120.00 Remaining)<br/>3) \[Groceries] \(Budget: ¥75.00) - ¥0.00 (¥75.00 Remaining)<br/>4) \[Social] \(Budget: ¥100.00) - ¥0.00 (¥100.00 Remaining)” | P    | /                     | /              |

#### Function: ListTransactionsForCategory(int chosenCategory)

| Date                              | Test                            | Inputs | Expected Outcome                                          | Test Outcome                                                 | P/F  | Fail Reason(if fails)                                        | How to Improve                                               |
| --------------------------------- | ------------------------------- | ------ | --------------------------------------------------------- | ------------------------------------------------------------ | ---- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Failed: 2020/5/1 Passed: 2020/5/1 | TestListTransactionsForCategory | 2      | "2) Phone Bill - ¥37.99<br/>3) Electricity Bill - ¥75.00" | "4) Sainsbury's Checkout - ¥23.765) Tesco's Checkout - ¥7.24" | F    | This function takes a category ID as a parameter, but the category ID start form 0, though the prompt massage start from 1. | Modified the source code, use (input - 1) as the category ID to traverse the list ,finding the corresponding transaction. |
| Passed: 2020/5/5                  | TestListTransactionsForCategory | 0      | "No transactions for the given category."                 | "No transactions for the given category."                    | P    | /                                                            | /                                                            |

#### Function: AddTransaction(Scanner in)

| Date             | Test                          | Inputs                                                       | Expected Outcome                                             | Test Outcome                                                 | P/F  | Fail Reason(if fails) | How to Improve |
| ---------------- | ----------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ---- | --------------------- | -------------- |
| Passed: 2020/5/1 | TestAddTransaction            | Scanner scan = new Scanner(System.in); (System.in = "\nbuy fruit\n2.5") | assertEquals(BoCApp.UserTransactions.get(BoCApp.UserTransactions.size() - 1), new BoCTransaction("buy fruit", new BigDecimal("2.5"), 0)); | assertEquals(BoCApp.UserTransactions.get(BoCApp.UserTransactions.size() - 1), new BoCTransaction("buy fruit", new BigDecimal("2.5"), 0)); | P    | /                     | /              |
| Passed: 2020/5/5 | TestAddTransactionForLongName | Scanner scan = new Scanner(System.in); (System.in = ""\n1234567890123456789012345678901234567890\n2.5"") | assertEquals(BoCApp.UserTransactions.get(BoCApp.UserTransactions.size() - 1),	new BoCTransaction("1234567890123456789012345", new BigDecimal("2.5"), 0)); | assertEquals(BoCApp.UserTransactions.get(BoCApp.UserTransactions.size() - 1),new BoCTransaction("1234567890123456789012345", new BigDecimal("2.5"), 0)); | P    | /                     | /              |

#### Function: ChangeTransactionCategory(Scanner in)

| Date                              | Test                          | Inputs                                                       | Expected Outcome                                             | Test Outcome                                                 | P/F  | Fail Reason(if fails) | How to Improve                     |
| --------------------------------- | ----------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ---- | --------------------- | ---------------------------------- |
| Passed: 2020/5/1                  | TestChangeTransactionCategory | Scanner scan = new Scanner(System.in); (System.in = "\n2\n3") | testChangeTxt                                                | testChangeTxt                                                | P    | /                     | /                                  |
| Failed: 2020/5/1 Passed: 2020/5/1 | TestChangeTransactionCategory | Scanner scan = new Scanner(System.in); (System.in = "\n1\n2") | assertEquals(BoCApp.UserTransactions.get(0), new BoCTransaction("Rent", new BigDecimal("850"), 1)) == True | assertEquals(BoCApp.UserTransactions.get(0), new BoCTransaction("Rent", new BigDecimal("850"), 1)) == False | F    | index is wrong        | Change the start index from 0 to 1 |

###### testChangeTxt: 

​					"Which transaction ID?\r\n" + 

​					"	- Phone Bill - ¥37.99\r\n" + 

​					"Which category will it move to?\r\n" + 

​					"1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)\r\n" + 

​					"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)\r\n" + 

​					"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)\r\n" + 

​					"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)\r\n" +  ""

#### Function: AddCategory(Scanner in)

| Date             | Test            | Inputs     | Expected Outcome                                             | Test Outcome                                                 | P/F  | Fail Reason(if fails) | How to Improve |
| ---------------- | --------------- | ---------- | ------------------------------------------------------------ | ------------------------------------------------------------ | ---- | --------------------- | -------------- |
| Passed: 2020/5/1 | TestAddCategory | "Food\n12" | "What is the title of the category?"<br/>"Food"<br/>f"What is the budget for this category?" <br/> 12<br/>"[Category added]"<br/> "1) \[Food] \(Budget: ¥12) - ¥0.00 (¥12.00 Remaining)" | "What is the title of the category?"<br/>"Food"<br/>"What is the budget for this category?" <br/> 12<br/>"[Category added]"<br/> "1) \[Food] \(Budget: ¥12) - ¥0.00 (¥12.00 Remaining)" | P    | /                     | /              |

#### Function: ChangeCategory(Scanner in)

| Date             | Test                     | Inputs          | Expected Outcome                                             | Test Outcome                                                 | P/F  | Fail Reason(if fails) | How to Improve |
| ---------------- | ------------------------ | --------------- | ------------------------------------------------------------ | ------------------------------------------------------------ | ---- | --------------------- | -------------- |
| Passed: 2020/5/3 | TestChangeCategoryName() | "\n2\nA\ntitle" | "Which category ID?" + System.lineSeparator()<br/>				+ "	- [Bills] (Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" + System.lineSeparator()<br/>				+ "What do you want to do?" + System.lineSeparator()<br/>				+ "N = Change [N]ame, B = Change [B]udget, A = Change [A]ll" + System.lineSeparator()<br/>				+ "What is the new category name?" + System.lineSeparator() + "What is the new category budget?"<br/>				+ System.lineSeparator() + ""; | "Which category ID?" + System.lineSeparator()<br/>				+ "	- [Bills] (Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" + System.lineSeparator()<br/>				+ "What do you want to do?" + System.lineSeparator()<br/>				+ "N = Change [N]ame, B = Change [B]udget, A = Change [A]ll" + System.lineSeparator()<br/>				+ "What is the new category name?" + System.lineSeparator() + "What is the new category budget?"<br/>				+ System.lineSeparator() + ""; | P    | /                     | /              |

#### Function:  ChangeTransaction(Scanner in)

| Date             | Test                  | Inputs               | Expected Outcome                                             | Test Outcome                                                 | P/F  | Fail Reason(if fails) | How to Improve |
| ---------------- | --------------------- | -------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ | ---- | --------------------- | -------------- |
| Passed: 2020/5/3 | TestChangeTransaction | "\n1\nbuy fruit\n10" | "Which transaction ID?" + System.lineSeparator() + "	- [Pending Transaction] - ¥0.00"<br/>				+ System.lineSeparator() + "What is the new name?" + System.lineSeparator() + "What is the new value?"<br/>				+ System.lineSeparator() + "" | "Which transaction ID?" + System.lineSeparator() + "	- [Pending Transaction] - ¥0.00"<br/>				+ System.lineSeparator() + "What is the new name?" + System.lineSeparator() + "What is the new value?"<br/>				+ System.lineSeparator() + "" | P    | /                     | /              |

#### Function: main

| Date             | Test                     | Inputs                                                 | Expected Outcome | Test Outcome | P/F  | Fail Reason(if fails) | How to Improve |
| ---------------- | ------------------------ | ------------------------------------------------------ | ---------------- | ------------ | ---- | --------------------- | -------------- |
| Passed: 2020/5/2 | TestmainT                | "T\nX"                                                 | EO1              | TO1          | P    | /                     | /              |
| Passed: 2020/5/2 | TestmainA                | "A\nbuy fruit\n2.5\nX"                                 | EO2              | TO2          | P    | /                     | /              |
| Passed: 2020/5/2 | TestmainAll              | "A\nbuy meat\n800\nT\nN\nfood\n3000\nO\nC\n8\n5\n5\nX" | EO3              | TO3          | P    | /                     | /              |
| Passed: 2020/5/2 | TestmainO                | "O\nX"                                                 | EO4              | TO4          | P    | /                     | /              |
| Passed: 2020/5/2 | TestmainC                | "C\n2\n3\nX"                                           | EO5              | TO5          | P    | /                     | /              |
| Passed: 2020/5/2 | TestmainN                | "N\nFood\n12\nX"                                       | EO6              | TO6          | P    | /                     | /              |
| Passed: 2020/5/2 | TestmainNum              | "1\nX"                                                 | EO7              | TO7          | P    | /                     | /              |
| Passed: 2020/5/2 | TestmainCtIDabNormal     | "C\n100\nX"                                            | EO8              | TO8          | P    | /                     | /              |
| Passed: 2020/5/2 | TestmainCcIDabNormal     | "C\n2\n100\nX"                                         | EO9              | TO9          | P    | /                     | /              |
| Passed: 2020/5/2 | TestmainInputNumabNormal | "N\nFood\nstring\nX"                                   | EO10             | TO10         | P    | /                     | /              |
| Passed: 2020/5/2 | TestmainOther            | "dqw\nX"                                               | EO11             | TO11         | P    | /                     | /              |
| Passed: 2020/5/3 | TestmainSC               | "SC\n2\nA\ntitle\nX"                                   | EO12             | TO12         | P    | /                     | /              |
| Passed: 2020/5/3 | TestmainST               | "A\n\n\nST\n8\nbuy clothes\n100\nX"                    | EO13             | TO13         | P    | /                     | /              |
| Passed: 2020/5/4 | TestmainPrompt           | /                                                      | EO14             | TO14         | P    | /                     | /              |

###### EO1/TO1:

​				"Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n" + System.lineSeparator() + 

​				"1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" +

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" +

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" +

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" + "\n" + "What do you want to do?\n" +

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"1) Rent - ¥850.00" + "2) Phone Bill - ¥37.99" + "3) Electricity Bill - ¥75.00" +

​				"4) Sainsbury's Checkout - ¥23.76" + "5) Tesco's Checkout - ¥7.24" +

​				"6) RockCity Drinks - ¥8.50" + "7) The Mooch - ¥13.99" + "\n" + "What do you want to do?\n" +

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"Goodbye! Thank you for using our App. Have a nice day:D" + ""

###### EO2/TO2:

​				"Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n" + System.lineSeparator() + 

​				"1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" +

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" +

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" +

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" + "\n" + "What do you want to do?\n" +

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"What is the title of the transaction?" + "What is the value of the transaction?" +

​				"[Transaction added]" + "\n" + "What do you want to do?\n" +

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"Goodbye! Thank you for using our App. Have a nice day:D" + ""

###### EO3/TO3:

​				"Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n" + System.lineSeparator() + 

​				 "1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" +

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" +

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" +

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" + "\n" + "What do you want to do?\n" +

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"What is the title of the transaction?" + "What is the value of the transaction?" +

​				"[Transaction added]" + "\n" + "What do you want to do?\n" +

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"1) Rent - ¥850.00" + "2) Phone Bill - ¥37.99" + "3) Electricity Bill - ¥75.00" +

​				"4) Sainsbury's Checkout - ¥23.76" + "5) Tesco's Checkout - ¥7.24" +

​				"6) RockCity Drinks - ¥8.50" + "7) The Mooch - ¥13.99" + "8) buy meat - ¥800.00" + "\n" +

​				"What do you want to do?\n" +

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"What is the title of the category?" + "What is the budget for this category?" +

​				"[Category added]" + "1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" +

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" +

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" +

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" +

​				"5) \[food] \(Budget: ¥3000.00) - ¥0.00 (¥3000.00 Remaining)" + "\n" + "What do you want to do?\n" +

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" +

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" +

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" +

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" +

​				"5) \[food] \(Budget: ¥3000.00) - ¥0.00 (¥3000.00 Remaining)" + "\n" + "What do you want to do?\n" +

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"Which transaction ID?" + "	- buy meat - ¥800.00" + "Which category will it move to?" +

​				"1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" +

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" +

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" +

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" +

​				"5) \[food] \(Budget: ¥3000.00) - ¥0.00 (¥3000.00 Remaining)" + "\n" + "What do you want to do?\n" +

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"6) RockCity Drinks - ¥8.50" + "7) The Mooch - ¥13.99" + "\n" + "What do you want to do?\n" +

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"Goodbye! Thank you for using our App. Have a nice day:D" + System.lineSeparator() + "";

###### EO4/TO4:

​				"Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n" + System.lineSeparator() + 

​				"1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" + 

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" + 

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" +

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" + 

​				"\n" + "What do you want to do?\n" + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" +

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" +

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" +

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" +

​				"\n" + "What do you want to do?\n" + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"Goodbye! Thank you for using our App. Have a nice day:D"

###### EO5/TO5:

​				"Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n" + System.lineSeparator() + 

​				"1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" +

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" +

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" +

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" +

​				"\n" + "What do you want to do?\n" + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"Which transaction ID?" + "	- Phone Bill - ¥37.99" +

​				"Which category will it move to?" +

​				"1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" +

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" +

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" +

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" +

​				"\n" + "What do you want to do?\n" + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"Goodbye! Thank you for using our App. Have a nice day:D"

###### EO6/TO6:

​				"Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n" + System.lineSeparator() + 

​				"1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" +

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" +

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" +

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" +

​				"\n" + "What do you want to do?\n" + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"What is the title of the category?" +

​				"What is the budget for this category?" + "[Category added]" +

​				"1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" +

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" +

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" +

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" +

​				"5) \[Food] \(Budget: ¥12) - ¥0.00 (¥12.00 Remaining)" +

​				"\n" + "What do you want to do?\n" + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"Goodbye! Thank you for using our App. Have a nice day:D" + "";

###### EO7/TO7:

​				"Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n" + System.lineSeparator() + 

​				"1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" +

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" +

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" +

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" +

​				"\n" +  "What do you want to do?\n" + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"1) Rent - ¥850.00" + "\n" + "What do you want to do?\n" +

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"Goodbye! Thank you for using our App. Have a nice day:D" + "";

###### EO8/TO8:

​				"Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n" + System.lineSeparator() + 

​				"1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" +

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" +

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" +

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" +

​				"\n" +  "What do you want to do?\n" + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X = E[x]it" + System.lineSeparator() +

​				"Which transaction ID?" + System.lineSeparator()

​				"Something went wrong: java.lang.IndexOutOfBoundsException: Index out of bounds!" + "\n" 

System.lineSeparator() + "\n" + "What do you want to do?\n"  + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange 

Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator()  + 

​				"Goodbye! Thank you for using our App. Have a nice day:D" + System.lineSeparator() + "";

###### EO9/TO9:

​				"Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n" + System.lineSeparator() + 

​				"1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" + 

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" + 

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" + 

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" + 

​				"\n" + "What do you want to do?\n" + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"Which transaction ID?" + "	- Phone Bill - ¥37.99" + "Which category will it move to?" + 

​				"1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" + 

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" + 

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" + 

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" + 

​				"Something went wrong: java.lang.IndexOutOfBoundsException: Index 99 out of bounds for length 4\n" + 

​				"" + "\n" + "What do you want to do?\n" + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"Goodbye! Thank you for using our App. Have a nice day:D" + "";

###### EO10/TO10:

​				"Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n" + System.lineSeparator() + 

​				"1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" + 

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" + 

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" + 

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" + 

​				"\n" + "What do you want to do?\n" + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"What is the title of the category?" + "What is the budget for this category?" + 

​				"Something went wrong: java.lang.NumberFormatException: Character s is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.\n" + 

​				"" + "\n" + "What do you want to do?\n" + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X 

= E[x]it" + System.lineSeparator() + 

​				"Goodbye! Thank you for using our App. Have a nice day:D" + "";

###### EO11/TO11:

​				"Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n" + System.lineSeparator() + 

​				"1) \[Unknown] \(Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" + 

​				"2) \[Bills] \(Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" + 

​				"3) \[Groceries] \(Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" + 

​				"4) \[Social] \(Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" + 

​				"\n" + "What do you want to do?\n" + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X = E[x]it" + System.lineSeparator() +

​				"Something went wrong: java.lang.NumberFormatException: For input string: \"dqw\"\n" + "" + System.lineSeparator() + "\n" + "What do you want to do?\n"

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X = E[x]it" + System.lineSeparator() +

​				"Goodbye! Thank you for using our App. Have a nice day:D" + System.lineSeparator() + "";

###### EO12/TO12:

​				"Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n" + "" +

​				System.lineSeparator() + "1) [Unknown] (Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" + 

​				System.lineSeparator() + "2) [Bills] (Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" +

​				System.lineSeparator() + "3) [Groceries] (Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" +

​				System.lineSeparator() + "4) [Social] (Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" +

​				System.lineSeparator() + "\n" + "What do you want to do?\n" +

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" +

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it" +

​				System.lineSeparator() + "Which category ID?" + System.lineSeparator() +

​				"	- [Bills] (Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" + System.lineSeparator() +

​				"What do you want to do?" + System.lineSeparator() +

​				"N = Change [N]ame, B = Change [B]udget, A = Change [A]ll" + System.lineSeparator() +

​				"What is the new category name?" + System.lineSeparator() + 

​				"What is the new category budget?" + System.lineSeparator() + "\n" + "What do you want to do?\n"

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n"

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory, ST = [S]et [T]ransaction, X = E[x]it"

​				System.lineSeparator() + "Goodbye! Thank you for using our App. Have a nice day:D"

​				System.lineSeparator() + "";

###### EO13/TO13:

​				"Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n" + System.lineSeparator() + 

​				"1) [Unknown] (Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" + System.lineSeparator() + 

​				"2) [Bills] (Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" + System.lineSeparator() + 

​				"3) [Groceries] (Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" + System.lineSeparator() + 

​				"4) [Social] (Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" + System.lineSeparator() + 

​				"\n" + "What do you want to do?\n" + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X = E[x]it" + 

​				System.lineSeparator() + "What is the title of the transaction?" + System.lineSeparator() + 

​				"What is the value of the transaction?" + System.lineSeparator() + "[Transaction added]" + 

​				System.lineSeparator() + "\n" + "What do you want to do?\n" + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" +

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X = E[x]it" + 

​				System.lineSeparator() + "Which transaction ID?" + System.lineSeparator() + 

​				"	- [Pending Transaction] - ¥0.00" + System.lineSeparator() + "What is the new name?" + 

​				System.lineSeparator() + "What is the new value?" + System.lineSeparator() + "\n" + 

​				"What do you want to do?\n" + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X = E[x]it" + 

​				System.lineSeparator() + "Goodbye! Thank you for using our App. Have a nice day:D" + System.lineSeparator() + "";

###### EO14/TO14:

​				"Hi, welcome to use BoC Finance Management App designed by Expecto Patronum:)\n" + System.lineSeparator() + 

​				"1) [Unknown] (Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)" + System.lineSeparator() + 

​				"2) [Bills] (Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)" + System.lineSeparator() + 

​				"3) [Groceries] (Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)" + System.lineSeparator() + 

​				"4) [Social] (Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining)" + System.lineSeparator() + 

​				"\n" + "What do you want to do?\n" + 

​				" T = List All [T]ransactions, O = [O]verview, [num] = Show Category [num], C = [C]hange Transaction Category,\n" + 

​				" A = [A]dd Transaction, N = [N]ew Category, SC = [S]et [C]ategory name, ST = [S]et [T]ransaction, X = E[x]it" + System.lineSeparator();