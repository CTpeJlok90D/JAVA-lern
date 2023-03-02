package ru.TSUtmb;
import static java.lang.Math.*;
import static ru.TSUtmb.MathEx.*;

public class Tasks
{
    static double Task1Equation(double x)
    {
        double firstSummand = pow(asin(sqrt(abs(x))/(sqrt(abs(x)) + 1d)),5d);
        double secondSummand = pow(pow(x,2d) + 1,1d/5d);
        double thirdSummand = log(pow(2d,sin(x)) + pow(abs(x),cos(x)),2d);
        return firstSummand + secondSummand + thirdSummand;
    }

    static boolean Task1Check(double x, double y)
    {
        double radius = 5d;

        if (x < 0)
        {
            return false;
        }

        return pow(radius,2d) > pow(x,2d) + pow(y,2d);
    }

    static double Task2CalculateY(double x)
    {
        double y;
        if (x < -1)
        {
            y = pow(x,6d) * log(abs(pow(6d,x) - pow(abs(x-5d),x)));
        }
        else if (x < 1)
        {
            y = sin(x/(1d-2d*pow(x,2d)));
        }
        else
        {
            y = asin(1d/pow(x,4d));
        }
        return y;
    }
}
