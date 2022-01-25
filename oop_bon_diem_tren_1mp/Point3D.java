package oop_bon_diem_tren_1mp;

public class Point3D {
    private int x, y, z;
    public Point3D(){

    }

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4){
        int a[][] = new int[5][5], b[][] = new int[5][5];
        int c[][] = new int[5][5], d[][] = new int[5][5];
        a[0][0]=p1.x; a[0][1]=p1.y; a[0][2]=p1.z;
        a[1][0]=p2.x; a[1][1]=p2.y; a[1][2]=p2.z;
        a[2][0]=p3.x; a[2][1]=p3.y; a[2][2]=p3.z;
        a[3][0]=p4.x; a[3][1]=p4.y; a[3][2]=p4.z;

        for (int j = 0; j < 3; j++) {
            b[0][j] = a[1][j] - a[0][j];
            c[0][j] = a[2][j] - a[0][j];
            d[0][j] = a[3][j] - a[0][j];
        }
        long res=(b[0][1] * c[0][2] - b[0][2] * c[0][1]) * d[0][0] + (b[0][2] * c[0][0] - b[0][0] * c[0][2]) * d[0][1] + (b[0][0] * c[0][1] - b[0][1] * c[0][0]) * d[0][2];
        if (res==0)
            return true;
        return false;
    }
}
