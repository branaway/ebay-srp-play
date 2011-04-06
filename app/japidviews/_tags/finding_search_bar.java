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
// NOTE: This file was generated from: japidviews/_tags/finding_search_bar.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class finding_search_bar extends cn.bran.japid.template.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/_tags/finding_search_bar.html";
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


	public finding_search_bar() {
		super(null);
	}
	public finding_search_bar(StringBuilder out) {
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
p("<div class=\"fsbr\">\n" + 
"<form name=\"fsb\" id=\"v4-0\" method=\"get\" action=\"");// line 1
p(searchUrl);// line 4
p("\">\n" + 
"<table cellpadding=\"0\" cellspacing=\"0\">\n" + 
"	<tbody>\n" + 
"		<tr>\n" + 
"		  <td class=\"keys\">\n" + 
"			<label for=\"_nkw_id\" class=\"g-hdn\">Enter your search keyword</label>\n" + 
"			 <span id=\"v4-1\" class=\"afi halo\"> <span class=\"mid\">\n" + 
"			<span class=\"inr\"> <input autocomplete=\"off\" id=\"_nkw_id\" name=\"_nkw\"\n" + 
"				maxlength=\"300\" value=\"\" class=\"afi\" type=\"text\">\n" + 
"				<b id=\"e2\" class=\"on\" title=\"Show suggestions\"> </b> </span> </span> </span>\n" + 
"		  </td>\n" + 
"		  <td class=\"cats\"><label for=\"v4-3\" class=\"g-hdn\">Select a category for search</label>\n" + 
"			<select name=\"_sacat\" id=\"v4-3\" class=\"cats\">\n" + 
"				<option selected=\"selected\" value=\"0\">All Categories</option>\n" + 
"				<!-- BEGIN CATS_BLOCK -->\n" + 
"				<option value=\"{CAT_NUMBER}\">{CAT_NAME}</option>\n" + 
"				<!-- END CATS_BLOCK -->\n" + 
"			</select>\n" + 
"		  </td>\n" + 
"	      <td class=\"lnks\"><input class=\"srch\" id=\"q_3\" value=\"Search\" type=\"submit\">\n" + 
"				<span class=\"flds\"> <input name=\"_odkw\" value=\"test\"\n" + 
"				type=\"hidden\"> <input name=\"_osacat\" value=\"0\" type=\"hidden\"> <input\n" + 
"				name=\"_trksid\" value=\"\" type=\"hidden\"> </span>\n" + 
"		  </td>\n" + 
"		</tr>\n" + 
"		<tr>\n" + 
"			<td class=\"rls\" colspan=\"2\"></td>\n" + 
"		</tr>\n" + 
"	</tbody>\n" + 
"</table>\n" + 
"</form>\n" + 
"</div>");// line 4

	}

}