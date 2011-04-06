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
// NOTE: This file was generated from: japidviews/_tags/leftpanel.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class leftpanel extends cn.bran.japid.template.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/_tags/leftpanel.html";
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


	public leftpanel() {
		super(null);
	}
	public leftpanel(StringBuilder out) {
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
p("<div class=\"ff-left\" id=\"ff-left\">\n" + 
"  <div id=\"LeftPanel\">\n" + 
"    <div id=\"v4-6\" class=\"navp ff-rail\">\n" + 
"      <!--  Category List -->\n" + 
"      <div id=\"v4-18\" class=\"ds-rlp hier\" style=\"display: block;\">\n" + 
"        <div id=\"e3\" class=\"rlp-h\">\n" + 
"          <span class=\"rlp-x\"></span>\n" + 
"\n" + 
"          <div class=\"rlp-t\">\n" + 
"            <h3 class=\"asr-tl\">Categories</h3>\n" + 
"          </div>\n" + 
"        </div>\n" + 
"\n" + 
"        <div class=\"rlp-b\" style=\"\">\n" + 
"          <div class=\"rlp-c\">\n" + 
"            <div id=\"v4-17\" class=\"hlist\">\n" + 
"              <!-- BEGIN CATEGORY -->\n" + 
"              <div class=\"hnode\"> <!-- Primary category name link -->\n" + 
"\n" + 
"                ");// line 3
if(asBoolean(results)) {// line 24
                  for (JsonElement category: JsonUtils.getArray(results, "findItemsByKeywordsResponse.0.categoryHistogramContainer.0.categoryHistogram")){// line 25
p("                    <div class=\"hlink\">\n" + 
"                      <a id=\"{TOP_E_NAME}\" href=\"{TOP_CATEGORY_URL}\" role=\"menuitem\"\n" + 
"                         class=\"lnk\" role=\"menuitem\">");// line 25
p(JsonUtils.getString(category, "categoryName.0"));// line 28
p(" </a>&nbsp;<span\n" + 
"                      class=\"cnt\">(");// line 28
p(JsonUtils.getString(category, "count.0"));// line 29
p(")</span>\n" + 
"                    </div>\n" + 
"                    <!-- BEGIN CATEGORY_LINK -->\n" + 
"                    ");// line 29
for (JsonElement child : JsonUtils.getArray(category, "childCategoryHistogram")){// line 32
p("                      <div class=\"hnode\">\n" + 
"                        <div class=\"hlink\">\n" + 
"                          <a id=\"{E_NAME}\" href=\"{CATEGORY_URL}\"\n" + 
"                             class=\"lnk\" role=\"menuitem\">");// line 32
p(JsonUtils.getString(child, "categoryName.0"));// line 36
p(" </a>&nbsp;<span\n" + 
"                          class=\"cnt\">(");// line 36
p(JsonUtils.getString(child, "count.0"));// line 37
p(")</span>\n" + 
"                        </div>\n" + 
"                      </div>\n" + 
"                    ");// line 37
}// line 40
p("                    <!-- END CATEGORY_LINK -->\n" + 
"                  ");// line 40
}// line 42
                }// line 43
p("              </div>\n" + 
"              <!-- END CATEGORY -->\n" + 
"\n" + 
"              <!-- BEGIN ALL_CATEGORY_LINK -->\n" + 
"              <div class=\"hnode g-novisited\">\n" + 
"                <div class=\"hlink\">\n" + 
"                  <a id=\"{ALL_CAT_E_NAME}\" href=\"{ALL_CATEGORIES_URL}\"\n" + 
"                     class=\"lnk\" role=\"menuitem\">See all categories</a>\n" + 
"                </div>\n" + 
"              </div>\n" + 
"              <!-- END ALL_CATEGORY_LINK -->\n" + 
"\n" + 
"              <!-- BEGIN EXPANDED_ALL_CATEGORIES -->\n" + 
"              <div class=\"hnode\">\n" + 
"                <div class=\"hlink\">\n" + 
"                  <a id=\"{E_NAME}\" href=\"{CATEGORY_URL}\"\n" + 
"                     class=\"lnk\" role=\"menuitem\">{CAT_NAME}</a>&nbsp;<span class=\"cnt\">({ITEM_COUNT}\n" + 
"                  )</span>\n" + 
"                </div>\n" + 
"              </div>\n" + 
"              <!-- END EXPANDED_ALL_CATEGORIES -->\n" + 
"\n" + 
"\n" + 
"            </div>\n" + 
"          </div>\n" + 
"        </div>\n" + 
"      </div>\n" + 
"      <!--  End category list -->\n" + 
"\n" + 
"      <!-- Condition Aspect -->\n" + 
"      <div id=\"v4-7\" class=\"asp\">\n" + 
"        <!--  Start Condition -->\n" + 
"        <div id=\"v4-8\" class=\"ds-rlp asr\" style=\"display: block;\">\n" + 
"          <div id=\"e19\" class=\"rlp-h\">\n" + 
"            <span class=\"rlp-x\"></span>\n" + 
"\n" + 
"            <div class=\"rlp-t\">\n" + 
"              <h3 class=\"asr-tl\">Condition</h3>\n" + 
"            </div>\n" + 
"          </div>\n" + 
"\n" + 
"          <div class=\"rlp-b\" style=\"\">\n" + 
"            <div class=\"rlp-c\">\n" + 
"              <div id=\"e15\" class=\"asr-b\">\n" + 
"                <div class=\"asr-v asr-nd\">\n" + 
"                  <a id=\"e16\" href=\n" + 
"                    \"{SEARCH_URL}?_nkw=test&amp;LH_ItemCondition=1&amp;_odkw=&amp;_osacat=0&amp;_trksid=\"\n" + 
"                     name=\"e16\"><b></b>New</a>\n" + 
"                </div>\n" + 
"\n" + 
"                <div class=\"asr-v asr-nd\">\n" + 
"                  <a id=\"e17\" href=\n" + 
"                    \"{SEARCH_URL}?_nkw=test&amp;LH_ItemCondition=2&amp;_odkw=&amp;_osacat=0&amp;_trksid=\"\n" + 
"                     name=\"e17\"><b></b>Used</a>\n" + 
"                </div>\n" + 
"\n" + 
"                <div class=\"asr-v asr-nd\">\n" + 
"                  <a id=\"e18\" href=\n" + 
"                    \"{SEARCH_URL}?_nkw=test&amp;LH_ItemCondition=0&amp;_odkw=&amp;_osacat=0&amp;_trksid=\"\n" + 
"                     name=\"e18\"><b></b>Not specified</a>\n" + 
"                </div>\n" + 
"\n" + 
"                <div class=\"asr-v asr-md\"></div>\n" + 
"              </div>\n" + 
"            </div>\n" + 
"          </div>\n" + 
"        </div>\n" + 
"        <!--  End Condition -->\n" + 
"\n" + 
"        <!-- Start Price -->\n" + 
"        <div id=\"v4-14\" class=\"ds-rlp asr\" style=\"display: block;\">\n" + 
"          <div id=\"e22\" class=\"rlp-h\">\n" + 
"            <span class=\"rlp-x\"></span>\n" + 
"\n" + 
"            <div class=\"rlp-t\">\n" + 
"              <h3 class=\"asr-tl\">Price</h3>\n" + 
"            </div>\n" + 
"          </div>\n" + 
"\n" + 
"          <div class=\"rlp-b\" style=\"\">\n" + 
"            <div class=\"rlp-c\">\n" + 
"              <div id=\"e20\" class=\"asr-b\">\n" + 
"                <form id=\"e21\" method=\"get\" class=\"asr-price\">\n" + 
"                  <div class=\"asr-e\">\n" + 
"                    <div id=\"EnterPrice\" class=\"msg\">\n" + 
"                      Please enter a minimum and/or maximum price before continuing.\n" + 
"                    </div>\n" + 
"                  </div>\n" + 
"\n" + 
"                  <div class=\"range\">\n" + 
"                    <input id=\"v4-13\" name=\"_mPrRngCbx\" value=\"1\" type=\"hidden\"/>$\n" + 
"                    <label class=\"g-hdn\" for=\"v4-11\">Enter minimum price</label>\n" + 
"                    <input id=\"v4-11\" name=\"_udlo\" size=\"6\" maxlength=\"13\" class=\n" + 
"                      \"price\" type=\"text\"/> to $ <label class=\"g-hdn\" for=\"v4-12\">Enter\n" + 
"                    maximum price</label> <input id=\"v4-12\" name=\"_udhi\" size=\"6\"\n" + 
"                                                 maxlength=\"13\" class=\"price\" type=\"text\"/> <input\n" + 
"                    disabled=\n" + 
"                      \"disabled\" id=\"q_6\" class=\"submit\" type=\"button\"/>&nbsp;\n" + 
"                  </div>\n" + 
"                </form>\n" + 
"              </div>\n" + 
"            </div>\n" + 
"          </div>\n" + 
"        </div>\n" + 
"        <!--  End Price -->\n" + 
"\n" + 
"        <!--  Start Seller -->\n" + 
"        <div id=\"v4-15\" class=\"ds-rlp asr\" style=\"display: block;\">\n" + 
"          <div id=\"e25\" class=\"rlp-h\">\n" + 
"            <span class=\"rlp-x\"></span>\n" + 
"\n" + 
"            <div class=\"rlp-t\">\n" + 
"              <h3 class=\"asr-tl\">Seller</h3>\n" + 
"            </div>\n" + 
"          </div>\n" + 
"\n" + 
"          <div class=\"rlp-b\" style=\"\">\n" + 
"            <div class=\"rlp-c\">\n" + 
"              <div id=\"e23\" class=\"asr-b\">\n" + 
"                <div class=\"asr-v asr-nd\">\n" + 
"                  <a id=\"e24\" href=\n" + 
"                    \"{SEARCH_URL}?_nkw=test&amp;LH_TopRatedSellers=1&amp;_odkw=&amp;_osacat=0&amp;_trksid=\"\n" + 
"                     name=\"e24\"><b></b>eBay Top-rated sellers</a>\n" + 
"                </div>\n" + 
"\n" + 
"                <div class=\"asr-v asr-md\"></div>\n" + 
"              </div>\n" + 
"            </div>\n" + 
"          </div>\n" + 
"        </div>\n" + 
"        <!-- End Seller -->\n" + 
"\n" + 
"        <div id=\"v4-16\" class=\"ds-rlp asr\" style=\"display: block;\">\n" + 
"          <div id=\"e30\" class=\"rlp-h\">\n" + 
"            <span class=\"rlp-x\"></span>\n" + 
"\n" + 
"            <div class=\"rlp-t\">\n" + 
"              <h3 class=\"asr-tl\">Location</h3>\n" + 
"            </div>\n" + 
"          </div>\n" + 
"\n" + 
"          <!-- Start Location -->\n" + 
"          <div class=\"rlp-b\" style=\"\">\n" + 
"            <div class=\"rlp-c\">\n" + 
"              <div id=\"e26\" class=\"asr-b\">\n" + 
"                <div class=\"asr-v asr-nd\">\n" + 
"                  <a id=\"e27\" href=\n" + 
"                    \"{SEARCH_URL}?_nkw=test&amp;LH_PrefLoc=1&amp;_odkw=&amp;_osacat=0&amp;_trksid=\"\n" + 
"                     name=\"e27\"><b></b>US Only</a>\n" + 
"                </div>\n" + 
"\n" + 
"                <div class=\"asr-v asr-nd\">\n" + 
"                  <a id=\"e28\" href=\n" + 
"                    \"{SEARCH_URL}?_nkw=test&amp;LH_PrefLoc=3&amp;_odkw=&amp;_osacat=0&amp;_trksid=\"\n" + 
"                     name=\"e28\"><b></b>North America</a>\n" + 
"                </div>\n" + 
"\n" + 
"                <div class=\"asr-v asr-nd\">\n" + 
"                  <a id=\"e29\" href=\n" + 
"                    \"{SEARCH_URL}?_nkw=test&amp;LH_PrefLoc=2&amp;_odkw=&amp;_osacat=0&amp;_trksid=\"\n" + 
"                     name=\"e29\"><b></b>Worldwide</a>\n" + 
"                </div>\n" + 
"\n" + 
"                <div class=\"asr-v asr-md\"></div>\n" + 
"              </div>\n" + 
"            </div>\n" + 
"          </div>\n" + 
"        </div>\n" + 
"        <!-- End Location -->\n" + 
"\n" + 
"      </div>\n" + 
"    </div>\n" + 
"  </div>\n" + 
"</div>\n" + 
"\n");// line 43

	}

}