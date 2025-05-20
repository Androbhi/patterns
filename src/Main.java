public class Main {
    public static void main(String[] args) {
//        first();
//        second();
//        third();
//        four();
//        five();
//        six();
//        seven();
//        eight();
//        nine();
//        ten(5);
//        eleven(5);
//        twelve(4);
//        thirteen(5);
//        fourteen(5);
//        fifteen(5);
//        sixteen(5);
        seventeen(5);
    }

    /*
    *  4*4 stars
    *   * * * *
    *   * * * *
    *   * * * *
    *   * * * *
    * */
    static void first(){
        for(int i = 0; i < 4; i++){
            for(int j=0; j<4; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    /*
     *   *
     *   * *
     *   * * *
     *   * * * *
     *   * * * * *
     * */
    static void second(){
        for(int i = 0; i < 5; i++){
            for(int j=0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }


    /*
    *   1
    *   1 2
    *   1 2 3
    *   1 2 3 4
    *   1 2 3 4 5
    * */
    static void third(){
        for(int i = 0; i <= 5; i++){
            for(int j=1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }

    /*
     *   1
     *   2 2
     *   3 3 3
     *   4 4 4 4
     *   5 5 5 5 5
     * */
    static void four(){
        for(int i = 1; i <= 5; i++){
            for(int j=0; j < i; j++){
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }

    /*
     *   *
     *   * *
     *   * * *
     *   * * * *
     *   * * * * *
     * */
    static void five(){
        for(int i = 0; i < 5; i++){
            for(int j=0; j < 5 - i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

   /*
   *    1 2 3 4 5
   *    1 2 3 4
   *    1 2 3
   *    1 2
   *    1
   * */
    static void six(){
        for(int i = 0; i < 5; i++){
            for (int j = 1; j <= 5 - i; j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }

    /*
    *           *
    *         * * *
    *       * * * * *
    *     * * * * * * *
    *   * * * * * * * * *
    */

    static void seven(){
        for (int i = 0; i<5; i++){
            //space
            for (int j = 0; j <= 5-i; j++){
                System.out.print(" ");
            }

            //star
            for(int j=0; j < 2*i+1; j++){
                System.out.print("*");
            }

            //space
            for (int j = 0; j <= 5-i; j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    /*
    *   * * * * * * * * *
    *     * * * * * * *
    *       * * * * *
    *         * * *
    *           *
    * */

    static void eight(){
        for (int i = 0; i<5; i++){
            //space
            for (int j = 0; j <= i; j++){
                System.out.print(" ");
            }

            //star
            for(int j=0; j < (2*5)-(2*i+1); j++){
                System.out.print("*");
            }

            //space
            for (int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    /*
     *           *
     *         * * *
     *       * * * * *
     *     * * * * * * *
     *   * * * * * * * * *
     *   * * * * * * * * *
     *     * * * * * * *
     *       * * * * *
     *         * * *
     *           *
     */

    static void nine(){
        seven();
        eight();
    }

    /*
    *   *
    *   * *
    *   * * *
    *   * * * *
    *   * * * * *
    *   * * * *
    *   * * *
    *   * *
    *   *
    * */

    static void ten(int n) {

        for (int i = 0; i <= 2 * n - 1; i++) {
            int star = i;
            if (i > n) star = 2 * n - i;
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    /*
    * 1
    * 0 1
    * 1 0 1
    * 0 1 0 1
    * 1 0 1 0 1
    * */

    static void eleven(int n) {
        int star = 1;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) star = 0;
            else star = 1;
            for (int j = 0; j < i; j++) {
                System.out.print(star + " ");
                star = 1 - star;
            }
            System.out.println();
        }
    }

    /*
    * 1      1
    * 12    21
    * 123  321
    * 12344321
    * */
    static void twelve(int n){
        int space = 2 * (n - 1);
        for(int i = 1; i <= n; i++){
            //Numbers
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            //Space
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            //Numbers
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            space = space - 2;
            System.out.println();
        }
    }

    /*
    * 1
    * 2 3
    * 4 5 6
    * 7 8 9 10
    * 11 12 13 14 15
    *
    * */

    static void thirteen(int n){
        int count = 1;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j<i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    /*
    * A
    * A B
    * A B C
    * A B C D
    * A B C D E
    *
    * */

    static void fourteen(int n){
        for(int i = 0; i <= n; i++){
            for(char chr = 'A'; chr < 'A' + i; chr++){
                System.out.print(chr);
            }
            System.out.println();
        }
    }

    /*
    * A B C D E
    * A B C D
    * A B C
    * A B
    * A
    * */

    static void fifteen(int n){
        for(int i = 0; i <= n; i++){
            for (char ch = 'A'; ch <= 'A' + (n-i-1); ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    /*
    * A
    * B B
    * C C C
    * D D D D
    * E E E E E
    *
    * */

    static void sixteen(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print((char)('A' + i));
            }
            System.out.println();
        }
    }

    /*
    *         A
    *       A B A
    *     A B C B A
    *   A B C D C B A
    * A B C D E D C B A
    *
    * */

    static void seventeen(int n){
        for (int i = 0; i < n; i++){
            //Space

            for(int j = 0; j < n - i ; j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){

                System.out.print(ch);
                if(j <= breakpoint) ch++;
                else ch--;
            }
            //Space
            for(int j = 0; j < n - i ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

