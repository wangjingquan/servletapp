package com.test;

import static com.oracle.jrockit.jfr.Transition.To;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.catalina.startup.Tomcat;

/**
 * @author jingquanwang
 * @date 2018/5/4
 */
public class mySeverlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    HttpSession httpSession = req.getSession();
    Cookie[] cookies =  req.getCookies();
    resp.addCookie(new Cookie("username", "wangjingquan"));
    resp.setStatus(200);
    resp.setContentType("text");
    PrintWriter result = resp.getWriter();
    result.print("success");
  }

  @Override
  public void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    super.doPost(req, resp);
  }
  private void getTomcatInstance() throws Exception{
    Tomcat tomcat = new Tomcat();
    tomcat.addWebapp("/example","/ROOT");
    tomcat.start();
    String[] arr=new String[10];
    String[] arrlist= new String[10];
    for (int i = 0 ;i<arr.length;i++){
      String Value=  arr[i];
      if (Value.startsWith("8")){
        int j = 0;
        arrlist[j]=Value;
        j++;
      }
    }
  }
}
