package ru.wscb.KESJavaClient.Modules.DataBaseApi;

import oracle.jdbc.OracleDriver;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * API для работы с базой данных.
 */
public class DataBaseApiCore {
  /**
   * Подключение к БД.
   */
  private Connection m_Connection;

  /**
   * Конструктор.
   */
  public DataBaseApiCore() {
  }

  /**
   * Состояние подключение к БД.
   * @return True - подключение к БД выполнено.
   */
  public boolean IsConnected(){
    //
    boolean _IsConnected = false;
    //
    try {
      _IsConnected = m_Connection.isClosed();
    }catch (Exception e){
      _IsConnected = false;
    }
    //
    return _IsConnected;
  }

  /**
   * Получить подключение к БД.
   */
  public void SetConnectionOracle(String Host, int Port, String DataBaseName, String UserName, String Password) {
    // Строка подключения.
    String _JDBCUrl = "jdbc:oracle:thin:@" + Host + ":" + Port + ":" + DataBaseName;
    // Драйвер БД.
    try {
      DriverManager.registerDriver(new OracleDriver());
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Ошибка драйвера БД: " + e.getMessage());
    }
    // Подключение к БД.
    try {
      m_Connection = DriverManager.getConnection(_JDBCUrl, UserName, Password);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Ошибка подключения к БД: " + e.getMessage());
    }
  }
}
