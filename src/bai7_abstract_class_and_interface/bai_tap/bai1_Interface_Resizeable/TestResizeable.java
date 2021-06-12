package bai7_abstract_class_and_interface.bai_tap.bai1_Interface_Resizeable;

public interface TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Rectangle(2.0, 3.0);
        shapes[2] = new Square(4.0);

        System.out.println("Before resizing: ");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println(((Circle) shape).getArea());
            } else {
                System.out.println(((Rectangle) shape).getArea());
            }
        }

        System.out.println("After resizing: ");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).resize1(10);
//                ((Circle) shape).resize1(Math.floor(Math.random()*100));
                System.out.println(((Circle) shape).getArea());
            } else {
                ((Rectangle) shape).resize1(10);
//                ((Rectangle) shape).resize1(Math.floor(Math.random()*100));
                System.out.println(((Rectangle) shape).getArea());
            }
        }
    }
}
