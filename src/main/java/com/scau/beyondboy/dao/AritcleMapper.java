package com.scau.beyondboy.dao;

import com.scau.beyondboy.model.Aritcle;
import com.scau.beyondboy.model.GroudAritcle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AritcleMapper {
    int deleteByPrimaryKey(Integer articleId);

    int insert(Aritcle record);

    int insertSelective(Aritcle record);

    Aritcle selectByPrimaryKey(Integer articleId);

    int updateByPrimaryKeySelective(Aritcle record);

    int updateByPrimaryKey(Aritcle record);
    List<Aritcle> getLimitFind(@Param("start")int start, @Param("end")int end);
    List<Aritcle> getAll();
    List<GroudAritcle> getGroudBy();
    List<Integer> getCount();
}