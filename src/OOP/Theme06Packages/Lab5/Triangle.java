package OOP.Theme06Packages.Lab5;

import static java.lang.Math.sqrt;

/**
 * Create class Triangle in package com.brainacad.shapes with three double data fields named “a”, “b”,
 * and “c” with default values 1.0 to denote three sides of the triangle.
 * Add constructor with (a,b,c) parameters and creates a triangle with specified a, b, and c values.
 * Add method named getArea() that returns the area if this triangle using Heron formula
 */
public class Triangle {
    double a = 1.0;
    double b = 1.0;
    double c = 1.0;

    public double getArea(double a, double b, double c){
        double s = 0.5 * (a + b + c);
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
