public class Main {
    public static void main(String[] args) {
        Tree firstChristmasTree = new FraserFir();
        firstChristmasTree = new RedBall(firstChristmasTree);
        firstChristmasTree = new BlueBall(firstChristmasTree);
        Tree secondChristmasTree = new ColoradoBlueSpruce();
        secondChristmasTree = new RedBall(secondChristmasTree);
        secondChristmasTree = new BlueBall(secondChristmasTree);
        System.out.println(firstChristmasTree.getTreeName() + " for a cost of: " + firstChristmasTree.cost());
        System.out.println(secondChristmasTree.getTreeName() + " for a cost of: " + secondChristmasTree.cost());
    }
}