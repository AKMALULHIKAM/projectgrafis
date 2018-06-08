package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class UASGrafis implements GLEventListener {

    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();
        canvas.addGLEventListener(new UASGrafis());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new Thread(new Runnable() {
                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }

    public void init(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());
        gl.setSwapInterval(1);
        gl.glClearColor(0f, 0f, 0f, 0f);
        gl.glShadeModel(GL.GL_SMOOTH);
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        if (height <= 0) {
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(40.0f, h, 0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void E(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(1, 0, 4);
        gl.glVertex3d(0, 0, 0);
        gl.glVertex3d(4, 0, 0);
        gl.glVertex3d(4, 0, -4);
        gl.glVertex3d(0, 0, -4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1
        gl.glColor3d(0, 0, 1);
        gl.glVertex3d(0, 0, 0);
        gl.glVertex3d(0, 0, -1);
        gl.glVertex3d(0, 5, -1);
        gl.glVertex3d(0, 5, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//2
        gl.glColor3d(0, 0, 1);
        gl.glVertex3d(4, 0, 0);
        gl.glVertex3d(4, 0, -1);
        gl.glVertex3d(4, 5, -1);
        gl.glVertex3d(4, 5, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3
        gl.glColor3d(0, 0, 1);
        gl.glVertex3d(0, 0, -3);
        gl.glVertex3d(0, 0, -4);
        gl.glVertex3d(0, 5, -4);
        gl.glVertex3d(0, 5, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4
        gl.glColor3d(0, 0, 1);
        gl.glVertex3d(4, 0, -3);
        gl.glVertex3d(4, 0, -4);
        gl.glVertex3d(4, 5, -4);
        gl.glVertex3d(4, 5, -3);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//5
        gl.glColor3d(0, 0, 1);
        gl.glVertex3d(0, 4, 0);
        gl.glVertex3d(0, 5, 0);
        gl.glVertex3d(0, 5,-4);
        gl.glVertex3d(0, 4,-4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//6
        gl.glColor3d(0, 0, 1);
        gl.glVertex3d(4, 4, 0);
        gl.glVertex3d(4, 5, 0);
        gl.glVertex3d(4, 5,-4);
        gl.glVertex3d(4, 4,-4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//7
        gl.glColor3d(1, 0, 4);
        gl.glVertex3d(0, 5, 0);
        gl.glVertex3d(4, 5, 0);
        gl.glVertex3d(4, 5,-4);
        gl.glVertex3d(0, 5,-4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//8
        gl.glColor3d(0, 0, 1);
        gl.glVertex3d(0, 2, 0);
        gl.glVertex3d(0, 3, 0);
        gl.glVertex3d(0, 3,-4);
        gl.glVertex3d(0, 2,-4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//9
        gl.glColor3d(0, 0, 1);
        gl.glVertex3d(4, 2, 0);
        gl.glVertex3d(4, 3, 0);
        gl.glVertex3d(4, 3,-4);
        gl.glVertex3d(4, 2,-4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//9
        gl.glColor3d(1, 0, 1);
        gl.glVertex3d(0, 2,-4);
        gl.glColor3d(0, 0, 1);
        gl.glVertex3d(0, 5,-4);
        gl.glColor3d(1, 0, 1);
        gl.glVertex3d(4, 5,-4);
        gl.glColor3d(0, 0, 1);
        gl.glVertex3d(4, 2,-4);
        gl.glEnd();
    }

    public void K(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(0.0f, 5.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(0.0f, 5.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(1.0f, 0.0f, 0.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 0.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//2
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 0.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(1.0f, 0.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 1.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(1.0f, 1.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 1.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(1.0f, 1.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(2.0f, 2.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(2.0f, 2.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(2.0f, 2.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(2.0f, 2.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(3.0f, 0.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(3.0f, 0.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(2.0f, 2.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(2.0f, 2.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(3.0f, 0.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(3.0f, 0.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(3.0f, 0.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(4.0f, 0.0f, 0.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(4.0f, 0.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(3.0f, 0.0f, 1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(4.0f, 0.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(4.0f, 0.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(3.0f, 3.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(3.0f, 3.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(3.0f, 3.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(3.0f, 3.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(4.0f, 5.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(4.0f, 5.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(4.0f, 5.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(4.0f, 5.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(2.5f, 5.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(2.5f, 5.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(2.5f, 5.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(2.5f, 5.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 3.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(1.0f, 3.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 3.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(1.0f, 3.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 5.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(1.0f, 5.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 5.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(1.0f, 5.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(0.0f, 5.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(0.0f, 5.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(1.0f, 0.0f, 0.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 1.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(1.0f, 0.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 1.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(0.0f, 1.0f, 1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(1.0f, 1.0f, 0.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 3.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(0.0f, 3.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(0.0f, 1.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(1.0f, 1.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 3.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(0.0f, 3.0f, 1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(0.0f, 3.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(1.0f, 3.0f, 0.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 5.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(0.0f, 5.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(0.0f, 3.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(1.0f, 3.0f, 0.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 5.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(0.0f, 5.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(0.0f, 3.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(1.0f, 3.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 5.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(0.0f, 5.0f, 1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 1.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(2.0f, 2.0f, 0.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 3.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 1.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(2.0f, 2.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 3.0f, 1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(2.0f, 2.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(3.0f, 0.0f, 0.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(4.0f, 0.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(3.0f, 3.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(2.0f, 2.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(3.0f, 0.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(4.0f, 0.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(3.0f, 3.0f, 1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(3.0f, 3.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(4.0f, 5.0f, 0.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(2.5f, 5.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(1.0f, 3.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(3.0f, 3.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(4.0f, 5.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(2.5f, 5.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(1.0f, 3.0f, 1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 3.0f, 0.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(3.0f, 3.0f, 0.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(2.0f, 2.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(1.0f, 3.0f, 1.0f);
        gl.glColor3d(1.0, 0.0, 0.0);
        gl.glVertex3f(3.0f, 3.0f, 1.0f);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3f(2.0f, 2.0f, 1.0f);
        gl.glEnd();
    }

    public void O(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(0.0f, 5.0f, 1.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(0.0f, 5.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(3.0f, 0.0f, 1.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(3.0f, 0.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(3.0f, 0.0f, 0.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(3.0f, 0.0f, 1.0f);
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(3.0f, 5.0f, 1.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(3.0f, 5.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(0.0f, 5.0f, 0.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(0.0f, 5.0f, 1.0f);
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(3.0f, 5.0f, 1.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(3.0f, 5.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(3.0f, 1.0f, 0.0f);
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(3.0f, 0.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(0.0f, 5.0f, 0.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(0.0f, 4.0f, 0.0f);
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(3.0f, 4.0f, 0.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(3.0f, 5.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(1.0f, 1.0f, 0.0f);
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(1.0f, 4.0f, 0.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(0.0f, 4.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(3.0f, 1.0f, 0.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(2.0f, 1.0f, 0.0f);
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(2.0f, 4.0f, 0.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(3.0f, 4.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(0.0f, 1.0f, 1.0f);
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(3.0f, 1.0f, 1.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(3.0f, 0.0f, 1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(0.0f, 5.0f, 1.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(0.0f, 4.0f, 1.0f);
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(3.0f, 4.0f, 1.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(3.0f, 5.0f, 1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(0.0f, 1.0f, 1.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(1.0f, 1.0f, 1.0f);
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(1.0f, 4.0f, 1.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(0.0f, 4.0f, 1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(3.0f, 1.0f, 1.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(2.0f, 1.0f, 1.0f);
        gl.glColor3d(0.0, 0.0, 1.0);
        gl.glVertex3f(2.0f, 4.0f, 1.0f);
        gl.glColor3d(1.0, 1.0, 0.0);
        gl.glVertex3f(3.0f, 4.0f, 1.0f);
        gl.glEnd();
    }
    static double sudut = 0;
    static double sudutPlus = 0;
    static double sudutMinus = 0;

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        sudut -= 1;
        sudutPlus -= 2;
        sudutMinus += 2;
        gl.glTranslated(-2, -2, -15);
        gl.glRotated(sudut, 0, 5, 0);
        E(gl);
//        gl.glLoadIdentity();
//        gl.glTranslated(0, -1, -15);
//        gl.glRotated(sudutPlus, 0, 5, 0);
//        K(gl);
//        gl.glLoadIdentity();
//        gl.glTranslated(5, -1, -15);
//        gl.glRotated(sudutMinus, 0, 5, 0);
//        O(gl);
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}
