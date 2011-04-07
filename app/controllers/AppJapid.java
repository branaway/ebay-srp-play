package controllers;

import cn.bran.japid.template.RenderResult;
import cn.bran.play.JapidController;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import play.libs.WS;
import play.mvc.Controller;
import utils.Ebay;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppJapid extends JapidController {
	private static final Logger LOGGER = Logger.getLogger("buyexp-play");

	public static void index() {
		final String query = request.params.get("_nkw");
		if (null != query && query.length() > 0) {
			String encoded;
			try {
				encoded = URLEncoder.encode(query, "UTF-8");
			} catch (UnsupportedEncodingException uee) {
				LOGGER.log(Level.WARNING, uee.getLocalizedMessage(), uee);
				encoded = URLEncoder.encode(query);
			}

			final String mode = request.params.get("_mode");
			final String skipRender = request.params.get("_skiprender");
			if ("async".equals(mode)) {
				doAsync(encoded, "true".equals(skipRender));
			} else {
				doSync(encoded, "true".equals(skipRender));
			}
		} else {
//			renderJapid((Object[])null);
			
// static linking is slightly faster!
			render(new japidviews.AppJapid.index().render(null));
		}
	}

	private static void doSync(final String query, final boolean skipPender) {
		// final String url =
		// "http://svcs.ebay.com/services/search/FindingService/v1?OPERATION-NAME=findItemsByKeywords&"
		// +
		// "SERVICE-VERSION=1.8.0&SECURITY-APPNAME=Foobat96e-1d23-4ae7-8e15-e5874c9cd58&"
		// +
		// "RESPONSE-DATA-FORMAT=JSON&REST-PAYLOAD&" +
		// "keywords=" + query + "&paginationInput.entriesPerPage=50&" +
		// "outputSelector%280%29=SellerInfo&outputSelector%281%29=CategoryHistogram";
		// final JsonElement results = WS.url(url).get().getJson();
		final JsonElement results = Ebay.getJsonLocal();
		if (!skipPender) {
//			renderJapidWith(AppJapid.class.getSimpleName() + "/index.html", results);
// static linking is slightly faster!
			render(new japidviews.AppJapid.index().render((JsonObject) results));
		}
	}

	private static void doAsync(final String query, boolean skipPender) {
		if (request.isNew) {
			if (null != query && query.length() > 0) {
				String encoded;
				try {
					encoded = URLEncoder.encode(query, "UTF-8");
				} catch (UnsupportedEncodingException uee) {
					LOGGER.log(Level.WARNING, uee.getLocalizedMessage(), uee);
					encoded = URLEncoder.encode(query);
				}
				final String url = "http://svcs.ebay.com/services/search/FindingService/v1?OPERATION-NAME=findItemsByKeywords&" +
						"SERVICE-VERSION=1.8.0&SECURITY-APPNAME=Foobat96e-1d23-4ae7-8e15-e5874c9cd58&" +
						"RESPONSE-DATA-FORMAT=JSON&REST-PAYLOAD&" +
						"keywords=" + encoded + "&paginationInput.entriesPerPage=50&" +
						"outputSelector%280%29=SellerInfo&outputSelector%281%29=CategoryHistogram";
				final Future<play.libs.WS.HttpResponse> future = WS.url(url).getAsync();
				request.args.put("f", future);
				waitFor(future);
			} else {
				renderJapid();
			}
		} else {
			if (!skipPender) {
				try {
					final Future<play.libs.WS.HttpResponse> future = (Future<play.libs.WS.HttpResponse>) request.args.get("f");
					WS.HttpResponse response = future.get();
					final JsonElement results = response.getJson();
					renderJapid(results);
				} catch (final InterruptedException ie) {
					ie.printStackTrace();
					response.status = 500;
				} catch (final ExecutionException ee) {
					ee.printStackTrace();
					response.status = 500;
				}
			}
		}
	}

	public static void search() {
		renderJapid();
	}
}
