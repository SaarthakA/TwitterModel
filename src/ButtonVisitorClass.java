
import java.util.ArrayList;
import java.util.List;

public class ButtonVisitorClass implements ButtonVisitor{
    private int totalUsers = 0;
    private int positiveCount = 0;
    private int totalMessages = 0;
    private int totalGroups = 0;

    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }
    
    public void setPositiveCount(List <User> user) {
        for(User users : user)
        this.positiveCount += users.getPositiveWord();
    }
    
    public void setMessageTotal(List <User> user) {
        for(User users : user)
        this.totalMessages += users.getMessageTotal();
    }
    
    public void setTotalGroups(List<UserGroup> group){
        this.totalGroups = group.size();
    }
 
    public void visitUserTotal(List <User> user) {
          setTotalUsers(user.size());
    }

    public void visitPositivePercentage(List <User> user) {
        setPositiveCount(user);
        setMessageTotal(user);
    }

    public void visitGroupTotal(List<UserGroup> group) {
        setTotalGroups(group);
    }

    public void visitMessageTotal(List <User> user) {
        setMessageTotal(user);
    }
   
   public double getPositivePercentage() {
        return ((positiveCount / totalMessages) * 100.0);
    }
    
}
