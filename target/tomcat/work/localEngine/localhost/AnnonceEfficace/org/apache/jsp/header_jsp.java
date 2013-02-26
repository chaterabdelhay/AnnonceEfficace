package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<script src=\"http://maps.google.com/maps?file=api&v=2&key=ABQIAAAA7A7Eu8gZ_mTslgWnRR9TGRQByQgPDcFg0q0wOb9u6rRtBOFyKBQD4QgfPHRxBFGL7JviJdz_jAlHfw\" type=\"text/javascript\"></script>\r\n");
      out.write("<!-- Website title -->\r\n");
      out.write("<title>Annonce Efficace</title>\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Favicon -->\r\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"favicon.ico\" />\r\n");
      out.write("\r\n");
      out.write("\t<!-- Begin Stylesheets -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"template/stylesheets/message.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"template/stylesheets/reset.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"template/stylesheets/960_12_col.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"template/stylesheets/layout.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"template/stylesheets/tipTip.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"template/stylesheets/colorbox.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"template/stylesheets/nivoslider/nivo-slider.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"template/stylesheets/nivoslider/default/default.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"template/stylesheets/bx_styles/bx_styles.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"template/stylesheets/top_panel.css\" type=\"text/css\" media=\"screen\" />  \r\n");
      out.write("         <link rel=\"stylesheet\" href=\"template/stylesheets/star_rating.css\" type=\"text/css\" media=\"screen\" />        \r\n");
      out.write("\t<!-- End Stylesheets -->\r\n");
      out.write("    \r\n");
      out.write("    <!-- Begin Google Web Fonts -->\r\n");
      out.write("    \t<link href='http://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css' />\r\n");
      out.write("\t<!-- End Google Web Fonts -->\r\n");
      out.write("    \r\n");
      out.write("\t<!-- Begin JavaScript -->\r\n");
      out.write("    \r\n");
      out.write("    \t<!-- jQuery -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"template/javascripts/jquery-1.6.4.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <!-- jQuery plugins -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"template/javascripts/jquery.tipTip.minified.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"template/javascripts/jquery.colorbox-min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"template/javascripts/jquery.nivo.slider.pack.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"template/javascripts/jquery.bxSlider.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"template/javascripts/jquery.ticker.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"template/javascripts/OptionPopupDescriptor.js\"></script>\r\n");
      out.write("        <!-- JQUERY rating stars -->\r\n");
      out.write("        \r\n");
      out.write("        <script type=\"text/javascript\" src=\"template/javascripts/jquery.rating.pack.js\"></script>\r\n");
      out.write(" \t\t<link href=\"template/stylesheets/jquery.rating.css\" rel=\"stylesheet\"/>\r\n");
      out.write("        <!-- JQUERY rating stars2 -->\r\n");
      out.write("         <script type=\"text/javascript\" src=\"template/javascripts/jquery.ticker.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"template/javascripts/OptionPopupDescriptor.js\"></script>\r\n");
      out.write("        <!-- jQuery plugin init -->\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// IMAGE CAROUSEL\r\n");
      out.write("\t\t\t$('#carousel').bxSlider({\r\n");
      out.write("\t\t\t\tdisplaySlideQty: 6,\r\n");
      out.write("\t\t\t\tmoveSlideQty: 1\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('#carousel li').mouseover( function() { $(this).css(\"color\",\"#3791CF\"); });\r\n");
      out.write("\t\t\t$('#carousel li').mouseout( function() { $(this).css(\"color\",\"#FFFFFF\"); });\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// IMAGE SLIDER\r\n");
      out.write("\t\t\t$('#slider').nivoSlider();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// TICKER\r\n");
      out.write("\t\t\t$('#comments').list_ticker({\r\n");
      out.write("\t\t\t\tspeed:4000,\r\n");
      out.write("\t\t\t\teffect:'fade'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// IMAGES LIGHTBOX\r\n");
      out.write("\t\t\t$('.colorbox').colorbox();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// WATCH THE VIDEO\r\n");
      out.write("\t\t\t$('.watch').colorbox({iframe:true, innerWidth:425, innerHeight:344});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// TIPS\r\n");
      out.write("\t\t\t$(\".tip\").tipTip({maxWidth: \"auto\", edgeOffset: 18, delay:0});  \r\n");
      out.write("\t\t\t$(\".tiptop\").tipTip({maxWidth: \"auto\", edgeOffset: 0, delay:0, defaultPosition: \"top\" });  \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// ROLLOVER EFFECT\r\n");
      out.write("\t\t\t$('#carousel li,.watch,.boxImage').mouseover( function() { $(this).fadeTo(0,0.8); });\r\n");
      out.write("\t\t\t$('#carousel li,.watch,.boxImage').mouseout( function() { $(this).fadeTo(0,1); });\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// TOP PANEL\r\n");
      out.write("\t\t\t$(\"div.panel_button\").click(function(){\r\n");
      out.write("\t\t\t\t$(\"div#panel\").animate({\r\n");
      out.write("\t\t\t\t\theight: \"500px\"\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\t.animate({\r\n");
      out.write("\t\t\t\t\theight: \"400px\"\r\n");
      out.write("\t\t\t\t}, \"fast\");\r\n");
      out.write("\t\t\t\t$(\"div.panel_button\").toggle();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t});\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t    $(\"div#hide_button\").click(function(){\r\n");
      out.write("\t\t\t\t$(\"div#panel\").animate({\r\n");
      out.write("\t\t\t\t\theight: \"0px\"\r\n");
      out.write("\t\t\t\t}, \"fast\");\r\n");
      out.write("   \t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// NEWSLETTER INPUT\r\n");
      out.write("\t\t\t\t// global vars\r\n");
      out.write("\t\t\tvar searchBox = $(\"#newsletterInput\");\r\n");
      out.write("\t\t\tvar searchBoxDefault = \"your mail address\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//Searchbox show/hide default text if needed\r\n");
      out.write("\t\t\tsearchBox.focus(function(){\r\n");
      out.write("\t\t\t\tif($(this).attr(\"value\") == searchBoxDefault) $(this).attr(\"value\", \"\");\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tsearchBox.blur(function(){\r\n");
      out.write("\t\t\t\tif($(this).attr(\"value\") == \"\") $(this).attr(\"value\", searchBoxDefault);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</script>\r\n");
      out.write(" \r\n");
      out.write("\t<!-- End JavaScript -->\r\n");
      out.write("    \r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Begin top panel -->\r\n");
      out.write("<div id=\"toppanel\">\r\n");
      out.write("    <div id=\"panel\">\r\n");
      out.write("    \t<div id=\"panel_contents\">\r\n");
      out.write("        \t<h1>Colors</h1>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"../../blue/nivo-slider/index.html\">blue</a></li>\r\n");
      out.write("                <li><a href=\"../../green/nivo-slider/index.html\">green</a></li>\r\n");
      out.write("                <li><a href=\"../../red/nivo-slider/index.html\">red</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            \r\n");
      out.write("            <h1>Sliders</h1>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"../../blue/nivo-slider/index.html\">nivo Slider</a></li>\r\n");
      out.write("                <li><a href=\"../../blue/piecemaker-slider/index.html\">piecemaker Slider</a></li>\r\n");
      out.write("                <li><a href=\"../../blue/kwicks-slider/index.html\">kwicks slider</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"panel_button\" id=\"expand_button\"><img src=\"template/images/expand.png\"  alt=\"expand\"/></div>\r\n");
      out.write("    <div class=\"panel_button\" id=\"hide_button\"><img src=\"template/images/collapse.png\" alt=\"collapse\" /></div>\r\n");
      out.write("</div><!-- End top panel -->\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN HEADER -->\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t\r\n");
      out.write("    <!-- begin .grid_3 - LOGO -->\r\n");
      out.write("    <div id=\"logo\" class=\"grid_3\">\r\n");
      out.write("    \t<img src=\"template/images/logo.png\" alt=\"\" />\r\n");
      out.write("    </div><!-- end .grid_3 -->\r\n");
      out.write("    \r\n");
      out.write("    <!-- begin .grid_9 - LINKS -->\r\n");
      out.write("    <div id=\"navigation\" class=\"grid_9\">\r\n");
      out.write("        <ul>\r\n");
      out.write("        \t<li><a href=\".\" class=\"selected\">Acceuil</a></li>\r\n");
      out.write("        \t");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_s_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            <li><a href=\"listeAnnonces\">Annonces</a></li>            \r\n");
      out.write("            ");
      if (_jspx_meth_s_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_s_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_s_005fif_005f4(_jspx_page_context))
        return;
      out.write("                                               \r\n");
      out.write("        </ul>\r\n");
      out.write("    </div><!-- end .grid_9 -->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("    \r\n");
      out.write("</div><!-- END HEADER -->\r\n");
      out.write("<!-- BEGIN SIDEBAR -->\r\n");
      out.write("<div id=\"sideBar\">\r\n");
      out.write("\t<div id=\"sideBarTopPart\"></div>\r\n");
      out.write("\t<div id=\"sideBarMiddlePart\">\r\n");
      out.write("\t\t<span id=\"opt1\" class=\"option\"> \r\n");
      out.write("\t\t\t<span class=\"optionDescription\" id=\"opt1Description\">Voir les annonces</span> \r\n");
      out.write("\t\t\t<img src=\"template/images/sideBar/options/opt1Normal.png\" \r\n");
      out.write("\t\t\t\t\tonmouseover=\"showOptionDescriptor(this)\" onmouseout=\"timedOuthideOptionDescriptor();\" \r\n");
      out.write("\t\t\t\t\tonclick=\"window.location.replace('listeAnnonces');\"/>\r\n");
      out.write("\t\t</span>\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fif_005f5(_jspx_page_context))
        return;
      out.write("\t\t\t\t\t\r\n");
      out.write("\t</div>\t\t\r\n");
      out.write("\t<div id=\"sideBarBottomPart\"></div>\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<table id=\"optionDescriptor\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td id=\"optionDescriptorLeftPart\"></td>\r\n");
      out.write("\t\t<td id=\"optionDescriptorMiddlePart\"><span id=\"optionDescriptorText\">Texte de descr.</span></td>\r\n");
      out.write("\t\t<td id=\"optionDescriptorRightPart\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<!-- END SIDEBAR -->");
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

  private boolean _jspx_meth_s_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent(null);
    // /header.jsp(162,9) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("%{#session.utilisateur!=null}");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            \t<li><a href=\"espaceUtilisateur\" style=\"color:#fff;\">Mon espace</a></li>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f1.setParent(null);
    // /header.jsp(165,12) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f1.setTest("%{#session.utilisateur!=null}");
    int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
    if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            \t<li><a href=\"listeMessages\" style=\"color:#fff;\">Mes messages</a></li>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f2 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f2.setParent(null);
    // /header.jsp(169,12) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f2.setTest("%{#session.utilisateur!=null}");
    int _jspx_eval_s_005fif_005f2 = _jspx_th_s_005fif_005f2.doStartTag();
    if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            \t<li><a href=\"publierAnnonce\" style=\"color:#fff;\">Publier une annonce</a></li>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f3 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f3.setParent(null);
    // /header.jsp(172,12) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f3.setTest("%{#session.utilisateur!=null}");
    int _jspx_eval_s_005fif_005f3 = _jspx_th_s_005fif_005f3.doStartTag();
    if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            \t<li><a href=\"disconnect\" style=\"color:#fff;\">Se deconnecter</a></li>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f4 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f4.setParent(null);
    // /header.jsp(175,12) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f4.setTest("%{#session.utilisateur==null}");
    int _jspx_eval_s_005fif_005f4 = _jspx_th_s_005fif_005f4.doStartTag();
    if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            \t<li><a href=\"connexion.jsp\">Se connecter</a></li>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f5 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f5.setParent(null);
    // /header.jsp(194,2) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f5.setTest("%{#session.utilisateur!=null}");
    int _jspx_eval_s_005fif_005f5 = _jspx_th_s_005fif_005f5.doStartTag();
    if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f5.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t<span id=\"opt3\" class=\"option\"> \r\n");
        out.write("\t\t\t\t<span class=\"optionDescription\" id=\"opt3Description\">Publier une annonce rapidement</span> \r\n");
        out.write("\t\t\t\t<img src=\"template/images/sideBar/options/opt3Normal.png\" \r\n");
        out.write("\t\t\t\t\tonmouseover=\"showOptionDescriptor(this)\" onmouseout=\"timedOuthideOptionDescriptor();\" \r\n");
        out.write("\t\t\t\t\tonclick=\"window.location.replace('publierAnnonce');\"/> \r\n");
        out.write("\t\t\t</span>\r\n");
        out.write("\t\t\t<span id=\"opt2\" class=\"option\"> \r\n");
        out.write("\t\t\t\t<span class=\"optionDescription\" id=\"opt2Description\">Participez au concours</span> \r\n");
        out.write("\t\t\t\t<img src=\"template/images/sideBar/options/opt2Normal.png\" \r\n");
        out.write("\t\t\t\t\tonmouseover=\"showOptionDescriptor(this)\" onmouseout=\"timedOuthideOptionDescriptor();\" \r\n");
        out.write("\t\t\t\t\tonclick=\"window.location.replace('participerConcours');\"/>\r\n");
        out.write("\t\t\t</span>\t\t\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f5);
    return false;
  }
}
