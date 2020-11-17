
package task4shape;


public class Rectangle extends Shape{
  private double width ;
  private double length ;

    public Rectangle() {}
     public Rectangle(String color, Boolean filled) {
        super(color, filled);
    }
    
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, Boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
   
    @Override
    public double getArea() {
       // System.out.println("Area = length * width = " + length* width );
         return length * width;
            
        }

    @Override
    public double getPerimeter() {
     // System.out.println("Perimeter = (length + width)*2 = " +  (length + width)*2 );
      return  (length + width)*2 ;
    }

    @Override
    public String toString() {
        return "Rectangle : " + "width = " + getWidth() + " , length = " + getLength() + " \nthen : Area =  "  + getArea() + "\n       Perimeter =  " + getPerimeter();
    }
    }
