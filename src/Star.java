public class Star extends TreeDecorator{
    boolean starExists = false; /*no this is a bad idea but im gonna run with it.*/
    private boolean doesStarExist(Tree tree){
        if(tree instanceof Star){

            return true;
        }
        return false;
    }
    public Star(Tree tree) {
        this.tree = tree;
    }
    public String getTreeName() {
        if(doesStarExist(tree)){
            System.out.println("Star already exists!");
            return tree.getTreeName();
        }
        else {
            return tree.getTreeName() + " , Star";
        }
    }
    public int cost() {
        if(doesStarExist(tree)){
            return tree.cost();
        }
        else {
            return 4 + tree.cost();
        }
    }
}
