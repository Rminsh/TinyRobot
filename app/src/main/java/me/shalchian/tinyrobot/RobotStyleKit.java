package me.shalchian.tinyrobot;

import android.graphics.Paint;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import java.util.Stack;



/**
 * Created by Armin on 9/28/17.
 * Copyright © 2017 Shalchian. All rights reserved.
 */
public class RobotStyleKit {
    
    
    // Resizing Behavior
    public enum ResizingBehavior {
        AspectFit, //!< The content is proportionally resized to fit into the target rectangle.
        AspectFill, //!< The content is proportionally resized to completely fill the target rectangle.
        Stretch, //!< The content is stretched to match the entire target rectangle.
        Center, //!< The content is centered in the target rectangle, but it is NOT resized.
    }
    
    // Canvas Drawings
    // Tab
    
    private static class CacheForAndroid_Robot {
        private static Paint paint = new Paint();
        private static RectF originalFrame = new RectF(0f, 0f, 540f, 450f);
        private static RectF resizedFrame = new RectF();
        private static RectF rectangle2Rect = new RectF();
        private static Path rectangle2Path = new Path();
        private static RectF rectangle3Rect = new RectF();
        private static Path rectangle3Path = new Path();
        private static RectF bezier2Rect = new RectF();
        private static Path bezier2Path = new Path();
        private static RectF bezierRect = new RectF();
        private static Path bezierPath = new Path();
    }
    
    public static void drawAndroid_Robot(Canvas canvas, float angle) {
        RobotStyleKit.drawAndroid_Robot(canvas, new RectF(0f, 0f, 540f, 450f), ResizingBehavior.AspectFit, angle);
    }
    
    public static void drawAndroid_Robot(Canvas canvas, RectF targetFrame, ResizingBehavior resizing, float angle) {
        // General Declarations
        Stack<Matrix> currentTransformation = new Stack<Matrix>();
        currentTransformation.push(new Matrix());
        Paint paint = CacheForAndroid_Robot.paint;
        
        // Local Colors
        int color2 = Color.argb(255, 170, 198, 73);
        
        // Resize to Target Frame
        canvas.save();
        RectF resizedFrame = CacheForAndroid_Robot.resizedFrame;
        RobotStyleKit.resizingBehaviorApply(resizing, CacheForAndroid_Robot.originalFrame, targetFrame, resizedFrame);
        canvas.translate(resizedFrame.left, resizedFrame.top);
        canvas.scale(resizedFrame.width() / 540f, resizedFrame.height() / 450f);
        
        // Rectangle 2
        canvas.save();
        canvas.translate(124.24f, 176.72f);
        currentTransformation.peek().postTranslate(124.24f, 176.72f);
        canvas.rotate(-angle);
        currentTransformation.peek().postRotate(-angle);
        RectF rectangle2Rect = CacheForAndroid_Robot.rectangle2Rect;
        rectangle2Rect.set(-24.24f, -13.72f, 23.76f, 121.28f);
        Path rectangle2Path = CacheForAndroid_Robot.rectangle2Path;
        rectangle2Path.reset();
        rectangle2Path.addRoundRect(rectangle2Rect, 23f, 23f, Path.Direction.CW);
        
        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color2);
        canvas.drawPath(rectangle2Path, paint);
        canvas.restore();
        
        // Rectangle 3
        RectF rectangle3Rect = CacheForAndroid_Robot.rectangle3Rect;
        rectangle3Rect.set(377f, 163f, 425f, 298f);
        Path rectangle3Path = CacheForAndroid_Robot.rectangle3Path;
        rectangle3Path.reset();
        rectangle3Path.addRoundRect(rectangle3Rect, 23f, 23f, Path.Direction.CW);
        
        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color2);
        canvas.drawPath(rectangle3Path, paint);
        
        // Bezier 2
        RectF bezier2Rect = CacheForAndroid_Robot.bezier2Rect;
        bezier2Rect.set(161f, 52.85f, 364f, 158f);
        Path bezier2Path = CacheForAndroid_Robot.bezier2Path;
        bezier2Path.reset();
        bezier2Path.moveTo(319.97f, 53.1f);
        bezier2Path.cubicTo(321.21f, 53.7f, 321.74f, 55.2f, 321.13f, 56.44f);
        bezier2Path.lineTo(312.71f, 73.88f);
        bezier2Path.cubicTo(312.71f, 73.88f, 310.98f, 77.45f, 309.01f, 81.54f);
        bezier2Path.cubicTo(341.67f, 95.83f, 364f, 124.71f, 364f, 158f);
        bezier2Path.lineTo(161f, 158f);
        bezier2Path.cubicTo(161f, 133.87f, 172.73f, 112.06f, 191.62f, 96.44f);
        bezier2Path.cubicTo(198.1f, 91.08f, 205.43f, 86.45f, 213.41f, 82.71f);
        bezier2Path.cubicTo(210.94f, 78.43f, 208.68f, 74.51f, 208.68f, 74.51f);
        bezier2Path.cubicTo(198.99f, 57.73f, 198.99f, 57.73f, 198.99f, 57.73f);
        bezier2Path.cubicTo(198.3f, 56.54f, 198.71f, 55.01f, 199.91f, 54.32f);
        bezier2Path.cubicTo(201.1f, 53.63f, 202.63f, 54.04f, 203.32f, 55.23f);
        bezier2Path.lineTo(213.01f, 72.01f);
        bezier2Path.cubicTo(213.01f, 72.01f, 215.44f, 76.23f, 218.01f, 80.68f);
        bezier2Path.cubicTo(219.33f, 80.13f, 220.67f, 79.61f, 222.02f, 79.11f);
        bezier2Path.cubicTo(234.42f, 74.54f, 248.11f, 72f, 262.5f, 72f);
        bezier2Path.cubicTo(277.43f, 72f, 291.61f, 74.73f, 304.37f, 79.64f);
        bezier2Path.cubicTo(306.41f, 75.43f, 308.2f, 71.71f, 308.2f, 71.71f);
        bezier2Path.cubicTo(316.63f, 54.27f, 316.63f, 54.27f, 316.63f, 54.27f);
        bezier2Path.cubicTo(316.98f, 53.55f, 317.62f, 53.08f, 318.33f, 52.92f);
        bezier2Path.cubicTo(318.86f, 52.8f, 319.44f, 52.85f, 319.97f, 53.1f);
        bezier2Path.close();
        bezier2Path.moveTo(309f, 110f);
        bezier2Path.cubicTo(305.83f, 110f, 303f, 111.48f, 301.17f, 113.78f);
        bezier2Path.cubicTo(299.81f, 115.49f, 299f, 117.65f, 299f, 120f);
        bezier2Path.cubicTo(299f, 125.52f, 303.48f, 130f, 309f, 130f);
        bezier2Path.cubicTo(314.52f, 130f, 319f, 125.52f, 319f, 120f);
        bezier2Path.cubicTo(319f, 114.48f, 314.52f, 110f, 309f, 110f);
        bezier2Path.close();
        bezier2Path.moveTo(219f, 110f);
        bezier2Path.cubicTo(216.71f, 110f, 214.61f, 110.77f, 212.92f, 112.06f);
        bezier2Path.cubicTo(210.54f, 113.89f, 209f, 116.76f, 209f, 120f);
        bezier2Path.cubicTo(209f, 125.52f, 213.48f, 130f, 219f, 130f);
        bezier2Path.cubicTo(224.52f, 130f, 229f, 125.52f, 229f, 120f);
        bezier2Path.cubicTo(229f, 114.48f, 224.52f, 110f, 219f, 110f);
        bezier2Path.close();
        
        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color2);
        canvas.drawPath(bezier2Path, paint);
        
        // Bezier
        RectF bezierRect = CacheForAndroid_Robot.bezierRect;
        bezierRect.set(161f, 163f, 364f, 405f);
        Path bezierPath = CacheForAndroid_Robot.bezierPath;
        bezierPath.reset();
        bezierPath.moveTo(196.16f, 163f);
        bezierPath.lineTo(364f, 163f);
        bezierPath.lineTo(364f, 299.84f);
        bezierPath.cubicTo(364f, 309.96f, 364f, 315.03f, 362.49f, 319.59f);
        bezierPath.lineTo(362.28f, 320.48f);
        bezierPath.cubicTo(360.11f, 326.43f, 355.43f, 331.11f, 349.48f, 333.28f);
        bezierPath.cubicTo(344.03f, 335f, 338.96f, 335f, 328.84f, 335f);
        bezierPath.lineTo(196.16f, 335f);
        bezierPath.cubicTo(186.04f, 335f, 180.97f, 335f, 176.41f, 333.49f);
        bezierPath.lineTo(175.52f, 333.28f);
        bezierPath.cubicTo(169.57f, 331.11f, 164.89f, 326.43f, 162.72f, 320.48f);
        bezierPath.cubicTo(161f, 315.03f, 161f, 309.96f, 161f, 299.84f);
        bezierPath.lineTo(161f, 163f);
        bezierPath.lineTo(196.16f, 163f);
        bezierPath.close();
        bezierPath.moveTo(217.5f, 335f);
        bezierPath.lineTo(217.5f, 335f);
        bezierPath.lineTo(240f, 335f);
        bezierPath.lineTo(240f, 370f);
        bezierPath.cubicTo(240f, 382.5f, 240f, 382.5f, 240f, 382.5f);
        bezierPath.lineTo(240f, 382.5f);
        bezierPath.cubicTo(240f, 394.93f, 229.93f, 405f, 217.5f, 405f);
        bezierPath.lineTo(217.5f, 405f);
        bezierPath.lineTo(217.5f, 405f);
        bezierPath.lineTo(217.5f, 405f);
        bezierPath.lineTo(217.5f, 405f);
        bezierPath.lineTo(217.5f, 405f);
        bezierPath.cubicTo(205.07f, 405f, 195f, 394.93f, 195f, 382.5f);
        bezierPath.lineTo(195f, 382.5f);
        bezierPath.lineTo(195f, 382.5f);
        bezierPath.lineTo(195f, 335f);
        bezierPath.lineTo(217.5f, 335f);
        bezierPath.close();
        bezierPath.moveTo(306.5f, 335f);
        bezierPath.lineTo(306.5f, 335f);
        bezierPath.lineTo(329f, 335f);
        bezierPath.lineTo(329f, 370f);
        bezierPath.cubicTo(329f, 382.5f, 329f, 382.5f, 329f, 382.5f);
        bezierPath.lineTo(329f, 382.5f);
        bezierPath.cubicTo(329f, 394.93f, 318.93f, 405f, 306.5f, 405f);
        bezierPath.lineTo(306.5f, 405f);
        bezierPath.lineTo(306.5f, 405f);
        bezierPath.lineTo(306.5f, 405f);
        bezierPath.lineTo(306.5f, 405f);
        bezierPath.lineTo(306.5f, 405f);
        bezierPath.cubicTo(294.07f, 405f, 284f, 394.93f, 284f, 382.5f);
        bezierPath.lineTo(284f, 382.5f);
        bezierPath.lineTo(284f, 382.5f);
        bezierPath.lineTo(284f, 335f);
        bezierPath.lineTo(306.5f, 335f);
        bezierPath.close();
        
        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color2);
        canvas.drawPath(bezierPath, paint);
        
        canvas.restore();
    }
    
    
    // Resizing Behavior
    public static void resizingBehaviorApply(ResizingBehavior behavior, RectF rect, RectF target, RectF result) {
        if (rect.equals(target) || target == null) {
            result.set(rect);
            return;
        }
        
        if (behavior == ResizingBehavior.Stretch) {
            result.set(target);
            return;
        }
        
        float xRatio = Math.abs(target.width() / rect.width());
        float yRatio = Math.abs(target.height() / rect.height());
        float scale = 0f;
        
        switch (behavior) {
            case AspectFit: {
                scale = Math.min(xRatio, yRatio);
                break;
            }
            case AspectFill: {
                scale = Math.max(xRatio, yRatio);
                break;
            }
            case Center: {
                scale = 1f;
                break;
            }
        }
        
        float newWidth = Math.abs(rect.width() * scale);
        float newHeight = Math.abs(rect.height() * scale);
        result.set(target.centerX() - newWidth / 2,
            target.centerY() - newHeight / 2,
            target.centerX() + newWidth / 2,
            target.centerY() + newHeight / 2);
    }
    
    
}