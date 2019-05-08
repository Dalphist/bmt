package bmt.service.system;

import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.PostConstruct;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bmt.common.exception.user.UserPasswordNotMatchException;
import bmt.entity.system.SysUser;

/**
* Title: SysPasswordImpl  
* Description:
* @author Dalphist  
* @date 2019年5月8日
 */
@Service
public class SysPasswordImpl implements SysPasswordService {
//	@Autowired
//    private CacheManager cacheManager;

    private Cache<String, AtomicInteger> loginRecordCache;

//    @PostConstruct
//    public void init()
//    {
//        loginRecordCache = cacheManager.getCache("loginRecordCache");
//    }

	@Override
	public void validate(SysUser user, String password) {
		String loginName = user.getLoginName();

//        AtomicInteger retryCount = loginRecordCache.get(loginName);

//        if (retryCount == null)
//        {
//            retryCount = new AtomicInteger(0);
//            loginRecordCache.put(loginName, retryCount);
//        }
//        if (retryCount.incrementAndGet() > Integer.valueOf(maxRetryCount).intValue())
//        {
//            AsyncManager.me().execute(AsyncFactory.recordLogininfor(loginName, Constants.LOGIN_FAIL, MessageUtils.message("user.password.retry.limit.exceed", maxRetryCount)));
//            throw new UserPasswordRetryLimitExceedException(Integer.valueOf(maxRetryCount).intValue());
//        }

        if (!matches(user, password))
        {
//            AsyncManager.me().execute(AsyncFactory.recordLogininfor(loginName, Constants.LOGIN_FAIL, MessageUtils.message("user.password.retry.limit.count", retryCount)));
//            loginRecordCache.put(loginName, retryCount);
//            throw new UserPasswordNotMatchException();
        }
        else
        {
            clearLoginRecordCache(loginName);
        }
	}

	public boolean matches(SysUser user, String newPassword)
    {
        return user.getPassword().equals(encryptPassword(user.getLoginName(), newPassword, user.getSalt()));
    }

    public void clearLoginRecordCache(String username)
    {
        loginRecordCache.remove(username);
    }

    public String encryptPassword(String username, String password, String salt)
    {
        return new Md5Hash(username + password + salt).toHex().toString();
    }
}
