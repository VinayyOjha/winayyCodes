#include <stdio.h>
#include <math.h>

float func(int not, float x, int xyz, float power[], float coeff[])
{
    float z;
    if (xyz == 1)
    {

        for (int i = 1; i <= not ; i++)
        {
            printf("Enter power of x in %d term :- ", i);
            scanf("%f", &power[i - 1]);
            printf("Enter coeffecient of %d term :- ", i);
            scanf("%f", &coeff[i - 1]);
        }
        printf("Your Equation is :-  ");
        for (int i = 1; i <= not ; i++)
        {
            printf("%.1f*x^%.1f", coeff[i - 1], power[i - 1]);
            if (i == not )
            {
                break;
            }
            printf(" + ");
        }
        return 0;
    }
    else
    {
        z = 0;
        for (int i = 1; i <= not ; i++)
        {
            z += coeff[i - 1] * pow(x, power[i - 1]);
        }
        return z;
    }
}

int main()
{
    printf("Enter number of terms in your equation :- ");
    int not ;
    scanf("%d", &not );
    float power[not ];
    float coeff[not ];
    int xyz = 1;
    func(not, 1, xyz, power, coeff);

    float l, r;
    int k, n;
    int minormax;
    printf("\nEnter 0 for Min and 1 for Max :- ");
    scanf("%d", &minormax);
    if (minormax != 0 && minormax != 1)
    {
        printf("Please Enter a valid Value of Min or Max ...");
        return 0;
    }
    printf("\nEnter the value of l,r,k,n respectively :-  ");
    scanf("%f %f %d %d ", &l, &r, &k, &n);

    float fiboseries[10];
    fiboseries[0] = 1;
    fiboseries[1] = 1;
    for (int i = 2; i < 10; i++)
    {
        fiboseries[i] = fiboseries[i - 1] + fiboseries[i - 2];
    }

    while (k < n)
    {
        xyz++;
        printf("Itration :-- %d \n", k);
        printf("Interval :-- (%f, %f) \n", l, r);
        float fstark = fiboseries[n - k] / fiboseries[n - k + 1];
        float x2 = l + fstark * (r - l);
        float x1 = l + r - x2;
        printf("x1 :-- %f and x2 :-- %f \n", x1, x2);
        double fx1 = func(not, x1, xyz, power, coeff);
        float fx2 = func(not, x2, xyz, power, coeff);
        printf("fx1 :-- %f and fx2 :-- %f \n", fx1, fx2);
        printf("\n");
        if (minormax == 0)
        {
            if (fx1 < fx2 || fx1 == fx2)
            {
                r = x2;
            }
            else
            {

                l = x1;
            }
        }
        else
        {
            if (fx1 <= fx2)
            {
                l = x1;
            }
            else
            {
                r = x2;
            }
        }
        k++;
    }
    float xmin = (l + r) / 2;
    printf("FINAL RESULTS\n");
    printf("--------------------------\n");
    printf("Your minimum interval is (%f, %f) \n", l, r);
    printf("Value of Xmin = %f \n", xmin);
    printf("Value of f(x) at x = %f is %f \n", xmin, func(not, xmin, xyz, power, coeff));
    return 0;
}
