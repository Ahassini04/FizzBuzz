
public class Reduce {
    public static void main(String[] args) {

        int counter = 0;
        int curr = 100;

        while (curr > 0) {
            if (curr % 2 == 0) {
                curr /= 2;
            } else {
                curr -= 1;
            }
            counter += 1;
        }

        System.out.println(counter);
    }
}
