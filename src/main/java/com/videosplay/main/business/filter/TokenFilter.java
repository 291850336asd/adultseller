package com.videosplay.main.business.filter;



import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by sunmeng on 17/9/14.
 */
@Component
@WebFilter(urlPatterns = "/*")
public class TokenFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    @CrossOrigin
    public void doFilter(ServletRequest request, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;

        String token = req.getHeader("token");
        if(token == null || !token.contains("abc123")){

            PrintWriter writer = null;
            OutputStreamWriter osw = null;
            try {
                HttpServletResponse response = (HttpServletResponse) res;
                response.addHeader("Access-Control-Allow-Origin", "*");
                response.addHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS");
                response.addHeader("Access-Control-Allow-Credentials", "true");
                response.addHeader("Access-Control-Allow-Headers",
                        "Origin, Content-Type, Accept, token, Authorization, x-requested-with, cache-control, Access-Control-Allow-Origin, Access-Control-Allow-Credentials, uuid");
                response.setContentType("application/json; charset=utf-8");
                osw = new OutputStreamWriter(response.getOutputStream() , "UTF-8");
                writer = new PrintWriter(osw, true);
                String jsonStr = "{\"error\": \"token is not null\"}";
                writer.write(jsonStr);
                writer.flush();
                writer.close();
                osw.close();
            } catch (UnsupportedEncodingException e) {
            } catch (IOException e) {
            } finally {
                if (null != writer) {
                    writer.close();
                }
                if(null != osw){
                    osw.close();
                }
            }
        }else {
            chain.doFilter(request, res);
        }
    }

    @Override
    public void destroy() {

    }
}
