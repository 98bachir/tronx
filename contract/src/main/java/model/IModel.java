package model;

import java.sql.SQLException;
import java.util.List;


public interface IModel {

   
    Example getExampleById(int id) throws SQLException;

  
     
    Example getExampleByName(String name) throws SQLException;

   
    List<Example> getAllExamples() throws SQLException;
}
