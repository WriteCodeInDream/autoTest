package testEnum;

public enum  User {
    USER_ADMIN("zidonghuaceshi", "wu123456"),

    ;
    public String username;
    public String password;
    User(String username, String password){
        this.username = username;
        this.password = password;
    }

}
