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
@JsonAdapter(CatalogoTipoDomicilio.Adapter.class)
public enum CatalogoTipoDomicilio {
  
  N("N"),
  
  O("O"),
  
  C("C"),
  
  P("P"),
  
  E("E");
  private String value;
  CatalogoTipoDomicilio(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoTipoDomicilio fromValue(String text) {
    for (CatalogoTipoDomicilio b : CatalogoTipoDomicilio.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoTipoDomicilio> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoTipoDomicilio enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoTipoDomicilio read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoTipoDomicilio.fromValue(String.valueOf(value));
    }
  }
}
