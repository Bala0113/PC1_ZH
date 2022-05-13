import java.util.ArrayList;

public class Chef {
    protected ArrayList<String[]> recipes= new ArrayList<>();

    public void newRecipe(String name)
    {

        String[] inner = new String[2];
        inner[0]=name;
        inner[1]="0";
        recipes.add(inner);

    }

    public void removeRecipe(String name){
        for (int i = 0; i < recipes.size(); i++)
        {
            if(recipes.get(i)[0]==name)
            {
                recipes.remove(i);
            }
        }
    }
    public String getMenu(){
        {
            String output="";
            for (int i = 0; i < recipes.size(); i++)
            {
                if (i==recipes.size()-1)
                {
                    output+=recipes.get(i)[0];
                    output+=" ";
                    output+=recipes.get(i)[1];
                }
                else
                {
                    output+=recipes.get(i)[0];
                    output+=" ";
                    output+=recipes.get(i)[1];
                    output+="\r\n";
                }
            }
            return output;
        }
    }
}
