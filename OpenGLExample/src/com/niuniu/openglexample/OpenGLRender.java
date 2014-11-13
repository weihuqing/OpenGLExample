package com.niuniu.openglexample;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;

public class OpenGLRender implements Renderer
{
    
    @Override
    public void onDrawFrame(GL10 gl)
    {
        // TODO Auto-generated method stub
        
        /*
         * 实际完成了把整个窗口清除为黑色的任务，glClearColor、glClearDepthf等等与对应。
         * 分为GL_DEPTH_BUFFER_BIT深度缓冲、GL_ACCUM_BUFFER_BIT累积缓冲、GL_STENCIL_BUFFER_BIT: 模板缓冲
         */
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT | GLES20.GL_DEPTH_BITS);
    }
    
    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height)
    {
        // TODO Auto-generated method stub
        
        // 剪取横坐标0到当前屏幕宽，纵坐标0到当前屏幕高的区域来展示GLSurfaceView，修改了并不改变View大小，清除的背景色依然铺满
        GLES20.glViewport(0, 0, width, height);
    }
    
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config)
    {
        // TODO Auto-generated method stub
        
        // 将颜色清除值设为黑色，
        GLES20.glClearColor(1.0f, 0.0f, 0.0f, 0.0f);
        // 指定深度缓冲区的清除值
        GLES20.glClearDepthf(1.0f);
        // 设置两点间颜色插值方式，一般为GL_SMOOTH（默认），即平滑插值
        gl.glShadeModel(GL10.GL_SMOOTH);
        // 启用深度测试模式，当两个图相加时，取深度较大的值显示
        // 关闭时使用此语句：gl.glDisable(GL10.GL_DEPTH_TEST);
        gl.glEnable(GL10.GL_DEPTH_TEST);
        // 如果输入的深度值小于或等于参考值，则通过，必须先写上面的Test语句
        gl.glDepthFunc(GL10.GL_LEQUAL);
        
        /*
         * 该函数控制OpenGL在某一方面有解释的余地时，所采取的操作行为。
         * 
         */
        gl.glHint(GL10.GL_PERSPECTIVE_CORRECTION_HINT, GL10.GL_NICEST);
    }
    
}
