package com.mkyong.common.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import java.util.Calendar;
 
public class PrintMsgInterceptor implements Interceptor{

	public void destroy() {
		System.out.println("CustomInterceptor destroy() is called...");
	}

	public void init() {
		System.out.println("CustomInterceptor init() is called...");
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		Calendar c1 = Calendar.getInstance();
        Integer hora=c1.get(Calendar.HOUR_OF_DAY);
		System.out.println("CustomInterceptor, before invocation.invoke()..."+hora);
		
		String result = invocation.invoke();
		
		System.out.println("CustomInterceptor, after invocation.invoke()..."+hora);
		
		return result;
	}
		
}