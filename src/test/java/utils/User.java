package utils;

public enum  User {
    USER_ADMIN("zidonghuaceshi", "wu123456"),

    ;
    String username;
    String password;
    User(String username, String password){
        this.username = username;
        this.password = password;
    }

}
