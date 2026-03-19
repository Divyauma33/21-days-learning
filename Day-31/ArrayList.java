import java.util.Scanner;
import java.util.ArrayList;
//Shopping Card items

public class Demo{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    ArrayList<String> cart=new ArrayList<>();
    for(int i=0;i< 4;i++){
        System.out.println("Enter product : ");
        String product=sc.next();
        cart.add(product);
    }
    System.out.println(cart);
    System.out.println("Enter product to search : ");
    String searchproduct =sc.next();
    if(cart.contains(searchproduct)){
        System.out.println("Product is in the cart");
    }
    else{
        System.out.println("Product is not in the cart");
    }
    System.out.println("Enter item to remove : ");
    String item=sc.next();
    if(cart.remove(item)){
        System.out.println(item +" Removed Successfully");
    }
    else{
        System.out.println(item + " not found in cart ");
    }
    System.out.println("Updated cart : "+ cart);

    }

}
