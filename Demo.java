class Demo{   // MA
	public static void main(String[] args){
		System.out.println("a");
		B b = new B();
		b.ben();
	}	
}


class B{
	int b;
	void ben(){
		System.out.println("Ben toch");
		throw new RuntimeException();
	}

}
