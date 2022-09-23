public class RectangleRunner {
    public static void main(String[] args){

        // creating one instance/object from the Rectangle class "blueprint"
        Rectangle rect1 = new Rectangle (5,6);
        rect1.printPerimeter(); // calling a method on the object

        // creating ANOTHER instance/object from the Rectangle class
        Rectangle rect2 = new Rectangle(7,10);
        rect2.printPerimeter(); 

        Rectangle rect3 = new Rectangle(9,9);
        rect3.printPerimeter();

    }
}
