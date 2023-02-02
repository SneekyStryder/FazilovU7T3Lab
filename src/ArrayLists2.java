import java.util.ArrayList;

public class ArrayLists2
{
    public static void main(String[] args)
    {
        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Patty"));
        catList.add(new Cat("Keith"));
        catList.add(new Cat("Jerry"));
        catList.add(new Cat("Mary"));

        // COMPLETE ME: print each Cat’s name using a
        // standard for loop
        for (int i = 0; i < catList.size(); i++)
        {
            System.out.println(catList.get(i).getName());
        }
        // COMPLETE ME: print each Cat’s name using an
        // enhanced for loop
        for (Cat cat : catList)
        {
            System.out.println(cat.getName());
        }
        // COMPLETE ME: print each Cat’s name (a third
        // time!) using a while loop
        int i = 0;
        while (i < catList.size())
        {
            System.out.println(catList.get(i).getName());
            i++;
        }
    }
}

