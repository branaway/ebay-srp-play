package japidviews._tags;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import static  japidviews._javatags.JapidWebUtil.*;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import controllers.*;
import play.mvc.Http.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/_tags/finding_control_bar.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class finding_control_bar extends cn.bran.japid.template.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/_tags/finding_control_bar.html";
{
	headers.put("Content-Type", "text/html; charset=utf-8");
}

// - add implicit fields with Play

	final Request request = Request.current(); 
	final Response response = Response.current(); 
	final Session session = Session.current();
	final RenderArgs renderArgs = RenderArgs.current();
	final Params params = Params.current();
	final Validation validation = Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public finding_control_bar() {
		super(null);
	}
	public finding_control_bar(StringBuilder out) {
		super(out);
	}
	private String searchUrl;
	public cn.bran.japid.template.RenderResult render(String searchUrl) {
		this.searchUrl = searchUrl;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
//------
;// line 1
p("<div class=\"ctlb\">\n" + 
"  <ul id=\"v4-19\" class=\"toppg\">\n" + 
"    <li class=\"toppg-t\">{PAGE_RANGE_TEXT}</li>\n" + 
"\n" + 
"    <li><a id=\"e4\" class=\"toppg-p toppg-pd\" name=\"e4\"><i>Previous</i></a></li>\n" + 
"\n" + 
"    <li><a id=\"e5\" href=\n" + 
"    \"");// line 1
p(searchUrl);// line 10
p("?_nkw=test&amp;rt=nc&amp;_odkw=&amp;_osacat=0&amp;_trksid=null&amp;_pgn=2\"\n" + 
"    class=\"toppg-n\" name=\"e5\"><i>Next</i></a></li>\n" + 
"  </ul>\n" + 
"\n" + 
"  <div class=\"sb\">\n" + 
"    Sort by:<select id=\"v4-20\">\n" + 
"      <option selected=\"selected\" value=\"1\">\n" + 
"        Time: ending soonest\n" + 
"      </option>\n" + 
"\n" + 
"      <option value=\"10\">\n" + 
"        Time: newly listed\n" + 
"      </option>\n" + 
"\n" + 
"      <option value=\"3\">\n" + 
"        Price: highest first\n" + 
"      </option>\n" + 
"\n" + 
"      <option value=\"2\">\n" + 
"        Price: lowest first\n" + 
"      </option>\n" + 
"    </select>\n" + 
"  </div>\n" + 
"\n" + 
"  <div class=\"g-clr\"></div>\n" + 
"</div>\n" + 
"\n");// line 10

	}

}