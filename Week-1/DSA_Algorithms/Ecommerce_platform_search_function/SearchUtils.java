import java.util.*;

public class SearchUtils{

    public Products LinearSearch(List<Products> product,String targetname){
        for(var item:product){
            if(item.getProductname().equals(targetname))
                return item;
        }
        return null;
    }

    public Products BinarySearch(List<Products> product,String targetname){
        int high = product.size();
        int low = 0;
        while(low<=high){
            int mid = (low+high)/2;
            int temp = product.get(mid).getProductname().compareTo(targetname);
            if(temp < 0){
                high = mid - 1;
            }else if(temp > 0){
                low = mid + 1;
            }else return product.get(mid);
        }
        return null;
    }
}