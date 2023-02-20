package com.houdezaiwu.admin.bean.VO;

import lombok.Data;

import java.io.Serializable;

/**
 * 角色
 *
 * @TableName role
 */
@Data
public class Role implements Serializable {

    /**
     * 角色id
     */
    private Long id;
    /**
     * 角色名称
     */
    private String roleName;

}
