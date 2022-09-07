class Demo{   // UT
	public static void main(String[] args){
		FietsenMaker piet = new FietsenMaker();
		Fiets f = piet.maken(60);
		System.out.println("einde" + f.snelheid);
	}
}
class FietsenMaker{
	Fiets maken(int q){
		Fiets t = new Fiets();
		t.snelheid = q + 10;
		return t;
	}
}

class Fiets{
	int snelheid;
}