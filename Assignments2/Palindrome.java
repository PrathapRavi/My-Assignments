package Assignments2;

public class Palindrome {
	public static void main(String[] args) {
		
		  int reminder;
		  int reverse;
		  int temp;    
		  int num=34343;
		  temp=num; 
		  
		 for(reverse=0; num>0; num/=10)
		  {    
		   reminder = num%10;
		   reverse=( reverse * 10) + reminder;    
		      
		  }    
		  if(temp==reverse)  {
			  
		  
		   System.out.println("The number is a palindrome number ");   
	}
		  else 
		  { 
		   System.out.println("The number is a not palindrome");
		  }

	}
}
