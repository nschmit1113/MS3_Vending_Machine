public class Snack {
    
    private int amount = 0;
    private double price = 0.0;
    private String name = "";

    public Snack(String name, int amount, double price){
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public void decAmount(){
        if(this.amount <= 0){
            throw new IllegalStateException("Amount is invalid");
        }
        this.amount--;
    }

    public void addAmount(){
        this.amount++;
    }

    public int checkAmount(){
        return this.amount;
    }

    public double checkPrice(){
        return this.price;
    }

    public String checkName(){
        return this.name;
    }
}
