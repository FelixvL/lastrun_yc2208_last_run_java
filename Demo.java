class Demo{   // QC
	public static void main(String[] args){
		System.out.println("Hij doet het");
		Jas jas = new Jas();
		Jas jas2 = new Jas();
	}	
}


class Jas{
	int knoop = knopen();
	static int knopen(){
		System.out.println("in knopen");
		return 17;
	}
	Jas(){
		System.out.println("in Jas");
	}
}