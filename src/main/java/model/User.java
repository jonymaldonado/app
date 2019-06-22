package model;

public class User {
    public int id;
    public String first_name;
    public String last_name;
    public String avatar;

    public String allData(){
        return "id: " + this.id + "\n"
                + "first name: " + this.first_name + "\n"
                + "last name: " + this.last_name + "\n"
                + "avatar: " + this.avatar;
    }
}
