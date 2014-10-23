/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.seeedstudio.BLE;

import com.example.seeedstudio.BLE.BuildConfig;
import com.example.seeedstudio.BLE.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

public class SearchDevicesView extends BaseView{
	
	public static final String TAG = "SearchDevicesView";
	public static final boolean D  = BuildConfig.DEBUG; 
	
	@SuppressWarnings("unused")
	private long TIME_DIFF = 1500;
	
	int[] lineColor = new int[]{0x7B, 0x7B, 0x7B};
	int[] innerCircle0 = new int[]{0xb9, 0xff, 0xFF};
	int[] innerCircle1 = new int[]{0xdf, 0xff, 0xFF};
	int[] innerCircle2 = new int[]{0xec, 0xff, 0xFF};
	
	int[] argColor = new int[]{0xF3, 0xf3, 0xfa};
	
	private float offsetArgs = 0;
	private boolean isSearching = false;
	private Bitmap bitmap;
	private Bitmap bitmap1;
	private Bitmap bitmap2;
	
	public boolean isSearching() {
		return isSearching;
	}

	public void setSearching(boolean isSearching) {
		this.isSearching = isSearching;
		offsetArgs = 0;
		//invalidate();
		postInvalidate();
	}

	public SearchDevicesView(Context context) {
		super(context);
		initBitmap();
	}
	
	public SearchDevicesView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initBitmap();
	}

	public SearchDevicesView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initBitmap();
	}
	
	private void initBitmap(){
		if(bitmap == null){
			bitmap = Bitmap.createBitmap(BitmapFactory.decodeResource(context.getResources(), R.drawable.gplus_search_bg));
		}
		if(bitmap1 == null){
			bitmap1 = Bitmap.createBitmap(BitmapFactory.decodeResource(context.getResources(), R.drawable.locus_round_click));
		}
		if(bitmap2 == null){
			bitmap2 = Bitmap.createBitmap(BitmapFactory.decodeResource(context.getResources(), R.drawable.gplus_search_args));
		}
	}

	@SuppressLint("DrawAllocation")
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);	
		canvas.drawBitmap(bitmap, getWidth() / 2 - bitmap.getWidth() / 2, getHeight() / 2 - bitmap.getHeight() / 2, null);
		//bitmap2 = Bitmap.createBitmap(BitmapFactory.decodeResource(context.getResources(), R.drawable.gplus_search_args));
		if(isSearching){
			bitmap2 = Bitmap.createBitmap(BitmapFactory.decodeResource(context.getResources(), R.drawable.gplus_search_args));
			Rect rMoon = new Rect(getWidth()/2-bitmap2.getWidth(),getHeight()/2,getWidth()/2,getHeight()/2+bitmap2.getHeight()); 
			canvas.rotate(offsetArgs,getWidth()/2,getHeight()/2);
			canvas.drawBitmap(bitmap2,null,rMoon,null);
			offsetArgs = offsetArgs + 3;
		}else{
			
			//canvas.drawBitmap(bitmap2,  getWidth() / 2  - bitmap2.getWidth() , getHeight() / 2, null);
		}
		
		canvas.drawBitmap(bitmap1,  getWidth() / 2 - bitmap1.getWidth() / 2, getHeight() / 2 - bitmap1.getHeight() / 2, null);
		
		if(isSearching) invalidate();
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {	
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:		
			handleActionDownEvenet(event);
			return true;
		case MotionEvent.ACTION_MOVE: 
			return true;
		case MotionEvent.ACTION_UP:
			return true;
		}
		return super.onTouchEvent(event);
	}
	
	public boolean getValidTouchEvent(MotionEvent event){
		RectF rectF = new RectF(getWidth() / 2 - bitmap1.getWidth() / 2, 
				getHeight() / 2 - bitmap1.getHeight() / 2, 
				getWidth() / 2 + bitmap1.getWidth() / 2, 
				getHeight() / 2 + bitmap1.getHeight() / 2);

		if(rectF.contains(event.getX(), event.getY())){
			return true;
		}
		return false;
	}
	
	private void handleActionDownEvenet(MotionEvent event){
		if(getValidTouchEvent(event)){
			if(D) Log.d(TAG, "click search device button");
			if(!isSearching()) {
				setSearching(true);
			}else{
				setSearching(false);
			}
		}
	}
}