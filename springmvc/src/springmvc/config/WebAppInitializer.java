package springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 使用 AbstractAnnotationConfigDispatcherServletInitializer 來配置
 * DispatcherServlet，是傳統 web.xml 配置方式的替代方案。
 * Servlet 3.0 以上的版本支援此方法。
 */
public class WebAppInitializer
    extends AbstractAnnotationConfigDispatcherServletInitializer {
    
    /* 
     * Mapping 設定 "/"，代表處理進入應用的所有請求
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
    
    /* 
     * Set WebConfig Class
     * It declares the controllers and servlets configuration.
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    }
    
    /* 
     * Set RootConfig Class
     * It declares business model, service and dao beans configuration.
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class };
    }
}
