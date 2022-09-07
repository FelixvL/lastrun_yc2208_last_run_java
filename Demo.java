class Demo{   // UP
	public static void main(String[] args){
		Fiets f = new Fiets();
		Fiets f2 = new Fiets();
		lopen(f);
		System.out.println("einde");
	}
	static void lopen(Object x){
		System.out.println("we zijn hier");
	}
}


class Fiets{
	int a = hoi();

	static int hoi(){
		System.out.println("hoi");
		return 7;
	}

}