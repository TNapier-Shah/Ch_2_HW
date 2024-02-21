package Bread;

public class Pastry extends Bread{
    private double butter;
    private int egg;

    private Pastry(double butter, int egg){
        super(3.5, 1, 0, 3, 0.25, 1, 0, "Croissant", "baked");
        this.butter = 2;
        this.egg = 1;
    }

    public double getButter() {
        return butter;
    }

    public void setButter(double butter) {
        this.butter = butter;
    }

    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }

    @Override
    public String toString(){
        return getIngredients();
    }

    @Override
    public String getIngredients(){
        return super.getIngredients() + String.format(butter + "cups of butter"
        + "\n " + egg + "egg");
    }

    private String[] PastryRecipe(){
        String[] instruct = new String[13];
        instruct[0] = "mix ingredients not the egg";
        instruct[1] = "make dough into smaller balls";
        instruct[2] = "put balls onto lightly floured area";
        instruct[3] = "roll dough into triangles";
        instruct[4] = "place butter on triangles";
        instruct[5] = "roll triangles";
        instruct[6] = "whisk together egg and water";
        instruct[7] = "lightly brush egg juice onto the rolls";
        instruct[8] = "set oven to 400";
        instruct[9] = "Place rolls onto baking sheet";
        instruct[10] = "Place sheet into oven for 25 minutes";
        instruct[11] = "clean station";
        instruct[12] = "Take rolls out the oven to cool";
        instruct[13] = "Enjoy";
        return instruct;
    }
}
