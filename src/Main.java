public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 68.80;
        double height = 1.78;
        int index = service.calculate(weight, height);
        System.out.println(index);
    }
}