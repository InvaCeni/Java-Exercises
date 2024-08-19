package org.example;

class Line {
    private Point2D start;
    private Point2D end;

    public Line(Point2D start, Point2D end) {
        this.start = start;
        this.end = end;
    }

    public Line(double startX, double startY, double endX, double endY) {
        this.start = new Point2D(startX, startY);
        this.end = new Point2D(endX, endY);
    }

    public Point2D getStart() {
        return start;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setStart(Point2D start) {
        this.start = start;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }

    public double length() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    public Point2D center() {
        double centerX = (start.getX() + end.getX()) / 2;
        double centerY = (start.getY() + end.getY()) / 2;
        return new Point2D(centerX, centerY);
    }
}