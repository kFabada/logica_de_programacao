package Orientacao_Objeto;

public class produto {

    public String name;
    public double price;
    public int quantity;

    public produto(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValoueInStock(){

        return price * quantity;
    }

    public void addProducts(int quantity){

        this.quantity += quantity;
    }

    public void removeProducts(int quantity){

        this.quantity -= quantity;
    }
    public String toString(){
        return name
              + ",$"
              + String.format("%.2f", price)
              + ", "
              + quantity
              + " units, Total: $ "
              + String.format("%.2f", totalValoueInStock());
    }
}
