package arrayPracticeExample;



public class stringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 
		String str = "Sumita Vala";
		
		String revstr = "";
		int j;
 		
			for(j=str.length()-1;j>=0;j--)
			{
				revstr= revstr + str.charAt(j);
			}	
		
		System.out.println("Reverse string = "+revstr);
	
	
	String str1 = "Sumita Vala";
	char [] strsort = str1.toCharArray();
	//Arrays.sort(strsort);
	int count=0;
	for(int i=0;i<str1.length();i++)
	{
		if(str1.charAt(i)!=' ')
			System.out.println();
			count++;
	}
	System.out.println(count);
}
	public static void stringanagram(String str1, String str2) {
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Both are not anagram");
		}
	}

}
