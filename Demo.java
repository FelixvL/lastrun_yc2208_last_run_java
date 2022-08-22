class Demo{   // QF
	public static void main(String[] args){
		System.out.println("Hij doet het");
		Jas jas = new Jas();
		System.out.println(jas.prijs);

	}	
}


class Jas extends Kleding{
	int knoop = knopen();
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
}