package cn.xycode.day12LogInFrame.pro01;

import java.util.HashMap;
import java.util.Map;

public class Data {

        private Map data = new HashMap();

        public Data(){}

        public boolean add(String name,String pw){
            if(data.containsKey(name)){
                return false;
            }
            else{
                data.put(name,pw);
                return true;
            }
        }

        public String login(String name,String pw){
            if(data.get(name) == null){
                return "该用户不存在";
            }
            else if(!data.get(name).equals(pw)) {
                return "密码错误";
            }
            else{
                return "登录成功";
            }
        }
    }



