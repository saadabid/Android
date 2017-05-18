package assignment04.net.assignment04_v1;

/**
 * Created by Saad on 5/17/2017.
 */

public class User {

    private int cnic;
    private String password;
    private String name;
    private String add;
    private String email;
    private int no;

    public User() {
        super();
    }

    public User(int cnic, String password, String name, String add, String email, int no) {
        this.cnic = cnic;
        this.password = password;
        this.name = name;
        this.add = add;
        this.email = email;
        this.no = no;
    }

    public int getCnic() {
        return cnic;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }

    public String getEmail() {
        return email;
    }

    public int getNo() {
        return no;
    }

    public void setCnic(int cnic) {
        this.cnic = cnic;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
