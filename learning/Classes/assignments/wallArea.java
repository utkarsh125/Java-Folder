package Classes.assignments;

public class wallArea {
    private double width;
    private double height;


    public wallArea(){

    }
    public wallArea(double width, double height){
        if(width<0){
            this.width = 0;
        }else if(height<0){
            this.height = 0;
        }
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    
    public void setWidth(double width){
        if(width<0){
            this.width = 0;
        }else{
            this.width = width;
        }
    }
    
    public void setHeight(double height){
        if(height<0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }
    
    public double getArea(){
        return getWidth()* getHeight();
    }

    public static void main(String[] args) {
        wallArea wall = new wallArea(5, 4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width=" + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
