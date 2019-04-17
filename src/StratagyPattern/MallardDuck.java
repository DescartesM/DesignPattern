package StratagyPattern;
public class MallardDuck extends Duck{
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public void display(){
		System.out.println("I am a real Mallard duck");
	}
}
