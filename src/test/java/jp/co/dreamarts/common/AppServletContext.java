package jp.co.dreamarts.common;

import javax.servlet.*;
import javax.servlet.descriptor.JspConfigDescriptor;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: nightknight
 * Date: 13-5-7
 * Time: 下午5:47
 * To change this template use File | Settings | File Templates.
 */
public class AppServletContext implements ServletContext {
    @Override
    public ServletContext getContext(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getContextPath() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getMajorVersion() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getMinorVersion() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getEffectiveMajorVersion() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getEffectiveMinorVersion() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getMimeType(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<String> getResourcePaths(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public URL getResource(String s) throws MalformedURLException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public InputStream getResourceAsStream(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public RequestDispatcher getRequestDispatcher(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public RequestDispatcher getNamedDispatcher(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * @deprecated
     */
    @Override
    public Servlet getServlet(String s) throws ServletException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * @deprecated
     */
    @Override
    public Enumeration<Servlet> getServlets() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * @deprecated
     */
    @Override
    public Enumeration<String> getServletNames() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void log(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * @deprecated
     */
    @Override
    public void log(Exception e, String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void log(String s, Throwable throwable) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getRealPath(String s) {
        return "/Users/Antony/Strap/merge/DanceWeb/src/main/webapp";
    }

    @Override
    public String getServerInfo() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getInitParameter(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Enumeration<String> getInitParameterNames() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean setInitParameter(String s, String s1) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object getAttribute(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Enumeration<String> getAttributeNames() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setAttribute(String s, Object o) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeAttribute(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getServletContextName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServletRegistration.Dynamic addServlet(String s, String s1) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServletRegistration.Dynamic addServlet(String s, Servlet servlet) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServletRegistration.Dynamic addServlet(String s, Class<? extends Servlet> aClass) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T extends Servlet> T createServlet(Class<T> tClass) throws ServletException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServletRegistration getServletRegistration(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Map<String, ? extends ServletRegistration> getServletRegistrations() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public FilterRegistration.Dynamic addFilter(String s, String s1) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public FilterRegistration.Dynamic addFilter(String s, Filter filter) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public FilterRegistration.Dynamic addFilter(String s, Class<? extends Filter> aClass) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T extends Filter> T createFilter(Class<T> tClass) throws ServletException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public FilterRegistration getFilterRegistration(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Map<String, ? extends FilterRegistration> getFilterRegistrations() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SessionCookieConfig getSessionCookieConfig() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setSessionTrackingModes(Set<SessionTrackingMode> sessionTrackingModes) throws IllegalStateException, IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<SessionTrackingMode> getDefaultSessionTrackingModes() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<SessionTrackingMode> getEffectiveSessionTrackingModes() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addListener(Class<? extends EventListener> aClass) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addListener(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T extends EventListener> void addListener(T t) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T extends EventListener> T createListener(Class<T> tClass) throws ServletException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void declareRoles(String... strings) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ClassLoader getClassLoader() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public JspConfigDescriptor getJspConfigDescriptor() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}