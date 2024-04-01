public class Main {
    public static void main(String[] args) {
        MenuBuilder menu = new MenuBuilder();

        // adding food to the menu
        menu.addFoodItem("pizza", 20.00);
        menu.addFoodItem("Hamburger", 10.99);
        menu.addFoodItem("cupcake", 7.99);

        // adding drinks to the menu
        menu.addDrinkItem("soda", 6.90);
        menu.addDrinkItem("lemonade", 7.90);
        menu.addDrinkItem("iced coffee", 6.90);

        // printing menu
        menu.printMenu();


        // client's ordering:
        String[] selectedFoodItems = {"pizza"};
        String[] selectedDrinkItems = {"lemonade"};


        //creating variable to get the final bill
        double bill = menu.calculateTotalBill(selectedFoodItems, selectedDrinkItems);

        //printing the final bill

        System.out.println("\n Client's Bill: " + "$" + bill );
    }
}
