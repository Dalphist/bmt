package bmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import bmt.entity.Item;
import bmt.mapper.ItemMapper;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemMapper itemMapper;

	@Override
	public PageInfo<Item> selectItemList(Item item) {
		PageHelper.startPage(1, 5);
        List<Item> list = itemMapper.selectItemList(item);
        return new PageInfo<>(list);
	}

	@Override
	public int insertItem(Item item) {
		itemMapper.insertItem(item);
		return item.getId();
	}

	@Override
	public int deleteItem(Integer id) {
		return itemMapper.deleteById(id);
	}

	@Override
	public int updateItem(Item item) {
		// TODO Auto-generated method stub
		return 0;
	}

}
