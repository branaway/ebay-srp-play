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
// NOTE: This file was generated from: japidviews/_tags/pagination.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class pagination extends cn.bran.japid.template.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/_tags/pagination.html";
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


	public pagination() {
		super(null);
	}
	public pagination(StringBuilder out) {
		super(out);
	}
	public cn.bran.japid.template.RenderResult render() {
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
//------
p("<div id=\"v4-26\">\n" + 
"<table class=\"pgbc\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\n" + 
"	width=\"100%\">\n" + 
"	<tbody>\n" + 
"		<tr>\n" + 
"			<td class=\"l\"><span class=\"page\">Page <i>{FIRST_PAGE} of {LAST_PAGE}</i> </span></td>\n" + 
"			<td>\n" + 
"			<table class=\"pager\" align=\"center\">\n" + 
"				<tbody>\n" + 
"					<tr>\n" + 
"						<td class=\"botpg-prev\"><a id=\"{E_PREVIOUS}\" href=\"{PREVIOUS_URL}\" class=\"{PREVIOUS_ENABLED}\"> <i>Previous</i>\n" + 
"						</a></td>\n" + 
"						<td class=\"pages\">\n" + 
"							<!-- BEGIN PAGE_LINKS -->\n" + 
"							<a href=\"{PAGE_LINK_URL}\" id=\"{ENUMBER}\" class=\"{ENABLED}\">{PAGE_NUMBER}</a> <span> </span>\n" + 
"						<!-- END PAGE_LINKS -->\n" + 
"						</td>\n" + 
"						<td class=\"botpg-next\">\n" + 
"								<a class=\"{NEXT_ENABLED}\" id=\"{E_NEXT}\" href=\"{NEXT_URL}\"><i>Next</i> </a>\n" + 
"						</td>\n" + 
"					</tr>\n" + 
"				</tbody>\n" + 
"			</table>\n" + 
"			</td>\n" + 
"			<td class=\"r\"></td>\n" + 
"		</tr>\n" + 
"	</tbody>\n" + 
"</table>\n" + 
"</div>");// line 1

	}

}