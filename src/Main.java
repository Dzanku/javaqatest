public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(98F, 1.87F);
        System.out.printf("Ваш индекс массы тела (кг/м2) = " + "%.1f", bmi);
        System.out.println();
    }
}

