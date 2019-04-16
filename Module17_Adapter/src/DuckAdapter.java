import java.util.Random;

public class DuckAdapter implements Turkey{
	Duck duck;
	Random rand;
	
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}
	
	public void gobble() {
		duck.quack();
	}
	
	public void fly() {
		System.out.println("fly() method called!");
		if(rand.nextInt(5)==0) {
			duck.fly();
		}
	}
}