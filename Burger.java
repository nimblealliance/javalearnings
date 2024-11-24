import java.util.Scanner;

public class Burger {

    public String type="Regular";
    public double Price=100.0;
    public int toppings;

    public Burger(){}

    public Burger (String type){
        this.type=type;
        this.toppings=0;
        setPrice();
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(){
        if (type.equalsIgnoreCase("large")){
            Price=150.0;
            setType("Large");
        }
        else if (type.equalsIgnoreCase("deluxe")) {
            Price = 200.0;
            setType("Deluxe");
        }

        else {
            Price = 120.0;
            setType("Medium");
        }
    }

    public void setType(String type1){
        type = type1;
    }

    public void addToppings(){
        int maxToppings;
        if (getClass().getSimpleName().equals("Burger")){
            maxToppings=3;
        }
        else {
            maxToppings=5;
        }

        Scanner s1 = new Scanner(System.in);
        while (toppings<maxToppings){
            int breaked = 0;
            System.out.println();
            System.out.println("The options for toppings are:\n" +
                    "Press 1 for Pickles @5 rs\n" +
                    "Press 2 for Tandoori Sauce @10 rs\n" +
                    "Press 3 for Cheese @10 rs\n" +
                    "Press 4 Egg @10 rs\n" +
                    "Press 5 Chicken Patty @50 rs\n" +
                    "Press any other number to exit...");
            System.out.println("Enter the topping you need: ");
            
            int option=s1.nextInt();

            switch (option){
                case 1:
                    System.out.println("Adding extra pickles...");
                    Price = Price +5.0;
                    toppings++;
                    break;
                case 2:
                    System.out.println("Adding extra Tandoori sauce...");
                    Price = Price +10.0;
                    toppings++;
                    break;

                case 3:
                    System.out.println("Adding extra cheese...");
                    Price = Price +10.0;
                    toppings++;
                    break;

                case 4:
                    System.out.println("Adding extra egg...");
                    Price = Price +10.0;
                    toppings++;
                    break;

                case 5:
                    System.out.println("Adding an extra chicken patty...");
                    Price = Price +50.0;
                    toppings++;
                    break;

                default:
                    System.out.println("Exiting...");
                    return;

            }
            if (breaked>0){
                break;
            }

        }

        if (toppings >= maxToppings){
            System.out.println("You can only add up to "+maxToppings+" extra toppings in your burger");
        }

        System.out.println("The Price of your burger with extra toppings is "+ getPrice());
        s1.close();
    }
}

class DeluxeBurger extends Burger{

    public DeluxeBurger(){
        super("Deluxe");
        Price= 200.0;
    }

    @Override
    public void addToppings(){
        super.addToppings();
    }
}