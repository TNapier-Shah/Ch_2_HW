package Bread;

public class Pasta extends Bread{
    private int egg;

    private Pasta(int egg){
        super(1, 0.25, 0, 0.5, 0, 0, 0,"Pasta", "not baked");
        this.egg = 1;
    }

    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }

    @Override
    public String toString(){
        return super.getIngredients();
    }

    @Override
    public String getIngredients(){
        return super.getIngredients() + String.format(egg + "egg");
    }

    private String[] PastaRecipe(){
        String[] instruct = new String[5];
        instruct[0] = "mix ingredients";
        instruct[1] = "knead dough on lightly floured area";
        instruct[2] = "cut dough into pieces and roll";
        instruct[3] = "cut into strips";
        instruct[4] = "boil the strips";
        instruct[5] = "Enjoy";
        return instruct;
    }

}
