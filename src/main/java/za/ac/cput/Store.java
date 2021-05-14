package za.ac.cput;
/*
* Grant Hendricks
* 215138848
* */

import java.util.*;

public class Store {
    public static void main (String[] args){

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");        /* add */
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Kia");
        System.out.println(cars);
        cars.remove("BMW");        /* remove */
        System.out.println(cars);

        System.out.println("\n");

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Japan", "Kyoto");        /* add */
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("South Africa", "Pretoria");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("South Africa"));        /* find */
        capitalCities.remove("Germany");        /* remove */
        System.out.println(capitalCities);

        System.out.println("\n");

        HashSet<String> laptops = new HashSet<String>();
        laptops.add("Lenovo");
        laptops.add("HP");
        laptops.add("Asus");
        laptops.add("MacBook");
        laptops.add("Dell");
        laptops.add("Toshiba");

        System.out.println(laptops);
        laptops.remove("Dell");
        System.out.println(laptops);

        if(laptops.contains("Asus")){
            System.out.println("Asus is in Set");
        }
        else {
            System.out.println("Asus is NOT in Set");
        }
    }
}
