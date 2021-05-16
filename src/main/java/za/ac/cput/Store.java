package za.ac.cput;
/*
* Grant Hendricks
* 215138848
* */

import java.util.*;

public class Store {


    public static void main (String[] args) {
        myList("polo");
        myMap("Cuba", "Havana");
        mySet("Apple");

    }

    static void myList(String input){

        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Kia");

        System.out.println(cars);

        cars.add(input);
        cars.remove("Kia");
        System.out.println(cars.get(2));

        System.out.println(cars);
    }

    public String myListGet(int num){

        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Kia");

        return cars.get(num);
    }

    public String myListAdd(String input){

        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Kia");
        cars.add(input);

        return cars.get(4);
    }

    public String myListRemove(int num){

        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Kia");

        cars.remove(num);

        return cars.get(num-1);
    }


    static void myMap(String input1, String input2){

        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("Japan", "Kyoto");
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("South Korea", "Seoul");
        capitalCities.put("South Africa", "Pretoria");

        System.out.println(capitalCities);

        capitalCities.put(input1, input2);
        System.out.println(capitalCities.get("South Africa"));
        capitalCities.remove("Germany");

        System.out.println(capitalCities);
    }

    public String myMapGet(String name){

        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("Japan", "Kyoto");
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("South Korea", "Seoul");
        capitalCities.put("South Africa", "Pretoria");

        return capitalCities.get(name);
    }

    public String myMapAdd(String input1, String input2){

        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("Japan", "Kyoto");
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("South Korea", "Seoul");
        capitalCities.put("South Africa", "Pretoria");

        capitalCities.put(input1, input2);

        return capitalCities.get(input1);
    }

    public String myMapRemove(String input){

        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("Japan", "Kyoto");
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("South Korea", "Seoul");
        capitalCities.put("South Africa", "Pretoria");

        capitalCities.remove(input);

        return capitalCities.get("Germany");
    }



    static void mySet(String input){

        HashSet<String> laptops = new HashSet<>();

        laptops.add("Lenovo");
        laptops.add("HP");
        laptops.add("Asus");
        laptops.add("MacBook");
        laptops.add("Dell");
        laptops.add("Toshiba");

        System.out.println(laptops);

        laptops.add(input);
        laptops.remove("Dell");

        if(laptops.contains("Asus")){
            System.out.println("Asus is in Set");
        }
        else {
            System.out.println("Asus is NOT in Set");
        }

    }

    public Boolean mySetGet(String name){

        HashSet<String> laptops = new HashSet<>();

        laptops.add("Lenovo");
        laptops.add("HP");
        laptops.add("Asus");
        laptops.add("MacBook");
        laptops.add("Dell");
        laptops.add("Toshiba");

        return laptops.contains(name);
    }

    public Boolean mySetAdd(String name){

        HashSet<String> laptops = new HashSet<>();

        laptops.add("Lenovo");
        laptops.add("HP");
        laptops.add("Asus");
        laptops.add("MacBook");
        laptops.add("Dell");
        laptops.add("Toshiba");

        laptops.add(name);

        return laptops.contains(name);
    }

    public Boolean mySetRemove(){

        HashSet<String> laptops = new HashSet<>();

        laptops.add("Lenovo");
        laptops.add("HP");
        laptops.add("Asus");
        laptops.add("MacBook");
        laptops.add("Dell");
        laptops.add("Toshiba");

        laptops.remove("Asus");

        return laptops.contains("Asus");
    }
}
