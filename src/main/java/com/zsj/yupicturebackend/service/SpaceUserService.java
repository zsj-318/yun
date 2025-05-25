package com.zsj.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zsj.yupicturebackend.model.dto.space.SpaceAddRequest;
import com.zsj.yupicturebackend.model.dto.space.SpaceQueryRequest;
import com.zsj.yupicturebackend.model.dto.spaceuser.SpaceUserAddRequest;
import com.zsj.yupicturebackend.model.dto.spaceuser.SpaceUserQueryRequest;
import com.zsj.yupicturebackend.model.entity.Space;
import com.zsj.yupicturebackend.model.entity.SpaceUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zsj.yupicturebackend.model.entity.User;
import com.zsj.yupicturebackend.model.vo.SpaceUserVO;
import com.zsj.yupicturebackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author 86157
* @description 针对表【space_user(空间用户关联)】的数据库操作Service
* @createDate 2025-05-25 18:59:07
*/
public interface SpaceUserService extends IService<SpaceUser> {

    /**
     * 创建空间成员
     * @param spaceAddRequest
     * @return
     */
    long addSpaceUser(SpaceUserAddRequest spaceAddRequest);
    /**
     * 校验空间成员
     *
     * @param spaceUser
     * @param add 是否为创建
     */
    void validSpaceUser(SpaceUser spaceUser, boolean add);
    /**
     * 获取空间成员封装
     * @param spaceUser
     * @param request
     * @return
     */
    SpaceUserVO getSpaceUserVO(SpaceUser spaceUser, HttpServletRequest request);

    /**
     * 获取空间成员封装（列表）
     * @param spaceUserList
     */
    List<SpaceUserVO> getSpaceUserVOList(List<SpaceUser> spaceUserList);
    /**
     * 获取成员查询对象
     *
     * @param spaceUserQueryRequest
     * @return
     */
    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);
}
