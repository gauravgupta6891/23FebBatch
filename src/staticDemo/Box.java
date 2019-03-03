package staticDemo;

public class Box {
	
	static int l=10;
	int b=20;
	int h=30;
	
	public static void main(String[] akhilesh) {
		
		Box smallBox = new Box();
		
		Box.l++;
		smallBox.b++;
		
		System.out.println(smallBox.l);
		System.out.println(smallBox.b);
		System.out.println(smallBox.h);
		
		Box middleBox = new Box();
		
		middleBox.l++;
		middleBox.h++;
		System.out.println(middleBox.l);
		System.out.println(middleBox.b);
		System.out.println(middleBox.h);
		
       Box bigBox = new Box();
		
        bigBox.l++;
        bigBox.b++;
		System.out.println(bigBox.l);
		System.out.println(bigBox.b);
		System.out.println(bigBox.h);
	}

}
