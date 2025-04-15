public class Main {
    public static void main(String[] args) {
        first();
        second();
        third();
        four();
        five();
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


}

