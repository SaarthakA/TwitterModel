
import java.util.List;

public interface ButtonVisitor {
    public void visitUserTotal(List <User> user);
    public void visitPositivePercentage(List <User> user);
    public void visitGroupTotal(List<UserGroup> group);
    public void visitMessageTotal(List <User> user);

}
