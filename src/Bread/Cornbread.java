package Bread;

public class Cornbread extends Bread{
    private int eggs;
    private double butter;
    private double butterM;
    private double cornM;

    private Cornbread(int eggs, double butter, double butterM, double cornM){
        super(1,0, 1/2, 1/4, 2/3, 0, 0, "Cornbread", "baked");
        this.butter = 0.5;
        this.butterM = 1;
        this.cornM = 1;
        this.eggs = 2;
    }

    public int getEggs() {
        return eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    public double getButter() {
        return butter;
    }

    public void setButter(double butter) {
        this.butter = butter;
    }

    public double getButterM() {
        return butterM;
    }

    public void setButterM(double butterM) {
        this.butterM = butterM;
    }

    public double getCornM() {
        return cornM;
    }

    public void setCornM(double cornM) {
        this.cornM = cornM;
    }

    @Override
    public String toString(){
        return super.getIngredients();
    }

    @Override
    public String getIngredients(){
        return super.getIngredients() + String.format(butter + " cups of butter" + "\n"
                + butterM + "cups of butter milk" + "\n" + cornM + "cups of cornmeal"
                + "\n " + eggs + "eggs");
    }

    private String[] cornBreadRecipe(){
        String[] instruct = new String[9];
        instruct[0] = "preheat oven to 375";
        instruct[1] = "Grease pan";
        instruct[2] = "pour melted butter in with sugar and eggs";
        instruct[3] = "combine other ingredients";
        instruct[4] = "mix until there are few lumps";
        instruct[5] = "pour batter into pan";
        instruct[6] = "place pan into oven for 30 to 40 minutes";
        instruct[7] = "stick toothpick until it comes out clean";
        instruct[8] = "remove pan to chill";
        instruct[9] = "Enjoy";
        return instruct;
    }
}
