/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.76
 * Generated at: 2022-03-17 03:03:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Quiz_005f10_005fresult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


			public String bmiStatus(double bmi) {
				String res = "null";
				if (bmi < 18.5) {
					res = "저체중입니다. 조금 더 몸무게를 늘릴 필요가 있습니다." + "<img alt=" + "bmiTable" + " src=" + "./imgsrc/bmiTable.png" + " width=" + "500" + ">";
				} else if (bmi < 23) {
					res = "정상입니다. 이대로 유지하세요!";
				} else if (bmi < 25) {
					res = "과체중입니다. 조금 더 몸무게를 줄일 필요가 있습니다.";
				} else {
					res = "비만입니다.";					
				}
				return res;
			}
		
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/./Quiz_10_bmi25.jsp", Long.valueOf(1647483843000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("	<head>\n");
      out.write("		<meta charset=\"UTF-8\">\n");
      out.write("		<title>Insert title here</title>\n");
      out.write("	</head>\n");
      out.write("	<body>\n");
      out.write("		<div style=\"text-align: center; margin-top: 100px;\">\n");
      out.write("		");

			int weight;
			double height;
			weight = Integer.parseInt(request.getParameter("weight"));
			height = Double.parseDouble(request.getParameter("height")) * 0.01;
			double bmi =  weight / (height * height);
			
		
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write("\n");
      out.write("		<img alt=\"bmiTable\" src=\"./imgsrc/bmiTable.png\" width=\"500\">\n");
      out.write("		<h1>당신의 BMI는 ");
      out.print(String.format("%2.2f", bmi) );
      out.write("입니다.</h1><br>\n");
      out.write("		<h1>당신은 ");
      out.print(bmiStatus(bmi) );
      out.write("</h1>\n");
      out.write("		");
 if ( bmi >= 25) {
				
      out.write("\n");
      out.write("\n");
      out.write("<h2>최저가 비만 클리닉 알아보기</h2> \n");
      out.write("	<dl>\n");
      out.write("		<dd><a href=\"http://theskinny.co.kr/realmodel/subin/?gclid=EAIaIQobChMI3aPF-IbM9gIVy9aWCh3PVwWBEAAYASAAEgJyB_D_BwE\" target=\"_blank\">더 스키니 의원</a></dd>\n");
      out.write("		<dd><a href=\"https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjdo8X4hsz2AhXL1pYKHc9XBYEYABAGGgJ0bA&ae=2&ohost=www.google.com&cid=CAASEuRo1oK9\n");
      out.write("		pHtxwEu-Beh8bwkPMQ&sig=AOD64_1N9a1HulXUnySTpZM01IGKGbsTPg&q&adurl&ved=2ahUKEwjp6L_4hsz2AhXFAogKHZkeCdMQ0Qx6BAgIEAE&dct=1\" target=\"_blank\">달라진 다이어트</a></dd>\n");
      out.write("		<dd><a href=\"https://trueman75.co.kr/Body/BodyShape/Abdomen?__REFERER=\" target=\"_blank\">트루맨 남성의원</a></dd>\n");
      out.write("		<dd><a href=\"https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjdo8X4hsz2AhXL1pYKHc9XBYEYABAEGgJ0bA&ae=2&ohost=www.google.com&cid=CAASEuRo1oK9\n");
      out.write("		pHtxwEu-Beh8bwkPMQ&sig=AOD64_0sYPeOheUiba5nqQ0GOZ4K50pw8g&q&adurl&ved=2ahUKEwjp6L_4hsz2AhXFAogKHZkeCdMQ0Qx6BAgGEAE&dct=1\" target=\"_blank\">예그린 한의원</a></dd>\n");
      out.write("	</dl>	\n");
 
			}
		
      out.write("\n");
      out.write("		</div>\n");
      out.write("	</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}