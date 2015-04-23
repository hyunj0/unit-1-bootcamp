/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals
{

    public static boolean isOdd(int x)
    {
        if(x % 2 != 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isMultipleOfThree(int x)
    {
        if(x % 3 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isOddAndIsMultipleOfThree(int x)
    {
        if(isOdd(x) && isMultipleOfThree(x))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isOddAndIsMultipleOfThree2(int x)
    {
        if(x % 2 != 0 && x % 3 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void fizzMultipleOfThree(int n)
    {
        if(isMultipleOfThree(n))
        {
            System.out.println("Fizz");
        }
        else
        {
            System.out.println(n);
        }
    }

    public static boolean isFromLondon(Person person)
    {
        if(person.getCity().equalsIgnoreCase("London"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void longName(Person person)
    {
        if(person.getName().length() > 5)
        {
            System.out.println(person.getName());
        }
        else
        {
            System.out.println("Name is too short.");
        }
    }

    public static boolean cigarParty(int numberOfCigars, boolean isWeekend)
    {
        if((numberOfCigars >= 40 && numberOfCigars <= 60) && isWeekend)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int caughtSpeeding(int speed, boolean isBirthday)
    {
        if(isBirthday)
        {
            speed = speed - 5;
        }

        if(speed <= 60)
        {
            return 0;
        }
        else if(speed > 60 && speed <= 80)
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }

    public static String alarmClock (int day, boolean isVacation) {
        String alarm = "";
        if (day > 0 && day < 6)
            if (isVacation)
                alarm = "10:00AM";
            else
                alarm = "7:00AM";
        else
            if (isVacation)
                alarm = "off";
            else
                alarm = "10:00AM";
        return alarm;
    }

    public static int lotteryTicket (int a, int b, int c) {
        if (a != b && a != c && b != c) {
            return 0;
        } else if (a == b && a == c && b == c) {
            return 20;
        } else if (a == b && a != c && b != c) {
            return 10;
        } else if (a != b && a == c && b != c) {
            return 10;
        } else if (a != b && a != c && b == c) {
            return 10;
        } else {
            return -1;
        }
    }

    //todo get the logic down!
    public static int blackjack (int a, int b) {
        int a21, b21;
        if (a <= 21) {
            if (b <= 21) {
                a21 = 21 - a;
                b21 = 21 - b;
                if (a21 < b21)
                    return a;
                else
                    return b;
            } else {
                return a;
            }
        } else {
            if (b <= 21) {
                return b;
            } else {
                return 0;
            }
        }
    }

    public static boolean evenlySpaced (int a, int b, int c) {
        int small = 0;
        int medium = 0;
        int large = 0;

        if (a < b && a < c) {
            small = a;
        } else if ((a < b && a > c) || (a > b && a < c)) {
            medium = a;
        } else if (a > b && a > c) {
            large = a;
        }

        if (b < a && b < c) {
            small = b;
        } else if ((b < a && b > c) || (b > a && b < c)) {
            medium = b;
        } else if (b > a && b > c) {
            large = b;
        }

        if (c < a && c < b) {
            small = c;
        } else if ((c < a && c > b) || (c > a && c < b)) {
            medium = b;
        } else if (c > a && c > b) {
            large = c;
        }

        return ((medium - small) == (large - medium));
    }

    public static void main(String args[])
    {
        for(int i = 0; i < 11; i++)
        {
            System.out.println(isOdd(i));
        }
        fizzMultipleOfThree(14);
        Person ana = new Person("Ana");
        Person michael = new Person("Michael");
        longName(ana);
        longName(michael);

        System.out.println(cigarParty(39, true));
        System.out.println(cigarParty(49, false));
        System.out.println(cigarParty(58, true));

        System.out.println(caughtSpeeding(60, false));
        System.out.println(caughtSpeeding(65, false));
        System.out.println(caughtSpeeding(65, true));

        System.out.println(alarmClock(1, false));
        System.out.println(alarmClock(5, false));
        System.out.println(alarmClock(0, false));

        System.out.println(lotteryTicket(1,1,1));
        System.out.println(lotteryTicket(1,1,0));
        System.out.println(lotteryTicket(0,1,1));
        System.out.println(lotteryTicket(1,2,3));

        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
        System.out.println(blackjack(-5, 4));
        System.out.println(blackjack(21, -13));

        System.out.println(evenlySpaced(2, 4, 6));
        System.out.println(evenlySpaced(4, 6, 2));
        System.out.println(evenlySpaced(4, 6, 3));

    }
}
