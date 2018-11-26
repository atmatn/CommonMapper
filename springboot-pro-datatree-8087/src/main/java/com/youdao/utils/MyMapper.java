package com.youdao.utils;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
 * Created by gaocheng on 2018/11/26.
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper{
}
