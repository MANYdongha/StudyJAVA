package inheritance;

public class Beer {
	String name;
	int alcohol;
	String type;
	
	public Beer() {}

	public Beer(String name, int alcohol) {
		this.name = name;
		this.alcohol = alcohol;
	}

	public void show() {
		System.out.printf("%s(%s) : %d %%\n", name,type,alcohol);
	}
}

class Blanc extends Beer{
	public Blanc(String name, int alcohol) {
		super(name, alcohol);
		type = "밀맥주";
	}
} 

class Cruiser extends Beer{
	String color;
	public Cruiser(String name, int alcohol, String color) {
		super(name, alcohol);
		type = "보드카";
		this.color = color;
	}
	@Override
	public void show() {
		System.out.printf("%s, %s(%s) : %d %%\n", name,color,type,alcohol);
	}
}

class Heineken extends Beer{
	public Heineken(String name, int alcohol) {
		super(name, alcohol);
		type = "라거";
	}
	
}