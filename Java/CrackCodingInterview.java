/* Data Structures */
/*HASH TABLES*/
public HashMap<Integer, Studen> buildMap(Student[] students) {
	HashMap<Integer, Student> map = new HashMap<Integer, Student>();
	for (Student s : students)
		map.put(s.getId(), s);
	return map;
}

/* ARRAY LIST*/
/* An ArrayList, or a dynamiccally resizing array, is an array that */
/* resizes itself as needed while still providing O(1) access*/
/* Typical implementation is that when a vector is full, the array*/
/* doubles in size. Each doubling takes O(n) time, but happens so rarely*/
/* that is amortized time is still O(1)*/
public ArrayList<String> merge(String[] words, String[] more) {
	ArrayList<String> sentence = new ArrayList<String>();
	for (String w : words) sentence.add(w);
	for (String w : more) sentence.add(w);
	return sentence;
}

/*STRING BUFFER / STRING BUILDER */
/* What is the running time of the code below? */
public String makeSentence(String[] words) {
	StringBuffer sentence = new StringBuffer();
	for (String w : words) {
		sentence.append(w);
	}
	return sentence.toString();
}
/* The running time is O(n^2) where n is number of letters in sentence */
/* Each time you call append, you need to run through the entire sentence again to append and copy over to the appended sentence */

/* ---------------------------------------------------- */
/* -------------- Chapter 1 Questions ------------------*/
/* 1.1 - Implement an algorithm to determine if a string has */
/* all unique characters. What if you can not use additional data structures? */
public class Chapter1() {
	public static boolean uniqueChars(String test) {
		boolean[] charList = new boolean[256];
		for (int i = 0; i < test.length(); i++) {
			int val = test.charAt(i);
			if (charList[val]) {
				return false;
			}
			charList[val] = true;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = Scanner(System.in);
		String test = scan.nextLine();
		System.out.println(uniqueChars(test));
	}
}

/* 1.2 - Write code to reverse a C-Style String */
public class Chapter1() {
	public static String reverseString(String test) {
		StringBuffer sb = new StringBuffer();
		int max = test.length();
		for (int i = max - 1; i >= 0; i--) {
			sb.append(test.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner scan = Scanner(System.in);
		String test = scan.nextLine();
		System.out.println(reverseString(test));
	}
}

/* 1.3 - Design an algorithm and write code to remove the duplicate characters in a string */
/* Do this without using an additional buffer. */



