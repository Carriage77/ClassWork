package cn.xycode.day12LogInFrame.ClassProject.Data;

public class Data {
    private String name;
    private String password;

    public Data(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Data() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
