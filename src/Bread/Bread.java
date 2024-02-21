/** Class:
    * @author: Taj Napier-Shah
    * @version 1.0
    * Course: ITEC 2150 Spring 2024
    * Written: Feb 18, 2024
    *
    * This class is making the super class that all the subs will extend from
*/
package Bread;

public class Bread {
    private double flour;
    private double water;
    private double bakingP;
    private double salt;
    private double sugar;
    private double yeast;
    private double oil;
    private String breadName;
    private String state;
    private Recipe recipe;

    public Bread(){
        flour = 5;
        water = 2;
        bakingP = 0;
        salt = 2;
        sugar = 0.25;
        yeast = 1;
        oil = 2;
        breadName ="white bread";
        state = "not baked";
    }

    public Bread(double flour, double water, double bakingP, double salt, double sugar, double yeast, double oil, String breadName, String state){
        this.flour = flour;
        this.water = water;
        this.bakingP = bakingP;
        this.salt = salt;
        this.sugar = sugar;
        this.yeast = yeast;
        this.oil =  oil;
        this.breadName = breadName;
        this.state = state;
    }

    public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getBakingP() {
        return bakingP;
    }

    public void setBakingP(double bakingP) {
        this.bakingP = bakingP;
    }

    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getYeast() {
        return yeast;
    }

    public void setYeast(double yeast) {
        this.yeast = yeast;
    }

    public double getOil() {
        return oil;
    }

    public void setOil(double oil) {
        this.oil = oil;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public String toString(){
        return getIngredients();
    }

    public String getIngredients(){
        return String.format("Ingredients of " + breadName + "are: \n" + "Flour: " + flour + " cups \n" +
                "Water: " + water + " cups \n" + "Baking Powder: " + bakingP + " tsp \n" + "Salt: " + salt + " tsp"
                + "\n Sugar: " + sugar + " cups" + "\n Yeast: " + yeast + " tsp" + "\n Oil: " + oil + " tbsp");
    }
}
