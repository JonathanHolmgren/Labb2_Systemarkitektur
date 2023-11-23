package org.golfshop.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Interceptor
@LogCreateProduct
public class LogCreateProductInterceptor {

    Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class);

    @AroundInvoke
    public Object logCreateProduct(InvocationContext ctx) throws Exception{
        logger.info("Product has benn created: " + ctx.getTarget().toString() + " in class "
                + ctx.getMethod().getDeclaringClass());
        return ctx.proceed();
    }
}