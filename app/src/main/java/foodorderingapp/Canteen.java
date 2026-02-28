package foodorderingapp;

public class Canteen {
    private int canteenId;
    private String canteenName;
    private String location;    
    private Menu menu;
    private LocalDateTime openingTime;
    private LocalDateTime closingTime;

    public Canteen(int canteenId, String canteenName, String location, LocalDateTime openingTime, LocalDateTime closingTime) {
        this.canteenId = canteenId;
        this.canteenName = canteenName;
        this.location = location;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.menu = new Menu();
    }
    public void displayMenu(){

    }
    public getMenu(){
        return menu;
    }
    public boolean isOpen(){
        LocalTime currentTime=LocalTime.now();
        return currentTime.isAfter(openingTime)&& currentTime.isBefore(closingTime);
    }
    }

}
