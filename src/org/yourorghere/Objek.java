package org.yourorghere;

import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Objek {

    static void O(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(1, 0, 4);
        gl.glVertex3d(0, 0, 0);
        gl.glVertex3d(0, 4, 0);
        gl.glVertex3d(0, 0, -4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(1, 0, 4);
        gl.glVertex3d(0, 0, -4);
        gl.glVertex3d(0, 0, -3.5);
        gl.glVertex3d(3, 0, -3.5);
        gl.glVertex3d(3, 0, -4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(1, 0, 4);
        gl.glVertex3d(0, 0, -0.25);
        gl.glVertex3d(0, 0,  0.0);
        gl.glVertex3d(-4, 0, 0.0);
        gl.glVertex3d(-4, 0, -0.25);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1
        gl.glColor3d(1, 0, 4);
        gl.glVertex3d(0, 0, 0);
        gl.glVertex3d(0, 4, 0);
        gl.glVertex3d(0, 0, 4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//2
        gl.glColor3d(1, 0, 4);
        gl.glVertex3d(0, 0, 0);
        gl.glVertex3d(0, -4, 0);
        gl.glVertex3d(0, 0, -4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3
        gl.glColor3d(1, 0, 4);
        gl.glVertex3d(0, 0, 0);
        gl.glVertex3d(0, -4, 0);
        gl.glVertex3d(0, 0, 4);
        gl.glEnd();
    }
    static void K(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 0, 4);
        gl.glVertex3d(0, 0, 0);
        gl.glVertex3d(1, 0, 0);
        gl.glVertex3d(0, 0, -1);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//1
        gl.glColor3d(0, 0, 4);
        gl.glVertex3d(0, 0, 0);
        gl.glVertex3d(-1, 0, 0);
        gl.glVertex3d(0, 0, -1);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//2
        gl.glColor3d(0, 0, 4);
        gl.glVertex3d(0, 0, 0);
        gl.glVertex3d(1, 0, 0);
        gl.glVertex3d(0, 0, 1);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//3
        gl.glColor3d(0, 0, 4);
        gl.glVertex3d(0, 0, 0);
        gl.glVertex3d(-1, 0, 0);
        gl.glVertex3d(0, 0, 1);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//4
        gl.glColor3d(1, 0, 0);
        gl.glVertex3d(0, 0, 0);
        gl.glVertex3d(0, 0.1, 0);
        gl.glVertex3d(1, 0, 0);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(0, 0, 4);
        gl.glVertex3d(0   , 0, 0);
        gl.glVertex3d(0.05, 0, 0);
        gl.glVertex3d(0.05, 1, 0);
        gl.glVertex3d(0   , 1, 0);
        gl.glEnd();

    }
    static void E(GL gl) {
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
        gl.glVertex3d(0, 5, -4);
        gl.glVertex3d(0, 4, -4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//6
        gl.glColor3d(0, 0, 1);
        gl.glVertex3d(4, 4, 0);
        gl.glVertex3d(4, 5, 0);
        gl.glVertex3d(4, 5, -4);
        gl.glVertex3d(4, 4, -4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//7
        gl.glColor3d(1, 0, 4);
        gl.glVertex3d(0, 5, 0);
        gl.glVertex3d(4, 5, 0);
        gl.glVertex3d(4, 5, -4);
        gl.glVertex3d(0, 5, -4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//8
        gl.glColor3d(0, 0, 1);
        gl.glVertex3d(0, 3, 0);
        gl.glVertex3d(0, 3.5, 0);
        gl.glVertex3d(0, 3.5, -4);
        gl.glVertex3d(0, 3, -4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//9
        gl.glColor3d(0, 0, 1);
        gl.glVertex3d(4, 3, 0);
        gl.glVertex3d(4, 3.5, 0);
        gl.glVertex3d(4, 3.5, -4);
        gl.glVertex3d(4, 3, -4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//9
        gl.glColor3d(1, 1, 1);
        gl.glVertex3d(0, 2, -4);
        gl.glColor3d(0, 1, 1);
        gl.glVertex3d(0, 5, -4);
        gl.glColor3d(1, 1, 0);
        gl.glVertex3d(4, 5, -4);
        gl.glColor3d(0, 1, 0);
        gl.glVertex3d(4, 2, -4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//10
        gl.glColor3d(0, 0, 1);
        gl.glVertex3d(0, 2, 0);
        gl.glVertex3d(0, 3.5, 0);
        gl.glVertex3d(0, 3.5, -4);
        gl.glVertex3d(0, 2, -4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//11
        gl.glColor3d(0, 0, 1);
        gl.glVertex3d(4, 2, 0);
        gl.glVertex3d(4, 3.5, 0);
        gl.glVertex3d(4, 3.5, -4);
        gl.glVertex3d(4, 2, -4);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//0
        gl.glColor3d(1, 1, 1);
        gl.glVertex3d(1, 3, 0);
        gl.glColor3d(0, 0, 0);
        gl.glVertex3d(1, 5, 0);
        gl.glColor3d(1, 0, 1);
        gl.glVertex3d(3, 5, 0);
        gl.glColor3d(1, 0, 0);
        gl.glVertex3d(3, 3, 0);
        gl.glEnd();
        
//        gl.glBegin(GL.GL_POLYGON);//12
//        gl.glColor3d(1, 0, 0);
//        gl.glVertex3d(0, 3.5, -2.5);
//        gl.glVertex3d(0, 4, -2.5);
//        gl.glVertex3d(5.5, 4, -2.5);
//        gl.glVertex3d(5.5, 3.5, -2.5);
//        gl.glEnd();
        
    }
}
