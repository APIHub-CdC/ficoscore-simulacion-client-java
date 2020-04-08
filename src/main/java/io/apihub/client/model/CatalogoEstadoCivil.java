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
@JsonAdapter(CatalogoEstadoCivil.Adapter.class)
public enum CatalogoEstadoCivil {
  
  D("D"),
  
  L("L"),
  
  C("C"),
  
  S("S"),
  
  V("V"),
  
  E("E");
  private String value;
  CatalogoEstadoCivil(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoEstadoCivil fromValue(String text) {
    for (CatalogoEstadoCivil b : CatalogoEstadoCivil.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoEstadoCivil> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoEstadoCivil enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoEstadoCivil read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoEstadoCivil.fromValue(String.valueOf(value));
    }
  }
}
