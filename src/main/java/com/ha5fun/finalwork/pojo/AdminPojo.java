package com.ha5fun.finalwork.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chen
 * @Company ha5fun.com
 * @Date 2020/9/22 11:20 上午
 */
@Data
public class AdminPojo implements Serializable {
    private int adminId;
    private String adminName;
    private String adminPasswd;

}
