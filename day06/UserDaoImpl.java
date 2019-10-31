package cn.xycode.day06;

import java.util.ArrayList;

public class UserDaoImpl implements UserDao {
    private static ArrayList<User>  users=new ArrayList<>();

    @Override
    public boolean isLogin(String name, String password) {
        boolean flag = false;
        for (User s : users) {
            if (s.getName().equals(name) && s.getPasswork().equals(password)) {
                flag = true;
                break;
            }

        } return flag;
    }



    @Override
    public void register(User user) {

        users.add(user);


    }
}
