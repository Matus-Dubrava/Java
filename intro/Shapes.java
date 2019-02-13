class TwoDShape {
    private double width;
    private double height;

    public TwoDShape(double v) {
        this.width = this.height = v;
    }

    public TwoDShape(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void showDim() {
        System.out.println("widht: " + this.width + ", height: " + this.height);
    }
}

class Triangle extends TwoDShape {
    private String style;

    public Triangle(double w, double h, String s) {
        super(w, h);
        this.style = s;
    }

    public void setStyle(String s) {
        this.style = s;
    }

    public double area() {
        return this.getWidth() * this.getHeight() / 2;
    }

    public void showStyle() {
        System.out.println(this.style);
    }
}

class ColorTriangle extends Triangle {
    private String color;

    public ColorTriangle(double w, double h, String s, String c) {
        super(w, h, s);
        this.color = c;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String c) {
        this.color = c;
    }
}

class Rectangle extends TwoDShape {
    public Rectangle(double v) {
        super(v);
    }

    public Rectangle(double w, double h) {
        super(w, h);
    }

    public boolean isSquare() {
        if (this.getWidth() == this.getHeight()) {
            return true;
        }

        return false;
    }

    public double area() {
        return this.getWidth() * this.getHeight();
    }
}

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(4.0, 4.0, "filled");
        Triangle t2 = new Triangle(8.0, 12.0, "outlined");
        Rectangle r1 = new Rectangle(10.0, 15.0);
        Rectangle r2 = new Rectangle(5.0);

        // t1.setWidth(4.0);
        // t1.setHeight(4.0);
        // t1.setStyle("filled");

        // t2.setWidth(8.0);
        // t2.setHeight(12.0);
        // t2.setStyle("outlined");

        System.out.println("Info for t1:");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is: " + t1.area());

        System.out.println();

        System.out.println("Info for t2:");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is: " + t2.area());

        System.out.println();

        System.out.println("Info for r1:");
        System.out.println("is square: " + r1.isSquare());
        System.out.println("Area is: " + r1.area());

        System.out.println();

        System.out.println("Info for r2:");
        System.out.println("is square: " + r2.isSquare());
        System.out.println("Area is: " + r2.area());
    }
}