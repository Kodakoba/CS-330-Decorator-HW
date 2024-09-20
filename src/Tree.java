public abstract class Tree {
    String treeName = "default tree";

    public String getTreeName() {
        return treeName;
    }
    public abstract int cost();
}
