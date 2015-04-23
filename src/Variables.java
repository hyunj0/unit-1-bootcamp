import java.util.ArrayList;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables
{
    public static boolean isOdd(int number)
    {
        if(number % 2 != 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void printHelloWorld()
    {
        System.out.println("Hello World");
    }

    public static int greatestCommonFactor(int numberOne, int numberTwo)
    {
        ArrayList<Integer> factorOne = new ArrayList<Integer>();
        for(int one = 1; one <= numberOne; one++)
        {
            if(numberOne % one == 0)
            {
                factorOne.add(one);
            }
            else
            {
                continue;
            }
        }
        System.out.println(factorOne);
        ArrayList<Integer> factorTwo = new ArrayList<Integer>();
        for(int two = 1; two <= numberTwo; two++)
        {
            if(numberTwo % two == 0)
            {
                factorTwo.add(two);
            }
            else
            {
                continue;
            }

        }
        System.out.println(factorTwo);
        ArrayList<Integer> commonFactor = new ArrayList<Integer>();
        for(int factor : factorOne)
        {
            if(factorTwo.contains(factor))
            {
                commonFactor.add(factor);
            }
            else
            {
                continue;
            }
        }
        System.out.println(commonFactor);

        return commonFactor.get(commonFactor.size() - 1);
    }

    public static void main(String args[])
    {
        int firstVariable = 113;
        double secondVariable = 2.71828;
        String thirdVariable = "Computer Science";
        System.out.println("This is room # " + firstVariable);
        System.out.println("e is close to " + secondVariable);
        System.out.println("I am learning a bit about " + thirdVariable);
        System.out.println(greatestCommonFactor(10, 40));
    }
}
