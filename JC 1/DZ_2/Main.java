package DZ_2;

public class Main {

    public static void main(String[] args) throws MyArraySizeException {
        String[][] strings = createArray();
        ArrayChecker arrayChecker = new ArrayChecker();
        arrayChecker.setStrings(strings);

       arrayChecker.summ();
    }

    public static String[][] createArray () throws MyArraySizeException {
        int size =4 ;
        if (size != 4) {
            throw new MyArraySizeException ("Массив отличен от заданного");
        }
        String[][] array = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = String.valueOf((int) (Math.random()*10));
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array [i] [j] + " ");
            }
            System.out.println();
        }
        return array;
    }
}