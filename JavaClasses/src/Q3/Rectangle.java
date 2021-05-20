package Q3;

class Rectangle {
	
	int length;
	int breadth;
	
	public Rectangle ( int l, int b) {
		length = l;
		breadth = b;
	}
	public int CalculateArea() {
		return length*breadth;
	}
    public int CalculatePerimeter() {
    	return 2*(length*breadth);
    }
   }
    class Answer{
	public static void main(String[] args){
		Rectangle x = new Rectangle (4,5);
		Rectangle y = new Rectangle (5,8);
		
System.out.println("Area : " + x.CalculateArea() + "Perimeter is " + x.CalculatePerimeter());
System.out.println("Area : " + y.CalculateArea() + "Perimeter is " + y.CalculatePerimeter());
		

	}
    }

