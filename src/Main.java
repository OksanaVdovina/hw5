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
        System.out.print("\n");
    }

    public static void task3() {
        int[] numbers = {5, 7, 9};
        double[] numbers2 = {1.57, 7.654, 9.986};
        char[] chars = {'a', 'b', 'c'};

        // Задание на обратные 5,7,9:
        for (int i = 0; i < numbers.length; i++) {
            int index = numbers.length - 1 - i;
            if (index == 0) {
                System.out.print(numbers[index]);
            }
           else System.out.print(numbers[index] + ", ");
        }
        System.out.print("\n");

        // Задание на обратные numbers2:
        for (int i = 0; i < numbers2.length; i++) {
            int index = numbers2.length - 1 - i;
            if (index == 0) {
                System.out.print(numbers2[index]);
            }
            else System.out.print(numbers2[index] + ", ");
        }
        System.out.print("\n");

        // Задание на обратные chars:
        for (int i = 0; i < chars.length; i++) {
            int index = chars.length - 1 - i;
            if (index == 0) {
                System.out.print(chars[index]);
            }
            else System.out.print(chars[index] + ", ");
        }
        System.out.print("\n");
    }

    public static void task4() {
        int[] numbers = {5, 7, 9};
        double[] numbers2 = {1.57, 7.654, 9.986};
        char[] chars = {'a', 'b', 'c'};

        for (int i = 0; i < numbers.length; i++) {
            int summ = 1 + numbers[i];
            System.out.print(summ + ", ");
        }
        System.out.print("\n");

        for (int i = 0; i < numbers2.length; i++) {
            double summ = 1 + numbers2[i];
            System.out.print(summ + ", ");
        }
        System.out.print("\n");

    }
}