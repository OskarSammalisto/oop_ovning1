public class Rectangle {
    private String x;
    private String y;
    private double width;
    private  double height;

    public  Rectangle(){
        x = "0";
        y = "0";
        width = 0;
        height = 0;
    }

    public  Rectangle(double width, double height){
        x = "0";
        y = "0";
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String x, String y){
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

}
