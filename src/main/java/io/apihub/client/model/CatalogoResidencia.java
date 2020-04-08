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
@JsonAdapter(CatalogoResidencia.Adapter.class)
public enum CatalogoResidencia {
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_3(3),
  
  NUMBER_4(4),
  
  NUMBER_5(5);
  private Integer value;
  CatalogoResidencia(Integer value) {
    this.value = value;
  }
  public Integer getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoResidencia fromValue(String text) {
    for (CatalogoResidencia b : CatalogoResidencia.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoResidencia> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoResidencia enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoResidencia read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return CatalogoResidencia.fromValue(String.valueOf(value));
    }
  }
}
