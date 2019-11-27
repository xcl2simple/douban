package cn.analysys.douban.exception;

/**
 * Description:
 *
 * @author houyi
 * @version 1.0
 * @date 2019/11/22 19:02
 * @since JDK 1.8
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}