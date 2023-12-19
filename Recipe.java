public class Recipe {
    private String name;
    private String[] ingredients;
    private String instructions;
    private NutritionInformation nutrition;
    private static int count;
    private int ID;
    private String additionalNotes;

    public Recipe(String name) {
        this.name = name;
        this.ingredients = new String[0];
        this.instructions = "";
        this.nutrition = new NutritionInformation(0);
        this.ID = count++;
        this.additionalNotes = "";
    }

    public Recipe(String name, String[] ingredients) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = "";
        this.nutrition = new NutritionInformation(0);
        this.ID = count++;
        this.additionalNotes = "";
    }

    public Recipe(String name, String instructions) {
        this.name = name;
        this.ingredients = new String[0];
        this.instructions = instructions;
        this.nutrition = new NutritionInformation(0);
        this.ID = count++;
        this.additionalNotes = "";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public NutritionInformation getNutrition() {
        return nutrition;
    }

    public void setNutrition(NutritionInformation nutrition) {
        this.nutrition = nutrition;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    public int getID() {
        return ID;
    }
}