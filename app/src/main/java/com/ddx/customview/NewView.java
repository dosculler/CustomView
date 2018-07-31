package com.ddx.customview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Environment;
import android.util.AttributeSet;
import android.view.View;

import java.io.File;

/**
 * Created by dingdx on 2018/7/19.
 */

public class NewView extends View {
    Paint mPaint = new Paint();
    Bitmap mBitmap;

    public NewView(Context context) {
        super(context);
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.STROKE);
        mBitmap = BitmapFactory.decodeFile(Environment.getDataDirectory().getPath() + File.separator + "11.jpg");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 不建议在onDraw做任何分配内存的操作
        if(mBitmap != null) {
            canvas.drawBitmap(mBitmap,0,0,mPaint);
        }
        /*mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        //mPaint.setColor(Color.BLUE);
        mPaint .setColor(Color.argb(60, 0, 0, 0));
        canvas.drawCircle(300,300,200,mPaint);*/
    }
}
