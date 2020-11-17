
package task4shape;


public abstract class Shape {     //parent class
    String color ;
    Boolean filled ;
     public Shape(){}
    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }
   
    public String getColor() {
        return color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea() ;
    public abstract double getPerimeter() ;
    public abstract String toString() ;
    
    
}
