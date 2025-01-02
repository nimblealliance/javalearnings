public class Main {

    public static void main(String[] args) {
        Burger b1 = new Burger("Medium");
        System.out.println("The Price of a "+b1.getType()+" burger is "+b1.getPrice());
       // b1.addToppings();

        System.out.println();
        Drink d1 = new Drink();
        System.out.println("The Price of a "+d1.getDrinkSize()+" Coke is "+d1.getDrinkPrice());
        d1.getBiggerDrink("Medium");
        System.out.println("The Price of a "+d1.getDrinkSize()+" Coke is "+d1.getDrinkPrice());

        System.out.println();
        SideItem s1 = new SideItem("Fries");
        System.out.println("The Price of a "+s1.getSideItemType()+" is "+s1.getSideItemPrice());

        System.out.println();
        MealOrder m1 = new MealOrder(b1,d1,s1);
        m1.getMealPrice();

        s1.getOtherSides();
        m1.getMealPrice();
        System.out.println();
        b1.addToppings();
        m1.getMealPrice();
        d1.getBiggerDrink("Large");
        m1.getMealPrice();

        DeluxeBurger deluxe = new DeluxeBurger();
        System.out.println("The Price of a "+deluxe.getType()+" Burger is "+deluxe.getPrice());
        deluxe.addToppings();

        Drink d2 = new Drink();
        System.out.println("The Price of a "+d2.getDrinkSize()+" Coke is "+d2.getDrinkPrice());

        SideItem s2 = new SideItem("Fries");
        System.out.println("The Price of a "+s2.getSideItemType()+" is "+s2.getSideItemPrice());

        DeluxeMealOrder dm1 = new DeluxeMealOrder(deluxe,d2,s2);
        dm1.getMealPrice();

    }
}
