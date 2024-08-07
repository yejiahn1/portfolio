/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-07-04 06:33:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class next2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("java.sql");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("	<head>\n");
      out.write("		<meta charset=\"utf-8\">\n");
      out.write("		<title>회원 정보 수정</title>\n");
      out.write("	</head>\n");
      out.write("	<style>\n");
      out.write("		#wrap{\n");
      out.write("			margin:0 auto;\n");
      out.write("			width:600px;\n");
      out.write("			border:10px solid gray;\n");
      out.write("			padding:65px;\n");
      out.write("			}\n");
      out.write("		th,tr,td{\n");
      out.write("			border:1px solid gray;\n");
      out.write("			}\n");
      out.write("		table,td{\n");
      out.write("			border-collapse : collapse;\n");
      out.write("			}\n");
      out.write("		th:nth-child(1){\n");
      out.write("			background-color:green;\n");
      out.write("		}	\n");
      out.write("		span{\n");
      out.write("		display:inline-block;\n");
      out.write("		width:250px;\n");
      out.write("		}\n");
      out.write("	</style>\n");
      out.write("	<body>\n");
      out.write("	");

		//정보수정을 하기 위해서는 select를 하고 update를 해줘야 사용자가 진행이 가능하다.
		Connection conn=null; //회선 연결
		Statement stmt=null;	//서버에서 mysql로 데이터를 보내는 객체
		ResultSet rs=null;		//데이터를 반환하는 객체
		
		String url="jdbc:mysql://127.0.0.1:3306/sample";
		String db_id="root";
		String db_pw="iotiot";
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url,db_id,db_pw);
			String sql="select * from register;";
			stmt=conn.createStatement();
			System.out.println(sql);//
			
			rs=stmt.executeQuery(sql);
			
      out.write("\n");
      out.write("				<div id=\"wrap\">\n");
      out.write("					<table>\n");
      out.write("						<tr>\n");
      out.write("							<th>회원번호</th>\n");
      out.write("							<th>아이디</th>\n");
      out.write("							<th>비밀번호</th>\n");
      out.write("							<th>이름</th>\n");
      out.write("							<th>이메일</th>\n");
      out.write("							<th>전화번호</th>\n");
      out.write("							<th>주소</th>\n");
      out.write("						</tr>\n");
      out.write("			");

			while(rs.next()){
				String num=rs.getString("num");
				String id=rs.getString("id");
				String pass=rs.getString("pass");
				String name=rs.getString("name");
				String email=rs.getString("email");
				String phone=rs.getString("phone");
				String address=rs.getString("address");
				
      out.write("\n");
      out.write("						<tr>\n");
      out.write("							<td>");
      out.print(num );
      out.write("</td>\n");
      out.write("							<td>");
      out.print(id );
      out.write("</td>\n");
      out.write("							<td>");
      out.print(pass );
      out.write("</td>\n");
      out.write("							<td>");
      out.print(name );
      out.write("</td>\n");
      out.write("							<td>");
      out.print(email );
      out.write("</td>\n");
      out.write("							<td>");
      out.print(phone );
      out.write("</td>\n");
      out.write("							<td>");
      out.print(address );
      out.write("</td>\n");
      out.write("						</tr>\n");
      out.write("			");

			}
			
			
      out.write("			\n");
      out.write("							\n");
      out.write("					</table>\n");
      out.write("				\n");
      out.write("			");

			
		}catch(Exception e){
			System.out.println("접속 중 오류 발생 : "+e);
		}finally{
			try{
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			}catch(Exception ex){
				System.out.println("접속 해제 중 오류 발생 :"+ex);
			}
		}
	
      out.write("\n");
      out.write("	<form method=\"post\" action=\"update.jsp\">\n");
      out.write("		변경하실 회원의 번호를 입력해 주세요 : <input type=\"text\" name=\"number\"><br>\n");
      out.write("		<fieldset>\n");
      out.write("			<legend>수정사항 입력</legend>\n");
      out.write("			<span>회원 아이디 변경</span><input type=\"text\" name=\"id\"><br>\n");
      out.write("			<span>회원 비밀번호 변경</span><input type=\"text\" name=\"pw\"><br>\n");
      out.write("			<span>회원 이름 변경</span><input type=\"text\" name=\"nm\"><br>\n");
      out.write("			<span>회원 이메일 변경</span><input type=\"text\" name=\"em\"><br>\n");
      out.write("			<span>회원 연락처 변경</span><input type=\"text\" name=\"ph\"><br>\n");
      out.write("			<span>회원 주소 변경</span><input type=\"text\" name=\"ad\"><br>\n");
      out.write("		</fieldset> \n");
      out.write("		<input type=\"submit\" value=\"수정\">\n");
      out.write("	</form>\n");
      out.write("	</div>\n");
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
