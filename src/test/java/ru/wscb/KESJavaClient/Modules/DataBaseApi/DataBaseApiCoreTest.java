package ru.wscb.KESJavaClient.Modules.DataBaseApi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DataBaseApiCoreTest {
  @Test
  void setConnectionOracle() {
    DataBaseApiCore _Core = new DataBaseApiCore();
    _Core.SetConnectionOracle("10.100.160.71",1521,"INBKES2","ZAKIROV_IG","1$Qazwsxedc");
    Assertions.assertTrue(_Core.IsConnected());
  }
}