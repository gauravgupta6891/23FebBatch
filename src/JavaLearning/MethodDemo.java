package JavaLearning;

public class MethodDemo {
	
	int a =10;
	
	public int sum(int c){
		
		int f = c+c*2;
		
		return f;
	}
	
	public static void main(String[] args) {
		
		MethodDemo abc = new MethodDemo();
		int c=abc.sum(6);
		
		System.out.println(c*3);
		
		int d = abc.sum(9);
		System.out.println(d*2);
		
		
	}

}
