package Products;

public class Product{
    String name;
    int amount;

    public Product(String name){
        this.name = name;
        this.amount=0;
    }

    public void setAmount(){
        amount++;
    }

    public String getName(){
        return name;
    }

    public int getAmount(){
        return amount;
    }
}