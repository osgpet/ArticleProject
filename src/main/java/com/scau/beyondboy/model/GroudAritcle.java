package com.scau.beyondboy.model;
import java.io.Serializable;
/**
 * Author:beyondboy
 * Gmail:xuguoli.scau@gmail.com
 * Date: 2016/2/18
 * Time: 11:10
 */
public class GroudAritcle implements Serializable
{
    int rowNum;
    String author_name;
    String title;
    public GroudAritcle()
    {

    }
    public String getAuthor_name()
    {
        return author_name;
    }
    public void setAuthor_name(String author_name)
    {
        this.author_name = author_name;
    }
    public int getRowNum()
    {
        return rowNum;
    }
    public void setRowNum(int rowNum)
    {
        this.rowNum = rowNum;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    @Override
    public String toString()
    {
        return "GroudAritcle{" +
                "rowNum=" + rowNum +
                ", author_name='" + author_name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
