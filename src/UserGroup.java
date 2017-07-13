
import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;

public class UserGroup{
    private String id;
    private List<User> users = new ArrayList();
    private static DefaultMutableTreeNode root;// for tree implementation but not working
    
    private int numGroups = 0;

     public UserGroup() {
        root = new DefaultMutableTreeNode("Root");
    }
     
     public UserGroup(String ID) {
        this.id = ID;
        numGroups++;
    }
     
    public int getNumGroups() {
        return numGroups;
    }
    
    public DefaultMutableTreeNode getRoot() {
        return root;
    }
    
    public String getID(){
        return id;
    }
}
