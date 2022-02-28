package service;
import java.sql.*;
import utility.ConnectionManager;
import model.Bus;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

import java.util.ArrayList;
public class BusDao {
    public static List<Bus> getAllBusData()
    {
        List<Bus> buses=new ArrayList<>();
        try{
            Connection connection=ConnectionManager.getConnection();
            String query="SELECT bus.busId,bus.busBordingPlace,bus.fromDate,bus.toDate,bus.time from bus order by bus.busId";
           Statement statement;
           statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(query);
            while(resultSet.next())
            {
                Bus bus=new Bus();
                bus.setBusId(resultSet.getInt("busId"));
                bus.setBusBoardingPlace(resultSet.getString("busBordingPlace"));
                Date fromDate=resultSet.getDate("fromDate");
                bus.setFromDate(fromDate.toString());
                Date toDate=resultSet.getDate("toDate");
                bus.setToDate(toDate.toString());
                Time time = resultSet.getTime("time");
                bus.setTime(time.toString());
                buses.add(bus);
                System.out.println("BUSDAO : "+resultSet.getInt("busId"));

            }

        }catch(SQLException sql)
        {
            sql.getMessage();
        }
   return buses;
    }
    public static List<Bus> getAllBusDatabySearch(String str)
    {
        List<Bus> buses=new ArrayList<>();
        try{
            Connection connection=ConnectionManager.getConnection();
            String query="SELECT bus.busId,bus.busBordingPlace,bus.fromDate,bus.toDate,bus.time from bus where bus.busID like '%"+str+"%' or bus.busBordingPlace like '%"+str+"%' order by bus.busId";
           Statement statement;
           statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(query);
            while(resultSet.next())
            {
                Bus bus=new Bus();
                bus.setBusId(resultSet.getInt("busId"));
                bus.setBusBoardingPlace(resultSet.getString("busBordingPlace"));
                Date fromDate=resultSet.getDate("fromDate");
                bus.setFromDate(fromDate.toString());
                Date toDate=resultSet.getDate("toDate");
                bus.setToDate(toDate.toString());
                Time time = resultSet.getTime("time");
                bus.setTime(time.toString());
                buses.add(bus);
                System.out.println("BUSDAO : "+resultSet.getInt("busId"));

            }

        }catch(SQLException sql)
        {
            sql.getMessage();
        }
   return buses;
    }
    public void addBus(Bus bus)
     {
        try
         {
             Connection connection=ConnectionManager.getConnection();
             PreparedStatement preparedStatement;
             preparedStatement=connection.prepareStatement("insert into bus(busBordingPlace,fromDate,toDate,time) values(?,?,?,?)");
             preparedStatement.setString(1,bus.getBusBoardingPlace());
             Date fromDate=Date.valueOf(bus.getFromDate()); 
             preparedStatement.setDate(2,fromDate);

             Date toDate=Date.valueOf(bus.getToDate()); 
             preparedStatement.setDate(3,toDate);
             Time time=Time.valueOf(bus.getTime());
             preparedStatement.setTime(4,time);
             preparedStatement.executeUpdate();
             preparedStatement.close();
             connection.close();             
            System.out.println("Succefull");
         }catch(SQLException sql)
         {
           System.out.println(sql);
         }
     }
     public void deleteBus(int busId) 
     {
         try
         {
        Connection connection=ConnectionManager.getConnection();
        PreparedStatement preparedStatement;
        preparedStatement=connection.prepareStatement("Select busBordingPlace from bus where busId=?");
        preparedStatement.setInt(1,busId);
        ResultSet resultSet;
        resultSet=preparedStatement.executeQuery();
        while(resultSet.next()==false)
        {
        resultSet.close();
        preparedStatement.close();
        connection.close();
        throw new Exception();
        }
        resultSet.close();
        preparedStatement.close();
        preparedStatement=connection.prepareStatement("delete from bus where busId=? ");
        preparedStatement.setInt(1,busId);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();

    }catch(Exception e)
    {
     System.out.println(e);
    }
     }

     public Bus viewBusById(int busId)
     {
        Bus bus=null;
         try
         {
        Connection connection=ConnectionManager.getConnection();
        PreparedStatement preparedStatement;
        preparedStatement=connection.prepareStatement("select bus.busBordingPlace,bus.fromDate,bus.toDate,bus.time where busId=?");
        preparedStatement.setInt(1,busId);
        ResultSet resultSet;
        resultSet=preparedStatement.executeQuery();
        while(resultSet.next()==false)
        {
        resultSet.close();
        preparedStatement.close();
        connection.close();
        throw new Exception();
        }
        bus=new Bus();
        bus.setBusId(busId);
        bus.setBusBoardingPlace(resultSet.getString("busBordingPlace"));
        Date fromDate=resultSet.getDate("fromDate");
        bus.setFromDate(fromDate.toString());
        Date toDate=resultSet.getDate("toDate");
        bus.setToDate(toDate.toString());
        Time time = resultSet.getTime("time");
        bus.setTime(time.toString());
        resultSet.close();
        preparedStatement.close();
        connection.close();

         }catch(Exception e)
         {
          System.out.println(e);
         }

     return bus;
     }
     public void updateBus(Bus bus)
     {
         int busId=bus.getBusId();
         try
         {
        Connection connection=ConnectionManager.getConnection();
        PreparedStatement preparedStatement;
        preparedStatement=connection.prepareStatement("Select busBordingPlace from bus where busId=?");
        preparedStatement.setInt(1,busId);
        ResultSet resultSet;
        resultSet=preparedStatement.executeQuery();
        while(resultSet.next()==false)
        {
        resultSet.close();
        preparedStatement.close();
        connection.close();
        throw new Exception();
        }
        resultSet.close();
        preparedStatement.close();
        preparedStatement=connection.prepareStatement("update bus set busBordingPlace=?,fromDate=?,toDate=?,time=? where busId=?");
        preparedStatement.setString(1,bus.getBusBoardingPlace());
        Date fromDate=Date.valueOf(bus.getFromDate()); 
        preparedStatement.setDate(2,fromDate);
        Date toDate=Date.valueOf(bus.getToDate()); 
        preparedStatement.setDate(3,toDate);
        Time time=Time.valueOf(bus.getTime());
        preparedStatement.setTime(4,time);
        preparedStatement.setInt(5, busId);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();             
            

    }catch(Exception e)
    {
      System.out.println(e);
    }
    
     

     }
}
