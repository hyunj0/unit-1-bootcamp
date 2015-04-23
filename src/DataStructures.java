
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures
{
    public static void mostFrequentElement(ArrayList<Integer> numbers)
    {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for(Integer value : numbers)
        {
            if(count.containsKey(value))
            {
                count.put(value, count.get(value) + 1);
            }
            else
            {
                count.put(value, 1);
            }
        }
        int freqeuntNumber = 0;
        int maximumCount = 0;
        for(Map.Entry<Integer, Integer> entry : count.entrySet())
        {
            if(entry.getValue() > maximumCount)
            {
                freqeuntNumber = entry.getKey();
                maximumCount = entry.getValue();
            }
            else
            {
                continue;
            }
        }
        System.out.println(
                "The most frequent number is " + freqeuntNumber + " with a total count of " + maximumCount);
    }

    public static boolean canRentACar(HashMap<String, Integer> pod)
    {
        boolean over25 = false;
        for(Map.Entry<String, Integer> eachPodMember : pod.entrySet())
        {
            if(eachPodMember.getValue() > 25)
            {
                over25 = true;
            }
            else
            {
                continue;
            }
        }
        return over25;
    }



    public static ArrayList<String> wordsWithoutList (String [] array, int size) {
        ArrayList<String> sizeMatters = new ArrayList<String>();
        for (String word : array) {
            if (word.length() == size) {
                continue;
            } else {
                sizeMatters.add(word);
            }
        }
        return sizeMatters;
    }

    //todo: finish code
    public static int countClumps (ArrayList<Integer> arrayList) {
        int compareFirst = 0;
        int compareSecond = 1;

        int count = 0;

        while (compareSecond < arrayList.size()) {
            if (arrayList.get(compareFirst) == arrayList.get(compareSecond))
                count += 1;
            compareFirst++;
            compareSecond++;

        }
        return count;
    }

    public static ArrayList<String> alphabetize (String sentence) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner read = new Scanner(sentence);
        while (read.hasNext()) {
            words.add(read.next());
        }
        Collections.sort(words);
        return words;
    }

    public static void main(String args[])
    {
        ArrayList<Cat> fiveCats = new ArrayList<Cat>();
        Cat one = new Cat("One");
        Cat two = new Cat("Two");
        Cat three = new Cat("Three");
        Cat four = new Cat("Four");
        Cat five = new Cat("Five");
        fiveCats.add(one);
        fiveCats.add(two);
        fiveCats.add(three);
        fiveCats.add(four);
        fiveCats.add(five);
        for(int i = 0; i < fiveCats.size(); i++)
        {
            System.out.println(fiveCats.get(i).getName());
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(6);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);

        mostFrequentElement(numbers);

        HashMap<String, Integer> donutPod = new HashMap<String, Integer>();
        donutPod.put("Allison", 30);
        donutPod.put("Elvis", 28);
        donutPod.put("John", 26);
        donutPod.put("Marbella", 24);
        donutPod.put("Sarah", 22);
        for(Map.Entry<String, Integer> individual : donutPod.entrySet())
        {
            String name = individual.getKey();
            int age = individual.getValue();

            System.out.println(name + " is " + age + " years old");
        }

        System.out.println(canRentACar(donutPod));

        System.out.println(wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 1));
        System.out.println(wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 3));
        System.out.println(wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 4));

        ArrayList<Integer> clumpOne = new ArrayList<Integer>();
        clumpOne.add(1);
        clumpOne.add(2);
        clumpOne.add(2);
        clumpOne.add(3);
        clumpOne.add(4);
        clumpOne.add(4);
        ArrayList<Integer> clumpTwo = new ArrayList<Integer>();
        clumpTwo.add(1);
        clumpTwo.add(1);
        clumpTwo.add(2);
        clumpTwo.add(1);
        clumpTwo.add(1);
        ArrayList<Integer> clumpThree = new ArrayList<Integer>();
        clumpThree.add(1);
        clumpThree.add(1);
        clumpThree.add(1);
        clumpThree.add(1);
        clumpThree.add(1);

        System.out.println(countClumps(clumpOne));
        System.out.println(countClumps(clumpTwo));
        System.out.println(countClumps(clumpThree));

        System.out.println(alphabetize("hello my name is world"));

    }
}
