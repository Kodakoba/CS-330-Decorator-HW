public class Lights extends TreeDecorator{
    public Lights(Tree tree){
        this.tree = tree;
    }
    public String getTreeName(){
        return tree.getTreeName() + ", Normal Lights";
    }
    public int cost() {
        return 5+tree.cost();
    }
}
