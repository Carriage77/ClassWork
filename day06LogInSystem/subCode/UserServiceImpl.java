package cn.xycode.day06LogInSystem.subCode;


import cn.xycode.day06LogInSystem.result.Result;

import java.util.Scanner;

/**
 * @program: UserServiceImpl
 * @Description: implement user service
 * @author: Mr.Ma
 * @date: 2019/10/16 9:05 下午
 */
public class UserServiceImpl implements UserService {
    /**
     * @Description: to login the system
     * @Param: [userLogin]
     * @return: cn.xycode.day06LogInSystem.result.Result
     * @Author: Mr.Ma
     * @Date: 2019/10/16 9:25 下午
     */
    @Override
    public Result Login(User userLogin) {
        UserDao readUser = new UserDao();
        User user = readUser.ReadUser(userLogin.getName());
        Result result = new Result(402, "发生错误！");
        if (user.getName().equals(userLogin.getName()) &&
                user.getPassword().equals(userLogin.getPassword())) {
            result.setResultCode(201);
            result.setResultMessage("欢迎您，" + user.getName());
        }
        return result;
    }

    /**
     * @Description: to change the password
     * @Param: [name]
     * @return: cn.xycode.day06LogInSystem.result.Result
     * @Author: Mr.Ma
     * @Date: 2019/10/16 9:47 下午
     */
    @Override
    public Result ForgetData(String name) {
        UserDao userDao = new UserDao();
        User user = userDao.ReadUser(name);
        Result result = new Result(404, "发生错误！");
        if (user.getName().equals(name)) {
            System.out.println("核对成功！请输入新密码：");
            Scanner sc = new Scanner(System.in);
            String newPassword = sc.nextLine();
            user.setPassword(newPassword);
            userDao.DeleteUser(name);
            userDao.SaveUser(user);
            result.setResultCode(202);
            result.setResultMessage("修改成功！");
        }
        return result;
    }

    /**
     * @Description: to register the User
     * @Param: [user]
     * @return: cn.xycode.day06LogInSystem.result.Result
     * @Author: Mr.Ma
     * @Date: 2019/10/16 10:10 下午
     */
    @Override
    public Result register(User user) {
        UserDao writeUser = new UserDao();
        boolean flag = writeUser.SaveUser(user);
        Result result = new Result(404, "注册失败!");
        if (flag) {
            result.setResultCode(200);
            result.setResultMessage("注册成功!");
        }
        return result;
    }
}
