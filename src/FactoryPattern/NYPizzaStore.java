package FactoryPattern;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item){
        if (item.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        else if(item.equals("veggie")){
            return new NYStyleVeggiePizza();
        }
        else return null;
    }
}
