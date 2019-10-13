package cn.xycode.day06;

public interface UserDao {

    //登录功能
    public abstract boolean isLogin(String name,String password);


    //注册功能
    public abstract void register(User user);

}
