package com.mulejava;

public class StringManipulation {
  
  
  public String result;
  
  public StringManipulation() {
  }
  public void ConcatAB(String value1, String value2) {
    result = value1 + value2;	
  }
  public static String staticFunctionTest() {
    return "static funtion invoked";	
  }
  public static String toCamelCase(final String init) {
	    if (init == null)
	        return null;

	 

	    final StringBuilder ret = new StringBuilder(init.length());

	    for (final String word : init.split(" ")) {
	        if (!word.isEmpty()) {
	            ret.append(Character.toUpperCase(word.charAt(0)));
	            ret.append(word.substring(1).toLowerCase());
	        }
	        if (!(ret.length() == init.length()))
	            ret.append(" ");
	    }

	 

	    return ret.toString();
	}

}