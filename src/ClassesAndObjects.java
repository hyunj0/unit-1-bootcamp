/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects
{

    public static boolean isOlder(Cat one, Cat two)
    {
        if(one.getAge() > two.getAge())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void makeBestFriends(Cat one, Cat two)
    {
        String favoriteFood = "Cookies";
        one.setFavoriteFood(favoriteFood);
        two.setFavoriteFood(favoriteFood);
    }

    public static Cat makeKitten(Cat one, Cat two)
    {
        Cat kitten = new Cat(one.getName() + two.getName());
        kitten.setAge(0);
        return kitten;
    }

    public static void adoption(Cat adopted, Person owner)
    {
        if(adopted.getName().equalsIgnoreCase("Catwoman"))
        {
            System.out.println("Catwoman will never be anyone's pet!");
        }
        else
        {
            adopted.setOwner(owner);
        }
    }

    public static boolean isFree(Cat cat)
    {
        if(cat.getOwner() == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isSibling(Cat one, Cat two)
    {
        if(one.getOwner() == two.getOwner())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String args[])
    {
        Cat garfield = new Cat("Garfield");
        Cat pinkPanther = new Cat("Pink Panther");
        Cat catwoman = new Cat("Catwoman");

        garfield.setFavoriteFood("Lasagna");
        pinkPanther.setFavoriteFood("Pizza");
        catwoman.setFavoriteFood("Cherries");

        garfield.setAge(25);
        pinkPanther.setAge(30);
        catwoman.setAge(35);

        System.out.println(isOlder(pinkPanther, catwoman));
        System.out.println(makeKitten(garfield, catwoman).getName());
        System.out.println(makeKitten(garfield, catwoman).getAge());

    }
}
