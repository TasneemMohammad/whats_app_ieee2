
package task4shape;


public class Square extends Rectangle{
   private double side ;


    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, Boolean filled) {
        super(color ,filled);
         this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setLength(double length) {    // ?
        super.setLength(side); 
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(side); 
    }

    
    @Override
    public double getPerimeter() {
        return side*4 ; 
    }

    @Override
    public double getArea() {
        return side*side ; 
    }

    @Override
    public String toString() {
      
        return "Square :side = " + side + " \nthen : Area =  "  + getArea() + "\n       Perimeter =  " + getPerimeter() ;
    }

    

    
    

    
   
    
    
}
