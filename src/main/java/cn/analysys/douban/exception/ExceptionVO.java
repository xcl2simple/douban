package cn.analysys.douban.exception;

/**
 * Description:
 *
 * @author houyi
 * @version 1.0
 * @date 2019/11/25 23:44
 * @since JDK 1.8
 */
public class ExceptionVO {
    private Integer errCode;

    private String errMsg;

    public ExceptionVO(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public Integer getErrCode() {
        return errCode;
    }

    @Override
    public String toString() {
        return "ExceptionVO{" +
                "errCode=" + errCode +
                ", errMsg='" + errMsg + '\'' +
                '}';
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

}