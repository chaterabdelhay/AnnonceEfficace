package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!-- BEGIN FOOTER -->\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("    <div class=\"container_12\">\r\n");
      out.write("    \r\n");
      out.write("    \t<!-- begin .grid_6 - SOCIAL -->\r\n");
      out.write("        <div class=\"grid_6\">\r\n");
      out.write("        \t<h4>Our social</h4>\r\n");
      out.write("            <div id=\"social\">\r\n");
      out.write("            \t<p id=\"socialText\">Ut dapibus fringilla volutpat. Sed ullamcorper augue nec risus facilisis eu venenatis metus tristique. In hac habitasse platea dictumst. Aenean at lacus urna. Donec pretium mattis gravida. Integer eu nisl erat, eu tempus nisi.</p>\r\n");
      out.write("                <a class=\"tip\" title=\"Twitter\" href=\"#\"><img class=\"socialIcon\" src=\"template/images/social/twitter.png\" alt=\"\" /></a>\r\n");
      out.write("                <a class=\"tip\" title=\"Linkedin\" href=\"#\"><img class=\"socialIcon\" src=\"template/images/social/linkedin.png\" alt=\"\" /></a>\r\n");
      out.write("                <a class=\"tip\" title=\"Skype\" href=\"#\"><img class=\"socialIcon\" src=\"template/images/social/skype.png\" alt=\"\" /></a>\r\n");
      out.write("                <a class=\"tip\" title=\"Dribbble\" href=\"#\"><img class=\"socialIcon\" src=\"template/images/social/dribble.png\" alt=\"\" /></a>\r\n");
      out.write("                <a class=\"tip\" title=\"Facebook\" href=\"#\"><img class=\"socialIcon\" src=\"template/images/social/facebook.png\" alt=\"\" /></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div><!-- end .grid_6 -->\r\n");
      out.write("        \r\n");
      out.write("        <!-- begin .grid_3 - MAP -->\r\n");
      out.write("        <div class=\"grid_3\">\r\n");
      out.write("        \t<h4>Where we are</h4>\r\n");
      out.write("        \t<img id=\"map\" src=\"template/images/map.png\" alt=\"\" />\r\n");
      out.write("            <p>Donec pretium mattis gravida. Integer eu nisl erat, <a href=\"#\">eu tempus</a> nisi.</p>\r\n");
      out.write("        </div><!-- end .grid_3 --> \r\n");
      out.write("        \r\n");
      out.write("        <!-- begin .grid_3 - FORM -->\r\n");
      out.write("        <div class=\"grid_3\">\r\n");
      out.write("        \t<h4>Newsletter</h4>\r\n");
      out.write("            <p>Sed ullamcorper augue nec risus facilisis eu venenatis metus tristique. In hac habitasse platea dictumst. Aenean at lacus urna.</p>\r\n");
      out.write("        \t<form action=\"\" id=\"newsletter\">\r\n");
      out.write("                <input type=\"text\" class=\"input\" id=\"newsletterInput\" value=\"your mail address\" />\r\n");
      out.write("                <input type=\"submit\" class=\"submit\" id=\"subscribe\" value=\"Subscribe\" /><input type=\"submit\" class=\"submit\" id=\"unsubscribe\" value=\"Unsubscribe\" />\r\n");
      out.write("            </form>\r\n");
      out.write("        </div><!-- end .grid_3 -->\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("</div><!-- END FOOTER -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
