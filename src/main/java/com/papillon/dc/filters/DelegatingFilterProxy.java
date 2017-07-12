package com.papillon.dc.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by papillon on 7/12/2017.
 */
//@WebFilter(filterName = "springSecurityFilterChain",urlPatterns = "/*")
public class DelegatingFilterProxy /*implements Filter*/ {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println(((HttpServletRequest)req).getRequestURI().toString()+" from spring filter");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
