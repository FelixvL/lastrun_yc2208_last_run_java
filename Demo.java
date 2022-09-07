class Demo{   // UW
	public static void main(String[] args){
		FietsenMaker piet = new FietsenMaker();
		Fiets f = piet.maken(60);
		f = piet.maken(40);
		System.out.println("einde" + f.snelheid);
	}
}
class FietsenMaker{
	Fiets t = new Fiets();

	Fiets maken(int q){	
		t.snelheid += q + 10;
		return t;
	}
}

class Fiets{
	int snelheid = 5;
}