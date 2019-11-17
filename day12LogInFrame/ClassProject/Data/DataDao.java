package cn.xycode.day12LogInFrame.ClassProject.Data;

import cn.xycode.day12LogInFrame.ClassProject.DefaultValue.DefaultValue;

import java.io.*;

public class DataDao {
    /**
     * @Description: 保存用户信息
     * @Param: [user]
     * @return: cn.xycode.day12LogInFrame.ClassProject.SubCode.RegListener
     * @Author: Mr.Ma
     * @Date: 2019/11/17 1:35 下午
     */
    public static boolean SaveUser(Data user) throws IOException {
        boolean flag = false;
        String filename = DefaultValue.FILE_PATH + user.getName() + DefaultValue.FILE_TYES;
        String content = user.getName() + "\n" + user.getPassword();
        File file = new File(filename);
        File fileParent = file.getParentFile();
        fileParent.mkdirs();
        file.createNewFile();
        BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
        out.write(content);
        out.close();
        flag = true;
        return flag;

    }
    /**
     * @Description: 读取一个用户信息
     * @Param: [username]
     * @return: cn.xycode.day12LogInFrame.ClassProject.SubCode.RegListener
     * @Author: Mr.Ma
     * @Date: 2019/10/16 12:00 下午
     */
    public static Data ReadUser(String username) {
        Data user = new Data();
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
