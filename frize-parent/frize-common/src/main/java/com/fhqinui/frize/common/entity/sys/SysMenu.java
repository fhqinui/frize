package com.fhqinui.frize.common.entity.sys;

import java.util.Date;

/**
 * @see t_sys_menu_
 * @date 2015-07-31 10:35:49
 */
public class SysMenu {
    /**
     * 
     * @column id_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    private String id;

    /**
     * 父菜单id
     * @column parent_id_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    private String parentId;

    /**
     * 编码
     * @column code_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    private String code;

    /**
     * 菜单名称
     * @column name_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    private String name;

    /**
     * 菜单url
     * @column url_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    private String url;

    /**
     * 图标
     * @column icon_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    private String icon;

    /**
     * 备注
     * @column comment_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    private String comment;

    /**
     * 新增时间
     * @column raw_add_time_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    private Date rawAddTime;

    /**
     * 最后修改时间
     * @column raw_update_time_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    private Date rawUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_menu_.id_
     *
     * @return the value of t_sys_menu_.id_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_menu_.id_
     *
     * @param id the value for t_sys_menu_.id_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_menu_.parent_id_
     *
     * @return the value of t_sys_menu_.parent_id_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_menu_.parent_id_
     *
     * @param parentId the value for t_sys_menu_.parent_id_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_menu_.code_
     *
     * @return the value of t_sys_menu_.code_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_menu_.code_
     *
     * @param code the value for t_sys_menu_.code_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_menu_.name_
     *
     * @return the value of t_sys_menu_.name_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_menu_.name_
     *
     * @param name the value for t_sys_menu_.name_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_menu_.url_
     *
     * @return the value of t_sys_menu_.url_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_menu_.url_
     *
     * @param url the value for t_sys_menu_.url_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_menu_.icon_
     *
     * @return the value of t_sys_menu_.icon_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_menu_.icon_
     *
     * @param icon the value for t_sys_menu_.icon_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_menu_.comment_
     *
     * @return the value of t_sys_menu_.comment_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_menu_.comment_
     *
     * @param comment the value for t_sys_menu_.comment_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_menu_.raw_add_time_
     *
     * @return the value of t_sys_menu_.raw_add_time_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_menu_.raw_add_time_
     *
     * @param rawAddTime the value for t_sys_menu_.raw_add_time_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_menu_.raw_update_time_
     *
     * @return the value of t_sys_menu_.raw_update_time_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_menu_.raw_update_time_
     *
     * @param rawUpdateTime the value for t_sys_menu_.raw_update_time_
     *
     * @mbggenerated 2015-07-31 10:35:49
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }
}