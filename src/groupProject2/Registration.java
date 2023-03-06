package groupProject2;
    /*4Create Registration Class in which you would have variables as email,
        userName and password that have an access scope only within its own class.
        After creating an object of the class user should be able to call methods
        and in each method separately pass values to set users email, username and
        password. Requirements:
        Valid email consider to be only yahoo
        Valid userName and password cannot be empty and should be of length
        larger than 6 characters. Also valid password cannot contain userName.
        You do not have permission to send messages in this channel.*/
public class Registration {
    private String email;
    private String userName;
    private String password;

    void email(String email){
        if(email.contains("@yahoo.com")){
            System.out.println(email);
        }else{
            System.out.println("Invalid e-mail, only yahoo is allowed");
        }
    }
    void userName(String userName){
        if((userName.isEmpty())&&(userName.length()<6)){
            System.out.println("userName can not be empty and needs to be over 6 characters");
        } else if ((userName.isEmpty())||(userName.length()<6)) {
            System.out.println("userName can not be empty and needs to be over 6 characters");
        }else {
            System.out.println(userName);
        }
    }
    void password(String password,String userName){
        if((userName.isEmpty())&&(userName.length()<6)&&(password.isEmpty())&&(password.length()<6)&&(password==userName)){
            System.out.println("userName can not be empty or contain the username and needs to be over 6 characters");
        } else if ((userName.isEmpty())||(userName.length()<6)||(password.isEmpty())||(password.length()<6)||(password==userName)) {
            System.out.println("userName can not be empty or contain the username and needs to be over 6 characters");
        }else {
            System.out.println(password);
        }
    }

}
