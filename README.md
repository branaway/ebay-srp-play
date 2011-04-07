This is a sample app used to benchmark Play Framework against Nodejs. See the blog post [Nodejs vs Play for Front-End Apps](http://www.subbu.org/blog/2011/03/nodejs-vs-play-for-front-end-apps) for the context and latest test results.

Note: Not all links on the page may work. The intent is to generate the search result page and nothing more.

To run this app:

* Install Play Framework 1.1.1.
* cd to whereever you cloned this repo
* play run

If you want to suggest tweaks/fixes to the app, please fork the repo, make changes, and send a pull request.

Note: This app uses eBay's publicly available APIs with a developer key, and your usage of this app is subjected to the usual terms and conditions. See http://developer.ebay.com for details.

*************************
bran's note on adding a Japid based front-end.

1. Added new controller that uses Japid to render the data. The new controller can be accessed at 
    http://localhost:9000/AppJapid/index
    
  The old code uses Groovy is still accessible from:
    
    http://localhost:9000/
      
2. The sync method in both controllers used a new local cached json response to effectively eliminate the IO cost.
3. Since Java does not provide a natural nested navigation in Json (Gson in this case) object, I have added a utility to use a simple path notation to navigate in Json object. See the JsonUtils.java.

My system reported that Japid based front-end generated about 200-300% throughput of the Groovy based front-end.

To run the Apache benchmark tool:

ab -k -c 50 -n 100 http://localhost:9000/AppJapid/index?_nkw=GH2&_sacat=0&_odkw=test&_osacat=0&_trksid= 

Or on the old code:

ab -k -c 50 -n 100 http://localhost:9000/?_nkw=GH2&_sacat=0&_odkw=test&_osacat=0&_trksid= 
