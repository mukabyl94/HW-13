import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Class creatClass = new Class(5, "Soz", new int[]{7,5,86,45,85,4,1,25});
        System.out.println("Number: " + creatClass.getNumber());
        System.out.println("World: " + creatClass.getWord());
        System.out.println("Array: " + Arrays.toString(creatClass.getArray()));




    }
}