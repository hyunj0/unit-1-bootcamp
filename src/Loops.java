import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops
{

    public static void printOneToTenUsingForLoop()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
    }

    public static void printOneToTenUsingWhileLoop()
    {
        int i = 1;
        while(i <= 10)
        {
            System.out.println(i);
            i++;
        }
    }

    public static void printOneToN(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            System.out.println(i);
        }
    }

    public static void printEvenNumbersToN(int n)
    {
        for(int i = 0; i <= n; i += 2)
        {
            System.out.println(i);
        }
    }

    public static void printSumOfOneThroughTen()
    {
        int sum = 0;
        for(int i = 1; i <= 10; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void printSumOfOneThroughN(int n)
    {
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void printString(int n, String string)
    {
        if(n < 0)
        {
            System.out.println("");
        }
        for(int i = 0; i < n; i++)
        {
            System.out.println(string);
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(string);
        }
    }

    public static void printFirstTenFibonnaci () {
        //a             0
        //b             1
        //a + b = c     0 + 1 = 1
        //b + c = d     1 + 1 = 2
        //c + d = e     1 + 2 = 3
        //d + e = f     2 + 3 = 5
        //e + f = g     3 + 5 = 8
        //f + g = h     5 + 8 = 13
        //g + h = i     8 + 13 = 21
        //h + i = j     13 + 21 = 34

        int totalSum = 0;

        //fibonnaci sequence at 0
        int a = 0;
        totalSum += a;
        System.out.println(a);
        
        //fibonnaci sequence at 1
        int b = 1;
        totalSum += b;
        System.out.println(b);

        //add the last two fibonnaci sequence to get the next
        for (int i = 2; i < 10; i++) {
            int sum = a + b;
            totalSum += sum;
            System.out.println(sum);
            a = b;
            b = sum;
        }

        System.out.println(totalSum);
    }

    //todo simplify this code if possible or find more efficient way to do this
    public static int sumNumbers (String string) {
        for (int i = 0; i < string.length(); i++) {
            if (Character.isAlphabetic(string.charAt(i))) {
                string = string.replace(string.charAt(i), ' ');
            }
        }
        Scanner scanner = new Scanner(string);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (scanner.hasNext())
        {
            numbers.add(Integer.parseInt(scanner.next()));
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

//    todo fix the bug in main method
    public static String notReplace (String string) {
        string = " " + string.replace("is", "is not") + " ";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'i' && string.charAt(i+1) == 's') {
                if (Character.isLetter(string.charAt(i-1)))
                    string = string.replaceFirst(" not", "");
//                    string = string.replaceFirst(string.substring(i + 3, i + 7), "");
                } else {
                    continue;
                }
            }
        return string;
    }

    // todo work on out of range exception when looping over string index
    public static String wordEnds (String string, String nonEmptyWordString) {
        String between = "";
        string = " " + string.replace(nonEmptyWordString, "*") + " ";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '*') {
                between = between + string.charAt(i-1) + string.charAt(i+1);
            }
        }
        return between;
    }

    public static void main(String args[])
    {
        printOneToTenUsingForLoop();
        printOneToTenUsingWhileLoop();
        printOneToN(7);
        printEvenNumbersToN(20);
        printSumOfOneThroughTen();
        printSumOfOneThroughN(5);
        printSumOfOneThroughN(10000);
        printString(- 1, "Hello");
        printString(4, "Hello");
        System.out.println("\n");
        printFirstTenFibonnaci();
        System.out.println("\n");
        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("aa11b33"));
        System.out.println(sumNumbers("7 11"));
        System.out.println(notReplace("is test"));
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));
//        todo fix the below bug
        System.out.println(notReplace("Thesis is always is an oasis"));
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));


        for (int i = 0; i <= 60; i++) {
            for (int j = 0; j <= 60; j++) {
                if (i + j == 60 && (i - j == 14 || j - i == 14)) {
                    System.out.println(i + " " + j);
                }
            }
        }

        String twoDigits;
        int sum;
        for(int tenthsPlace = 1; tenthsPlace < 10; tenthsPlace++)
        {
            for(int onesPlace = 0; onesPlace < 10; onesPlace++)
            {
                twoDigits = Integer.toString(tenthsPlace) + Integer.toString(onesPlace);
                sum = tenthsPlace + onesPlace;
                System.out.println(twoDigits + ", " + tenthsPlace + " + " + onesPlace + " = " + sum);
            }
        }
    }
}
