public class Main {
    public static void main(String[] args) {

        FigureManager manager = new FigureManager();
        
        manager.add(new Circle(10));
        manager.add(new Rectangle(10, 30));
        manager.add(new Circle(1000));


        System.out.println("manager.getMaxPerimeter() = " + manager.getMaxPerimeter());
        System.out.println("manager.getAverageAreaSize() = " + manager.getAverageAreaSize());
        System.out.println("manager.getAreaBySizeCategories() = " + manager.getAreaBySizeCategories());


    }
}
