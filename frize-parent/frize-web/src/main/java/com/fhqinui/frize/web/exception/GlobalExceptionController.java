package com.fhqinui.frize.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.fhqinui.frize.common.enums.CodeEnum;
import com.fhqinui.frize.common.exception.PatternException;
import com.fhqinui.frize.common.http.CommonResult;

/**
 * 注意使用注解@ControllerAdvice作用域是全局Controller范围
 * 可应用到所有@RequestMapping类或方法上的@ExceptionHandler、@InitBinder、@ModelAttribute，在这里是@ExceptionHandler
 * @author zhaofei
 * @date 2015年6月6日 下午2:55:20
 */
@ControllerAdvice
public class GlobalExceptionController {

    @ExceptionHandler(PatternException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)  
    @ResponseBody
    public CommonResult handleCustomException(PatternException ex) {
        
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(ex.getErrorCode());
        commonResult.setMessage(ex.getMessage());
        commonResult.setErrors(ex.getMessage());
        return commonResult;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)  
    @ResponseBody
    public CommonResult handleAllException(Exception ex) {

        CommonResult commonResult = new CommonResult();
        commonResult.setCode(CodeEnum.SYSTEM_ERROR.getCode());
        commonResult.setMessage(CodeEnum.SYSTEM_ERROR.getMessage());
        commonResult.setErrors(ex.getMessage());
        return commonResult;

    }

}
