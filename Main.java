public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        ReportUser.report(user);
        SaveUser.save(user);
    }
}