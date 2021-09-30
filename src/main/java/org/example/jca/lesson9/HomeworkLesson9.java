package org.example.jca.lesson9;

public class HomeworkLesson9 {
    static int size = 4;
    static int sum;

    public static void main(String[] args) {

        String[][] stringArray = new String[][]{
                {"8", "9", "8", "5"/*, "world"*/},
                {"12", "2", "3", "1"},
                {"7", "9", "01", "11"},
                {"67", "8", "610", "6"}/*,
                {"67", "76", "610", "6"}*/
        };

//        Task(stringArray);
        try {
            Task(stringArray);
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    public static void Task(String[][] stringArray) throws MyArraySizeException, MyArrayDataException {
        if (stringArray.length < size || stringArray.length > size) throw new MyArraySizeException();
        for (int y = 0; y < stringArray.length; y++) {
            if (stringArray[y].length == size) {
//                try {
                for (int x = 0; x < stringArray.length; x++) {
                    if (stringArray[x].length == size) {
                        try {
                            sum += Integer.parseInt(stringArray[y][x]);
                        } catch (NumberFormatException e) {
                            throw new MyArrayDataException(String.format("Here we don't have a number: %d, %d", y + 1, x + 1));
                        }
                    } else {
                        throw new MyArraySizeException();
                    }
                }
            } else {
                throw new MyArraySizeException();
            }
        }
        System.out.println("Sum = " + sum);
    }
}

