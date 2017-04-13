package bai_6;

public abstract class Cat implements Animal {
	int amount = 0;//default
	public int amount1 = 1;
	private int amount2 = 2;
	protected int amount3 = 0;
	
	public void talk(){
		System.out.println("cat talk");
	}
	
	public abstract void run();
	
	public int getAmount2(){
		return amount2 + 1;
	}

}
