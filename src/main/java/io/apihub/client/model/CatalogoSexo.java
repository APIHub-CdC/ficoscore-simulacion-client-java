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
@JsonAdapter(CatalogoSexo.Adapter.class)
public enum CatalogoSexo {
  
  F("F"),
  
  M("M");
  private String value;
  CatalogoSexo(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoSexo fromValue(String text) {
    for (CatalogoSexo b : CatalogoSexo.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoSexo> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoSexo enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoSexo read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoSexo.fromValue(String.valueOf(value));
    }
  }
}
