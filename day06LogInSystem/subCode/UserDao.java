package cn.xycode.day06LogInSystem.subCode;

import cn.xycode.day06LogInSystem.DefaultValue.DefaultValue;

import java.io.*;
/**
 * @program: UserDao
 * @Description: declare class UserDao
 * @author: Mr.Ma
 * @date: 2019/10/16 10:40 下午
 */
public class UserDao {
    /**
     * @Description: to delete the file of UserData
     * @Param: [name]
     * @return: [null]
     * @Author: Mr.Ma
     * @Date: 2019/10/16 10:45 下午
     */
    public static void DeleteUser(String name) {
        String filename = DefaultValue.FILE_PATH + name + DefaultValue.FILE_TYES;
        File file = new File(filename);
        File fileParent = file.getParentFile();
        fileParent.mkdirs();
        boolean flag = false;
        int tryCount = 0;
        while (!flag && tryCount++ < 10) {
            System.gc();
            flag = file.delete();
        }
    }
    /**
     * @Description: to save the file of UserData
     * @Param: [user]
     * @return: cn.xycode.day06LogInSystem.subCode.UserService
     * @Author: Mr.Ma
     * @Date: 2019/10/16 11:25 下午
     */
    public static boolean SaveUser(User user) {
        boolean flag = false;
        try {
            if (user.getName() == null || user.getName().length() == 0) {
                throw new Exception();
            }
            String filename = DefaultValue.FILE_PATH + user.getName() + DefaultValue.FILE_TYES;
            String content = user.getName() + "\n" + user.getPassword();
            File file = new File(filename);
            File fileParent = file.getParentFile();
            fileParent.mkdirs();
            if (file.exists()) {
                throw new Exception();
            }
            file.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
            out.write(content);
            out.close();
            flag = true;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }
    /**
     * @Description: to read the file of UserData
     * @Param: [username]
     * @return: cn.xycode.day06LogInSystem.subCode.UserService
     * @Author: Mr.Ma
     * @Date: 2019/10/16 12:00 下午
     */
    public static User ReadUser(String username) {
        User user = new User();
        try {
            if (username == null || username.length() == 0) {
                throw new Exception();
            }
            String filename = DefaultValue.FILE_PATH + username + DefaultValue.FILE_TYES;
            File file = new File(filename);
            if (!file.exists()) {
                throw new Exception();
            }
            BufferedReader in = new BufferedReader(new FileReader(file));
            String id = in.readLine();
            String password = in.readLine();
            in.close();
            user.setName(id);
            user.setPassword(password);
        } catch (IOException e) {

            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

}
