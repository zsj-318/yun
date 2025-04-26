package com.zsj.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zsj.yupicturebackend.model.dto.picture.PictureQueryRequest;
import com.zsj.yupicturebackend.model.dto.picture.PictureUploadRequest;
import com.zsj.yupicturebackend.model.entity.Picture;
import com.zsj.yupicturebackend.model.entity.User;
import com.zsj.yupicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
* @author 86157
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-04-26 21:17:11
*/
public interface PictureService extends IService<Picture> {

    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);
    /**
     * 校验图片
     *
     * @param picture
     */
    public void validPicture(Picture picture);
    /**
     * 获取图片封装
     * @param picture
     * @param request
     * @return
     */
    public PictureVO getPictureVO(Picture picture, HttpServletRequest request);
    /**
     * 分页获取图片封装
     */

    public Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);
    /**
     * 获取查询对象
     *
     * @param pictureQueryRequest
     * @return
     */
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);


}
