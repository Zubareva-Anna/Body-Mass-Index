public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 68.80;
        double height = 1.78;
        double index = service.calculate(weight, height);
        String result = String.format("%.1f",index);
        System.out.println(result);
    }
}