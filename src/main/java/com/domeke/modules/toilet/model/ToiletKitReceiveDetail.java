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
 * 
 * </p>
 *
 * @author zyl
 * @since 2020-09-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("toilet_kit_receive_detail")
@ApiModel(value="ToiletKitReceiveDetail对象", description="")
public class ToiletKitReceiveDetail implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键、清洁工具领取详情")
    private String id;

    @ApiModelProperty(value = "领取订单id")
    private String kitRecevieId;

    @ApiModelProperty(value = "领取工具的id")
    private String kitId;

    @ApiModelProperty(value = "领取数量")
    private String kitNumber;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

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


}
