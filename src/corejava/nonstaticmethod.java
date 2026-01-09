package corejava;
  class nonstaticmethod {

	public static void main(String[] args) {
		
//		 creating object
		nonstaticmethod obj = new nonstaticmethod();
		
		
//		2. call nonstaticmethod using object
		 obj.add();

	}

void add() {
		
	System.out.println("addition is : " + (10+7));
	}
}
