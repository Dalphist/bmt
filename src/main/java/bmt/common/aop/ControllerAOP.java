package bmt.common.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import bmt.common.beans.ResultBean;
import bmt.common.exception.CheckException;
import bmt.common.exception.UnloginException;

@Aspect
@Component
public class ControllerAOP {
	private static final Logger logger = LoggerFactory.getLogger(ControllerAOP.class);
	
	@Pointcut(value = "execution(public bmt.common.beans.ResultBean *(..)))")
    public void handlerResultBeanMethod() {
    }
	
	@Around("handlerResultBeanMethod()")
	public Object handlerControllerMethod(ProceedingJoinPoint pjp) {
		long startTime = System.currentTimeMillis();
		ResultBean<?> result;
		try {
			result = (ResultBean<?>) pjp.proceed();
			logger.info(pjp.getSignature() + "use time:" + (System.currentTimeMillis() - startTime));
		} catch (Throwable e) {
			result = handlerException(pjp, e);
		}

		return result;
	}
 

	private ResultBean<?> handlerException(ProceedingJoinPoint pjp, Throwable e) {
		ResultBean<?> result = new ResultBean();

		// 已知异常
		if (e instanceof CheckException) {
			result.setMsg(e.getLocalizedMessage());
			result.setCode(ResultBean.FAIL);
		} else if (e instanceof UnloginException) {
			result.setMsg("Unlogin");
			result.setCode(ResultBean.NO_LOGIN);
		} else {
//			logger.error(pjp.getSignature() + " error ", e);
			// TODO 未知的异常，应该格外注意，可以发送邮件通知等
			result.setMsg(e.toString());
			result.setCode(ResultBean.FAIL);
		}

		return result;
	}
}
