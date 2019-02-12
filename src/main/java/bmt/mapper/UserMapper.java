package bmt.mapper;

/**
* Title: UserMapper  
* Description:角色Mapper
* @author Dalphist  
* @date 2019年2月11日
 */
public interface UserMapper
{
    public String getPassword(String username);
    
    public String getRole(String username);

}
