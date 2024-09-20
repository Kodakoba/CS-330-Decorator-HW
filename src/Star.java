public class Star extends TreeDecorator{
    public Star(Tree tree) {
        this.tree = tree;
    }
    public String getTreeName() {
        return tree.getTreeName() + " , Star";
    }
    public int cost() {
        return 4+tree.cost();
    }
}
