package com.domeke.modules.toilet.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 厕所楼栋  关联 设备保洁员
 * </p>
 *
 * @author zyl
 * @since 2020-09-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("toilet_associated")
@ApiModel(value="ToiletAssociated对象", description="厕所楼栋  关联 设备保洁员")
public class ToiletAssociated implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    private String id;

    @ApiModelProperty(value = "厕所id")
    private String toiletId;

    @ApiModelProperty(value = "楼栋id")
    private String toiletBuildingId;

    @ApiModelProperty(value = "保洁员id")
    private String cleanerId;

    @ApiModelProperty(value = "设备id")
    private String deviceId;

    private Date createTime;

    private Date modifyTime;

    @ApiModelProperty(value = "设备数量")
    private Integer deviceNum;


}
