package cn.analysys.douban.exception;

/**
 * Description:
 *
 * @author houyi
 * @version 1.0
 * @date 2019/11/22 19:04
 * @since JDK 1.8
 */
public enum BusinessExceptionEnum implements CommonException {

    //以1xxxx开头的是通用异常
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),

    UNKNOW_ERROR(10002,"未知异常"),

    Null_Pointer(10003,"空指针异常"),

    Array_Index_Out_Of_Bounds(10004,"数组越界异常"),

    Arithmetic(10005,"算术异常"),

    //2xxxx开头为用户信息相关错误定义
    USER_NOT_EXIST(20001,"用户不存在")

    ;

    private int exCode;
    private String exMsg;

    BusinessExceptionEnum(int exCode, String exMsg) {
        this.exCode = exCode;
        this.exMsg = exMsg;
    }

    @Override
    public int getExceptionCode() {
        return exCode;
    }

    @Override
    public String getExceptionMsg() {
        return exMsg;
    }

    @Override
    public CommonException setExceptionMsg(String errMsg) {
        this.exMsg = errMsg;
        return this;
    }
}
