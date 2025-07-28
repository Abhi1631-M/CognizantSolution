package Checkpoint1.BrilliantRestaurant;

public class Restaurant {
    private String customerName;
    private int orderNumber;
    private String deliveryType;
    private String foodName;
    private long phoneNumber;
    public Restaurant(String customerName, int orderNumber, String deliveryType,String foodName, long phoneNumber)
    {
        this.customerName=customerName;
        this.orderNumber=orderNumber;
        this.deliveryType=deliveryType;
        this.foodName=foodName;
        this.phoneNumber=phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public double calculateTotalBill(double cost)
    {
         double tR;
         switch (deliveryType)
         {
             case "HomeDelivery":
                 tR=0.8;
                 break;
             case "Parcel":
                  tR=0.5;
                  break;
             case "NormalOrder":
                 tR=0.3;
                 break;
             default:
                 throw new IllegalArgumentException("Invalid Order Type");
         }
         return (cost*tR)+cost;
    }
}
