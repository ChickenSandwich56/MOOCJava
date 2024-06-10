public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String initialName,int initialPrice ,int initialQuantity)
    {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    public void printProduct()
    {
        System.out.println("Product Name: "+this.name+", price: £"+ this.price+", " +this.quantity + " pcs");
    }
    
}
