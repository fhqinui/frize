package com.fhqinui.frize.common.enums;
import java.util.ArrayList;
import java.util.List;

/**
 * 系统操作返回码
 *  
 * @author zhaofei
 * @date 2015年6月6日 下午2:47:58
 */
public enum CodeEnum {
	
    SUCCESS("0", "操作成功"), 
    ILLEGAL_REQUEST("10001", "非法请求"), //400
    SERVICE_NOT_FOUND("10002", "服务不存在"), //404
    UNSUPPORT_MEDIATYPE("10003", "不支持的媒体类型"), //415
    SYSTEM_ERROR("10004", "系统错误"), //500
    NO_PERMISSION("10005", "没有权限"), //500
    SYSTEM_IS_BUSY("10006", "系统繁忙"), //500
    REMOTE_SYSTEM_ERROR("10007", "服务端错误"), //500
    SERVICE_UNAVAILABLE("10008", "服务暂停"), //503
    RESPONSE_IS_BLANK("10009", "通知状态码不正确"), 
    REQUEST_TIMEOUT("10010", "请求超时"),//408
    PATTERN_ERROR("20001", "入参格式错误"), 
    CONFIG_ERROR("20002", "配置异常");

    /** 枚举值 */
    private final String code;

    /** 枚举描述 */
    private final String message;

    /**
     * 构造一个<code>DomainResultCodeEnum</code>枚举对象
     * 
     * @param code
     * @param message
     */
    private CodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @return Returns the code.
     */
    public String getCode() {
        return code;
    }

    /**
     * @return Returns the message.
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return Returns the code.
     */
    public String code() {
        return code;
    }

    /**
     * @return Returns the message.
     */
    public String message() {
        return message;
    }

    /**
     * 通过枚举<code>code</code>获得枚举
     * 
     * @param code
     * @return DomainResultCodeEnum
     */
    public static CodeEnum getByCode(String code) {
        for (CodeEnum _enum : values()) {
            if (_enum.getCode().equals(code)) {
                return _enum;
            }
        }
        return null;
    }

    /**
     * 获取全部枚举
     * 
     * @return List<DomainResultCodeEnum>
     */
    public List<CodeEnum> getAllEnum() {
        List<CodeEnum> list = new ArrayList<CodeEnum>();
        for (CodeEnum _enum : values()) {
            list.add(_enum);
        }
        return list;
    }

    /**
     * 获取全部枚举值
     * 
     * @return List<String>
     */
    public List<String> getAllEnumCode() {
        List<String> list = new ArrayList<String>();
        for (CodeEnum _enum : values()) {
            list.add(_enum.code());
        }
        return list;
    }
}
