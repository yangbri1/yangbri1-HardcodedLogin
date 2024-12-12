
public class Lab {
    /**
     * This challenge represents a hardcoded login example:
     *
     *     Let's say we have two users, named "admin" and "user".
     *     "admin" has a password of "qwerty".
     *     "user" has a password of "password".
     *
     * The method should return true if the login should be permitted, and false if it should not. You will need to use
     * if/else statements.
     *
     * @param username a String that represents a username.
     * @param password a String that represents a password.
     * @return true if there is a successful login, and false otherwise.
     */
    public boolean login(String username, String password){
        // bitwise AND & operator to inclusively compare both sides
        // if admin is trying to log in & their password should match "qwerty" 
        if(username == "admin" & password == "qwerty"){
            return true;    // log in
        }
        // bitwise AND & operator to check both sides before proceeding -- could change this into nested if's too
        // preferred to use String.equals() method to compare values of String over '==' operator normally as sometimes even though values are same, may point to different mem addresses in String Pool (In Heap memory)
        else if(username.equals("user") & password.equals("password")){
            return true;    // log in
        }
        // if neither cases are true above
        return false;   // deny entry
    }
}
