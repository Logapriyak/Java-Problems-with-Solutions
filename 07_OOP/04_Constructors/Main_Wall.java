public class Main_Wall {

    public static void main(String[] args) {

        // Test 1: Parameterized constructor with valid values
        Wall wall1 = new Wall(5, 4);
        System.out.println("=== Parameterized Constructor ===");
        System.out.println("Width  : " + wall1.getWidth());
        System.out.println("Height : " + wall1.getHeight());
        System.out.println("Area   : " + wall1.getArea());

        // Test 2: Setter validation (negative height)
        wall1.setHeight(-1.5);
        System.out.println("\n=== After setHeight(-1.5) ===");
        System.out.println("Width  : " + wall1.getWidth());
        System.out.println("Height : " + wall1.getHeight());
        System.out.println("Area   : " + wall1.getArea());

        // Test 3: Default constructor
        Wall wall2 = new Wall();
        System.out.println("\n=== Default Constructor ===");
        System.out.println("Width  : " + wall2.getWidth());
        System.out.println("Height : " + wall2.getHeight());
        System.out.println("Area   : " + wall2.getArea());

        // Test 4: Using setters after default constructor
        wall2.setWidth(8.5);
        wall2.setHeight(3.5);
        System.out.println("\n=== After Using Setters ===");
        System.out.println("Width  : " + wall2.getWidth());
        System.out.println("Height : " + wall2.getHeight());
        System.out.println("Area   : " + wall2.getArea());

        // Test 5: Constructor validation (negative values)
        Wall wall3 = new Wall(-5, -4);
        System.out.println("\n=== Constructor Validation ===");
        System.out.println("Width  : " + wall3.getWidth());
        System.out.println("Height : " + wall3.getHeight());
        System.out.println("Area   : " + wall3.getArea());
    }
}