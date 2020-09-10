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
 * 清洁工具
 * </p>
 *
 * @author zyl
 * @since 2020-09-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("toilet_kit")
@ApiModel(value="ToiletKit对象", description="清洁工具")
public class ToiletKit implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键、清洁工具")
    private String id;

    @ApiModelProperty(value = "名称")
    private String name;

    private String toiletType;

    @ApiModelProperty(value = "纬度")
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

    @ApiModelProperty(value = "图片路径")
    private String img;

    @ApiModelProperty(value = "缩略图")
    private String img2;


}
