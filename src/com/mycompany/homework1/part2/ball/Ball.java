package com.mycompany.homework1.part2.ball;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float deltaX;
    private float deltaY;

    public Ball(float x, float y, int radius, float speed, float direction) {
        if ((direction > 180) || (direction < -180))
            System.out.println("Error");
        else {
            this.x = x;
            this.y = y;
            this.radius = radius;
            this.deltaX = speed * (float) Math.cos(Math.toRadians(direction));
            this.deltaY = -speed * (float) Math.sin(Math.toRadians(direction));
        }
    }

    @Override
    public String toString() {
        return "Ball[(" + x + "," + y + "), speed=(" + deltaX + "," +
                deltaY + ")]";
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getDeltaX() {
        return deltaX;
    }

    public void setDeltaX(float deltaX) {
        this.deltaX = deltaX;
    }

    public float getDeltaY() {
        return deltaY;
    }

    public void setDeltaY(float deltaY) {
        this.deltaY = deltaY;
    }

    public void move() {
        this.x += this.deltaX;
        this.y += this.deltaY;
    }

    public void reflectHorizontal() {
        this.deltaX *= -1;
    }

    public void reflectVertical() {
        this.deltaY *= -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)){return false;}

        Ball ball = (Ball) o;


        return (ball.x == this.x) &&(ball.y == this.y) &&(ball.radius == this.radius) &&(ball.deltaX == this.deltaX) &&
                (ball.deltaY == this.deltaY);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int)this.x;
        result = 31 * result + (int)this.y;
        result = 31 * result + radius;
        result = 31 * result + (int)this.deltaX;
        result = 31 * result + (int)this.deltaY;
        return result;
    }
}
