class Demo{   // QD
	public static void main(String[] args){
		System.out.println("Hij doet het");
		Jas jas = new Jas();
		Jas jas2 = new Jas();
	}	
}


class Jas{
	static int knoop = knopen();
	int knopen(){
		System.out.println("in knopen");
		return 17;
	}
	Jas(){
		System.out.println("in Jas");
	}
}