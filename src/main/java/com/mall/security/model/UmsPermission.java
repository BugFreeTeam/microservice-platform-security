package com.mall.security.model;


import com.anjuxing.platform.common.base.ValidateData;
import com.anjuxing.platform.common.crud.CrudModel;
import com.anjuxing.platform.common.util.CodeUtils;
import com.anjuxing.platform.common.util.DateUtils;
import com.anjuxing.platform.common.util.ValidateUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 后台用户权限表
 */
public class UmsPermission extends CrudModel<UmsPermission> {

    private static final long serialVersionUID = 1L;

    private Long id; // 
    private Long pid; // 父级权限id
    private String name; // 名称
    private String value; // 权限值
    private String icon; // 图标
    private Integer type; // 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
    private String uri; // 前端资源路径
    private Integer status; // 启用状态；0->禁用；1->启用
    private Object createTime; // 创建时间
    private Integer sort; // 排序

    /************************************************自定义字段***********************************************/

    public UmsPermission() {

    }

    /**
     * 获取
     * @return Long
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取父级权限id
     * @return Long
     */
    public Long getPid() {
        return pid;
    }

    /**
     * 设置父级权限id
     * @param pid
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * 获取名称
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取权限值
     * @return String
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置权限值
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取图标
     * @return String
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     * @return Integer
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取前端资源路径
     * @return String
     */
    public String getUri() {
        return uri;
    }

    /**
     * 设置前端资源路径
     * @param uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * 获取启用状态；0->禁用；1->启用
     * @return Integer
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置启用状态；0->禁用；1->启用
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     * @return Object
     */
    public Object getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     * @param createTime
     */
    public void setCreateTime(Object createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取排序
     * @return Integer
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /********************************************数据校验处理操作***********************************************/

    /**
     * 数据校验，插入数据之前执行，需要手动调用
     * @return
     */
    @Override
    public ValidateData validate() {
        ValidateData valid = new ValidateData();
        StringBuffer msg = new StringBuffer();
        boolean status = true;
        valid.setStatus(status);
        valid.setMessage(msg.toString());
        return valid;
    }

    /**
     * 插入数据之前执行方法，需要手动调用
     */
    @Override
    public void preInsert() {
        if (ValidateUtils.isEmpty(this.id)) {
            //this.id = CodeUtils.getUUID();
        }
    }

    /**
     * 更新数据之前执行方法，需要手动调用
     */
    @Override
    public void preUpdate() {

    }

    /**
     * 逻辑删除数据之前执行方法，需要手动调用
     * @param
     */
    @Override
    public void preCancel() {

    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.getClass().getName());
        sb.append("; id=" + (id == null ? "null" : id.toString()));
        sb.append("; pid=" + (pid == null ? "null" : pid.toString()));
        sb.append("; name=" + (name == null ? "null" : name.toString()));
        sb.append("; value=" + (value == null ? "null" : value.toString()));
        sb.append("; icon=" + (icon == null ? "null" : icon.toString()));
        sb.append("; type=" + (type == null ? "null" : type.toString()));
        sb.append("; uri=" + (uri == null ? "null" : uri.toString()));
        sb.append("; status=" + (status == null ? "null" : status.toString()));
        sb.append("; createTime=" + (createTime == null ? "null" : createTime.toString()));
        sb.append("; sort=" + (sort == null ? "null" : sort.toString()));
        return sb.toString();
    }

}