package japidviews._tags;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import com.google.gson.JsonElement;
import utils.JsonUtils;
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
// NOTE: This file was generated from: japidviews/_tags/finding_result_count.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class finding_result_count extends cn.bran.japid.template.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/_tags/finding_result_count.html";
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


	public finding_result_count() {
		super(null);
	}
	public finding_result_count(StringBuilder out) {
		super(out);
	}
	private JsonElement results;
	public cn.bran.japid.template.RenderResult render(JsonElement results) {
		this.results = results;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
//------
;// line 1
p("<div id=\"v4-4\" class=\"fpcc\">\n" + 
"<div>\n" + 
"	<span>\n" + 
"		<h1 class=\"smuy\">\n" + 
"	      ");// line 3
if(asBoolean(results)) {// line 9
p("			<span class=\"countClass\">");// line 9
p(JsonUtils.getString(results, "findItemsByKeywordsResponse.0.paginationOutput.0.totalPages.0"));// line 10
p("</span> \n" + 
"			<span class=\"matchClass\">results found for</span> <span class=\"keywordClass\" id=\"v4-5\">");// line 10
p(request.params.get("_nkw"));// line 11
p("</span>\n" + 
"	      ");// line 11
}// line 12
p("		</h1>\n" + 
"	</span>\n" + 
"	<span class=\"saveSearch\"> </span>\n" + 
"	<span> </span>\n" + 
"</div>\n" + 
"</div>\n");// line 12

	}

}