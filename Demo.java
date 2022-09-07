class Demo{   // UX
	public static void main(String[] args){
		Fiets f = new MountainBike();
		f.fietsen();
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
	void fietsen(){
		System.out.println("f in f");
	}
}
class MountainBike extends Fiets{
	int snelheid = 15;
	void fietsen(){
		System.out.println("f in mb");
	}
}