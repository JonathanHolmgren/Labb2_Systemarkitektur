package org.golfshop.interceptor;


import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Interceptor
@Log
public class LoggingInterceptor {

    Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class);

    @AroundInvoke
    public Object logMethodEntry(InvocationContext ctx) throws Exception{
        logger.info("Entering method: " + ctx.getMethod().getName() + " in class "
                + ctx.getMethod().getDeclaringClass());
        return ctx.proceed();
    }
}
