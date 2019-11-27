package cn.analysys.douban.exception;

import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description:
 * 全局异常捕获类
 * 所有的异常都会在这个类中处理
 *
 * @author houyi
 * @version 1.0
 * @date 2019/11/25 22:13
 * @since JDK 1.8
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 捕获除特定异常外的其他所有异常
     * @return 未知异常说明
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseEntity<ExceptionVO> handlerException() {

        String errMsg = BusinessExceptionEnum.UNKNOW_ERROR.getExceptionMsg();
        int errCode = BusinessExceptionEnum.UNKNOW_ERROR.getExceptionCode();
        ExceptionVO exceptionVO = new ExceptionVO(errCode,errMsg);

        return new ResponseEntity(exceptionVO,HttpStatus.INTERNAL_SERVER_ERROR);
    }



    /**
     * 捕获空指针异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public ResponseEntity<ExceptionVO> handleNotFoundException() {
        //
        int errCode = BusinessExceptionEnum.Null_Pointer.getExceptionCode();
        String errMsg = BusinessExceptionEnum.Null_Pointer.getExceptionMsg();
        ExceptionVO exceptionVO = new ExceptionVO(errCode,errMsg);

        return new ResponseEntity(exceptionVO,HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(value = ArrayIndexOutOfBoundsException.class)
    @ResponseBody
    public ResponseEntity<ExceptionVO> handleArrayIndexOutOfBoundsException() {

        int errCode = BusinessExceptionEnum.Array_Index_Out_Of_Bounds.getExceptionCode();
        String errMsg = BusinessExceptionEnum.Array_Index_Out_Of_Bounds.getExceptionMsg();
        ExceptionVO exceptionVO = new ExceptionVO(errCode,errMsg);

        return new ResponseEntity(exceptionVO,HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(value = ArithmeticException .class)
    @ResponseBody
    public ResponseEntity<ExceptionVO> handleArithmeticException () {

        int errCode = BusinessExceptionEnum.Arithmetic.getExceptionCode();
        String errMsg = BusinessExceptionEnum.Arithmetic.getExceptionMsg();
        ExceptionVO exceptionVO = new ExceptionVO(errCode,errMsg);

        return new ResponseEntity(exceptionVO,HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public ResponseEntity<ExceptionVO> handleMyException(Exception e) {

        int errCode = 0;
        String errMsg = null;

        BusinessException businessException = (BusinessException) e;

        if ( businessException.getExceptionCode()== 20001){
            errCode = BusinessExceptionEnum.USER_NOT_EXIST.getExceptionCode();
            errMsg = BusinessExceptionEnum.USER_NOT_EXIST.getExceptionMsg();
        }

        ExceptionVO exceptionVO = new ExceptionVO(errCode,errMsg);

        return new ResponseEntity(exceptionVO,HttpStatus.INTERNAL_SERVER_ERROR);
    }


}