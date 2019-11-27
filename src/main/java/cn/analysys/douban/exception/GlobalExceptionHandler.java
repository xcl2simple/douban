package cn.analysys.douban.exception;

import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:
 *
 * @author houyi
 * @version 1.0
 * @date 2019/11/25 22:13
 * @since JDK 1.8
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseEntity<ExceptionVO> resolveException() {

        String errMsg = EmBusinessError.UNKNOW_ERROR.getErrMsg();
        int errCode = EmBusinessError.UNKNOW_ERROR.getErrCode();
        ExceptionVO exceptionVO = new ExceptionVO(errCode,errMsg);

        return ResponseEntity.ok(exceptionVO);
    }

    @ExceptionHandler(value = NotFoundException.class)//指定异常类型
    @ResponseBody
    public ResponseEntity<ExceptionVO> handleNotFoundException(NotFoundException e) {
        //
        int errCode = EmBusinessError.Null_Pointer.getErrCode();
        String errMsg = EmBusinessError.Null_Pointer.getErrMsg();
        ExceptionVO exceptionVO = new ExceptionVO(errCode,errMsg);

        return  ResponseEntity.ok(exceptionVO);
    }

    @ExceptionHandler(value = BusinessException.class)//指定异常类型
    @ResponseBody
    public ResponseEntity<ExceptionVO> handleMyException(Exception e) {

        int errCode = 0;
        String errMsg = null;

        if (e instanceof BusinessException){
            errCode = EmBusinessError.USER_NOT_EXIST.getErrCode();
            errMsg = EmBusinessError.USER_NOT_EXIST.getErrMsg();
        }

        ExceptionVO exceptionVO = new ExceptionVO(errCode,errMsg);

        return  ResponseEntity.ok(exceptionVO);
    }


}