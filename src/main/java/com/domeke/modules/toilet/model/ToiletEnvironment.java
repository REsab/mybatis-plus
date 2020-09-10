package com.domeke.modules.toilet.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 操作日志表
 * </p>
 *
 * @author zyl
 * @since 2020-09-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("toilet_environment")
@ApiModel(value="ToiletEnvironment对象", description="操作日志表")
public class ToiletEnvironment implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    private String id;

    @ApiModelProperty(value = "外键")
    private String toiletId;

    @ApiModelProperty(value = "温度，摄氏度")
    private String envTemperature;

    @ApiModelProperty(value = "湿度，使用相对温度单位 %RH")
    private String envHumidity;

    @ApiModelProperty(value = "氨气，单位 g/L")
    private String envAmmonia;

    @ApiModelProperty(value = "硫化氢，单位g/L")
    private String envHydrogenSulfide;

    @ApiModelProperty(value = "数据状态，标记是否已删除")
    @TableField("DATASTATE")
    private String datastate;

    @ApiModelProperty(value = "创建人")
    @TableField("CREATER")
    private String creater;

    @ApiModelProperty(value = "修改人")
    @TableField("MODIFIER")
    private String modifier;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_TIME")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    @TableField("MODIFY_TIME")
    private Date modifyTime;

    @ApiModelProperty(value = "版本号")
    @TableField("VERSION")
    private String version;

    @ApiModelProperty(value = "公司id")
    private String idInCompany;


}
