public class LED extends TreeDecorator{
    public LED(Tree tree){
        this.tree = tree;
    }
    public String getTreeName(){
        return tree.getTreeName() + ", LEDs";
    }
    public int cost() {
        return 10+tree.cost();
    }
}
