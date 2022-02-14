package DZ_3;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        createArray();
//        System.out.println(Arrays.toString(createArray()));
        doLesson_Fruits();
    }

    public static int[] createArray() {
        int[] nums = {1, 2, 3, 4, 5};
        int length = nums.length;
        int temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
        return nums;
    }

    private static void doLesson_Fruits() {
        Box<Apple> appleBox = new Box<Apple>(1);
        Box<Orange> orangeBox = new Box<Orange>(1.5);
        Box<Apple> appleBox2 = new Box<Apple>(1);

        for (int i = 0; i < 3; i++) {
            orangeBox.addFruit(new Orange());
            appleBox.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
        }

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        appleBox2.addFruit(new Apple());


        System.out.println("Вес коробки с яблоками: " + appleBox.getBoxWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getBoxWeight());
        System.out.println("Сравнение веса - " + appleBox.compare(orangeBox));
        System.out.println("---------------------------------------------");

        appleBox.addFruit(appleBox2);

    }
}
