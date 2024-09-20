public class Ruffles extends TreeDecorator{
    public Ruffles(Tree tree){
        this.tree = tree;
    }
    public String getTreeName(){
        return tree.getTreeName() + " ,Ruffles";
    }
    public int cost() {
        return 1+tree.cost();
    }
}
