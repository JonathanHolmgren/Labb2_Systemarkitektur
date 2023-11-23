package org.golfshop.interceptor;

import jakarta.interceptor.InterceptorBinding;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@InterceptorBinding
@Target({TYPE, METHOD})
public @interface LogCreateProduct {
}
