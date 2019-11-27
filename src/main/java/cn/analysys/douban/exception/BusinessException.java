package cn.analysys.douban.exception;

/**
 * Description:
 * 这是一个异常类，会接收一个error(这个error是我自己定义的)
 * 包装器业务
 *
 * @author houyi
 * @version 1.0
 * @date 2019/11/22 19:14
 * @since JDK 1.8
 */
public class BusinessException extends Exception implements CommonError {

    private CommonError commonError;

    //直接接收EmBusinessError的传参用于构造业务异常
    public BusinessException(CommonError commonError){
        super();
        this.commonError = commonError;
    }

    //直接接收EmBusinessError的传参用于构造业务异常
    public BusinessException(CommonError commonError,String errMsg){
        super();
        this.commonError = commonError;
        commonError.setErrMsg(errMsg);
    }

    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}