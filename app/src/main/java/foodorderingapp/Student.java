package foodorderingapp;
import java.util.*;

public class Student {

    private List<FoodItem> cart;
    private List<Order> orderHistory;
    public Student(int userId, String name, String phoneNumber, String email) {
        super(userId, name, phoneNumber, email,"Student");
        cart=new ArrayList<>();
        orderHistory=new ArrayList<>();
    }
    public void viewMenu(Menu menu){
        menu.displayItems();

    }   
    public void addToCart(FoodItem item){
        if (item.isAvailable()) {
            cart.add(item);
            System.out.println(item.getName()+" added to cart.");
        } else {
            System.out.println("Sorry,"+item.getName() +" is currently unavailable.");
        }
        
    }
    public void placeOrder(){
        if(cart.isEmpty()){
            System.out.println("Cart is empty.Please add items to place order.");
            return;
        }
        double totalAmount=0;
        for(FoodItem item:cart){
            totalAmount+=item.getPrice();
        }
        System.out.println("Order placed successfully.Total amount:"+totalAmount);
        orderHistory.add("Order Amount:"+totalAmount);
        cart.clear();
    }
    public void viewOrderHistory(){
        System.out.println("Order History:");
        for(String order:orderHistory){
            System.out.println(order);
        }

    }
    public void cancelOrder(){
        cart.clear();
        System.out.println("Current order cancelled.");
    } 
    
}
