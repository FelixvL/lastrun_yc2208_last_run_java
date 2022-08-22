class Demo{   // QG
	public static void main(String[] args){
		System.out.println("Hij doet het");
		Kleding jas = new Jas();
		System.out.println(jas.prijs);
		jas.knopen();

	}	
}


class Jas extends Kleding{
	int knoop = 55;
	int knopen(){
		System.out.println("in knopen");
		return 17;
	}
	Jas(){
		super(5);
		System.out.println("in Jas");
	}
}
class Kleding{
	int prijs;
	Kleding(int getal){
		System.out.println("In Kleding");
		prijs = getal;
	}
	int knopen(){
		System.out.println("in knopen kleding");
		return 18;
	}
}