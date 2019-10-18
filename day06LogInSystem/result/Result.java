package cn.xycode.day06LogInSystem.result;
/**
 * @program: Result
 * @Description: declare class Result
 * @author: Mr.Ma
 * @date: 2019/10/16 10:30 下午
 */
public class Result {
    private int ResultCode;
    private String ResultMessage;

    public Result() {
    }

    public Result(int resultCode, String resultMessage) {
        ResultCode = resultCode;
        ResultMessage = resultMessage;
    }

    public int getResultCode() {
        return ResultCode;
    }

    public void setResultCode(int resultCode) {
        ResultCode = resultCode;
    }

    public String getResultMessage() {
        return ResultMessage;
    }

    public void setResultMessage(String resultMessage) {
        ResultMessage = resultMessage;
    }


}
