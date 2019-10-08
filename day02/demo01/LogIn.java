package cn.xycode.day02.demo01;

/**
 * 创建一个LogIn类，用于登录
 */
public class LogIn {
    private String id = "carriage";

    private String password = "12345678";

    public LogIn(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public LogIn() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }


}
