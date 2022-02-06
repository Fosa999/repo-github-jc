package DZ_2;

public class ArrayChecker {
    private String[][] strings;

    public void setStrings(String[][] strings) {
//        checkSizeArray(strings);
        this.strings = strings;
    }

    public  void summ() {
        if (strings == null) {
            System.out.println("Нет чисел для суммирования");
            return;
        }
        try {
            summArray();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private void summArray() throws MyArrayDataException {
        int result = 0;
        for (int x = 0; x < strings.length; x++) {
            String[] str = strings[x];
            for (int y = 0; y < str.length; y++) {
                try {
                    result += Integer.parseInt(str[y]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Массив содержит не только числа, суммирование не возможно. Ошибка в ячейке: " + x + ":" + y);
                }
            }
        }
        System.out.println("Сумма элементов массива: " + result);
    }

}


