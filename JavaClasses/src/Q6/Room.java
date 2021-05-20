package Q6;

     class Room {
    	 int roomNo;
    	 String roomType;
    	 double roomArea;
    	 boolean acMachine;
    	 
    	 void setData(int rno, String rt, double area, boolean ac) {
    		 roomNo = rno;
    		 roomType = rt;
    		 roomArea = area;
    		 acMachine = ac;
    		 }
    	 void displayData() {
    		 System.out.println("The room NumberIs" + roomNo);
    		 System.out.println("The room Type is" + roomType);
    		 System.out.println("The room area is" + roomArea);
    		 String s = (acMachine) ? "yes" : "no";
    		 System.out.println("The A / c Machine needed" + s);
    		 
    		 }
    	 Room room1 = new Room();
	public static void main(String[] args) {
		Room room1 = new Room();
		room1.setData(101, "Dynasty", 240.0 , true);
		room1.displayData();
		

	}

}
