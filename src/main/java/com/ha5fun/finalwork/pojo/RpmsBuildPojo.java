package com.ha5fun.finalwork.pojo;

import lombok.Data;

import java.util.Date;
import java.util.Objects;

/**
 *@author chen
 *@Company ha5fun.com
 *@Date 2020/9/21 8:29 下午
 */
@Data
public class RpmsBuildPojo {
    private int buildId;
    private String buildName;
    private Date buildStart;
    private Date buildFinish;
    private String buildLeak;
    private double buildArea;
    private int buildDelete;
}
