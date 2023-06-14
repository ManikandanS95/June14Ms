package org.course;

public class StringS {
	public static void main(String[] args) {
		String s="Engineering Filed";
		int len = s.length();
		System.out.println(len);
		String r = s.replace("g", "Java");
		System.out.println(r);
		String reverse = new StringBuffer(s).reverse().toString();
	     
	      System.out.println(reverse);
	      String revString = "";

	      for (int i = s.length() - 1; i >= 0; --i) {
	       revString += s.charAt(i);
	      }

	      System.out.println(revString);
	      System.out.println(s.contains("gine"));
	   System.out.println(s.toUpperCase());
	
	    
		 
      
    }
}
	


