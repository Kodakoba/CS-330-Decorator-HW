public class Ribbons extends TreeDecorator{
    public Ribbons(Tree tree){
        this.tree = tree;
    }
    public String getTreeName(){
        return tree.getTreeName() + ", Ribbons";
    }
    public int cost() {
        return 2+tree.cost();
    }
}
