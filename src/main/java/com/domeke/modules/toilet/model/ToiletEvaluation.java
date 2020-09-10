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
@TableName("toilet_evaluation")
@ApiModel(value="ToiletEvaluation对象", description="")
public class ToiletEvaluation implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键、满意度")
    private String id;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "厕所id")
    private String toiletId;

    @ApiModelProperty(value = "评价图片、存放路径")
    private String imgUrl2;

    @ApiModelProperty(value = "评价图片、存放路径")
    private String imgUrl1;

    @ApiModelProperty(value = "评价内容")
    private String note;

    @ApiModelProperty(value = "0-5 五星好评")
    private Integer evaluatonLeval;

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

    @ApiModelProperty(value = "评价图片、存放路径")
    private String imgUrl3;

    @ApiModelProperty(value = "评价图片、存放路径")
    private String imgUrl4;

    @ApiModelProperty(value = "评价图片、存放路径")
    private String imgUrl5;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "评价原因，选择的内容")
    private String evaluatonWhy;

    @ApiModelProperty(value = "评价原因，选择的内容,id值")
    private String evaluatonWhyId;


}
