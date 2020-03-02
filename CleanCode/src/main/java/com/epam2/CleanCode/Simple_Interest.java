package com.epam2.CleanCode;
class Simple_Interest{
  double principal,rate_of_Interest,time;
  Simple_Interest(double principal,double rate_of_Interest,double time)
  {
    this.principal=principal;
    this.rate_of_Interest=rate_of_Interest;
    this.time=time;
  }
  public double calulatesi()
  {
    return ((principal *rate_of_Interest*time)/100);
  }
}