package IfElseDemo;

public class CheckIfElse {

	public static void main(String[] args) {
		int age =40;

     if(age<18){
    	 
    	 System.out.println("Not elgible for Voting");
      }
     else if(age>=18 && age<=40){
    	System.out.println("Eligible for Voting");
       }
     else if(age>=40 && age<=60){
    	 System.out.println("Senior citizon");
    	 if(age==60){
    		 System.out.println("Extra previledge");
    	 }
     }
      else{
    	System.out.println("Something wrong"); 
     }
		
		
	}

}
