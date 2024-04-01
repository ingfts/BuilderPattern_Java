import java.util.Map;
import java.util.HashMap;

public class MenuBuilder {
    private Map<String, Double> foodMenu = new HashMap<>();
    private Map<String, Double> drinkMenu = new HashMap<>();

    public MenuBuilder addFoodItem(String itemName, double price){
        foodMenu.put(itemName, price);
        return this;
    }

    //add drink items to the drinkMenu
    public MenuBuilder addDrinkItem (String itemName, double price){
        drinkMenu.put(itemName, price);
        return this;
    }


    /*-----------------Comments-----------------------

    -Entry -> Interface that represents the key/value pair in a map
    -<String, Double> -> Data type of each element in the 'foodMenu'
    -entry -> instance of Entry
    -entrySet() -> similar to an index iterating over elements in an array or a list in a loop
    -getKey() -> get the key (name of the food) of the pair (key/value)
    -getValue() -> get the value (price of the food) of the pair (key/value)
    */

    public void printMenu(){
        System.out.println("------ Menu ------");
        for (Map.Entry<String, Double> entry : foodMenu.entrySet()){
            System.out.println(entry.getKey() + "- $ " + entry.getValue());
        }
        for (Map.Entry<String, Double> entry: drinkMenu.entrySet()){
            System.out.println(entry.getKey() + " - $ " + entry.getValue());
        }
        System.out.println("------------------");


    }



    /*-----------------Comments--------------------

     -selectedFoodItems & selectedDrinkItems -> Both arrays of String type
        for loop:
     -foodItem -> variable that represents each item (food) in the array 'selectedFoodItems'
        if:
     -foodMenu -> reference to the Map object
     -foodMenu.containsKey(foodItem) -> checks if the current item (key) being processed in the loop exists in the 'foodMenu' map
        if it does, then the variable 'totalBill' gets the price of the current food item added
    */

    public double calculateTotalBill (String[] selectedFoodItems, String[] selectedDrinkItems){
        double totalBill = 0.0;

        for (String foodItem : selectedFoodItems){
          if (foodMenu.containsKey(foodItem)){
              totalBill = totalBill + foodMenu.get(foodItem);
          }
        }

        for (String drinkItem : selectedDrinkItems){
            if (drinkMenu.containsKey(drinkItem)){
                totalBill = totalBill + drinkMenu.get(drinkItem);
            }
        }
        return totalBill;
    }





}
