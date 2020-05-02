package com.pavilionvip.mygmall.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * Created by rize on 2019/2/13.
 */
@Data
@TableName("unimall_img")
public class ImgDO extends SuperDO {

    @TableField("biz_type")
    private Integer bizType;

    @TableField("biz_id")
    private Long bizId;

    private String url;


}
