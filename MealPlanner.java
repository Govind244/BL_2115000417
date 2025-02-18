interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian Meal";
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan Meal";
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto Meal";
    }
}

class Meal<T extends MealPlan> {
    private T meal;

    public Meal(T meal) {
        this.meal = meal;
    }

    public void displayMeal() {
        System.out.println("Selected Meal: " + meal.getMealType());
    }
}

public class MealPlanner {
    public static void main(String[] args) {
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        
        Meal<VegetarianMeal> meal1 = new Meal<>(vegetarianMeal);
        Meal<VeganMeal> meal2 = new Meal<>(veganMeal);
        Meal<KetoMeal> meal3 = new Meal<>(ketoMeal);
        
        meal1.displayMeal();
        meal2.displayMeal();
        meal3.displayMeal();
    }
}
