package services;

public class CalculatorService {
    public static int addTwoNumbers(int a,int b) {
        return a+b;


    }
public static int productNums(int a,int b){
        return a*b;

}
public static double divisionNum(int a,int b){
return a/b;
}
public static int minusNums(int a,int b)
{
    return a-b;

}
public static int sumAnyNumbers(int... numbers)
{
    int s=0;
    for(int n:numbers)
    {
         s+=n;
    }
    return s;
}
}
