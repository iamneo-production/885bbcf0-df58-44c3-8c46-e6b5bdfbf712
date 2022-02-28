package model;
public class Bus 
{
 private int busId;
 private String busBoardingPlace;
 private String fromDate;
 private String toDate;
 private String Time;

 public Bus()
 {
  this.busId=0;
  this.busBoardingPlace="";
  this.fromDate="";
  this.toDate="";
  this.Time="";
 }
 public void setBusId(int busId)
 {
 this.busId=busId;
 }
 public int getBusId()
 {
     return this.busId;
 }
 public void setBusBoardingPlace(String busBoardingPlace)
 {
     this.busBoardingPlace=busBoardingPlace;
 }
 public String getBusBoardingPlace()
 {
     return this.busBoardingPlace;
 }
 public void setFromDate(String fromDate)
 {
     this.fromDate=fromDate;
 }
 public String getFromDate()
 {
     return this.fromDate;
 }
public void setToDate(String toDate)
{
    this.toDate=toDate;
}
public String getToDate()
{
    return this.toDate;
}
public void setTime(String Time)
{
    this.Time=Time;
}
public String getTime()
{
    return this.Time;
}
}