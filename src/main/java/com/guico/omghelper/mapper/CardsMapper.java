package com.guico.omghelper.mapper;

import com.guico.omghelper.domain.Cards;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author 13054
* @description 针对表【cards】的数据库操作Mapper
* @createDate 2024-02-07 22:17:41
* @Entity com.guico.omghelper.domain.Cards
*/
@Mapper
public interface CardsMapper  {
    @Select("select * from cards")
    List<Cards> list();

}




