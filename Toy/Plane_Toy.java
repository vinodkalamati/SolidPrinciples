public class Plane_Toy extends Toy implements Move,Fly{
    private String Model_no;

    
    public void move(){
        System.out.println("Plane is moving......");
    }
    public void fly(){
        System.out.println("Plane is Flying.....");
    }

    public String getModel_no() {
        return Model_no;
    }

    public void setModel_no(String model_no) {
        Model_no = model_no;
    }
}