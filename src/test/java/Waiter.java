public class Waiter extends Chef
{
    public void modifyPrice(String name, int price)
    {
        for (int i = 0; i < recipes.size(); i++)
        {
            if (recipes.get(i)[0] == name)
            {
                recipes.get(i)[1] = String.valueOf(price);
            }
        }
    }
}
