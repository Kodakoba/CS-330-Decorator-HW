public class RedBall extends TreeDecorator {
    public RedBall(Tree tree) {
        this.tree = tree;
    }
    public String getTreeName() {
        return tree.getTreeName() + ", Ball Red";
    }
    public int cost(){
        return 1+tree.cost();
    }
}
