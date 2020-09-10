package com.domeke.modules.toilet.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zyl
 * @since 2020-09-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("toilet_kit_receive")
@ApiModel(value="ToiletKitReceive对象", description="")
public class ToiletKitReceive implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键、清洁工具领用表")
    private String id;

    @ApiModelProperty(value = "领用人id")
    private String workerCleanId;

    @ApiModelProperty(value = "领用状态")
    private String state;

    @ApiModelProperty(value = "领取详情")
    private String kitRecevieDetailId;

    @ApiModelProperty(value = "纬度")
    private BigDecimal latitude;

    @ApiModelProperty(value = "修改者")
    private String modifier;

    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;

    @ApiModelProperty(value = "版本")
    private Long version;

    @ApiModelProperty(value = "状态是否删除 ")
    private String datastate;

    @ApiModelProperty(value = "公司id")
    private String idInCompany;

    @ApiModelProperty(value = "工具领取时间")
    private Date kitGetTime;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;


}
