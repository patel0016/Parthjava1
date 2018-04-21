/* Name : Parth Patel
 * course section :18W_CST8110_300 Intro to Computer Programming
 * Lab Teacher :Anissa Shaddy
 * Purpose of the program : Array
 * Assignment number : 4
 * Date : April 20th 2018
 */

public class Assign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// StringArray array = new StringArray();

		/*----------------------------
		 * Test 1: default constructor
		----------------------------*/
		StringArray test1 = new StringArray();
		boolean test1Successful = true;
		if (!test1.isEmpty()) {
			System.out.println("Test 1a: default object is not empty");
			test1Successful = false;
		}
		if (test1.size() != 0) {
			System.out.println("Test 1b: default object size is not zero");
			test1Successful = false;
		}
		if (test1.capacity() != 10) {
			System.out.println("Test 1c: default object capacity is not ten");
			test1Successful = false;
		}
		if (test1Successful) {
			System.out.println("Test 1: Pass");
		}

		/*----------------------------
		 *  Test 2: initial constructor
		----------------------------*/
		StringArray test2 = new StringArray(50);

		boolean test2Successful = true;
		if (!test2.isEmpty()) {
			System.out.println("Test 2a: Initial object is not empty");
			test2Successful = false;
		}
		if (test2.size() != 0) {
			System.out.println("Test 2b: Initial object size is not zero");
			test2Successful = false;
		}
		if (test2.capacity() != 50) {
			System.out.println("Test 2c: Initial object capacity is not fifty");
			test2Successful = false;
		}
		if (test2Successful) {
			System.out.println("Test 2: Pass");
		}

		/*----------------------------
		 * Test 3: copy constructor
		----------------------------*/
		StringArray temp = new StringArray(50);
		temp.add("s");
		temp.add("a");
		StringArray test3 = new StringArray(temp);

		boolean test3Successful = true;
		if (test3.capacity() != 50) {
			System.out.println("Test 3a:capacity value is not 50 ");
			test3Successful = false;
		}
		if (test3.size() != 2) {
			System.out.println("Test 3b: if size value is not 2");
			test3Successful = false;
		}
		if (test3.equals(temp)) {
			System.out.println("Test 3c: copy of array is not present");
			test3Successful = false;
		}
		if (test3Successful) {
			System.out.println("Test 3: Pass");
		}

		/*----------------------------
		 * Test 4: add(String s)
		----------------------------*/

		StringArray test4 = new StringArray();
		test4.add("Parth");
		test4.add("Sanket");
		test4.add("Prajal");

		boolean test4Successful = true;
		if (test4.isEmpty()) {
			System.out.println("Test 4a: size is not empty");
			test4Successful = false;
		}
		if (test4.size() != 3) {
			System.out.println("Test 4b: size is 3");
			test4Successful = false;
		}
		if (test4.capacity() == test4.size()) {
			System.out.println("Test 4c: capacity and size is equal");
			test2Successful = false;
		}
		if (test4Successful) {
			System.out.println("Test 4: Pass");
		}

		/*----------------------------
		 * Test 5: add(int index, String s)
		----------------------------*/

		StringArray test5 = new StringArray(50);
		test5.add(0, "Parth");
		test5.add(3, "Patel");

		boolean test5Successful = true;
		if (test5.isEmpty()) {
			System.out.println("Test 5a: There is value on Index ");
			test5Successful = false;
		}
		if (test5.size() != 2) {
			System.out.println("Test 5b:size is not two");
			test5Successful = false;
		}

		if (!test5.get(3).equals("Patel")) {
			test5Successful = false;
			System.out.println("Test 5c: The Value is not same");

		}
		if (test5Successful) {
			System.out.println("Test 5: Pass");
		}

		/*----------------------------
		 * Test 6: clear()
		----------------------------*/
		StringArray test6 = new StringArray();
		test6.add(0, "shubham");
		test6.add(5, "Harsh");

		boolean test6Successful = true;

		if (test6.isEmpty()) {
			System.out.println("Test 6a: Initial object is not empty");
			test6Successful = false;
		}
		if (test6.size() != 2) {
			System.out.println("Test 6b: size is not two");
			test6Successful = false;
		}

		test6.clear();

		if (test6.size() != 0) {
			System.out.println("Test 6c: size is not zero");
			test6Successful = false;
		}
		if (test6Successful) {
			System.out.println("Test 6: Pass");
		}

		/*----------------------------
		 * Test 7: contains(String s) and indexOf(String s)
		----------------------------*/
		StringArray test7 = new StringArray();
		test7.add("Patel");
		test7.add("Parth");

		boolean test7Successful = true;
		if (test7.isEmpty()) {
			System.out.println("Test 7a: default object is not empty");
			test7Successful = false;
		}
		if (test7.size() != 2) {
			System.out.println("Test 7b: default object size is not zero");
			test7Successful = false;
		}
		if (!test7.contains("Patel")) {
			System.out.println("Test 7c: string value is not inserted");
			test7Successful = false;
		}

		if (test7.indexOf("patel") == 0) {

			System.out.println("Test 7c: enter value in contains in not present in indexof");
			test7Successful = false;
		}
		if (test7Successful) {
			System.out.println("Test 7: Pass");
		}

		/*----------------------------
		 * Test 8: remove(int index) and remove(String s)
		----------------------------*/

		StringArray test8 = new StringArray();
		test8.add("Patel");
		test8.add("Parth");

		boolean test8Successful = true;

		if (test8.indexOf("patel") == 0) {

			System.out.println("Test 8a: enter value in contains in not present in indexof");
			test8Successful = false;
		}
		if (test8.remove(0) == null) {

			System.out.println("Test 8b: enter value in not present");
			test8Successful = false;

		}
		if (test8Successful) {
			System.out.println("Test 8: Pass");
		}

		/*----------------------------
		 * Test 9: get(int index) and set(int index, String s)
		----------------------------*/
		StringArray test9 = new StringArray();
		test9.add("Patel");
		test9.add("Parth");
		test9.add("Jay");
		boolean test9Successful = true;
		if (test9.get(0) != "Patel") {

			System.out.println("Test 9a: Add string name Patel is not present at location 0");
			test9Successful = false;
		}
		if (test9.get(1) != "Parth") {

			System.out.println("Test 9b: Add string name Parth is not present at location 1");
			test9Successful = false;

		}

		if (test9.set(0, "sanket") != "Patel") {

			System.out.println("Test 9c: name Patel is not passed at index 0 ");
			test9Successful = false;

		}
		if (test9Successful) {
			System.out.println("Test 9: Pass");
		}

		/*----------------------------
		 * Test 10: ensureCapacity(int minCapacity)
		----------------------------*/
		StringArray test10 = new StringArray();

		int minCapacity = 12;
		boolean test10Successful = true;

		test10.ensureCapacity(14);

		if (minCapacity < test10.capacity()) {

			System.out.println(" Test10 : cpacity is not increased  ");
			test9Successful = false;
		}
		if (test10Successful) {
			System.out.println("Test 10: Pass");
		}
	}

}
