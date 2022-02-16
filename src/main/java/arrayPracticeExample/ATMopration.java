package arrayPracticeExample;

import java.util.Scanner;

public class ATMopration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 523 ;
		int [] array = {2000,500,200,100,50,20,10,5,1};
		int [] noteCounter = new int[9];
		
		for(int i=0;i<9;i++)
		{
			if(amount >= array[i]) {
				noteCounter[i]=amount/array[i];
				amount = amount - (noteCounter[i]*array[i]);
			}
		}
		System.out.println("Currency note = ");
		for(int i=0;i<9;i++)
		{
			if(noteCounter[i]!=0)
			{
				System.out.println(array[i] + "   =   " + noteCounter[i]);
			}
		}
	}	

}
