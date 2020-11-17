
package task4shape;


public class Task4Shape {

   
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 10, "red" ,false) ;
        rectangle1.getArea();
        rectangle1.getPerimeter();
        System.out.println(rectangle1.toString());
        
        System.out.println("************************************");
        
        Square square1 = new Square( 5 , "blue" , false) ;
        System.out.println(square1.toString());
        
        System.out.println("************************************");

        Circle circle = new Circle(5 , "null" ,false) ;
        
        System.out.println(circle.toString());
        
    }
    
}
