public class Main {
    public static void main(String[] args) {
        task12();
        task3();
        task4();
    }
    public static void task12() {
        int[] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] numbers2 = {1.57, 7.654, 9.986};

        char[] chars = {'a', 'b', 'c'};

        // 2ое задание:
        for (int i = 0; i< numbers.length; i++){
            if ( i == numbers.length-1 ) {
                System.out.print(numbers[i]);
            }
            else { System.out.print( numbers[i] + ", ");
            }
        }
        System.out.print("\n");

        for (int i = 0; i< numbers2.length; i++){
            if ( i == numbers2.length-1 ) {
                System.out.print(numbers2[i]);
            }
            else { System.out.print( numbers2[i] + ", ");
            }
        }
        System.out.print("\n");

        for (int i = 0; i< chars.length; i++){
            if ( i == chars.length-1 ) {
                System.out.print(chars[i]);
            }
            else { System.out.print(chars[i] + ", ");
            }
        }
        System.out.println("\n");
    }

    public static void task3() {
        int[] numbers = {5, 7, 9};
        double[] numbers2 = {1.57, 7.654, 9.986};
        char[] chars = {'a', 'b', 'c'};

        // Задание на обратные 5,7,9:
        for (int i = numbers.length - 1; i >= 0; i--) {
             if (i == 0) {
                System.out.print(numbers[i]);
            }
           else System.out.print(numbers[i] + ", ");
        }
        System.out.print("\n");

        // Задание на обратные numbers2:
        for (int i = numbers2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numbers2[i]);
            }
            else System.out.print(numbers2[i] + ", ");
        }
        System.out.print("\n");

        // Задание на обратные chars:
        for (int i = chars.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(chars[i]);
            }
            else System.out.print(chars[i] + ", ");
        }
        System.out.println("\n");
    }

    public static void task4() {
        int[] numbers = {5, 8, 9};
        double[] numbers2 = {1.57, 7.654, 9.986};
        char[] chars = {'a', 'b', 'c'};

        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + 1 + ", ");
                }
            else System.out.print(numbers[i] + ", ");
            }

    }
}