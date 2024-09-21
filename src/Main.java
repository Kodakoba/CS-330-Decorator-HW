import java.text.NumberFormat; //for displaying dollar amounts properly!
public class Main {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        Tree firstChristmasTree = new ColoradoBlueSpruce();
        firstChristmasTree = new Ruffles(new Ruffles(new Star(firstChristmasTree)));
        Tree secondChristmasTree = new DouglasFir();
        secondChristmasTree = new Star(new Star(new SilverBall(new BlueBall(new Lights(new Ribbons(secondChristmasTree)))))); //haha two stars!
        Tree thirdChristmasTree = new BalsamFir();
        thirdChristmasTree = new BlueBall(new RedBall(new LED(thirdChristmasTree)));
        Tree fourthChristmasTree = new FraserFir();
        fourthChristmasTree = new Ribbons(new SilverBall(new RedBall(new BlueBall(new Star(fourthChristmasTree)))));
        System.out.println(firstChristmasTree.getTreeName() + " for a cost of: " + formatter.format(firstChristmasTree.cost()));
        System.out.println(secondChristmasTree.getTreeName() + " for a cost of: " + formatter.format(secondChristmasTree.cost()));
        System.out.println(thirdChristmasTree.getTreeName() + " for a cost of: " + formatter.format(thirdChristmasTree.cost()));
        System.out.println(fourthChristmasTree.getTreeName() + " for a cost of: " + formatter.format(fourthChristmasTree.cost()));
    }
}