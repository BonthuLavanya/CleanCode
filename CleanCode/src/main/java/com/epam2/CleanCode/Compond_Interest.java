package com.epam2.CleanCode;
class Compound_Interest{
  double principal,rate_of_Interest,time,n;
  Compound_Interest(double principal,double rate_of_Interest,double time,double n)
  {
    this.principal=principal;
    this.rate_of_Interest=rate_of_Interest;
    this.time=time;
    this.n=n;
  }
  public double calulateci()
  {
    double interest=principal * Math.pow(1.0+rate_of_Interest /n,n*time)-principal;
    return(interest);
  }
}