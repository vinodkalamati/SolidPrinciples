public class Car_Toy extends Toy implements Move{
    
    private String Model_no;

    public void move(){
        System.out.println("Car is moving......");
    }

    public String getModel_no() {
        return Model_no;
    }

    public void setModel_no(String model_no) {
        Model_no = model_no;
    }

}