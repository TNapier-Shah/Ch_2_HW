/** Class:
 * @author: Taj Napier-Shah
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: Feb 18, 2024
 *
 * This class
 */
package Bread;

public class Recipe {
    private String[] instruct;

    public Recipe(String[] instruct){
        this.instruct = instruct;
    }

    public String[] getInstruct() {
        return instruct;
    }

    public void setInstruct(String[] instruct) {
        this.instruct = instruct;
    }

}
