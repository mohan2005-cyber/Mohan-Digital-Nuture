public class Products implements Comparable<Products>{
    private String productname;
    private double price;
    private String category;

    Products(String productname,double price,String category){
        this.productname = productname;
        this.price = price;
        this.category = category;
    }

    public int compareTo(Products products){
        return this.productname.compareToIgnoreCase(products.getProductname());
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString(){
        return "productname : " + productname + ", price : " + price + ", category : " + category;
    }
}