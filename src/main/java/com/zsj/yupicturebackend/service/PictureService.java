package com.zsj.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zsj.yupicturebackend.model.dto.picture.*;
import com.zsj.yupicturebackend.model.entity.Picture;
import com.zsj.yupicturebackend.model.entity.User;
import com.zsj.yupicturebackend.model.vo.PictureVO;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author 86157
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-04-26 21:17:11
*/
public interface PictureService extends IService<Picture> {

    /**
     * 上传图片
     *
     * @param inputSource
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    public PictureVO uploadPicture(Object inputSource, PictureUploadRequest pictureUploadRequest, User loginUser);
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

    /**
     * 图片审核
     *
     * @param pictureReviewRequest 图片审核请求
     * @param loginUser            当前登录的 user
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);
    /**
     * 填充审核参数，方便其他方法使用
     *
     * @param picture   picture
     * @param loginUser 登录的用户
     */
    void fillReviewParams(Picture picture, User loginUser);

    /**
     * 批量抓取和创建图片
     *
     * @param pictureUploadByBatchRequest
     * @param loginUser
     * @return 成功创建的图片数
     */
    Integer uploadPictureByBatch(
            PictureUploadByBatchRequest pictureUploadByBatchRequest,
            User loginUser
    );

    /**
     * 清理图片
     *
     * @param oldPicture
     */
    void clearPictureFile(Picture oldPicture);

    /**
     * 删除图片
     *
     * @param pictureId
     * @param loginUser
     */
    void deletePicture(long pictureId, User loginUser);

    /**
     * 编辑图片
     *
     * @param pictureEditRequest
     * @param loginUser
     */
    void editPicture(PictureEditRequest pictureEditRequest, User loginUser);

    /**
     * 校验空间图片权限
     * @param loginUser
     * @param picture
     */
    void checkPictureAuth(User loginUser,Picture picture);

    /**
     * 按照颜色相似度查询图片
     *
     * @param spaceId spaceId
     * @param picColor 颜色
     * @param loginUser 登录的用户
     * @return 图片 vo 结合
     */
    List<PictureVO> searchPictureByColor(Long spaceId, String picColor, User loginUser);


    /**
     * 批量编辑图片
     *
     * @param pictureEditByBatchRequest
     * @param loginUser
     */
    void editPictureByBatch(PictureEditByBatchRequest pictureEditByBatchRequest, User loginUser);
}
