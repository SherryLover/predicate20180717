/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2018-05-19 13:08:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsps;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("    <title>一款基于JQuery做的动画背景后台管理登录模板 - </title>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"../static_login/css/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"login\">\r\n");
      out.write("    <div class=\"box png\">\r\n");
      out.write("        <div class=\"logo png\"></div>\r\n");
      out.write("        <div class=\"input\">\r\n");
      out.write("            <div class=\"log\">\r\n");
      out.write("                <div class=\"name\">\r\n");
      out.write("                    <label>用户名</label><input type=\"text\" class=\"text\" id=\"userName\" placeholder=\"用户名\" name=\"value_1\"\r\n");
      out.write("                                             tabindex=\"1\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"pwd\">\r\n");
      out.write("                    <label>密 码</label><input type=\"password\" class=\"text\" id=\"pwd\" placeholder=\"密码\" name=\"value_2\"\r\n");
      out.write("                                             tabindex=\"2\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"pwd\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"pwd\">\r\n");
      out.write("                    <input type=\"checkbox\"><label>记住密码</label>\r\n");
      out.write("                    <input type=\"button\" class=\"submit\" tabindex=\"3\" value=\"登录\" onclick=\"userlogin()\">\r\n");
      out.write("                    <div class=\"check\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"tip\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"air-balloon ab-1 png\"></div>\r\n");
      out.write("    <div class=\"air-balloon ab-2 png\"></div>\r\n");
      out.write("    <div class=\"footer\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../static_login/js/jQuery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../static_login/js/fun.base.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../static_login/js/script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("<script src=\"../static_login/js/DD_belatedPNG.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script>DD_belatedPNG.fix('.png')</script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script>\r\n");
      out.write("    /*一加载页面就执行这个方法*/\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        //去用户名和密码\r\n");
      out.write("        var str = getCookie(\"loginInfo\");\r\n");
      out.write("        str = str.substring(1, str.length - 1);\r\n");
      out.write("        var username = str.split(\",\")[0];\r\n");
      out.write("        var password = str.split(\",\")[1];\r\n");
      out.write("        //自动填充用户名和密码\r\n");
      out.write("        $(\"#userName\").val(username);\r\n");
      out.write("        $(\"#pwd\").val(password);\r\n");
      out.write("    })\r\n");
      out.write("    //获取cookie\r\n");
      out.write("    function getCookie(cname) {\r\n");
      out.write("        var name = cname + \"=\";\r\n");
      out.write("        var ca = document.cookie.split(';');\r\n");
      out.write("        for (var i = 0; i < ca.length; i++) {\r\n");
      out.write("            var c = ca[i];\r\n");
      out.write("            while (c.charAt(0) == ' ') c = c.substring(1);\r\n");
      out.write("            if (c.indexOf(name) != -1) return c.substring(name.length, c.length);\r\n");
      out.write("        }\r\n");
      out.write("        return \"\";\r\n");
      out.write("    }\r\n");
      out.write("    //记住密码功能\r\n");
      out.write("    function remember() {\r\n");
      out.write("        var remFlag = $(\"input[type='checkbox']\").is(':checked');\r\n");
      out.write("        if (remFlag === true) { //如果选中设置remFlag为1\r\n");
      out.write("            //cookie存用户名和密码,回显的是真实的用户名和密码,存在安全问题.\r\n");
      out.write("            var conFlag = confirm(\"记录密码功能不宜在公共场所(如网吧等)使用,以防密码泄露.您确定要使用此功能吗?\");\r\n");
      out.write("            if (conFlag) { //确认标志\r\n");
      out.write("                return \"selected\";\r\n");
      out.write("            } else {\r\n");
      out.write("                $(\"input[type='checkbox']\").removeAttr('checked');\r\n");
      out.write("                return \"unselected\";\r\n");
      out.write("            }\r\n");
      out.write("        } else { //如果没选中设置remFlag为\"\"\r\n");
      out.write("            return \"unselected\";\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function userlogin() {\r\n");
      out.write("        var userName = $(\"#userName\").val();\r\n");
      out.write("        var pwd = $(\"#pwd\").val();\r\n");
      out.write("        var rememberPass = remember();\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"/user/login.action\",\r\n");
      out.write("            // 请求方式\r\n");
      out.write("            type: \"post\",\r\n");
      out.write("            // 服务器响应的数据类型\r\n");
      out.write("            dataType: \"json\",\r\n");
      out.write("            data: {\r\n");
      out.write("                userName: userName,\r\n");
      out.write("                pwd: pwd,\r\n");
      out.write("                rememberPass: rememberPass\r\n");
      out.write("            },\r\n");
      out.write("            // 请求成功时执行的回调函数\r\n");
      out.write("            success: function (result) {\r\n");
      out.write("                if (result.mesg == \"success\") {\r\n");
      out.write("                    window.location.href = \"imageload.jsp\";\r\n");
      out.write("                } else {\r\n");
      out.write("                    alert(\"用户名或密码错误！\");\r\n");
      out.write("                    /*这时把用户名和密码还有复选框置为空*/\r\n");
      out.write("                    $(\"#userName\").val(\"\");\r\n");
      out.write("                    $(\"#pwd\").val(\"\");\r\n");
      out.write("                    $(\"input[type='checkbox']\").removeAttr('checked');\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<div style=\"text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';\">\r\n");
      out.write("    <p>适用浏览器：360、FireFox、Chrome、Safari、Opera、傲游、搜狗、世界之窗. 不支持IE8及以下浏览器。</p>\r\n");
      out.write("    <p>More Templates <a href=\"http://www.cssmoban.com/\" target=\"_blank\" title=\"模板之家\">模板之家</a> - Collect from <a\r\n");
      out.write("            href=\"http://www.cssmoban.com/\" title=\"网页模板\" target=\"_blank\">网页模板</a></p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /jsps/login.jsp(34,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo!=null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginInfo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
