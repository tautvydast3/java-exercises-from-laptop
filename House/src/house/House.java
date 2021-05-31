
// House.java

package house;


import java.util.ArrayList;

public class House {

    Integer id;
    String title;
    String address;
    String zipCode;
    String city;
    Enum type;
    Double price;
    Boolean isSold;

    public House(Integer id,
                 String title,
                 String address,
                 String zipCode,
                 String city,
                 Enum type,
                 Double price,
                 Boolean isSold) {

        this.id = id;
        this.title = title;
        this.zipCode = zipCode;
        this.city = city;
        this.type = type;
        this.price = price;
        this.isSold = isSold;
    }


    // Metodas allHouse masyvo objektu atvaizdavimui
//    public static void display(ArrayList<House> allHouse) {
//        for (House i : allHouse) {
//            System.out.println(i.title);
//
//        }
//
//    }

    // Metodas allHouses masyvo objektu atvaizdavimui
//    public static void displaySort(ArrayList<House> allHouses) {
//        House expensiveHouses = null;
//        for (House i : allHouses) {
//            if (i.price == Main.expensivePrice) {
//
//            }
//        }
//
//    }

    //SUKURK SORTINIMO CIKLA MAIN FUNKCIJOJ, PAŽIŪRĖK AR GAUNASI
//    public static void displayExpensive(ArrayList<House> expensiveHouses) {
//        for (House i : expensiveHouses) {
//            System.out.println(i.title);
//        }
//
//
//    }


}
