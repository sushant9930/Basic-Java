package com.String;

public class MethodsOfString {

	public static void main(String[] args) 
	{
		String s1="Java";
		String s2="Langauge";
		String s3="java";
		String s4="Java";
		String s5=new String("Java");
		
		System.out.println("s1 == s5: "+s1==s5);
		System.out.println("s1 == s2: "+s1==s2);
		System.out.println("s1 == s3: "+s1==s3);
		System.out.println("s1 == s4: "+s1==s4);
		System.out.println();
		
		System.out.println("With equals method check s1 equals s5: "+s1.equals(s5));
		System.out.println("With equals method check s1 equals s2: "+s1.equals(s2));
		System.out.println("With equals method check s1 equals s3: "+s1.equals(s3));
		System.out.println("With equals method check s1 equals s4: "+s1.equals(s4));
		System.out.println();
		
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		System.out.println();
		System.out.println(s1+s2);
		System.out.println(s1);
		System.out.println();
		
		//Compare to
		System.out.println("Compare to: "+s4.compareTo(s5));
		System.out.println("Compare to: "+s2.compareTo(s4));
		System.out.println("Compare to ignore case sensitivity: "+s1.compareToIgnoreCase(s3));
		System.out.println();
		
		//Index of
		//here index number will be return
		System.out.println("Index of given character: "+s1.indexOf('a'));
		System.out.println("First Index of given String: "+s2.indexOf("gau"));
		System.out.println();
		//check character / String present or not value return in boolean value
		System.out.println("Contain an in s2: "+s2.contains("an"));
		System.out.println("Contain ax in s2: "+s2.contains("ax"));
		System.out.println();
		
		//Replace character or String:
		System.out.println("Replace in s2 gu to GU: "+s2.replace("gu", "GU"));
		System.out.println("Replace in s2 g to A: "+s2.replace('g', 'A'));
		System.out.println();
		
		//SubString: 
		System.out.println("SubString from start point: "+s2.substring(3));
		System.out.println("SubString from start point and end with given end point: "+s2.substring(2, 6));   
		//2-6=4(thats why in return print from index 2 to next 4 index)
		System.out.println();
		
		//Check which index contain which character
		System.out.println("Character at: "+s2.charAt(5));
		//its print 5 index character
		System.out.println();
		
		//Start with give character or nor 
		System.out.println("Starts with L ? "+s2.startsWith("L"));
		//give object string start with "L" or "a"
		System.out.println("Starts with a ? "+s2.startsWith("a"));
		System.out.println();
		
		//EndsWith
		System.out.println("Ends with e ? "+(s2.endsWith("e")));
		System.out.println("Ends with a ? "+s1.endsWith("a"));
		System.out.println();
		
		//Length of Give Strings:
		System.out.println("Length of s1: "+s1.length());
		System.out.println("Length of s2: "+s2.length());
		System.out.println("Length of s3: "+s3.length());
		System.out.println("Length of s4: "+s4.length());
		System.out.println("Length of s4: "+s5.length());
	}

}
