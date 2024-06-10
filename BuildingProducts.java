public class BuildingProducts {
    private String productName;
    private String productLocation;
    private int productWeight;

    public BuildingProducts(String name)
    {
        
        this.productName = name;
        this.productLocation = "Shelf";
        this.productWeight = 1;
    }
    public BuildingProducts(String name, String location)
    {
        this.productName = name;
        this.productLocation = location;
        this.productWeight=1;

    }
    public BuildingProducts(String name, int weight)
    {
        this.productName = name;
        this.productWeight = weight;
        this.productLocation = "Shelf";
    }

    @Override
    public String toString(){
        
        return "Name: "+this.productName+", Location:"+this.productLocation+", Weight:"+this.productWeight;
    }
}
