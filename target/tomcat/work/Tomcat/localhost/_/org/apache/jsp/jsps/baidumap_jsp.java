/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2018-05-04 10:40:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsps;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class baidumap_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("    <title>适应屏幕</title>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"http://api.map.baidu.com/api?v=1.5&ak=YWdGplhYjUGQ3GtpKNeuTM2S\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("    html {\r\n");
      out.write("        height: 100%\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    body {\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0px\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #container {\r\n");
      out.write("        height: 80%;\r\n");
      out.write("        width: 80%;\r\n");
      out.write("        left: 250px;\r\n");
      out.write("        margin: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .info_ul {\r\n");
      out.write("        margin: 0 0 5px 0;\r\n");
      out.write("        padding: 0.2em 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .info_li {\r\n");
      out.write("        line-height: 26px;\r\n");
      out.write("        font-size: 15px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .info_span {\r\n");
      out.write("        width: 50px;\r\n");
      out.write("        display: inline-block;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<div>\r\n");
      out.write("    起始位置:<input type=\"text\" id=\"start\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;终点位置:<input type=\"text\" id=\"end\">\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"container\"></div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var mappoints = new Array();\r\n");
      out.write("    mappoints.push(\"aaa\");\r\n");
      out.write("    mappoints.push(\"bbb\");\r\n");
      out.write("    mappoints.push(\"ccc\");\r\n");
      out.write("    mappoints.push(\"ddd\");\r\n");
      out.write("    mappoints.push(\"eee\");\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    //数据准备,模拟数据\r\n");
      out.write("    var points = [\r\n");
      out.write("        {\"lng\": 113.517652, \"lat\": 34.818929, \"status\": 1, \"id\": 50},\r\n");
      out.write("        {\"lng\": 113.517821, \"lat\": 34.816873, \"status\": 1, \"id\": 2},\r\n");
      out.write("        {\"lng\": 113.516357, \"lat\": 34.813965, \"status\": 0, \"id\": 3},\r\n");
      out.write("        {\"lng\": 113.508883, \"lat\": 34.818173, \"status\": 0, \"id\": 4},\r\n");
      out.write("        {\"lng\": 113.527047, \"lat\": 34.820795, \"status\": 1, \"id\": 5}\r\n");
      out.write("    ];\r\n");
      out.write("\r\n");
      out.write("    var map = new BMap.Map(\"container\");//初始化地图\r\n");
      out.write("    setZoom(points);//设置中心点和缩放级别。\r\n");
      out.write("    addMarker(points);//把原始数据的轨迹点添加到地图上。\r\n");
      out.write("    map.enableScrollWheelZoom();//滚轮放大缩小\r\n");
      out.write("    //下面是用到的函数\r\n");
      out.write("    //根据原始数据计算中心坐标和缩放级别，并为地图设置中心坐标和缩放级别。\r\n");
      out.write("    function setZoom(points) {\r\n");
      out.write("        if (points.length > 0) {\r\n");
      out.write("            var maxLng = points[0].lng;\r\n");
      out.write("            var minLng = points[0].lng;\r\n");
      out.write("            var maxLat = points[0].lat;\r\n");
      out.write("            var minLat = points[0].lat;\r\n");
      out.write("            var res;\r\n");
      out.write("            for (var i = points.length - 1; i >= 0; i--) {\r\n");
      out.write("                res = points[i];\r\n");
      out.write("                if (res.lng > maxLng) maxLng = res.lng;\r\n");
      out.write("                if (res.lng < minLng) minLng = res.lng;\r\n");
      out.write("                if (res.lat > maxLat) maxLat = res.lat;\r\n");
      out.write("                if (res.lat < minLat) minLat = res.lat;\r\n");
      out.write("            }\r\n");
      out.write("            ;\r\n");
      out.write("            var cenLng = (parseFloat(maxLng) + parseFloat(minLng)) / 2;\r\n");
      out.write("            var cenLat = (parseFloat(maxLat) + parseFloat(minLat)) / 2;\r\n");
      out.write("            var zoom = getZoom(maxLng, minLng, maxLat, minLat);\r\n");
      out.write("            /*\r\n");
      out.write("             其中map.centerAndZoom(new BMap.Point(cenLng,cenLat), 14)\r\n");
      out.write("             cenLng和cenLat是经纬度，在new BMap.Point()是中心位置，14是比例尺,看到地图的缩放\r\n");
      out.write("             113.646604, 34.755857是郑州的某处坐标\r\n");
      out.write("             */\r\n");
      out.write("            //map.centerAndZoom(new BMap.Point(113.646604, 34.755857), 14);\r\n");
      out.write("            map.centerAndZoom(new BMap.Point(cenLng, cenLat), zoom);\r\n");
      out.write("        } else {\r\n");
      out.write("            //没有坐标，显示全中国。\r\n");
      out.write("            //map.centerAndZoom(new BMap.Point(103.388611,35.563611), 5);\r\n");
      out.write("            //没有坐标，显示整个郑州。\r\n");
      out.write("            map.centerAndZoom(new BMap.Point(113.646604, 34.755857));\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    //根据经纬极值计算绽放级别。本例核心代码。\r\n");
      out.write("    function getZoom(maxLng, minLng, maxLat, minLat) {\r\n");
      out.write("        var zoom = [\"50\", \"100\", \"200\", \"500\", \"1000\", \"2000\", \"5000\", \"10000\", \"20000\", \"25000\", \"50000\", \"100000\", \"200000\", \"500000\", \"1000000\", \"2000000\"]//级别18到3。\r\n");
      out.write("        var pointA = new BMap.Point(maxLng, maxLat);  // 创建点坐标A\r\n");
      out.write("        var pointB = new BMap.Point(minLng, minLat);  // 创建点坐标B\r\n");
      out.write("        var distance = map.getDistance(pointA, pointB).toFixed(1);  //获取两点距离,保留小数点后1位\r\n");
      out.write("        for (var i = 0, zoomLen = zoom.length; i < zoomLen; i++) {\r\n");
      out.write("            if (zoom[i] - distance > 0) {\r\n");
      out.write("                return 18 - i + 3;//之所以会多3，是因为地图范围常常是比例尺距离的10倍以上。所以级别会增加3。\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        ;\r\n");
      out.write("    }\r\n");
      out.write("    //在轨迹点上创建图标，并添加点击事件\r\n");
      out.write("    function addMarker(points) {\r\n");
      out.write("        var point, marker;\r\n");
      out.write("        // 创建标注对象并添加到地图\r\n");
      out.write("        for (var i = 0, pointsLen = points.length; i < pointsLen; i++) {\r\n");
      out.write("            point = new BMap.Point(points[i].lng, points[i].lat);\r\n");
      out.write("            marker = new BMap.Marker(point);\r\n");
      out.write("            map.addOverlay(marker);\r\n");
      out.write("            //给标注点添加点击事件。使用立即执行函数和闭包\r\n");
      out.write("            (function () {\r\n");
      out.write("                var thePoint = points[i];\r\n");
      out.write("                marker.addEventListener(\"click\", function () {\r\n");
      out.write("                    showInfo(this, thePoint);\r\n");
      out.write("                });\r\n");
      out.write("            })();\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    //显示信息窗口，显示标注点的信息。\r\n");
      out.write("    function showInfo(thisMaker, point) {\r\n");
      out.write("        var sContent = '<div style=\"widht:600px;height: auto\">'\r\n");
      out.write("            + '<div style=\"float:left;width:180px;\">'\r\n");
      out.write("            + '<img src=\"../upload/pot.jpg\" style=\"width:150px;height:150px;\" ></img>'\r\n");
      out.write("            + '</div>'\r\n");
      out.write("            + '<div style=\" width:300px;\">'\r\n");
      out.write("            + '<ul class=\"info_ul\">'\r\n");
      out.write("            + '<li class=\"info_li\">'\r\n");
      out.write("            + '<span class=\"info_span\">id：</span>' + point.id + '</li>'\r\n");
      out.write("            + '<li class=\"info_li\">'\r\n");
      out.write("            + '<span class=\"info_span\">级别：</span>' + point.status + '</li>'\r\n");
      out.write("            + '<li class=\"info_li\"><span class=\"info_span\">查看：</span><a href=\"' + point.url + '\" target=\"_blank\">详情</a></li>'\r\n");
      out.write("            + '</ul>'\r\n");
      out.write("            + '</div>'\r\n");
      out.write("            + '</div>';\r\n");
      out.write("\r\n");
      out.write("        var infoWindow = new BMap.InfoWindow(sContent);// 创建信息窗口对象\r\n");
      out.write("        thisMaker.openInfoWindow(infoWindow);//图片加载完毕重绘infowindow\r\n");
      out.write("    }\r\n");
      out.write("    //显示信息窗口，显示标注点的信息。\r\n");
      out.write("    /*function showInfo(thisMaker, point) {\r\n");
      out.write("     var sContent =\r\n");
      out.write("     '<ul class=\"info_ul\">'\r\n");
      out.write("     + '<li style=\"line-height: 26px;font-size: 15px;\">'\r\n");
      out.write("     + '<img src=\"../upload/pot.jpg\" \"></img>'\r\n");
      out.write("     + '</li>'\r\n");
      out.write("     + '<li class=\"info_li\">'\r\n");
      out.write("     + '<span class=\"info_span\">id：</span>' + point.id + '</li>'\r\n");
      out.write("     + '<li class=\"info_li\">'\r\n");
      out.write("     + '<span class=\"info_span\">级别：</span>' + point.status + '</li>'\r\n");
      out.write("     + '<li class=\"info_li\"><span class=\"info_span\">查看：</span><a href=\"' + point.url + '\" target=\"_blank\">详情</a></li>'\r\n");
      out.write("     + '</ul>';\r\n");
      out.write("     var infoWindow = new BMap.InfoWindow(sContent);// 创建信息窗口对象\r\n");
      out.write("     thisMaker.openInfoWindow(infoWindow);//图片加载完毕重绘infowindow\r\n");
      out.write("     }*/\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
}
