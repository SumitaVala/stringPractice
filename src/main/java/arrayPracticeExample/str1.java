package arrayPracticeExample;



import java.util.Arrays;
import java.util.Scanner;
public class str1 {
   public static void main(String args[]) {
     // Scanner sc = new Scanner(System.in);
	   String str ="sumita";
    //  System.out.println("Enter a string value: ");
    //  String str = sc.nextLine();
      char charArray[] = str.toCharArray();
      Arrays.sort(charArray);
      System.out.println(new String(charArray));
      
      str1 objstr = new str1();
      objstr.vowelandconinstr();
   }
   
   static public void vowelandconinstr() {
	   
	   String str = "sumita vala";
	   int vCount =0, cCount=0;
	   for(int i=0;i<str.length();i++)
	   {
		   if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
		   {
			   vCount++;
		   }
		   else if((str.charAt(i)>='a' && str.charAt(i)<='z')) //|| (str.charAt(i)>='A' && str.charAt(i)<='Z'))
		   {
			   cCount++;
		   }
		   
	   }
	   System.out.println("Vowel " +vCount);
	   System.out.println("Consonant "+ cCount);
   }
   
}
