package com.java.distinctstring;

public class FindDistinctLettersInString {

	public static void main(String args[]) {

		//String str1 = "ABC", str2 = "BC";
		
		String str1 = "ABAD", str2 = "BABC";
		String[] ar=getDistinctLettersOfStrings(str1, str2);
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i].isEmpty()) {
				ar[i]=null;
			}
		}
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
	}

	static String[] getDistinctLettersOfStrings(String str1, String str2) {
		
		
		String ar[] = new String[2];

		String op1 = "";
		String op2 = str2;

		for (int i = 0; i < str1.length(); i++) {

			boolean flag = false;
			for (int j = 0; j < str2.length(); j++) {

				if (str1.charAt(i) == str2.charAt(j)) {
					flag = false;
					op2=op2.replaceAll(str1.charAt(i) + "", "");
					break;
				} else {
					flag = true;
				}

			}
			if (flag) {
				op1 = op1.concat(str1.charAt(i) + "");
			}
		}
		ar[0]=op1;
		ar[1]=op2;
		return ar;
	}

}
