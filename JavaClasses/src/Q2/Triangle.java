package Q2;

class Triangle {
	int a,b, c;
	
	public double Area() {
		double s = (a+b+c)/2;
		return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
	}

public double Perimeter(){
  return (a+b+c)/2.0;
}
}
    class Answer{
    	  public static void  main(String[] args){
    		    Triangle t = new Triangle();
    		    t.a = 2;
    		    t.b = 5;
    		    t.c = 6;
    		    System.out.println(t.Area());
    		    System.out.println(t.Perimeter());
    		  }
    		}		
