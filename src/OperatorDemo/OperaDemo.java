package OperatorDemo;

public class OperaDemo {
	
	public static void main(String[] args) {
		
		
		System.out.println(2+3+"Akhilesh"+2+3);
		
		System.out.println(2==3);
		
		try{
		int b=12;
		b = b++ + ++b +b++ +b--;
		System.out.println(b);
		}catch(NumberFormatException t){
			
		}
		int a=11;
		
		if(a%2==0){
			
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
		
		
		
	}

}
