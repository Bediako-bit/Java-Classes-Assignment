package Q4;

import java.util.Scanner;

class Area {
	int length;
	int breadth;
	
	public Area (int l, int b) {
		length=l;
		breadth=b;
		}
	public int CalculateArea() {
		return (length * breadth);
	}
}
    class Answer{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int l,b;
		
		l= scan.nextInt();
		b= scan.nextInt();
		
		System.out.println("Enter length");
		System.out.println("Enter breadth");
		
		Area a= new Area (l,b);
		System.out.println("Area :" + a.CalculateArea());
		
	}

}
