package arrays;

public class singleElement {
    public static void main(String[] args){
        int result = 0;
        int [] arr = {2, 3, 5, 645, 2, 3, 5};
        for(int i = 0; i < arr.length ; i++){
            result = result^arr[i];
        }
        System.out.println(result);
    }
}
