package string.RemoveWhiteSpacesInString;

public class RemoveWhiteSpacesInStringWithoutUsingReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "I am    adding extra  spaces     to test this  program";
		  
	    char[] chars = str1.toCharArray();
	  
	     StringBuffer sb = new StringBuffer();
	  
	        for (int i = 0; i<chars.length; i++)
	        {
	            if( (chars[i] != ' ')&& (chars[i] != '\t') )
	            {
	                sb.append(chars[i]);
	            }
	        } 
	        System.out.println(sb); 

	}

}
