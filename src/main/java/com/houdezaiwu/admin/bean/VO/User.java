package com.houdezaiwu.admin.bean.VO;

import lombok.Data;

@Data
public class User {
    /**
     * 主键
     */
    private Long id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 角色名
     */
    private String roleName;
}
