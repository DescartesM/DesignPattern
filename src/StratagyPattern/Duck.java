package StratagyPattern;
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {
		// TODO Auto-generated constructor stub
	}
	public abstract void display();
	public void performFly(){
		flyBehavior.fly();
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	public void swim(){
		System.out.println("all ducks float, even decoys!");
	}
}
