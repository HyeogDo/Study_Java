/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.76
 * Generated at: 2022-03-22 03:47:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("	<script type=\"text/javascript\">\n");
      out.write("		function loginCheck() {\n");
      out.write("			var f = document.formLogin\n");
      out.write("			var regExpId = /^[a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/\n");
      out.write("			var regExpPhone = /^\\d{3}-\\d{3,4}-\\d{4}$/\n");
      out.write("			var regExpName = /^[가-힣]*$/\n");
      out.write("			\n");
      out.write("			var id = f.userId.value\n");
      out.write("			if (id == \"\"){\n");
      out.write("				alert(\"아이디를 입력해 주세요\")\n");
      out.write("				f.userId.select();\n");
      out.write("				return\n");
      out.write("			} else if (!regExpId.test(id)){\n");
      out.write("				alert(\"아이디는 문자로 시작해 주세요\")\n");
      out.write("				f.userId.select();\n");
      out.write("				return\n");
      out.write("			}\n");
      out.write("			\n");
      out.write("			var name = f.userName.value\n");
      out.write("			if (name == \"\"){\n");
      out.write("				alert(\"이름을 입력해 주세요\")\n");
      out.write("				f.userName.select();\n");
      out.write("				return\n");
      out.write("			}else if (!regExpName.test(name)){\n");
      out.write("				alert(\"이름은 한글만 입력해주세요\")\n");
      out.write("				f.userName.select();\n");
      out.write("				return\n");
      out.write("			}\n");
      out.write("			\n");
      out.write("			var phone = f.phone1.value + \"-\" + f.phone2.value + \"-\" + f.phone3.value\n");
      out.write("			if (!regExpPhone.test(phone)){\n");
      out.write("				alert(\"연락처 입력을 확인해 주세요\")\n");
      out.write("				f.phone2.select();\n");
      out.write("				return\n");
      out.write("			}\n");
      out.write("			\n");
      out.write("			var address = f.userAddress.value\n");
      out.write("			if (address == \"\"){\n");
      out.write("				alert(\"주소를 입력해 주세요\")\n");
      out.write("				f.userAddress.select();\n");
      out.write("				return\n");
      out.write("			}\n");
      out.write("			f.submit()\n");
      out.write("\n");
      out.write("		}\n");
      out.write("	</script>\n");
      out.write("	<body>\n");
      out.write("	<div style=\"position: absolute; left: 40%; top: 20%;\">\n");
      out.write("		<h3><b>아래의 항목을 입력 후 확인 버튼을 누르세요!</b></h3>\n");
      out.write("		<form action=\"todbLogin.jsp\" method=\"post\" name=\"formLogin\">\n");
      out.write("			<table>\n");
      out.write("				<tr>\n");
      out.write("					<td align=\"right\">사용자 ID</td>\n");
      out.write("					<td> : <input type=\"text\" name=\"userId\" size=\"10\"></td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td align=\"right\">성명</td>\n");
      out.write("					<td> : <input type=\"text\" name=\"userName\" size=\"10\"></td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td align=\"right\">전화번호</td>\n");
      out.write("					<td> : <select name=\"phone1\">\n");
      out.write("								<option value=\"010\">010</option>\n");
      out.write("								<option value=\"011\">011</option>\n");
      out.write("								<option value=\"016\">016</option>\n");
      out.write("								<option value=\"017\">017</option>\n");
      out.write("								<option value=\"018\">018</option>\n");
      out.write("								<option value=\"019\">019</option>\n");
      out.write("							</select>\n");
      out.write("							- <input type=\"text\" maxlength=\"4\" size=\"4\" name=\"phone2\">\n");
      out.write("							- <input type=\"text\" maxlength=\"4\" size=\"4\" name=\"phone3\">\n");
      out.write("					</td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td align=\"right\">주소</td>\n");
      out.write("					<td> : <input type=\"text\" name=\"userAddress\" size=\"60\"></td>\n");
      out.write("				</tr>\n");
      out.write("			</table>\n");
      out.write("			<br>\n");
      out.write("			<br>\n");
      out.write("			<br>\n");
      out.write("			&emsp;&emsp;&emsp;&emsp;&emsp;<input type=\"button\" value=\"확인\" onclick=\"loginCheck()\">\n");
      out.write("		</form>\n");
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