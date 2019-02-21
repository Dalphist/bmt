package bmt.service;

import com.github.pagehelper.PageInfo;

import bmt.entity.Item;

/**
* Title: ItemService  
* Description:
* @author Dalphist  
* @date 2019年2月21日
 */
public interface ItemService {
	/**
	 * 查询物品数据
	 * @param item
	 * @return
	 */
    public PageInfo<Item> selectItemList(Item item);
    
    /**
              * 插入物品
     * @param item
     * @return 物品id
     */
    public int insertItem(Item item);
    
    /**
               * 删除物品
     * @param id
     * @return
     */
    public int deleteItem(Integer id);
    
    /**
              * 修改物品
     * @param item
     * @return
     */
    public int updateItem(Item item);
}
