package com.menghuanwd.interceptor;

/**
 * @program: springboot_learnning
 * @description: 中间件
 * @author: guyifeng
 * @create: 2021-01-16 15:35
 **/
//public class MyInterceptor implements HandlerInterceptor {
public class MyInterceptor {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        // 获取URL
//        String requestURI = request.getRequestURI();
//        // /account/toList account/toList
//        String substring = requestURI.substring(1);
//        // /account/toList account
//        int index=substring.indexOf("/");
//        if(index!=-1){
//            // account
//            substring=substring.substring(0,index);
//        }
//
//        HashSet<String> urls= (HashSet<String>)request.getSession().getAttribute("module");
//        // account是否在 该用户所有的资源中
//        boolean result=urls.stream().anyMatch(substring::equals);
//        if(!result){
//            response.sendRedirect("/");
//        }
//        return result;
//    }
}
