import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class PizzaBase {
    private String size;
    private String type;
    private String toppings,mode;

    private long bill_size= 0 , bill_type = 0 , bill_toppings = 0 ,bill_mode =0 ,total_bill = 0;

    

    PizzaBase()
    {
        Scanner sc = new Scanner(System.in);
        
        // Asks if u want a small, medium or Large pizza
        while(true) {
            System.out.println("Do you want small, medium or large : ?");
            System.out.println("press 's' : small \npress 'm' : medium \npress 'l': large");
            this.size = sc.next();
            this.size.toLowerCase();

            if (size.charAt(0) == 's') {
                System.out.println("You have selected small");
                this.bill_size = this.bill_size + 300;
                this.size = "small";
                break;

            } else if (size.charAt(0) == 'm') {
                System.out.println("You have selected medium");
                this.bill_size = this.bill_size + 450;
                this.size = "medium";
                break;

            } else if (size.charAt(0) == 'l') {
                System.out.println("You have selected large");
                this.bill_size = this.bill_size + 550;
                this.size = "large";
                break;

            } else {
                System.out.println("wrong input please click again !!");
            }
        }
        
        // Asks if you want a veg or a nonveg pizza
        while (true) {
            System.out.println("Do you want Veg or Non-veg ?");
            System.out.println("press 'v': veg \npress 'n': non-veg");
            this.type = sc.next();
            this.type.toLowerCase();
            if (type.charAt(0) == 'v') {
                System.out.println("You have selected Veg");
                this.type = "veg";
                this.bill_type = this.bill_type + 100;
                break;
            } else if (type.charAt(0) == 'n') {
                System.out.println("You have selected Non-Veg");
                this.bill_type = this.bill_type + 200;
                this.type = "non - veg";
                break;
            } else {
                System.out.println("wrong input please click again !!!");
            }
        }
        
        // Asks if u need toppings  or not
        while (true) {
            System.out.println("Do you need toppings ?");
            System.out.println("press 'y': yes \npress 'n': no");
            this.toppings = sc.next();
            this.toppings.toLowerCase();
            if (toppings.charAt(0) == 'y') {
                System.out.println("You get extra toppings");
                this.bill_toppings = this.bill_toppings + 200;
                this.toppings = "yes";
                break;
            } else if (toppings.charAt(0) == 'n') {
                System.out.println("no extra toppings");
                this.toppings = "no";
                break;
            } else {
                System.out.println("wrong input please click again !!!");
            }
        }
        
        //Dine in or Take away
        while (true) {
            System.out.println("Do you want to dine-in or take-away ?");
            System.out.println("press 'd': dine-in \npress 't': take-away");
            this.mode = sc.next();
            if (mode.charAt(0) == 'd') {
                System.out.println("You are Dining here .");
                this.mode = "dine-in";
                break;
            } else if (mode.charAt(0) == 't') {
                System.out.println("You are taking away .");
                this.bill_mode = this.bill_mode + 20;
                this.mode = "take-away";
                break;
            } else {
                System.out.println("wrong input please click again !!!");
            }
        }
        bill_customer();
    }
    
    public void bill_customer()
    {
        System.out.println("Size :  "+this.size + " = " + this.bill_size);
        System.out.println("Type  : "+this.type + " = " + this.bill_type);
        System.out.println("Extra topping : "+ this.toppings + " = " + this.bill_toppings);
        System.out.println("Mode : "+this.mode + " = " + this.bill_mode);
        this.total_bill = this.bill_size+this.bill_type+this.bill_toppings+this.bill_mode;
        System.out.println("TOTAL = " + this.total_bill +" Rupees Only");

        
    }
}
 