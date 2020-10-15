import java.util.*;
import java.lang.Math;
class octnov2019{
    void fun(){
        Scanner sc = new Scanner(System.in);
        String[] Tiles_Description = {
            "Small black granite",
            "Small grey marble",
            "Small  powder blue",
            "Medium sunset yellow",
            "Medium berry red",
            "Medium glittery purple",
            "Large oak wood effect",
            "Large black granite",
            "Large bamboo effect",
            "Extra-large white marble"};
        System.out.println(Tiles_Description[1]);
        Double[] Price_per_box = {
            19.50,
            25.95, 
            35.75,
            12.50,
            11.00,
            52.95,
            65.00,
            58.98,
            85.00,
            62.75,};
        double[] Height = new double[999];
        double[] Width = new double[999];
        //Task 1
        int count = 0;
        int Number_of_tiles = Tiles_Description.length;
        System.out.println("We have the following tiles: ");
        while (count < Number_of_tiles){
            int Identification_code = count + 1;
            System.out.println(Identification_code + ". " + Tiles_Description[count] + " $" + Price_per_box[count]);
            count = count + 1;
        }
        System.out.println("How many walls do you wish to tile?");
        int walls = sc.nextInt();
        int i = 0;
        double Area = 0;
        while (walls > 0){
            System.out.println("What is the height of the wall you want to tile?: ");
            Height[i] = sc.nextDouble();
            System.out.println("What is the width of the wall you want to tile?: ");
            Width[i] = sc.nextDouble();
            System.out.println("------------------------------------------------------------------------");
            Area = (Height[i] * Width[i]) + Area;
            walls = walls - 1;
            i = i + 1;
        }
        System.out.println("Type in the Sr. Number of the tile you want to buy (Ex--> 7): ");
        int User_tile_wrong = sc.nextInt();
        int User_tile = User_tile_wrong - 1;
        System.out.println("------------------------------------------------------------------------");
        double Packs_needed = Math.round(Area);
        System.out.println("The area of your wall is " + Area);
        double price = Price_per_box[User_tile];
        double cost = price * Packs_needed;
        double waste = ((Packs_needed - Area)/Packs_needed)*100;
        System.out.println("You will need " + Packs_needed + " packs of tiles.");
        System.out.println("The cost of your purchase is " + cost);
        System.out.println(waste + "% of your packs of tiles will be wasted");
    }
}


       // Price_per_box = [
         //   19.50,
         //   25.95, 
         //   35.75,
         //   12.50,
         //   11.00,
         //   52.95,
         //   65.00,
         //   58.98,
         //   85.00,
         //   62.75,
      //  ]
        