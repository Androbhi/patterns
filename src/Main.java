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
        nine();
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

}

