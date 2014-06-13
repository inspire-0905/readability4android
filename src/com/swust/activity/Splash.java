package com.swust.activity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * @Title: Splash.java
 * @Package com.swust.activity
 * @Description: TODO(添加描述)
 * @author lichen8974#gmail.com
 * @date 2014-6-3 下午11:59:12
 * @version V1.0
 */
public class Splash extends BaseActivity {

	private ImageView mImageViewLogo;
	private ImageView mImageViewStartBtn;

	private RelativeLayout mContainerBackground;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activty_splash);
		mImageViewLogo = (ImageView) findViewById(R.id.img_logo);
		mImageViewStartBtn = (ImageView) findViewById(R.id.img_start_btn);
		mContainerBackground = (RelativeLayout) findViewById(R.id.container_background);
		startAnimation();

	}

	public void startAnimation() {
		float height = getWindow().getDecorView().getHeight()
				- mImageViewStartBtn.getHeight();
		System.out.println(getWindow().getDecorView().getHeight() + "   "
				+ mImageViewStartBtn.getHeight());
		AnimatorSet as = new AnimatorSet();
		ObjectAnimator transAnimBtn = ObjectAnimator.ofFloat(
				mImageViewStartBtn, "translationY", 200, 0);
		ObjectAnimator alphaAnimBtn = ObjectAnimator.ofFloat(
				mImageViewStartBtn, "alpha", 0f, 1f);
		ObjectAnimator scaleXAnimBackground = ObjectAnimator.ofFloat(
				mContainerBackground, "scaleX", 1.5f, 1f);
		ObjectAnimator scaleYAnimBackground = ObjectAnimator.ofFloat(
				mContainerBackground, "scaleY", 1.5f, 1f);
		ObjectAnimator transAnimLogo = ObjectAnimator.ofFloat(mImageViewLogo,
				"translationY", -200, 0);
		ObjectAnimator alphaAnimLogo = ObjectAnimator.ofFloat(mImageViewLogo,
				"alpha", 0f, 1f);
		as.setDuration(3000);
		as.playTogether(transAnimBtn, alphaAnimBtn, scaleXAnimBackground,
				scaleYAnimBackground, transAnimLogo, alphaAnimLogo);
		as.start();
	}

	@Override
	protected void onStart() {
		super.onStart();
	}

}
