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
@TableName("toilet_user")
@ApiModel(value="ToiletUser对象", description="")
public class ToiletUser implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    private String id;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "密码")
    private String pwd;

    @ApiModelProperty(value = "手机号")
    private String tel;

    @ApiModelProperty(value = "微信id")
    private String wxid;

    @ApiModelProperty(value = "微信号")
    private String wx;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "经度 ")
    private String longitude;

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
