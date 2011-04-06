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
// NOTE: This file was generated from: japidviews/_tags/item.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class item extends cn.bran.japid.template.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/_tags/item.html";
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


	public item() {
		super(null);
	}
	public item(StringBuilder out) {
		super(out);
	}
	private JsonElement item;
	public cn.bran.japid.template.RenderResult render(JsonElement item) {
		this.item = item;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
//------
;// line 1
p("<a name=\"item{ITEM_ID_HEX}\"></a>\n" + 
"  <table class=\"li\">\n" + 
"    <tbody>\n" + 
"      <tr>\n" + 
"        <td class=\"pic p140 lt\"><a href=\"#\" class=\"x140 img\">\n" + 
"          ");// line 3
if(asBoolean(JsonUtils.getElement(item, "galleryURL"))) {// line 10
p("            <img class=\"img\" src='");// line 10
p(JsonUtils.getString(item, "galleryURL.0"));// line 11
p("' alt=\"Item image\" /></a>\n" + 
"          ");// line 11
}// line 12
p("        </td>\n" + 
"\n" + 
"        <td class=\"dtl ttl\"><a href='http://cgi.ebay.com/");// line 12
p(JsonUtils.getString(item, "title.0"));// line 15
p("/");// line 15
p(JsonUtils.getString(item, "itemId.0"));// line 15
p("'\n" + 
"        class=\"vip\">");// line 15
p(JsonUtils.getString(item, "title.0"));// line 16
p("</a></td>\n" + 
"\n" + 
"        <td class=\"trs\">\n" + 
"          ");// line 16
if(asBoolean(JsonUtils.getBoolean(item, "sellerInfo.0.topRatedSeller.0"))) {// line 19
p("             <img src= \"http://p.ebaystatic.com/aw/pics/icons/iconTrsXSmall.gif\"\n" + 
"                  alt=\"Get fast shipping and excellent service when you buy from eBay Top-rated sellers\"\n" + 
"                  height=\"30\" width=\"66\" />\n" + 
"          ");// line 19
}// line 23
p("        </td>\n" + 
"\n" + 
"        ");// line 23
if(asBoolean(JsonUtils.getElement(item, "sellingStatus.0.bidCount"))) {// line 26
p("            <td class=\"bids bin1\">");// line 26
p(JsonUtils.getString(item, "sellingStatus.0.bidCount.0"));// line 27
p(" Bids</td>\n" + 
"        ");// line 27
} else {// line 28
p("            <td class=\"bids bin1\">0 Bids</td>\n" + 
"        ");// line 28
}// line 30
p("        <td class=\"prc g-b\">");// line 30
p(JsonUtils.getString(item, "sellingStatus.0.currentPrice.0.__value__"));// line 32
p(" \n" + 
"        ");// line 32
p(JsonUtils.getString(item, "sellingStatus.0.currentPrice.0.@currencyId"));// line 33
p(" </td>\n" + 
"\n" + 
"        <td class=\"tme rt\"><b class=\"hidlb\">Time left:</b> <span class=\n" + 
"        \"{ALERT_OR_NOT}\">");// line 33
p(JsonUtils.getString(item, "sellingStatus.0.timeLeft.0"));// line 36
p(" </span></td>\n" + 
"      </tr>\n" + 
"    </tbody>\n" + 
"  </table>");// line 36

	}

}