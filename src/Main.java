import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        double[] arrayDouble = {1.57, 7.654, 9.986};
        short[] arrayShort = {12, 4, 447, -309, 3008, 5452};

        //Задание 2
        System.out.print("Массив 1: ");
        for (int i = 0; i < arrayInt.length; i++) {
            if (i == arrayInt.length - 1) {
                System.out.println(arrayInt[i]);
            } else {
                System.out.print(arrayInt[i] + ", ");
            }
        }
        System.out.print("Массив 2: ");
        for (int i = 0; i < arrayInt.length; i++) {
            if (i == arrayDouble.length - 1) {
                System.out.println(arrayDouble[i]);
            } else {
                System.out.print(arrayDouble[i] + ", ");
            }
        }
        System.out.print("Массив 3: ");
        for (int i = 0; i < arrayShort.length; i++) {
            if (i == arrayShort.length - 1) {
                System.out.println(arrayShort[i]);
            } else {
                System.out.print(arrayShort[i] + ", ");
            }
        }
        System.out.println();

        //Задание 3
        System.out.print("Массив 1 в обратном порядке: ");
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayInt[i]);
            } else {
                System.out.print(arrayInt[i] + ", ");
            }
        }
        System.out.print("Массив 2 в обратном порядке: ");
        for (int i = arrayDouble.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayDouble[i]);
            } else {
                System.out.print(arrayDouble[i] + ", ");
            }
        }
        System.out.print("Массив 3 в обратном порядке: ");
        for (int i = arrayShort.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayShort[i]);
            } else {
                System.out.print(arrayShort[i] + ", ");
            }
        }
        System.out.println();

        //Задание 4
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 != 0) {
                arrayInt[i] += 1;
            }
        }
        System.out.print("Массив 1 после преобразования: ");
        System.out.println(Arrays.toString(arrayInt));
    }
}