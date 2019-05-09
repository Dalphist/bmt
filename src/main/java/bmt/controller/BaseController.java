package bmt.controller;

import java.beans.PropertyEditorSupport;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import bmt.common.beans.PageDomain;
import bmt.common.beans.ResultBean;
import bmt.common.beans.TableDataInfo;
import bmt.common.beans.TableSupport;
import bmt.common.utils.DateUtils;
import bmt.common.utils.ShiroUtils;
import bmt.common.utils.StringUtils;
import bmt.entity.system.SysUser;

/**
 * web层通用数据处理
 * 
 * @author ruoyi
 */
public class BaseController
{
    /**
     * 将前台传递过来的日期格式的字符串，自动转化为Date类型
     */
    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        // Date 类型转换
        binder.registerCustomEditor(Date.class, new PropertyEditorSupport()
        {
            @Override
            public void setAsText(String text)
            {
                setValue(DateUtils.parseDate(text));
            }
        });
    }

    /**
     * 设置请求分页数据
     */
    protected void startPage()
    {
        PageDomain pageDomain = TableSupport.buildPageRequest();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();
        if (StringUtils.isNotNull(pageNum) && StringUtils.isNotNull(pageSize))
        {
            String orderBy = pageDomain.getOrderBy();
            PageHelper.startPage(pageNum, pageSize, orderBy);
        }
    }

    /**
     * 响应请求分页数据
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    protected TableDataInfo getDataTable(List<?> list)
    {
        TableDataInfo rspData = new TableDataInfo();
        rspData.setCode(0);
        rspData.setRows(list);
        rspData.setTotal(new PageInfo(list).getTotal());
        return rspData;
    }

    /**
     * 响应返回结果
     * 
     * @param rows 影响行数
     * @return 操作结果
     */
    protected ResultBean<String> toResultBean(int rows)
    {
        return rows > 0 ? success() : fail();
    }

    /**
     * 响应返回结果
     * 
     * @param result 结果
     * @return 操作结果
     */
    protected ResultBean<String> toAjax(boolean result)
    {
        return result ? success() : fail();
    }

    /**
     * 返回成功
     */
    public ResultBean<String> success()
    {
        return new ResultBean<String>().success();
    }

    /**
     * 返回失败消息
     */
    public ResultBean<String> fail()
    {
        return new ResultBean<String>().fail();
    }

    /**
     * 返回成功消息
     */
    public ResultBean<String> success(String message)
    {
    	ResultBean<String> rb = new ResultBean<String>().success();
    	rb.setMsg(message);
        return rb;
    }

    /**
     * 返回失败消息
     */
    public ResultBean<String> error(String message)
    {
    	ResultBean<String> rb = new ResultBean<String>().fail();
    	rb.setMsg(message);
        return rb;
    }

    /**
     * 返回错误码消息
     */
    public ResultBean<String> fail(int code, String message)
    {
    	ResultBean<String> rb = new ResultBean<String>().fail();
    	rb.setMsg(message);
    	rb.setCode(code);
        return rb;
    }

    /**
     * 页面跳转
     */
    public String redirect(String url)
    {
        return StringUtils.format("redirect:{}", url);
    }

    public SysUser getSysUser()
    {
        return ShiroUtils.getSysUser();
    }

    public void setSysUser(SysUser user)
    {
        ShiroUtils.setSysUser(user);
    }

    public Long getUserId()
    {
        return getSysUser().getUserId();
    }

    public String getLoginName()
    {
        return getSysUser().getLoginName();
    }
}
