package com.zsj.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zsj.yupicturebackend.model.dto.space.SpaceAddRequest;
import com.zsj.yupicturebackend.model.dto.space.SpaceQueryRequest;
import com.zsj.yupicturebackend.model.entity.Space;
import com.zsj.yupicturebackend.model.entity.Space;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zsj.yupicturebackend.model.entity.User;
import com.zsj.yupicturebackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author 86157
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2025-05-07 21:59:55
*/
public interface SpaceService extends IService<Space> {

    /**
     * 创建空间
     *
     * @param loginUser
     * @param spaceAddRequest
     * @return
     */
    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);
    /**
     * 校验空间
     *
     * @param space
     * @param add 是否为创建
     */
    void validSpace(Space space, boolean add);
    /**
     * 获取空间封装
     * @param space
     * @param request
     * @return
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);
    /**
     * 分页获取空间封装
     */

    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);
    /**
     * 获取查询对象
     *
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    /**
     * 填充空间层级
     * @param space
     */
   void fillSpaceBySpaceLevel(Space space);

   /**
    * 校验空间权限
    * @param loginUser
    * @param space
    */
   void checkSpaceAuth(User loginUser,Space space);
}
