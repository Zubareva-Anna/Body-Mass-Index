public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 68.80;
        int index = service.calculate(weight);
        System.out.println(index);
    }
}