import java.util.Scanner;

public class Drink {

    private String size;
    private double drinkPrice;

    private final String type ="Coke";

    public Drink() {
        this.drinkPrice = 30.0;
        this.size = "Small";
    }

    public Drink(String size , double drinkPrice){
        this.size=size;
        this.drinkPrice = drinkPrice;
    }

    public void getBiggerDrink(String size) {
        if (size.equalsIgnoreCase("large")) {
            System.out.println("Adding a large Coke @ 50 rs");
            setDrinkPrice(50.0);
            setSize("Large");
        } else {
            System.out.println("Adding a medium Coke @ 40 rs");
            setDrinkPrice(40.0);
            setSize("Medium");
        }
    }

    public String getDrinkSize() {
        return size;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }
}

class SideItem {

    private String type="Fries";
    private double sideItemPrice =20.0;


    public SideItem(String type) {
        this.type = type;

    }

    public void getOtherSides() {
        Scanner s1 = new Scanner(System.in);
        System.out.println();
        System.out.println("The options for other sides are:\n" +
                "Press 1 for Chicken popcorn @30 rs\n" +
                "Press 2 for Chicken Wings @40 rs\n");

        System.out.println("Enter the side item you need: ");
        int option = s1.nextInt();
        switch (option) {
            case 1:
                System.out.println("Adding Chicken popcorn @30 rs");
                sideItemPrice = 30.0;
                type = "Chicken popcorn";
                break;

            case 2:
                System.out.println("Adding Chicken Wings @40 rs");
                sideItemPrice = 40.0;
                type = "Chicken wings";
                break;

            default:
                System.out.println("Exiting...");
                break;

        }
        s1.close();
    }

    public String getSideItemType(){
        return type;
    }

    public double getSideItemPrice() {
        return sideItemPrice;
    }
}
