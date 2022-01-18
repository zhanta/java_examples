import classes.Matrixa;
import classes.Person;
import classes.Phone;

public class Main {
    public static void main(String[] args) {
        // Phone phone = new Phone();
        // phone.setModel("model");
        // phone.setNumber("87081444129");
        // phone.setWeight("80kg");
        // System.out.println(phone.toString());

        // phone.receiveCall("Zhanta");
        // Phone phone1 = new Phone("87081444128","fc8i", "70kg");
        // //Phone phone1 = new Phone("8705", "hell");
        // System.out.println("\n"+phone1.toString());

        // phone1.receiveCall("Person", "87081444128");

        //Person person = new Person();

        //Person person2 = new Person("Zhanta Yessen", 20);

        int[][] arr = new int[10][10];

        for(int i =0;i<arr.length;i++) {
            for(int j = 0;j<arr[0].length;j++) {
                arr[i][j] = (int) (Math.random() * 100) - 1;
            }
        }

        // for(int i =0;i<arr.length;i++) {
        //     for(int j = 0;j<arr[0].length;j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println("");
        // }

        Matrixa matrix = new Matrixa();
        Matrixa matrixa = new Matrixa();
        matrixa.setArr(arr);
        matrix.setArr(arr);
        matrix.slozheniya(matrixa);
        matrix.printerArr();
        matrixa.umnozheniyaNaNumber(10);
        System.out.println("\n");
        matrixa.printerArr();
    }
}
