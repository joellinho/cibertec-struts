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
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void init() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        Calendar c1 = Calendar.getInstance();
        Integer hora = c1.get(Calendar.HOUR_OF_DAY);
        if (hora > 10) {
            return "cerrado";
        }
        if (hora < 5) {
            return "cerrado";
        }
        return invocation.invoke();
    }

}
