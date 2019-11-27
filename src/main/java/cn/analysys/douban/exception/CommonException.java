package cn.analysys.douban.exception;

/**
 * Description:
 * 作为一个公共的异常
 *
 * @author houyi
 * @version 1.0
 * @date 2019/11/22 19:02
 * @since JDK 1.8
 */
public interface CommonException {
    public int getExceptionCode();
    public String getExceptionMsg();
    public CommonException setExceptionMsg(String errMsg);
}