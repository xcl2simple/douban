package cn.analysys.douban.exception;

/**
 * Description:
 * 这是一个异常类，会接收一个Exception(这个Exception是我自己定义的)
 * 包装器业务
 *
 * @author houyi
 * @version 1.0
 * @date 2019/11/22 19:14
 * @since JDK 1.8
 */
public class BusinessException extends Exception implements CommonException {

    private CommonException commonException;

    //直接接收EmBusinessException的传参用于构造业务异常
    public BusinessException(CommonException commonException){
        super();
        this.commonException = commonException;
    }

    //直接接收EmBusinessException的传参用于构造业务异常
    public BusinessException(CommonException commonException, String exMsg){
        super();
        this.commonException = commonException;
        commonException.setExceptionMsg(exMsg);
    }

    @Override
    public int getExceptionCode() {
        return this.commonException.getExceptionCode();
    }

    @Override
    public String getExceptionMsg() {
        return this.commonException.getExceptionMsg();
    }

    @Override
    public CommonException setExceptionMsg(String exMsg) {
        this.commonException.setExceptionMsg(exMsg);
        return this;
    }
}