package foodorderingapp;

public class Admin {
    
    public Admin(int userId, String name, String phoneNumber, String email) {
        super(userId, name, phoneNumber, email,"Admin");
    }
    public void addItem(Menu menu, FoodItem item){
        menu.addItem(item);
        System.out.println(item.getName()+" added successfully.");
    }
    public void removeItem(Menu menu,int itemId){
        menu.removeItem(itemId);
        System.out.println("Item with ID "+itemId+" removed successfully.");

    }
    public void changeAvailability(FoodItem item, boolean isAvailable){
        item.setAvailable(isAvailable);
        System.out.println("Availability updated.");;

    }
    public void updatePrice(FoodItem item, double newPrice){
        item.setPrice(newPrice);
        System.out.println("Price updated for "+item.getName());

    }
    public void viewOrders(){
        System.out.println("View all orders:");
    }
}
