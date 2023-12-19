public class NutritionInformation {
    private int calories;
    private int protein;
    private int carbs;
    private int fat;


    public NutritionInformation(int calories) {
        this.calories = calories;
        this.protein = -1;
        this.carbs = -1;
        this.fat = -1;
    }

    public NutritionInformation(int calories, int protein, int carbs, int fat) {
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
    }

    public int getCalories() {
        return this.calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getProtein() {
        return this.protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getCarbs() {
        return this.carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        // TODO: Rewrite
        return super.toString();
    }
}