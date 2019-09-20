

public class Toy{
    private int price;
    private String color;

    public void setprice(int _price){
        this.price=_price;
    }
    public int getprice(){
        return this.price;
    }
    public void setcolor(String _color){
        this.color=_color;
    }
    public String getcolor(){
        return this.color;
    }

    public String _Print(String Name){
        return(Name+" color is: "+this.color+ "    "+Name +" price is: "+this.price+"INR");
    }


    public static void main(String[] args) {
        Car_Toy Car1 =new Car_Toy();
        Car1.setcolor("Blue");
        Car1.setprice(200);
        Train_Toy Train1=new Train_Toy();
        Train1.setcolor("Green");
        Train1.setprice(500);
        Plane_Toy Plane1=new Plane_Toy();
        Plane1.setcolor("White");
        Plane1.setprice(2000);

        System.out.println(Car1._Print("Car"));
        Car1.move();
        System.out.println();
        System.out.println(Train1._Print("Train"));
        Train1.move();
        System.out.println();
        System.out.println(Plane1._Print("Plane"));
        Plane1.move();
        Plane1.fly();
    }


}

