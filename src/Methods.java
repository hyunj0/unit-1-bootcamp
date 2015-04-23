import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods
{

    public static int calculateSquare(int x)
    {
        return x * x;
    }

    public static int calculateSquareRoot(int x)
    {
        int squareRoot = 0;
        for(int i = 0; i <= x; i++)
        {
            if(i * i == x)
            {
                squareRoot = i;
            }
            else
            {
                continue;
            }
        }
        return squareRoot;
    }

    public static String toLowerCase(String string)
    {
        return string.toLowerCase();
    }

    public static boolean isMultiple(int one, int two)
    {
        return two % one == 0;
    }

    public static void prettyInteger(int number)
    {
        String decoration = "";
        for(int i = 0; i < number; i++)
        {
            decoration += "*";
        }
        System.out.println(decoration + " " + number + " " + decoration);
    }

    public static int random(int one, int two)
    {
        Random random = new Random();
        int randomNumber = random.nextInt(two - one + 1) + one;
        return randomNumber;
    }

    public static void main(String args[])
    {
        System.out.println(calculateSquare(2));
        System.out.println(calculateSquare(3));
        System.out.println(calculateSquare(4));
        System.out.println(calculateSquareRoot(4));
        System.out.println(calculateSquareRoot(9));
        System.out.println(calculateSquareRoot(16));
        System.out.println(toLowerCase("Hello, World!"));
        System.out.println(isMultiple(2, 3));
        System.out.println(isMultiple(2, 4));
        System.out.println(isMultiple(5, 100));
        System.out.println(isMultiple(5, 101));
        prettyInteger(4);
        prettyInteger(10);
        System.out.println(random(1, 100));
    }
}
