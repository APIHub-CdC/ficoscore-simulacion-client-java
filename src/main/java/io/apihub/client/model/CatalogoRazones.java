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
@JsonAdapter(CatalogoRazones.Adapter.class)
public enum CatalogoRazones {
  
  A0("A0"),
  
  A1("A1"),
  
  A2("A2"),
  
  A3("A3"),
  
  A4("A4"),
  
  A5("A5"),
  
  A6("A6"),
  
  A7("A7"),
  
  A8("A8"),
  
  A9("A9"),
  
  B0("B0"),
  
  B1("B1"),
  
  B2("B2"),
  
  B3("B3"),
  
  B4("B4"),
  
  B5("B5"),
  
  B6("B6"),
  
  D0("D0"),
  
  D1("D1"),
  
  D2("D2"),
  
  D3("D3"),
  
  D4("D4"),
  
  D5("D5"),
  
  D6("D6"),
  
  D7("D7"),
  
  D8("D8"),
  
  D9("D9"),
  
  E0("E0"),
  
  E1("E1"),
  
  E2("E2"),
  
  E3("E3"),
  
  E4("E4"),
  
  E5("E5"),
  
  E6("E6"),
  
  F0("F0"),
  
  F1("F1"),
  
  F2("F2"),
  
  F3("F3"),
  
  F4("F4"),
  
  F5("F5"),
  
  F6("F6"),
  
  F7("F7"),
  
  F8("F8"),
  
  F9("F9"),
  
  G0("G0"),
  
  G1("G1"),
  
  G2("G2"),
  
  G3("G3"),
  
  G4("G4"),
  
  G5("G5"),
  
  G6("G6"),
  
  J0("J0"),
  
  J1("J1"),
  
  J2("J2"),
  
  J3("J3"),
  
  J4("J4"),
  
  J5("J5"),
  
  J6("J6"),
  
  J7("J7"),
  
  J8("J8"),
  
  J9("J9"),
  
  K0("K0"),
  
  K1("K1"),
  
  K2("K2"),
  
  K3("K3"),
  
  K4("K4"),
  
  K5("K5"),
  
  K6("K6"),
  
  K7("K7"),
  
  K8("K8"),
  
  K9("K9"),
  
  M0("M0"),
  
  M1("M1"),
  
  M2("M2"),
  
  M3("M3"),
  
  M4("M4"),
  
  M5("M5"),
  
  M6("M6"),
  
  M7("M7"),
  
  M8("M8"),
  
  M9("M9"),
  
  N0("N0"),
  
  N1("N1"),
  
  N2("N2"),
  
  N3("N3"),
  
  N4("N4"),
  
  N5("N5"),
  
  N6("N6"),
  
  N7("N7"),
  
  N8("N8"),
  
  P0("P0"),
  
  P1("P1"),
  
  P2("P2"),
  
  P3("P3"),
  
  P5("P5"),
  
  P6("P6"),
  
  P7("P7"),
  
  P8("P8"),
  
  P9("P9"),
  
  Q0("Q0"),
  
  Q1("Q1"),
  
  R0("R0"),
  
  R1("R1"),
  
  R2("R2"),
  
  R3("R3"),
  
  R4("R4"),
  
  R5("R5"),
  
  R6("R6"),
  
  R7("R7"),
  
  R9("R9"),
  
  S0("S0"),
  
  S1("S1"),
  
  S2("S2"),
  
  T0("T0"),
  
  T1("T1"),
  
  T2("T2"),
  
  T3("T3"),
  
  T4("T4"),
  
  T5("T5"),
  
  T6("T6"),
  
  T7("T7"),
  
  T8("T8"),
  
  T9("T9"),
  
  U0("U0"),
  
  U1("U1"),
  
  U2("U2"),
  
  U4("U4"),
  
  U5("U5"),
  
  U6("U6"),
  
  U7("U7"),
  
  U8("U8"),
  
  U9("U9"),
  
  V0("V0"),
  
  V1("V1"),
  
  V3("V3"),
  
  V4("V4"),
  
  W3("W3"),
  
  W4("W4"),
  
  W5("W5"),
  
  W6("W6"),
  
  W7("W7"),
  
  W9("W9"),
  
  X0("X0"),
  
  C1("C1"),
  
  C2("C2"),
  
  C3("C3"),
  
  C4("C4"),
  
  C5("C5"),
  
  SC("SC");
  private String value;
  CatalogoRazones(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoRazones fromValue(String text) {
    for (CatalogoRazones b : CatalogoRazones.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoRazones> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoRazones enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoRazones read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoRazones.fromValue(String.valueOf(value));
    }
  }
}
