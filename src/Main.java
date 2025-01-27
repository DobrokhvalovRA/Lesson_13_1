import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void showFruits() {
        HashSet<String> noOneFruit = new HashSet<>();
        String[] fruits = new String[]{"Яблоко" , "Персик" , "Груша" , "Груша" , "Апельсин" , "Ананас" , "Ананас" , "Яблоко" , "Киви" , "Груша" , "Яблоко" , "Банан"};

        for (var fruit : fruits){
            int count = 0;
            for (int i = 0; i < fruits.length; i++){
                if (fruit.equals(fruits[i])) count++;
            }
            if (count == 1) System.out.println(fruit);
            else noOneFruit.add(fruit + " встречается " + count + " раз.");
        }
        for (var fruit : noOneFruit) {
            System.out.println(fruit);
        }



        /*HashSet<String> noOneFruit = new HashSet<>();
        ArrayList<String> fruits = new ArrayList<>(16);
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Киви");
        fruits.add("Апельсин");
        fruits.add("Киви");
        fruits.add("Гранат");
        fruits.add("Персик");
        fruits.add("Яблоко");
        fruits.add("Груша");
        fruits.add("Яблоко");
        fruits.add("Груша");
        fruits.add("Груша");

        for (var fruit : fruits) {
            int count = 0;
            for (int i = 0; i < fruits.size(); i++) {
                if (fruit.equals(fruits.get(i))) count++;
            }
            if (count == 1) System.out.println(fruit);
            else noOneFruit.add(fruit + " встречается " + count + " раз.");
        }
        for (var fruit : noOneFruit) {
            System.out.println(fruit);
        }*/
    }

    public static void main(String[] args) {
        showFruits();
    }
}