package ist.fourtwelve.models;


public class Professor {

    //Login Credentials
    private String username;
    private char[] password;

    //Contact information\Password Confirmation
    private String email;

    //List of courses the Instructor is responsible for grading
//    private ArrayList<Course> courseList;

    //init with just username and password fields
    public Professor(String username, char[] password){
        this.username = username;
        this.password = password;
    }

    //init with the additional email field
    public Professor(String username, char[] password, String email){
        this.username = username;
        this.password = password;
        this.email    = email;
    }

    //GET/SET Username
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }


    //GET/SET Password
    public char[] getPassword(){
        return this.password;
    }
    public void setPassword(char[] password){
        this.password = password;
    }

    //GET/SET Email
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    //GET courseList
//    public ArrayList<Course> getCourseList(){
//        return this.courseList;
//    }

}
