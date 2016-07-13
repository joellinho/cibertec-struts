/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.struts.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import java.util.Calendar;

/**
 *
 * @author admin-joel
 */
public class RangoHoraInterceptor implements Interceptor {
    @Override
    public String intercept(ActionInvocation ai) throws Exception {
        
        Calendar c1 = Calendar.getInstance();
        Integer hora=c1.get(Calendar.HOUR_OF_DAY);
        
        if(hora > 9){ return "cerrado";}
        if(hora < 6){ return "cerrado";}
        
        return ai.invoke();
    }
    
    @Override
    public void destroy() {
         }

    @Override
    public void init() {
    }

    

}
