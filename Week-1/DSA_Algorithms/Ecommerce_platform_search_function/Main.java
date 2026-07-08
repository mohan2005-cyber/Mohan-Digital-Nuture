import java.util.*;

class Main {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        SearchUtils search = new SearchUtils();

        String productname = "Laptop";

        List<Products> products = List.of(
                new Products("Laptop",86000,"Electronic"),
                new Products("PC",26300,"Electronic"),
                new Products("Computer",50000,"Electronic"),
                new Products("Desktop",60000,"Electronic")
        );

        System.out.println("Linear Search on Products for " + productname + " :");
        System.out.println(search.LinearSearch(products,productname));
        System.out.println("\nBinary Search on Products for " + productname + " :");
        System.out.println(search.BinarySearch(products,productname));
    }
}