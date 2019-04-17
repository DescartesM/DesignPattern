package FactoryPattern;

public abstract class PizzaStore {
    Pizza pizza;
    public Pizza orderPizza(String type){
        pizza = createPizza(type);
        pizza.hashCode();
        pizza.prepare();
        return pizza;
    }
    protected abstract Pizza createPizza(String type);

}
