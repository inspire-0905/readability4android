package com.swust.activity;

import android.os.Bundle;

import com.swust.app.ReadAbilityClient;

/** 
 * @Title: BaseActivity.java 
 * @Package com.swust.activity 
 * @Description: TODO(添加描述) 
 * @author lichen8974#gmail.com 
 * @date 2014-5-12 上午12:15:28 
 * @version V1.0 
 */
public class BaseActivity extends SwustActivity<ReadAbilityClient> {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		client=getClient();
	}

	@Override
	public ReadAbilityClient getClient() {
		return ReadAbilityClient.getInstanse();
	}

}
