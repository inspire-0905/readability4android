package com.swust.app;

import android.content.Context;

import com.loopj.android.http.RequestParams;
import com.swust.SerializationDeserialization4Json.http.APIClient;
import com.swust.SerializationDeserialization4Json.http.DataResponseHandler;

/**
 * @Title: ReadAbilityClient.java
 * @Package com.swust.app
 * @Description: TODO(添加描述)
 * @author lichen8974#gmail.com
 * @date 2014-5-12 上午12:16:27
 * @version V1.0
 */
public class ReadAbilityClient extends APIClient {
	public static final String HOST = "http://www.ctshare.com/";
	public static final String API_PARSE="parse";
	private static ReadAbilityClient singleton;
	private ReadAbilityClient() {
	}

	public static ReadAbilityClient getInstanse() {
		if (singleton == null) {
			singleton = new ReadAbilityClient();
		}
		return singleton;
	}

	@Override
	public String getHost() {
		return HOST;
	}
	
	public void parseArticle(Context context,String urlArticle,DataResponseHandler responseHandler)
	{
		String url=API_PARSE;
		RequestParams params = new RequestParams();
		params.put("url", urlArticle);
		get(context, url, params, responseHandler);
	}
}
