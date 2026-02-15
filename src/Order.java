public class Order{
  private int orderId;
  private int itemId;
  private int quantity;
  private LocalDateTime orderDateTime;
  private String status;
  private double totalAmount;

   public Order(int orderId, int orderId,int quantity ,double totalAmount){
    this.orderId=orderId;
    this.itemId=itemId;
    this.quantity=quantity;
    this.orderDateTime=LocalDateTime.now();
    this.status="Placed";
    this.totalAmount=totalAmount;
    }
}
  
