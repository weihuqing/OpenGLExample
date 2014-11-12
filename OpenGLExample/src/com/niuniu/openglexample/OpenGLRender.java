package com.niuniu.openglexample;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLSurfaceView.Renderer;

public class OpenGLRender implements Renderer
{
    
    @Override
    public void onDrawFrame(GL10 gl)
    {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height)
    {
        // TODO Auto-generated method stub
        
        // 设置背景色
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.5f);
        // 设置两点间颜色插值方式，一般为GL_SMOOTH（默认），即平滑插值
        gl.glShadeModel(GL10.GL_SMOOTH);
        // 指定深度缓冲区的清除值
        gl.glClearDepthf(1.0f);
        // 启用深度测试模式，当两个图相加时，取深度较大的值显示
        // 关闭时使用此语句：gl.glDisable(GL10.GL_DEPTH_TEST);
        gl.glEnable(GL10.GL_DEPTH_TEST);
        // 如果输入的深度值小于或等于参考值，则通过，必须先写上面的Test语句
        gl.glDepthFunc(GL10.GL_LEQUAL);
    }
    
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config)
    {
        // TODO Auto-generated method stub
        
    }
    
}
