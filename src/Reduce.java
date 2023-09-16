public class Reduce {
    public static void main(String[] args) {
        int i = 2;
        int count = 0;
        while (i > 0) {
            boolean isEven = i % 2 == 0;
            if (isEven) {
                i /= 2;
            } else {
                i -= 1;
            }
            count += 1;
        }
        System.out.println(count);
    }
}
