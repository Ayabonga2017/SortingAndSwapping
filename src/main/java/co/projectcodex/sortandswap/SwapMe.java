package co.projectcodex.sortandswap;

public class SwapMe {

    public static String[] swapFirstWithLast(String[] values) {

       String lastValue = values[0];
       String secondValue = values[3];

       values[0] = secondValue;
       values[3] = lastValue;

        return values;
    }

    public static String[] swapFirstWithSecond(String[] values) {

        String firstValue = values[0];
        String secondValue = values[1];

        values[0] = secondValue;
        values[1] = firstValue;

        return values;
    }

    public static int[] swapNeighbours(int[] numbers) {

        int one = numbers[0];
        int two = numbers[1];
        int three = numbers[2];
        int four = numbers[3];
        int five = numbers[4];
        int six = numbers[5];
        int seven = numbers[6];

        numbers[0]= one;
        numbers[1] =three;
        numbers[2] = four;
        numbers[3]=six;
        numbers[4] = four;
        numbers[5] = six;
        numbers[6]=five;

        return  numbers;
    }





}
