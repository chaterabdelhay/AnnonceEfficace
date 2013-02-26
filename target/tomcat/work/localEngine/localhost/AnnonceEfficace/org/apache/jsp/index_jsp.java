package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- Include the header -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN : page body content -->\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN CONTAINER -->\r\n");
      out.write("<div class=\"container_12\">\r\n");
      out.write("\t\r\n");
      out.write("    <!-- begin image slider -->\r\n");
      out.write("    <div id=\"sliderWrapper\">\r\n");
      out.write("    \r\n");
      out.write("    \t<!-- begin .grid_4 - SLIDER TEXT -->\r\n");
      out.write("        <div id=\"sliderText\" class=\"grid_4\">\r\n");
      out.write("            <h1>Lorem ipsum dolor sit amet, eu consectetur. Ut dapibus fringilla volutpat.</h1>\r\n");
      out.write("            <p id=\"sliderPar\">Ut dapibus fringilla volutpat. Sed ullamcorper augue nec risus facilisis eu venenatis metus tristique. In hac habitasse platea dictumst. Aenean at lacus urna. Donec pretium mattis gravida. Integer eu nisl erat, eu tempus nisi. Maecenas pharetra egestas adipiscing. Nullam consequat velit in felis sodales in facilisis justo fringilla.</p>\r\n");
      out.write("            <a href=\"#\"><img src=\"template/images/download.png\" alt=\"\" /></a>&nbsp;<a href=\"http://www.youtube.com/embed/jk2cJTbwm04?rel=0&amp;hd=1\" class=\"watch\">or watch the video&nbsp;&nbsp;<img src=\"template/images/video.png\" alt=\"\" /></a>\r\n");
      out.write("        </div><!-- end .grid_4 -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- begin .grid_8 - IMAGE SLIDER -->\r\n");
      out.write("        <div class=\"grid_8\">\r\n");
      out.write("            <!-- NIVO SLIDER -->\r\n");
      out.write("            <div class=\"slider-wrapper theme-default\">\r\n");
      out.write("                <div class=\"ribbon\"></div>\r\n");
      out.write("                <div id=\"slider\" class=\"nivoSlider\">\r\n");
      out.write("                    <img src=\"template/images/slider/1.jpg\" alt=\"\" title=\"1# This is an example of a caption\" />\r\n");
      out.write("                    <img src=\"template/images/slider/2.jpg\" alt=\"\" title=\"2# This is an example of a caption\" />\r\n");
      out.write("                    <img src=\"template/images/slider/3.jpg\" alt=\"\" title=\"3# This is an example of a caption\" />\r\n");
      out.write("                    <img src=\"template/images/slider/4.jpg\" alt=\"\" title=\"4# This is an example of a caption\" />\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div><!-- end .grid_8 -->\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("        \r\n");
      out.write("    </div><!-- end image slider -->\r\n");
      out.write("    \r\n");
      out.write("    <!-- begin .grid_12 - CAROUSEL -->\r\n");
      out.write("    <!-- <div id=\"carouselWrapper\" class=\"grid_12\">\r\n");
      out.write("        <ul id=\"carousel\">\r\n");
      out.write("            <li><a href=\"#\"><img src=\"template/images/carousel/1.jpg\" alt=\"\" /></a><br />Slide one</li>\r\n");
      out.write("            <li><a href=\"#\"><img src=\"template/images/carousel/2.jpg\" alt=\"\" /></a><br />Slide two</li>\r\n");
      out.write("            <li><a href=\"#\"><img src=\"template/images/carousel/3.jpg\" alt=\"\" /></a><br />Slide three</li>\r\n");
      out.write("            <li><a href=\"#\"><img src=\"template/images/carousel/4.jpg\" alt=\"\" /></a><br />Slide four</li>\r\n");
      out.write("            <li><a href=\"#\"><img src=\"template/images/carousel/5.jpg\" alt=\"\" /></a><br />Slide five</li>\r\n");
      out.write("            <li><a href=\"#\"><img src=\"template/images/carousel/6.jpg\" alt=\"\" /></a><br />Slide six</li>\r\n");
      out.write("            <li><a href=\"#\"><img src=\"template/images/carousel/7.jpg\" alt=\"\" /></a><br />Slide seven</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div> \t\r\n");
      out.write("\t--> \r\n");
      out.write("\t<!-- end .grid_12 --> \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("    <br/>\r\n");
      out.write("\t\r\n");
      out.write("    <!-- begin boxes -->\r\n");
      out.write("    <div id=\"boxes\">\r\n");
      out.write("    \t<!-- begin .grid_3 - BOX1 -->\r\n");
      out.write("        <div class=\"grid_3\">\r\n");
      out.write("            <a href=\"template/images/slider/1.jpg\" title=\"Maecenas pharetra egestas adipiscing.\" class=\"colorbox\"><img class=\"boxImage tiptop\" src=\"template/images/boxes/1.jpg\" alt=\"\" title=\"&plusmn;&nbsp;zoom\" /></a>\r\n");
      out.write("                    \r\n");
      out.write("            <h3>Morbi fermentum sollicitudin diam vel vehicula</h3>\r\n");
      out.write("            <p>Maecenas pharetra egestas adipiscing. Nullam consequat velit in felis sodales in facilisis justo fringilla. Pellentesque nec lobortis dolor. Praesent et mi eu magna dapibus condimentum.&nbsp;<a href=\"#\">Read more&nbsp;&rarr;</a></p>\r\n");
      out.write("        </div><!-- end .grid_3 -->\r\n");
      out.write("        \r\n");
      out.write("        <!-- begin .grid_3 - BOX2 -->\r\n");
      out.write("        <div class=\"grid_3\">\r\n");
      out.write("            <a href=\"template/images/slider/2.jpg\" title=\"Maecenas pharetra egestas adipiscing.\" class=\"colorbox\"><img class=\"boxImage tiptop\" src=\"template/images/boxes/2.jpg\" alt=\"\" title=\"&plusmn;&nbsp;zoom\" /></a>\r\n");
      out.write("                    \r\n");
      out.write("            <h3>Morbi fermentum sollicitudin diam vel vehicula</h3>\r\n");
      out.write("            <p>Maecenas pharetra egestas adipiscing. Nullam consequat velit in felis sodales in facilisis justo fringilla. Pellentesque nec lobortis dolor. Praesent et mi eu magna dapibus condimentum.&nbsp;<a href=\"#\">Read more&nbsp;&rarr;</a></p>\r\n");
      out.write("        </div><!-- end .grid_3 -->\r\n");
      out.write("        \r\n");
      out.write("        <!-- begin .grid_3 - BOX3 -->\r\n");
      out.write("        <div class=\"grid_3\">\r\n");
      out.write("            <a href=\"template/images/slider/3.jpg\" title=\"Maecenas pharetra egestas adipiscing.\" class=\"colorbox\"><img class=\"boxImage tiptop\" src=\"template/images/boxes/3.jpg\" alt=\"\" title=\"&plusmn;&nbsp;zoom\" /></a>\r\n");
      out.write("                    \r\n");
      out.write("            <h3>Morbi fermentum sollicitudin diam vel vehicula</h3>\r\n");
      out.write("            <p>Maecenas pharetra egestas adipiscing. Nullam consequat velit in felis sodales in facilisis justo fringilla. Pellentesque nec lobortis dolor. Praesent et mi eu magna dapibus condimentum.&nbsp;<a href=\"#\">Read more&nbsp;&rarr;</a></p>\r\n");
      out.write("        </div><!-- end .grid_3 -->\r\n");
      out.write("        \r\n");
      out.write("        <!-- begin .grid_3 - BOX4 -->\r\n");
      out.write("        <div class=\"grid_3\">\r\n");
      out.write("            <a href=\"template/images/slider/4.jpg\" title=\"Maecenas pharetra egestas adipiscing.\" class=\"colorbox\"><img class=\"boxImage tiptop\" src=\"template/images/boxes/4.jpg\" alt=\"\" title=\"&plusmn;&nbsp;zoom\" /></a>\r\n");
      out.write("                    \r\n");
      out.write("            <h3>Morbi fermentum sollicitudin diam vel vehicula</h3>\r\n");
      out.write("            <p>Maecenas pharetra egestas adipiscing. Nullam consequat velit in felis sodales in facilisis justo fringilla. Pellentesque nec lobortis dolor. Praesent et mi eu magna dapibus condimentum.&nbsp;<a href=\"#\">Read more&nbsp;&rarr;</a></p>\r\n");
      out.write("        </div><!-- end .grid_3 -->\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("        \r\n");
      out.write("    </div><!-- end boxes -->\r\n");
      out.write("\t\r\n");
      out.write("    <!-- begin buttons -->\r\n");
      out.write("    <div id=\"buttons\">\r\n");
      out.write("    \r\n");
      out.write("    \t<!-- begin .grid_4 - BUTTON1 -->\r\n");
      out.write("        <div class=\"grid_4\">\r\n");
      out.write("            <a href=\"#\" class=\"tip\" title=\"Maecenas pharetra egestas adipiscing.\"><img class=\"btn\" src=\"template/images/btn/btn1.png\" alt=\"\" /></a>\r\n");
      out.write("        </div><!-- end .grid_4 -->\r\n");
      out.write("        \r\n");
      out.write("        <!-- begin .grid_4 - BUTTON2 -->\r\n");
      out.write("        <div class=\"grid_4\">\r\n");
      out.write("            <a href=\"#\" class=\"tip\" title=\"Maecenas pharetra egestas adipiscing.\"><img class=\"btn\" src=\"template/images/btn/btn2.png\" alt=\"\" /></a>\r\n");
      out.write("        </div><!-- end .grid_4 -->\r\n");
      out.write("        \r\n");
      out.write("        <!-- begin .grid_4 - BUTTON3 -->\r\n");
      out.write("        <div class=\"grid_4\">\r\n");
      out.write("            <a href=\"#\" class=\"tip\" title=\"Maecenas pharetra egestas adipiscing.\"><img class=\"btn\" src=\"template/images/btn/btn3.png\" alt=\"\" /></a>\r\n");
      out.write("        </div><!-- end .grid_4 -->\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("    <!-- begin video & features -->\r\n");
      out.write("    <div id=\"video_features\">\r\n");
      out.write("    \t\r\n");
      out.write("        <!-- begin .grid_7 - FEATURES -->\r\n");
      out.write("        <div class=\"grid_7\">\r\n");
      out.write("            <h2>Lorem ipsum dolor sit amet, consectetur eu tempus.</h2>\r\n");
      out.write("            <p>Sed ullamcorper augue nec risus facilisis eu venenatis metus tristique. In hac habitasse platea dictumst. Aenean at lacus urna. Donec pretium mattis gravida. Integer eu nisl erat, eu tempus nisi.</p>\r\n");
      out.write("            <ul id=\"features\">\r\n");
      out.write("                <li><img src=\"template/images/list_icon/1.png\" alt=\"\" />&nbsp;&nbsp;&nbsp;Lorem ipsum dolor sit amet, eu consectetur. Ut dapibus fringilla.</li>\r\n");
      out.write("                <li><img src=\"template/images/list_icon/2.png\" alt=\"\" />&nbsp;&nbsp;&nbsp;Ut dapibus fringilla volutpat. Sed ullamcorper augue nec.</li>\r\n");
      out.write("                <li><img src=\"template/images/list_icon/3.png\" alt=\"\" />&nbsp;&nbsp;&nbsp;Maecenas pharetra egestas adipiscing. Nullam consequat velit.</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <p>Ut dapibus fringilla volutpat. Sed ullamcorper augue nec risus facilisis eu venenatis metus tristique. In hac habitasse platea dictumst. Aenean at lacus urna. Donec pretium mattis gravida.</p>\r\n");
      out.write("        </div><!-- end .grid_7 -->\r\n");
      out.write("        \r\n");
      out.write("        <!-- begin .grid_5 - VIDEO -->\r\n");
      out.write("        <div id=\"video\" class=\"grid_5\">\r\n");
      out.write("            <iframe src=\"http://player.vimeo.com/video/23428725?title=0&amp;byline=0&amp;portrait=0\" width=\"380\" height=\"285\" frameborder=\"0\"></iframe>\r\n");
      out.write("        </div><!-- end .grid_5 -->\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("        \r\n");
      out.write("     </div>\r\n");
      out.write("\t\r\n");
      out.write("     <!-- begin .grid_12 - COMMENTS -->\r\n");
      out.write("     <div id=\"strip\" class=\"grid_12\">\r\n");
      out.write("         <img id=\"users\" src=\"template/images/users.png\" alt=\"\" />\r\n");
      out.write("         <ul id=\"comments\">\r\n");
      out.write("             <li>\"Maecenas pharetra egestas adipiscing. Nullam consequat velit in felis sodales in facilisis justo fringilla. Pellentesque nec lobortis dolor. Praesent et mi eu magna dapibus condimentum.\"<br /><span class=\"signature\">John Doe - 4 October 2011</span></li>\r\n");
      out.write("             <li>\"Ut dapibus fringilla volutpat. Sed ullamcorper augue nec risus facilisis eu venenatis metus tristique. In hac habitasse platea dictumst. Aenean at lacus urna. Donec pretium mattis gravida.\"<br /><span class=\"signature\">John Doe - 4 October 2011</span></li>\r\n");
      out.write("         </ul>\r\n");
      out.write("     </div><!-- end .grid_12 -->\r\n");
      out.write("\r\n");
      out.write("</div><!-- END CONTAINER -->\r\n");
      out.write("\r\n");
      out.write("<!-- END : page body content -->\r\n");
      out.write("\r\n");
      out.write("<!-- Include the footer -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
