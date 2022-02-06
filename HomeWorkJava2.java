import java.sql.SQLOutput;

public class HomeWorkJava2 {
    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};  // ДЗ #1
        int arr2 = arr.length;
        for (int i = 0; i < arr2; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println("ДЗ №1:");
        for (int i = 0; i < arr2; i++) {
            System.out.println(i + "-" + arr[i]);
        }

        int[] array = new int[8];    // ДЗ #2
        int j = 0;
        int arr3 = array.length;
        System.out.println(" ");
        System.out.println("ДЗ №2:");

        for (int i = 0; i < arr3; ++i, j = j + 3) {
            array[i] = j;
            System.out.print(+array[i] + " ");
            System.out.println(" ");
        }

        int[] array1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};   // ДЗ #3
        int arr4 = array1.length;
        for (int i = 0; i < arr4; i++) {
            if (array1[i] < 6)
                array1[i] = array1[i] * 2;
        }
        System.out.println(" ");
        System.out.print("ДЗ №3:  ");

        for (int i = 0; i < arr4; i++) {

            System.out.print(+array1[i] + ", ");

        }


        /**
         * Вопрос по ДЗ №4 - закомментировал свой код,т.к. при его активации он как то влияет на ДЗ №3 -
         * ломает код ДЗ №3.
         * Так же если,честно я не совсем понял суть ДЗ №4, по итогу как понял так и сделал - единственное не могу
         * додумать как прописать,что бы были те самые единицы.
         */

        /*
        int [] [] table = new int [4] [4];      // ДЗ #4

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {

               if (x < y) {
                   table [x] [y] = 0;
               } else if (x > y) {
                   table[x][y] = 1;
               } else {
                       table [x] [y] = 1;
                   }
                   System.out.println(table [x] [y] + " ");
               }
            }

            System.out.println(" ");
            System.out.println("ДЗ №4:  ");
            System.out.println(" ");
            */

        }

    }

/**
 * Задания со звездочкой самостоятельно пока,что не могу сделать, но я попробую, как
 * будет результат скину дпоолнительно, если можно.
 */









