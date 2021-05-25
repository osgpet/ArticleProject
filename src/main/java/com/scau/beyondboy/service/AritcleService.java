package com.scau.beyondboy.service;

import com.scau.beyondboy.model.Aritcle;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * Author:beyondboy
 * Gmail:xuguoli.scau@gmail.com
 * Date: 2016/2/18
 * Time: 1:10
 */
public interface AritcleService
{
    Aritcle getAritcleId(int id);
    List<Aritcle> getLimitFind(@Param("start")int start,@Param("end")int end);
    Object getGroudBy();
    List<Integer> getCount();
    List<Aritcle> getAll();
    void add(Aritcle aritcle);
    void delete(int id);
}
