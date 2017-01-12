import java.util.List;
import java.util.ArrayList;

class Inventory{
    public static void main(String[]args){
        System.out.println("AIABAGS");
        List<Item> INV = new ArrayList();
        float total = 0.0f;

        Item t1 = new Item("MAXX", "Candy", 2.00f);

        Item t2 = new Item("Snow Bear", "Candy", 1.00f);

        Item t3 = new Item("White Rabbit", "Candy", 3.00f);

        Item t4 = new Item("Monami", "Candy", 5.00f);

        Item t5 = new Item("Frutos", "Candy", 10.00f);

        Item t6 = new Item("Mentos", "Candy", 15.00f);

        Item t7 = new Item("X.O", "Candy", 6.00f);

        Item t8 = new Item("Halls", "Candy", 3.00f);

        Item t9 = new Item("Lipps", "Candy", 20.00f);

        Item t10 = new Item("Yakee", "Candy", 25.00f);

        INV.add(t1);
        INV.add(t2);
        INV.add(t3);
        INV.add(t4);
        INV.add(t5);
        INV.add(t6);
        INV.add(t7);
        INV.add(t8);
        INV.add(t9);
        INV.add(t10);
        for(Item a: INV){
            if(a.Getname()=="X.O"){
                System.out.println("Gotcha!");
            }else{
                System.out.println("Nope");
            }
            total = total + a.Getprice();
        }
        System.out.println(total);
    }
}