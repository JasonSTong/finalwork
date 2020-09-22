package generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * RPMS_material
 * @author 
 */
@Data
public class RpmsMaterial implements Serializable {
    /**
     * 物资ID号
     */
    private Integer materialId;

    /**
     * 物资别名
     */
    private String materialName;

    /**
     * 数量
     */
    private Integer materialCount;

    /**
     * 单价
     */
    private Double materialPrice;

    /**
     * 物资类别ID号
     */
    private Integer typeId;

    /**
     * 入库时间
     */
    private Date materialInDate;

    /**
     * 出库时间
     */
    private Date materialOutDate;

    /**
     * 物资状态(0,1)
     */
    private Integer materialStat;

    /**
     * 删除状态(0,1)
     */
    private Integer materialDelete;

    private static final long serialVersionUID = 1L;
}