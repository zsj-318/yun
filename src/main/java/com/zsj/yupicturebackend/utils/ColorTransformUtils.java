package com.zsj.yupicturebackend.utils;

import org.checkerframework.checker.units.qual.C;

import java.awt.*;

/**
 * 颜色类转换工具类
 */
public class ColorTransformUtils {
    private ColorTransformUtils() {
        //工具类不需要实例化
    }

    /**
     * 获取标准色差（将数据万象的5 位色值转换为6 位）
     * @param color
     * @return
     */
    public static String getStandardCol(String color){
        //(每一种rgb色值都有可能只有一个0 要转换为00）
        //示例0x080e0 => 0x080e00
        if (color.length() == 7){
            color = color.substring(0, 4) + "0" + color.substring(4, 7);
        }

        return color;
    }
}
