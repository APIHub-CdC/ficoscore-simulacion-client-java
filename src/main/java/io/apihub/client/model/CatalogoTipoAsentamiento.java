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
@JsonAdapter(CatalogoTipoAsentamiento.Adapter.class)
public enum CatalogoTipoAsentamiento {
  
  _0("0"),
  
  _1("1"),
  
  _2("2"),
  
  _3("3"),
  
  _4("4"),
  
  _5("5"),
  
  _6("6"),
  
  _7("7"),
  
  _8("8"),
  
  _9("9"),
  
  _10("10"),
  
  _11("11"),
  
  _12("12"),
  
  _13("13"),
  
  _14("14"),
  
  _15("15"),
  
  _16("16"),
  
  _17("17"),
  
  _18("18"),
  
  _19("19"),
  
  _20("20"),
  
  _21("21"),
  
  _22("22"),
  
  _23("23"),
  
  _24("24"),
  
  _25("25"),
  
  _26("26"),
  
  _27("27"),
  
  _28("28"),
  
  _29("29"),
  
  _30("30"),
  
  _31("31"),
  
  _32("32"),
  
  _33("33"),
  
  _34("34"),
  
  _35("35"),
  
  _36("36"),
  
  _37("37"),
  
  _38("38"),
  
  _39("39"),
  
  _40("40"),
  
  _41("41"),
  
  _42("42"),
  
  _43("43"),
  
  _44("44"),
  
  _45("45"),
  
  _46("46"),
  
  _47("47"),
  
  _48("48"),
  
  _49("49"),
  
  _50("50"),
  
  _51("51"),
  
  _52("52"),
  
  _53("53"),
  
  _54("54"),
  
  _55("55");
  private String value;
  CatalogoTipoAsentamiento(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoTipoAsentamiento fromValue(String text) {
    for (CatalogoTipoAsentamiento b : CatalogoTipoAsentamiento.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoTipoAsentamiento> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoTipoAsentamiento enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoTipoAsentamiento read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoTipoAsentamiento.fromValue(String.valueOf(value));
    }
  }
}
