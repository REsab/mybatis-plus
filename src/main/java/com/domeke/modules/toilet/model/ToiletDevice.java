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
@TableName("toilet_device")
@ApiModel(value="ToiletDevice对象", description="")
public class ToiletDevice implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    private String id;

    @ApiModelProperty(value = "名称")
    private String name;

    private String toiletId;

    @ApiModelProperty(value = "数量")
    private BigDecimal numbers;

    @ApiModelProperty(value = "类型")
    private String type;

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

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "创建人")
    private String creater;

    @ApiModelProperty(value = "主键")
    private String deviceId;

    @ApiModelProperty(value = "主键")
    private String supplierId;

    @ApiModelProperty(value = "品牌")
    private String band;

    @ApiModelProperty(value = "默认配置 0、1")
    private String defaultConfig;

    @ApiModelProperty(value = "图片")
    private String img;

    @ApiModelProperty(value = "缩略图")
    private String img2;


}
