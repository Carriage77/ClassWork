package cn.xycode.day06LogInSystem.subCode;

import cn.xycode.day06LogInSystem.result.Result;

/**
 * @program: UserService
 * @Description: declare userService interface
 * @author: Mr.Ma
 * @date: 2019/10/16 8:49 下午
 */
public interface UserService {
    /**
     * @Description: to login the system
     * @Param: [user]
     * @return: cn.xycode.day06LogInSystem.result.Result
     * @Author: Mr.Ma
     * @Date: 2019/10/16 8:55 下午
     */
    //登录功能
    public abstract Result Login(User user);

    /**
     * @Description: to change the password
     * @Param: [name]
     * @return: cn.xycode.day06LogInSystem.result.Result
     * @Author: Mr.Ma
     * @Date: 2019/10/16 8:57 下午
     */
    //忘记密码
    public abstract Result ForgetData(String name);

    /**
     * @Description: to register the User
     * @Param: [user]
     * @return: cn.xycode.day06LogInSystem.result.Result
     * @Author: Mr.Ma
     * @Date: 2019/10/16 9:00 下午
     */
    //注册功能
    public abstract Result register(User user);


}
