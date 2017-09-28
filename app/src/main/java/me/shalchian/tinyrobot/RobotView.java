package me.shalchian.tinyrobot;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;


public class RobotView extends View {

  private float mAngle;


  public RobotView(Context context) {
    super(context);
    init(null, 0);
  }

  public RobotView(Context context, AttributeSet attrs) {
    super(context, attrs);
    init(attrs, 0);
  }

  public RobotView(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
    init(attrs, defStyle);
  }

  private void init(AttributeSet attrs, int defStyle) {
    // Load attributes
    final TypedArray a = getContext().obtainStyledAttributes(
      attrs, R.styleable.RobotView, defStyle, 0);

    mAngle = a.getFloat(R.styleable.RobotView_angle, 0);

    a.recycle();

  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    RobotStyleKit.drawAndroid_Robot(canvas , new RectF(0, 0 , getWidth() , getHeight()) , RobotStyleKit.ResizingBehavior.AspectFit , mAngle);
  }

  public void setAngle(float angle) {
    mAngle = angle;
    invalidate();
  }
}
