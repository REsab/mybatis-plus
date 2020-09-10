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
@TableName("toilet_type")
@ApiModel(value="ToiletType对象", description="")
public class ToiletType implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "厕所类型主键")
    private String typeId;

    @ApiModelProperty(value = "厕所外键")
    private String toiletId;

    @ApiModelProperty(value = "类型名称 ")
    private String typeName;

    @ApiModelProperty(value = "创建人")
    private String creater;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改人")
    private String modifier;

    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;

    @ApiModelProperty(value = "版本")
    private Long version;

    @ApiModelProperty(value = "状态 ")
    private String datastate;

    @ApiModelProperty(value = "公司id")
    private String idInCompany;


}
