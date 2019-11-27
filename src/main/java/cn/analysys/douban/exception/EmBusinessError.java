package cn.analysys.douban.exception;

/**
 * Description:
 *
 * @author houyi
 * @version 1.0
 * @date 2019/11/22 19:04
 * @since JDK 1.8
 */
public enum EmBusinessError implements CommonError {

    //通用错误类型00001
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    //未知错误类型
    UNKNOW_ERROR(10002,"未知错误"),
    //空指针异常
    Null_Pointer(10003,"空指针错误"),



    //10000开头为用户信息相关错误定义
    USER_NOT_EXIST(20001,"用户不存在")

    ;

    private int errCode;
    private String errMsg;

    EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public int getErrCode() {
        return errCode;
    }

    @Override
    public String getErrMsg() {
        return errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
