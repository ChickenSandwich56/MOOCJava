import java.util.ArrayList;
public class Menu {

private ArrayList<String> meals;

public Menu()
{
    this.meals = new ArrayList<>();
}
public void addMeal(String meal)
{
    if(meals.contains(meal)){
        System.out.println("Meal already added to menu!");
    }
    else{
    meals.add(meal);
    }
}
public void printMeals()
{
    for(String meal: this.meals)
    {
        System.out.println(meal);
    }
}
public void clearMenu()
{
    
        meals.clear();
    
}
    
}
