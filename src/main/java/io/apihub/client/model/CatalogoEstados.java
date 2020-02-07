package io.apihub.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(CatalogoEstados.Adapter.class)
public enum CatalogoEstados {
  
  AGS("AGS"),
  
  BC("BC"),
  
  BCS("BCS"),
  
  CAMP("CAMP"),
  
  COAH("COAH"),
  
  COL("COL"),
  
  CHIS("CHIS"),
  
  CHIH("CHIH"),
  
  DF("DF"),
  
  CDMX("CDMX"),
  
  DGO("DGO"),
  
  GTO("GTO"),
  
  GRO("GRO"),
  
  HGO("HGO"),
  
  JAL("JAL"),
  
  MEX("MEX"),
  
  MICH("MICH"),
  
  MOR("MOR"),
  
  NAY("NAY"),
  
  NL("NL"),
  
  OAX("OAX"),
  
  PUE("PUE"),
  
  QRO("QRO"),
  
  QROO("QROO"),
  
  SLP("SLP"),
  
  SIN("SIN"),
  
  SON("SON"),
  
  TAB("TAB"),
  
  TAMP("TAMP"),
  
  TLAX("TLAX"),
  
  VER("VER"),
  
  YUC("YUC"),
  
  ZAC("ZAC");
  private String value;
  CatalogoEstados(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoEstados fromValue(String text) {
    for (CatalogoEstados b : CatalogoEstados.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoEstados> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoEstados enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoEstados read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoEstados.fromValue(String.valueOf(value));
    }
  }
}
