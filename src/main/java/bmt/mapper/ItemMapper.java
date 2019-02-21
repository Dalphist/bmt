package bmt.mapper;

import java.util.List;

import bmt.entity.Item;

public interface ItemMapper {
	
	List<Item> selectItemList(Item item);
	
	int insertItem(Item item);

    int deleteById(Integer id);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
}