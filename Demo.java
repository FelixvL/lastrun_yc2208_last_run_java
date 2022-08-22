class Demo{   // QK
	public static void main(String[] args){
		System.out.println("Hij doet het");
		Kleding jas = new Jas();
		System.out.println(jas.knoop);
		jas.knopen();

	}	
}


class Jas extends Kleding{
	int knoop = 55;
	int prijs = 80;
	int knopen(){
		System.out.println("in knopen"+knoop);
		return 17;
	}
}
class Kleding{
	int prijs;
	int knoop = 70;
	void knopen(){
		System.out.println("in knopen kleding"+knoop);
	}
}