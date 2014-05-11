package com.swust.activity;

import com.swust.SerializationDeserialization4Json.http.ModelResponseHandler;
import com.swust.model.Article;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/** 
 * @Title: HomeActivity.java 
 * @Package com.swust.activity 
 * @Description: TODO(添加描述) 
 * @author lichen8974#gmail.com 
 * @date 2014-5-12 上午12:18:32 
 * @version V1.0 
 */
public class HomeActivity extends BaseActivity{

	private WebView mWebView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mWebView=(WebView)findViewById(R.id.webview_show);
		mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.getSettings().setBuiltInZoomControls(true);
		mWebView.setWebViewClient(new ArticleWebClient());
		client.parseArticle(this, "http://jianshu.io/p/e95259378a34", new ModelResponseHandler<Article>(Article.class){

			@Override
			public void onSuccess(int status, Article model) {
				
				mWebView.loadDataWithBaseURL(null,model.content, "text/html", "utf-8",null);
			}
			
		});
	}
	
	
	class ArticleWebClient extends WebViewClient{
		
	}
}
