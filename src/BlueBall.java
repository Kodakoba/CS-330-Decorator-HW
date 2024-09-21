public class BlueBall/*s*/ extends TreeDecorator{
    public BlueBall(Tree tree) {
        this.tree = tree;
    }
    public String getTreeName(){
        return tree.getTreeName() + ", Ball Blue";
    }
    public int cost(){
        return 2+tree.cost();
    }
}

