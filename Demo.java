class Demo{   // QI
	public static void main(String[] args){
		System.out.println("Hij doet het");
		Kleding jas = new Jas();
		System.out.println(jas.knoop);
		jas.knopen();

	}	
}


class Jas extends Kleding{
	int knoop = 55;
	int knopen(){
		System.out.println("in knopen");
		return 17;
	}
}
class Kleding{
	int prijs;
	int knopen(){
		System.out.println("in knopen kleding");
		return 18;
	}
}