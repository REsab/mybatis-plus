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
@TableName("toilet_building")
@ApiModel(value="ToiletBuilding对象", description="")
public class ToiletBuilding implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    private String id;

    @ApiModelProperty(value = "名称")
    private String name;

    private String toiletType;

    @ApiModelProperty(value = "经度 ")
    private BigDecimal longitude;

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

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "创建人")
    private String creater;

    @ApiModelProperty(value = "别名")
    private String name2;

    @ApiModelProperty(value = "地址")
    private String addr;

    @ApiModelProperty(value = "负责人")
    private String leader;

    @ApiModelProperty(value = "park")
    private String park;

    @ApiModelProperty(value = "图片")
    private String img;

    @ApiModelProperty(value = "缩略图")
    private String img2;


}
