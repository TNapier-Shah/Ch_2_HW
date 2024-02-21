/** Class:
 * @author: Taj Napier-Shah
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: Feb 18, 2024
 *
 * This class makes a sourdough bread, with instructions
 */

package Bread;

public class Sourdough extends Bread{
    private double timeFermented;

    private Sourdough(double timeFermented){
        super(3.25, 1.25, 0, 2, 0, 1, 2, "Sourdough", "baked");
        this.timeFermented = timeFermented;
    }

    public double getTimeFermented() {
        return timeFermented;
    }

    public void setTimeFermented(double timeFermented) {
        this.timeFermented = timeFermented;
    }

    private String[] SourdoughRecipe(){
        String[] instruct = new String[9];
        instruct[0] = "mix the ingredients, including starter";
        instruct[1] = "knead the dough";
        instruct[2] = "Let dough sit";
        instruct[3] = "Set oven to 350";
        instruct[4] = "Score dough";
        instruct[5] = "Place dough into oven";
        instruct[6] = "Bake the loaf for 60 minutes";
        instruct[7] = "Clean station";
        instruct[8] = "Remove bread when time is up";
        instruct[9] = "Enjoy";
        return instruct;
    }

}
