public abstract class Tree {
    String treeName = "default tree";

    public String getTreeName() {
        return treeName + " decorated with:";
    }
    public abstract int cost();
}
