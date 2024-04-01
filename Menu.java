public class Menu {
    private String itemName;
    private Double price;


    public Menu(String itemName, Double price){
        this.itemName = itemName;
        this.price = price;

    }

    public String getName (){

        return itemName;
    }

    public Double getPrice(){
        return price;
    }

}
