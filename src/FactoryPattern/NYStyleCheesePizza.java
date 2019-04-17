package FactoryPattern;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "NYStyleCheesePizza";
        dough = "dasd";
        sauce = "sadsa";
        toppings.add("dasdsa");
    }
    @Override
    void prepare(){
        System.out.println("NY prepare pizza\n");
    }
}
