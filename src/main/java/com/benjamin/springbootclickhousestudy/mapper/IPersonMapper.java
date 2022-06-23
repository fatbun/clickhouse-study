package com.benjamin.springbootclickhousestudy.mapper;

import com.benjamin.springbootclickhousestudy.entity.PersonEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Ben.Li
 * @date 6/23/22 1:40 PM
 */
@Mapper
public interface IPersonMapper {

    /**
     * 查询全部
     *
     * @return
     */
    List<PersonEntity> selectList();
}
