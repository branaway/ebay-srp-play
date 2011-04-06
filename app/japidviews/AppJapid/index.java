package japidviews.AppJapid;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import com.google.gson.*;
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
// NOTE: This file was generated from: japidviews/AppJapid/index.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class index extends cn.bran.japid.template.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/AppJapid/index.html";
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



// -- set up the tag objects
final header _header0 = new header(getOut());
{ _header0.setActionRunners(getActionRunners()); }

final finding_search_bar _finding_search_bar1 = new finding_search_bar(getOut());
{ _finding_search_bar1.setActionRunners(getActionRunners()); }

final finding_result_count _finding_result_count2 = new finding_result_count(getOut());
{ _finding_result_count2.setActionRunners(getActionRunners()); }

final leftpanel _leftpanel3 = new leftpanel(getOut());
{ _leftpanel3.setActionRunners(getActionRunners()); }

final finding_control_bar _finding_control_bar4 = new finding_control_bar(getOut());
{ _finding_control_bar4.setActionRunners(getActionRunners()); }

final item _item5 = new item(getOut());
{ _item5.setActionRunners(getActionRunners()); }

final pagination _pagination6 = new pagination(getOut());
{ _pagination6.setActionRunners(getActionRunners()); }

final footer _footer7 = new footer(getOut());
{ _footer7.setActionRunners(getActionRunners()); }

// -- end of the tag objects

	public index() {
		super(null);
	}
	public index(StringBuilder out) {
		super(out);
	}
	private JsonObject results;
	public cn.bran.japid.template.RenderResult render(JsonObject results) {
		this.results = results;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
//------
;// line 1
String url = "index";// line 5
p("<!DOCTYPE html>\n" + 
"<html>\n" + 
"<head>\n" + 
"  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" + 
"  <!-- What to do about these **********************  -->\n" + 
"  <link rel=\"stylesheet\" type=\"text/css\" href=\"http://include.ebaystatic.com/v4css/en_US/e695/Finding_SharedDS2_e69512341310_en_US.css\">\n" + 
"    <link rel=\"stylesheet\" type=\"text/css\" href=\"http://include.ebaystatic.com/v4css/en_US/e695/Finding_BaseDS2_e69512325629_en_US.css\">\n" + 
"    <link rel=\"stylesheet\" type=\"text/css\" href=\"http://include.ebaystatic.com/v4css/en_US/e693/GH-ZAM_RedesignEbayNoneFull_e69312303392_en_US.css\">\n" + 
"    <link rel=\"stylesheet\" type=\"text/css\" href=\"http://include.ebaystatic.com/v4css/en_US/e695/Finding_SearchRecoveryShowItems_e69512325629_en_US.css\">\n" + 
"</head>\n" + 
"\n" + 
"<body class=\"sz940\" id=\"body\">\n" + 
"<script type=\"text/javascript\" src=\"http://include.ebaystatic.com/v4js/en_US/e693/Finding_BaseDS2_e69312303384_1_en_US.js\"></script>\n" + 
"<script type=\"text/javascript\" src=\"http://include.ebaystatic.com/v4js/en_US/e695/Finding_SharedDS2_e69512325628_2_en_US.js\"></script>\n" + 
"<script type=\"text/javascript\" src=\"http://include.ebaystatic.com/v4js/en_US/e693/Finding_DiagnosticsDS2_e69312303384_2_en_US.js\"></script>\n" + 
"<script type=\"text/javascript\">var _GlobalNavHeaderUtf8Encoding=true;</script>\n" + 
"<script type=\"text/javascript\" src=\"http://include.ebaystatic.com/v4js/en_US/e695/GH-ZAM_RedesignEbayNoneFull_e69512360751_1_en_US.js\"></script>\n" + 
"\n" + 
"  <div class=\"ff-body\" id=\"ff-body\">\n" + 
"    <div class=\"ff-top\" id=\"ff-top\">\n" + 
"        <div id=\"TopPanel\">\n" + 
"      ");// line 5
_header0.setOut(getOut()); _header0.render();
// line 28
      _finding_search_bar1.setOut(getOut()); _finding_search_bar1.render(url);
// line 29
      _finding_result_count2.setOut(getOut()); _finding_result_count2.render(results);
// line 30
p("        </div> <!-- End TopPanel -->\n" + 
"    </div>\n" + 
"\n" + 
"    ");// line 30
_leftpanel3.setOut(getOut()); _leftpanel3.render(results);
// line 35
p("    <!-- Start center -->\n" + 
"    <div class=\"ff-center\" id=\"ff-center\">\n" + 
"        <div id=\"CenterPanel\">\n" + 
"            ");// line 35
_finding_control_bar4.setOut(getOut()); _finding_control_bar4.render(url);
// line 40
p("            <div id=\"ResultSet\" class=\"rs_box\">\n" + 
"                <div id=\"v4-22\">\n" + 
"                    <a name=\"mainContent\"></a>\n" + 
"                    <div id=\"v4-23\">\n" + 
"                        <div id=\"v4-25\" class=\"lview\">\n" + 
"                        <!-- BEGIN RESULT_SET -->\n" + 
"                 ");// line 40
if(asBoolean(results)) {// line 47
                   for (JsonElement item : JsonUtils.getArray(results, "findItemsByKeywordsResponse.0.searchResult.0.item")) {// line 48
                     _item5.setOut(getOut()); _item5.render(item);
// line 49
                   }// line 50
                 }// line 51
p("                        <!-- END RESULT_SET -->\n" + 
"                        </div>\n" + 
"               ");// line 51
_pagination6.setOut(getOut()); _pagination6.render();
// line 54
p("                    </div>\n" + 
"                </div>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div> <!-- End center -->\n" + 
"    <div class=\"ff-clear\" id=\"ff-clear\"></div>\n" + 
"\n" + 
"    ");// line 54
_footer7.setOut(getOut()); _footer7.render();
// line 62
p(" </div>\n" + 
"\n" + 
"<div class=\"afl\" id=\"v4-2\" style=\"z-index: 5;\"><div class=\"sugg\"></div><div class=\"prod\"><div class=\"titl\"><span>Popular products</span></div><div class=\"body\"></div></div><div class=\"logo\"></div><div class=\"none\">No suggestions</div><div class=\"foot\"><a href=\"javascript:;\" id=\"e1\">Hide eBay suggestions</a></div></div>\n" + 
"\n");// line 62
p("<script type=\"text/javascript\">vjo.ctype(\"vjo.darwin.globalnav.util.SGuid\").needs(\"vjo.dsf.cookie.VjCookieJar\").props({writeSessionGuid:function(id)\n" + 
"{if(id&&id.length>0)\n" + 
"{vjo.dsf.cookie.VjCookieJar.writeCookieEx(\"cssg\",id,1);}}}).endType();\n" + 
"\n" + 
"vjo.ctype(\"vjo.darwin.globalnav.overlay.Overlay\").needs(\"vjo.darwin.core.utils.ElementUtils\",\"EU\").needs(\"vjo.darwin.core.utils.WindowDimension\",\"W\").needs(\"vjo.dsf.EventDispatcher\",'ED').props({timer:null,currObj:[],contentObjRef:null,id:null,keepOpen:false,iOpen:false,init:function(overlayId,imgSrc){var t=this;t.id=overlayId;t.callFnOnClose=[];t.callFnOnOpen=[];var func=function(){var obj=vjo.dsf.Element.get(overlayId);if(obj){document.body.appendChild(obj);var E=t.vj$.ED;E.addEventListener(obj,\"mouseout\",function(){t.closeOverlay(t.closeDelay);},t);E.addEventListener(obj,\"mouseover\",t.cancelOpen,t);}};if(!window[\"overlayinit\"]){t.vj$.ED.add(\"body\",\"load\",func,t);window[\"overlayinit\"]=true;}},openOverlay:function(model,delay,callFnOnOpen){var t=this;clearTimeout(t.timer);var f=function(){if(t.callFnOnOpen[model[0]]){t.callFnOnOpen[model[0]]();}\n" + 
"t.open(model);};if(model[0]&&!t.callFnOnOpen[model[0]]&&callFnOnOpen){t.callFnOnOpen[model[0]]=callFnOnOpen;}\n" + 
"if(t.iOpen){if(t.currObj[0]!=model[0]){if(t.callFnOnClose[t.currObj[0]]){if(delay&&model[9]&&model[9]==\"BrowseCategories\"){setTimeout(t.callFnOnClose[t.currObj[0]],delay);}else{t.callFnOnClose[t.currObj[0]]();}}}}\n" + 
"if(delay&&!t.iOpen){t.openTimer=setTimeout(f,delay);}else if(delay&&model[9]&&model[9]==\"BrowseCategories\"){t.openTimer=setTimeout(f,delay);}else if(delay&&model[9]&&model[9]==\"BrowseCategories\"){t.openTimer=setTimeout(f,delay);}else{f(model);}},open:function(model){var t=this,CHV=/chevron[0-9]+/,l=t.vj$,E=l.EU,W=l.W;t.closeDelay=model[8];if(model[0]&&!CHV.test(model[0])&&E.get(model[0])){var a1=E.get(model[0]),a2=E.get(\"BrowseCategories\"),hb=E.get(\"headerWrapper\");if(hb){hb.className=hb.className.replace(\" gh-zidx\",\"\");}\n" + 
"if(CHV.test(model[0]))\n" + 
"a1.className=\"gh-ai\";if(a2){a2.className=a2.className.replace(\" gh-hbdr\",\"\");a2.className=a2.className.replace(\" gh-hs\",\"\");}}\n" + 
"if(model){t.keepOpen=model[6];}\n" + 
"model=model||t.currObj;var tE=E.get(model[7])||E.get(model[0]),bD=W.getBrowserDimension(),ovrly=E.get(t.id),cO=(typeof(model[1])==\"object\")?model[1]:E.get(model[1]);t.currObj=model;var ovrCss=model[2]||\"\";if(ovrCss.indexOf(\"gh-vsmn\")==-1){ovrly.style.width=\"\";}\n" + 
"if(!ovrly||!tE){return;}\n" + 
"var ovrC=ovrly.childNodes;var inOvrly=(ovrC[0].innerHTML==undefined)?ovrC[1]:ovrC[0];clearTimeout(t.timer);var isParentWidthLess=(inOvrly.offsetWidth>ovrly.offsetWidth);ovrly.className=\"gh-ovr \"+model[2];inOvrly.className=\"gh-iovr \";var obj=(isParentWidthLess)?inOvrly:ovrly,c=inOvrly.childNodes;if(t.contentObjRef&&c.length>0){t.contentObjRef.appendChild(c[0]);}\n" + 
"model[4]=(model[4])?model[4]:0;model[5]=(model[5])?model[5]:0;var div_ext;var noborderWd=tE.offsetWidth-2-model[5];if(c[0]&&c[0].id==cO.id){}\n" + 
"else{inOvrly.innerHTML=\"\";t.contentObjRef=cO.parentNode;div_ext=document.createElement(\"div\");var div_wrp=document.createElement(\"div\");div_wrp.appendChild(div_ext);div_wrp.appendChild(cO);inOvrly.appendChild(div_wrp);div_ext.className=\"gh-ext\";div_ext.style.width=noborderWd+\"px\";}\n" + 
"var wid=obj.offsetWidth,ltz=W.getOffsetPosition(tE,bD);var spaceLeftToOverlay=(ltz[0]+ltz[4])-wid;var spaceFromLeft=bD[0]-(ltz[0]+wid);var isLeftAligned=(!model[3]&&(spaceFromLeft>10||(spaceFromLeft>spaceLeftToOverlay)));var tp=(ltz[1]+ltz[3]+model[4])+\"px\",lt=(isLeftAligned)?(ltz[0]+model[5])+\"px\":(spaceLeftToOverlay+model[5])+\"px\";if(div_ext&&!isLeftAligned){var fw=ovrly.offsetWidth;div_ext.style.marginLeft=(fw-noborderWd-2)+\"px\";}\n" + 
"t.applyStyle(ovrly,lt,tp);t.iOpen=true;},applyStyle:function(obj,left,top){if(obj){var s=obj.style;s.left=left;s.top=top;}},cancelOpen:function(){var t=this;clearTimeout(t.timer);},closeOverlay:function(delay,callFnOnClose){var t=this;clearTimeout(t.openTimer);if(t.keepOpen)return;if(t.currObj[0]&&!t.callFnOnClose[t.currObj[0]]&&callFnOnClose){t.callFnOnClose[t.currObj[0]]=callFnOnClose;}\n" + 
"var f=function(){t.close();t.iOpen=false;};delay=(typeof(delay)==\"number\")?delay:t.closeDelay;t.timer=setTimeout(f,delay);},close:function(e){var t=this;var elm=(e)?e.nativeEvent.srcElement||e.nativeEvent.target:null;if(elm&&t.currObj[0]==elm.id)return;var l=t.vj$,E=l.EU;var a2=E.get(\"BrowseCategories\");if(a2){a2.className=a2.className.replace(\" gh-hbdr\",\"\");}\n" + 
"t.callFn();t.applyStyle(t.vj$.EU.get(t.id),\"-1000px\",\"-1000px\");t.currObj=[];t.keepOpen=null;t.iOpen=false;},callFn:function(){var t=this;if(t.callFnOnClose[t.currObj[0]]){t.callFnOnClose[t.currObj[0]]();}}}).endType();\n" + 
"\n" + 
"vjo.darwin.globalnav.overlay.Overlay.init(\"gbh_ovl\", \"http://p.ebaystatic.com/aw/pics/homepage/imgMenuBg.png\");\n" + 
"vjo.darwin.globalnav.overlay.Overlay.init(\"gbh_ovl\", \"http://p.ebaystatic.com/aw/pics/homepage/imgMenuBg.png\");</script><script type=\"text/javascript\">vjo.dsf.error.ErrorHandlerManager.register(new vjo.dsf.error.DefaultErrorHandler());\n" + 
"vjo.dsf.error.ErrorHandlerManager.enableOnError(true);\n" + 
"vjo.dsf.cookie.VjCookieJar.sCookieDomain = '.ebay.com';vjo.dsf.cookie.VjCookieJar.writeCookielet('ebay','js','1');\n" + 
"\n" + 
"vjo.darwin.tracking.rover.Rover.roverTrack();\n" + 
"(function () {\n" + 
"var _r = vjo.Registry;\n" + 
"function $o5(p0,p1_4){return new vjo.darwin.domain.jaguar.pagination.DynamicPagerDS(p0,{pagesLinkSid:null,buttons:{\"prevEnabled\":\"http://q.ebaystatic.com/aw/pics/buttons/btnsquareltArrow.gif\",\"nextEnabled\":\"http://p.ebaystatic.com/aw/pics/buttons/btnsquarertArrow.gif\",\"prevDisabled\":\"http://p.ebaystatic.com/aw/pics/buttons/btnsquareltArrowoff.gif\",\"nextDisabled\":\"http://q.ebaystatic.com/aw/pics/buttons/btnsquarertArrowoff.gif\"},htmlId:\"ResultSet\",pagination:{\"pageSize\":50,\"totalPages\":8,\"state\":\"Page\",\"paginationTesting\":false,\"currentPage\":1,\"itemCount\":50,\"baseUrl\":\"/Health-Beauty-/26395/i.html?_nkw=test&rt=nc&_catref=1&_odkw=ipod&_osacat=0&_sac=1&_trksid=null\",\"pageParam\":\"_pgn\"},page:p1_4});};_r.put('0',new vjo.darwin.domain.jaguar.autofill.AutoFillInput(\"v4-1\", {\"layer\":\"v4-2\",\"sugg\":\"http://include.ebaystatic.com\",\"site\":0,\"prod\":\"http://catalog.ebay.com\",\"input\":\"_nkw_id\",\"versions\":{\"1\":\"1290725330\",\"2\":\"1213421493\"},\"trk\":{\"hide\":null,\"sugg\":null,\"prod\":null,\"logo\":null,\"recent\":null,\"show\":null},\"auto\":\"v4-1\"})); _r.put('1',new vjo.darwin.domain.jaguar.component.findingsearchbar.FindingSearchBar(\"v4-0\", {\"trksid\":\"\",\"submit\":\"q_3\"})); _r.put('2',new vjo.darwin.domain.jaguar.navigation.aspects.AspectPanel(\"v4-7\", {\"clearUrl\":null,\"groupingSeparator\":\",\",\"categoryHtmlId\":\"v4-18\",\"decimalSeparator\":\".\",\"constraints\":[],\"title\":\"Refine search\",\"trkID\":null,\"aspects\":[{\"enabled\":true,\"config\":null,\"title\":\"Condition\",\"expanded\":true,\"type\":\"DefaultAspectRollupModel.boolean\",\"id\":\"v4-8\",\"name\":\"LH_ItemCondition\"},{\"enabled\":true,\"config\":{\"pattern\":\"Sn\",\"buttons\":{\"submitDisabled\":\"http://p.ebaystatic.com/aw/pics/icon/iconMoveRtDisabled_20x20.gif\",\"submitEnabled\":\"http://p.ebaystatic.com/aw/pics/icon/iconMoveRt_20x20.gif\"},\"ranges\":[{\"ct\":0,\"value\":\"0.00..0.00\",\"display\":\"0.00..0.00\",\"cdt\":1,\"selected\":false,\"description\":null,\"disabled\":false,\"count\":0}],\"symbol\":\"$\"},\"title\":\"Price\",\"expanded\":true,\"type\":\"PriceAspectRollupModel.form\",\"id\":\"v4-14\",\"name\":\"LH_Price\"},{\"enabled\":true,\"config\":null,\"title\":\"Seller\",\"expanded\":true,\"type\":\"DefaultAspectRollupModel.boolean\",\"id\":\"v4-15\",\"name\":\"LH_FromSellers\"},{\"enabled\":true,\"config\":null,\"title\":\"Location\",\"expanded\":true,\"type\":\"DefaultAspectRollupModel.Group\",\"id\":\"v4-16\",\"name\":\"LH_PrefLoc\"}],\"name\":\"NavigationPanel\",\"disabled\":false,\"baseUrl\":\"/Health-Beauty-/26395/i.html?_nkw=test&_catref=1&_odkw=ipod&_osacat=0&_sac=1&_trksid=\",\"disableStateMgr\":false}, \"gry-flp\", false)); _r.put('3',new vjo.darwin.domain.jaguar.rollup.RollupPanel(\"v4-18\", \"Categories\", true, true)); _r.put('4',new vjo.darwin.domain.jaguar.navigation.NavigationPanel({\"clearAllText\":\"Clear All\",\"clearId\":\"navClr\",\"clearText\":\"Clear\",\"id\":\"v4-6\"})); _r.put('5',$o5(\"v4-19\",\"Page $Current$ of $Total$\")); _r.put('6',new vjo.darwin.domain.ds.sortby.SortbyDropdown({\"ajax\":false,\"sortBaseURL\":\"http://health-beauty.srchrecover.vip.ebay.com/Health-Beauty-/26395/i.html?_nkw=test&rt=nc&_catref=1&_odkw=ipod&_osacat=0&_sac=1&_trksid=\",\"sortId\":\"v4-20\",\"sortLinks\":[{\"value\":\"1\",\"isSelected\":true,\"type\":\"TimeEndingSoonest\",\"sortParameter\":\"&_sop=1\"},{\"value\":\"10\",\"isSelected\":false,\"type\":\"TimeNewlyListed\",\"sortParameter\":\"&_sop=10\"},{\"value\":\"3\",\"isSelected\":false,\"type\":\"PriceHighestFirst\",\"sortParameter\":\"&_sop=3\"},{\"value\":\"2\",\"isSelected\":false,\"type\":\"PriceLowestFirst\",\"sortParameter\":\"&_sop=2\"}]})); _r.put('7',$o5(\"v4-26\",\"Page <i>$Current$ of $Total$<\\/i>\")); _r.put('8',new vjo.darwin.domain.jaguar.resultset.ResultSet(\"ResultSet\", {\"resultsId\":\"v4-22\",\"inlineRefresh\":false,\"htmlId\":\"ResultSet\",\"tracking\":false,\"pagination\":{\"pageSize\":50,\"totalPages\":8,\"state\":\"Page\",\"paginationTesting\":false,\"currentPage\":1,\"itemCount\":50,\"baseUrl\":\"/Health-Beauty-/26395/i.html?_nkw=test&rt=nc&_catref=1&_odkw=ipod&_osacat=0&_sac=1&_trksid=null\",\"pageParam\":\"_pgn\"},\"type\":\"USE_DEFAULT\"})); })();</script><script type=\"text/javascript\">vjo.ctype(\"vjo.dsf.FirePageLoad\").endType();if(typeof(oGaugeInfo)!=\"undefined\"){oGaugeInfo.iLoadST=(new Date()).getTime();}\n" + 
"vjo.dsf.EventDispatcher.load(document.body);\n" + 
"</script>\n");// line 67
p("\n" + 
"</body>\n" + 
"</html>\n");// line 100

	}

}