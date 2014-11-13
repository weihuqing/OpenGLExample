package com.niuniu.openglexample;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class OpenGLActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
        // 设置为无标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_open_gl);
        // 设置为无状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        GLSurfaceView glSurfaceView = new GLSurfaceView(this);
        OpenGLRender render = new OpenGLRender();
        
        glSurfaceView.setRenderer(render);
        
        setContentView(glSurfaceView);
    }
    
    
}
