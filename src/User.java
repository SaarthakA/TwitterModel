
import java.util.List;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class User extends Observable implements Observer{
    private String id;
    private List<User> followers;
    private List<String> following;
    private List<String> news;
    private String tweet;
    private int positiveWords;
    private int messageTotal;
      private String[] happyWords = {"good", "great", "excellent", "delighted", "friend",
        "lol", "lmao", "haha", "awesome", "best", "amazing"};
    
    public String getID(){
        return this.id;
    }
    public void setID(String input){
        this.id = input;
    }
    
    public int getMessageTotal(){
        return this.messageTotal;
    }
    
    public int getPositiveWord(){
        return positiveWords;
    }
    
    public User(String ID){
        this.id = ID;
        followers = new <User> ArrayList();
        following = new <String> ArrayList();
        news = new <String> ArrayList();
        positiveWords = 0;
        messageTotal = 0;
    }
    
    public List<String> getNews(){
        return news;
    }
    
    public void addNews(String message){
        news.add(message);
    }
    
    public List<User> getFollowers(){
        return followers;
    }
    
     public List<String> getFollowing(){
        return following;
    }
    
    public void attach(User user) {
        followers.add(user);
    }   
    
    public void follow(String person){
        following.add(person);
    }
    
    
    public void message(String input){
        tweet = input;
        setChanged();
        notifyObservers(tweet);
        for (String word :happyWords) {
            if (tweet.toLowerCase().contains(word)) {
                positiveWords++;
            }
        }
        messageTotal++;
        
    }
    
    //not implemented
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
