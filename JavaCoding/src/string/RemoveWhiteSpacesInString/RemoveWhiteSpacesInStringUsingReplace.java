package string.RemoveWhiteSpacesInString;

public class RemoveWhiteSpacesInStringUsingReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "I am    adding extra  spaces     to test this  program";
 
        String str2 = str1.replaceAll("\\s", "");
  
        System.out.println(str2);
  
           }

}
