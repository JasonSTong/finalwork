package generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * RPMS_build
 * @author 
 */
@Data
public class RpmsBuild implements Serializable {
    /**
     * 楼栋ID号
     */
    private Integer buildId;

    /**
     * 楼栋名
     */
    private String buildName;

    /**
     * 开工时间
     */
    private Date buildStart;

    /**
     * 竣工时间
     */
    private Date buildFinish;

    /**
     * 漏洞信息
     */
    private String buildLeak;

    /**
     * 建筑面积
     */
    private Double buildArea;

    /**
     * 删除状态码(0,1)
     */
    private Integer buildDelete;

    private static final long serialVersionUID = 1L;
}