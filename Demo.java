class Demo{   // UR
	public static void main(String[] args){
		Fiets f = new Fiets();
		Fiets f2 = new Fiets();
		lopen(f);
		System.out.println("einde" + f2.a);
	}
	static void lopen(Fiets x){
		x.a = 25;
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