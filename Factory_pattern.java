interface Shape {
    void draw();
}


class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}


class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}


class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square.");
    }
}


class ShapeFactory {
   public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        switch (shapeType.toUpperCase()) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}

public class FactoryMethodExample {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw(); 

        Shape shape2 = factory.getShape("RECTANGLE");
        shape2.draw();  

        Shape shape3 = factory.getShape("SQUARE");
        shape3.draw(); 
    }
}
