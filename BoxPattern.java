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
//or 
      // int n = 4;               // maximum number
      //   int size = 2 * n - 1;    // grid size = 7 for n=4

      //   for (int i = 0; i < size; i++) {
      //       for (int j = 0; j < size; j++) {
      //           int value = n; // start with outermost number

      //           // check each "layer" by boundaries
      //           if (i > 0 && j > 0 && i < size - 1 && j < size - 1) {
      //               value = n - 1; // 2nd layer
      //           }
      //           if (i > 1 && j > 1 && i < size - 2 && j < size - 2) {
      //               value = n - 2; // 3rd layer
      //           }
      //           if (i > 2 && j > 2 && i < size - 3 && j < size - 3) {
      //               value = n - 3; // center
      //           }

      //           System.out.print(value);
      //       }
      //       System.out.println();
      //   }

    
    }
}
