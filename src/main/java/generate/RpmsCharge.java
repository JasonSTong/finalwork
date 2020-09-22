package generate;

import java.io.Serializable;
import lombok.Data;

/**
 * RPMS_charge
 * @author 
 */
@Data
public class RpmsCharge implements Serializable {
    /**
     * 收费项目ID号
     */
    private Integer chargeId;

    /**
     * 收费项目名称
（水电费、物业费、停车费等）
     */
    private String chargeName;

    /**
     * 收费标准（*元/m2/月）
     */
    private Double chargeUnit;

    /**
     * 删除状态码（0，1）
     */
    private Integer chargeDelete;

    private static final long serialVersionUID = 1L;
}