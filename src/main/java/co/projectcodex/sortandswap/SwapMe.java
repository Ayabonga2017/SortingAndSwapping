package co.projectcodex.sortandswap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

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

    public static int[] swapNeighbours (int[] numbers) {


        for ( int i = 0; i < numbers.length; i++ ) {

            if (i+1 < numbers.length) {
                int currentValue = numbers[ i ];
                int nextValue = numbers[ i + 1 ];

                if ( nextValue < currentValue ) {

                    numbers[ i + 1 ] = currentValue;
                    numbers[i] = nextValue;
                    System.out.println(currentValue);
                    System.out.println(nextValue);

                }
            }

        }
        return  numbers;

    }


}
