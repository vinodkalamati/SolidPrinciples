public class Train_Toy extends Toy implements Move{
    private String Model_no;

    public void move(){
        System.out.println("Train is moving......");
    }

    public String getModel_no() {
        return Model_no;
    }

    public void setModel_no(String model_no) {
        Model_no = model_no;
    }

}