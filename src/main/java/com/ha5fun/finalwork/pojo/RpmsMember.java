package com.ha5fun.finalwork.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * RPMS_member
 * @author 
 */
@Data
public class RpmsMember implements Serializable {
    /**
     * 业主成员id
     */
    private Integer memberId;

    /**
     * 成员姓名
     */
    private String memberName;

    /**
     * 成员性别
     */
    private Integer memberSex;

    /**
     * 成员籍贯
     */
    private String memberNative;

    /**
     * 联系方式
     */
    private String memberPhone;

    /**
     * 工作单位
     */
    private String memberComp;

    /**
     * 业主ID
     */
    private Integer ownerId;

    private Integer memberDelete;

    private static final long serialVersionUID = 1L;
}