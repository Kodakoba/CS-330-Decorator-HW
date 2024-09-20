public class SilverBall extends TreeDecorator{
    public SilverBall(Tree tree) {
        this.tree = tree;
    }
    public String getTreeName() {
        return tree.getTreeName() + " ,Ball Silver";
    }
    public int cost(){
        return 3+tree.cost();
    }
}
