public class BmiService {
    public int calculate(double weight) {
        double height = 3.56;
        int index = (int) (weight / height);
        return index;
    }
}