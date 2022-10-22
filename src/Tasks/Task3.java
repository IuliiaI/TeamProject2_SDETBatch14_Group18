package Tasks;
public class Task3 {
    /*     Create a Class Car that would have the following fields: carPrice and color and method
calculateSalePrice() which should be returning a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its own
implementation of calculateSalePrice() method in which returned price is calculated as
following: if weight>2000 then returned price car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also does it is own implementation of
calculateSalePrice(): if length of sedan is >20 feet then returned car price should include 5%
discount, otherwise 10% discount     */
    public static void main(String[] args) {
        Car car1=new Sedan(50000.0,10.0,15);
        double salePriceSedan=car1.calculateSalePrice();
        System.out.println("The sale price of Sedan is "+salePriceSedan);

        Car car2=new Truck(70000.0,10.0,3000);
        double salePriceTruck=car2.calculateSalePrice();
        System.out.println("The sale price of Truck is "+salePriceTruck);
    }
}
class Car{
    double carPrice;
    String color;
    double discount;

    Car (double carPrice,double discount){
        this.carPrice=carPrice;
        this.discount=discount;
    }
    double calculateSalePrice(){
        double salePrice=0.00;
        salePrice=carPrice-discount*carPrice/100;
        return salePrice;
    }
}
class Sedan extends Car{
    double length;

    Sedan(double carPrice, double discount,double length) {
        super(carPrice, discount);
        this.length=length;
    }
    double calculateSalePrice(){
        double salePrice=0.00;
        if(length>20){
            salePrice=carPrice-(discount+5)*carPrice/100;
        }else{
            salePrice=carPrice-(discount+10)*carPrice/100;
        }
        return salePrice;
    }
}
class Truck extends Car{
    double weight;

    Truck(double carPrice, double discount,double weight) {
        super(carPrice, discount);
        this.weight=weight;
    }

    double calculateSalePrice(){
        double salePrice=0.00;
        if(weight>2000){
            salePrice=carPrice-(discount+10)*carPrice/100;
        }else{
            salePrice=carPrice-(discount+20)*carPrice/100;
        }
       return salePrice;
    }
}
