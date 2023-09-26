public class GeometricObjectTest {
    public static void main(String[] args) {
        // Criar instância de um círculo
        Circle circle = new Circle(5.0);

        // Calcular e imprimir a área do círculo
        double circleArea = circle.getArea();
        System.out.println("Área do círculo: " + circleArea);

        // Calcular e imprimir o perímetro do círculo
        double circlePerimeter = circle.getPerimeter();
        System.out.println("Perímetro do círculo: " + circlePerimeter);

        // Criar instância de um retângulo
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calcular e imprimir a área do retângulo
        double rectangleArea = rectangle.getArea();
        System.out.println("Área do retângulo: " + rectangleArea);

        // Calcular e imprimir o perímetro do retângulo
        double rectanglePerimeter = rectangle.getPerimeter();
        System.out.println("Perímetro do retângulo: " + rectanglePerimeter);
    }
}
