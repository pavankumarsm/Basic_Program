public class Pattern {
    public static void main(String[] args) {
        int n = 4; // maximum number
        int size = 2 * n - 1; // matrix size (7 for n=4)

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // distance from borders
                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                // minimum distance from any border
                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

                // print value
                System.out.print((n - min));
            }
            System.out.println();
        }
    }
}
