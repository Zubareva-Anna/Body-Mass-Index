public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 68.80;
        int miles = service.calculate(weight);
        System.out.println(miles);
    }
}