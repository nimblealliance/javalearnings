public class MealOrder {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public MealOrder(Burger burger, Drink drink, SideItem sideItem) {
        System.out.println("Adding one Meal order");
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public void getMealPrice(){
        System.out.println("Price of the meal with a "+burger.getType()+" Burger , one "+drink.getDrinkSize()+" Coke and one "+sideItem.getSideItemType()+" is: "+(burger.getPrice()+drink.getDrinkPrice()+sideItem.getSideItemPrice()));
    }

}

class DeluxeMealOrder {

    private DeluxeBurger deluxeBurger;
    private Drink drink;
    private SideItem sideItem;

    public DeluxeMealOrder(DeluxeBurger deluxeBurger, Drink drink, SideItem sideItem) {
        this.deluxeBurger = deluxeBurger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public void getMealPrice(){
        System.out.println("Price of the meal with a "+deluxeBurger.getType()+" Burger , one "+drink.getDrinkSize()+" Coke and one "+sideItem.getSideItemType()+" is: "+(deluxeBurger.getPrice()+drink.getDrinkPrice()+sideItem.getSideItemPrice()));
    }

}
