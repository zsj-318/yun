package com.zsj.yupicturebackend.model.dto.space.analyze;

import lombok.Data;

import java.io.Serializable;
/**
 * 空间排行分析请求
 */
@Data
public class SpaceRankAnalyzeRequest implements Serializable {

    /**
     * 排名前 N 的空间
     */
    private Integer topN = 10;

    private static final long serialVersionUID = 1L;
}
