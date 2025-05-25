package com.zsj.yupicturebackend.service;

import com.zsj.yupicturebackend.model.dto.space.analyze.*;
import com.zsj.yupicturebackend.model.entity.Space;
import com.zsj.yupicturebackend.model.entity.User;
import com.zsj.yupicturebackend.model.vo.space.analyze.*;

import java.util.List;

public interface SpaceAnalyzeService {
    /**
     * 获取空间使用分析数据
     *
     * @param spaceUsageAnalyzeRequest SpaceUsageAnalyzeRequest 请求参数
     * @param loginUser                当前登录用户
     * @return SpaceUsageAnalyzeResponse 使用分析结果
     */
    SpaceUsageAnalyzeResponse getSpaceUsageAnalyze(SpaceUsageAnalyzeRequest spaceUsageAnalyzeRequest, User loginUser);

    /**
     * 获取空间分类分析数据
     *
     * @param spaceCategoryAnalyzeRequest SpaceCategoryAnalyzeRequest 请求参数
     * @param loginUser                   当前登录用户
     * @return List<SpaceCategoryAnalyzeResponse> 分类分析结果列表
     */
    List<SpaceCategoryAnalyzeResponse> getSpaceCategoryAnalyze(SpaceCategoryAnalyzeRequest spaceCategoryAnalyzeRequest, User loginUser);

    /**
     * 获取空间标签分析数据
     *
     * @param spaceTagAnalyzeRequest SpaceTagAnalyzeRequest 请求参数
     * @param loginUser              当前登录用户
     * @return List<SpaceTagAnalyzeResponse> 标签分析结果列表
     */
    List<SpaceTagAnalyzeResponse> getSpaceTagAnalyze(SpaceTagAnalyzeRequest spaceTagAnalyzeRequest, User loginUser);

    /**
     * 获取空间大小分析数据
     *
     * @param spaceSizeAnalyzeRequest SpaceSizeAnalyzeRequest 请求参数
     * @param loginUser               当前登录用户
     * @return List<SpaceSizeAnalyzeResponse> 大小分析结果列表
     */
    List<SpaceSizeAnalyzeResponse> getSpaceSizeAnalyze(SpaceSizeAnalyzeRequest spaceSizeAnalyzeRequest, User loginUser);

    /**
     * 获取空间用户上传分析数据
     *
     * @param spaceUserAnalyzeRequest SpaceUserAnalyzeRequest 请求参数
     * @param loginUser               当前登录用户
     * @return List<SpaceUserAnalyzeResponse> 用户分析结果列表
     */
    List<SpaceUserAnalyzeResponse> getSpaceUserAnalyze(SpaceUserAnalyzeRequest spaceUserAnalyzeRequest, User loginUser);

    /**
     * 获取空间排行分析数据
     *
     * @param spaceRankAnalyzeRequest SpaceRankAnalyzeRequest 请求参数
     * @param loginUser               当前登录用户
     * @return List<Space> 排行结果列表
     */
    List<Space> getSpaceRankAnalyze(SpaceRankAnalyzeRequest spaceRankAnalyzeRequest, User loginUser);
}
