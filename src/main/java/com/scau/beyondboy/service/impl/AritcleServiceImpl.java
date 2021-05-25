package com.scau.beyondboy.service.impl;
import com.scau.beyondboy.dao.AritcleMapper;
import com.scau.beyondboy.model.Aritcle;
import com.scau.beyondboy.model.GroudAritcle;
import com.scau.beyondboy.service.AritcleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * Author:beyondboy
 * Gmail:xuguoli.scau@gmail.com
 * Date: 2016/2/18
 * Time: 9:34
 */
@Service("aritcleService")
public class AritcleServiceImpl implements AritcleService
{
    @Resource
    private AritcleMapper aritcleMapper;
    @Override
    public Aritcle getAritcleId(int id)
    {
        return null;
    }
    @Override
    public List<Aritcle> getLimitFind(@Param("start")int start, @Param("end")int end)
    {
        return aritcleMapper.getLimitFind(start,end);
    }
    @Override
    public List<GroudAritcle> getGroudBy()
    {
        return aritcleMapper.getGroudBy();
    }
    @Override
    public List<Integer> getCount()
    {
        return aritcleMapper.getCount();
    }
    @Override
    public List<Aritcle> getAll()
    {
        return aritcleMapper.getAll();
    }
    @Override
    public void add(Aritcle aritcle)
    {
        aritcleMapper.insert(aritcle);
    }
    @Override
    public void delete(int id)
    {
        aritcleMapper.deleteByPrimaryKey(id);
    }
}
