package io.apihub.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.apihub.client.model.Error;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@ApiModel(description = "Si existen errores, se listarán.")


public class Errores {
  @SerializedName("errores")
  private List<Error> errores = null;
  public Errores errores(List<Error> errores) {
    this.errores = errores;
    return this;
  }
  public Errores addErroresItem(Error erroresItem) {
    if (this.errores == null) {
      this.errores = new ArrayList<Error>();
    }
    this.errores.add(erroresItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Error> getErrores() {
    return errores;
  }
  public void setErrores(List<Error> errores) {
    this.errores = errores;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Errores errores = (Errores) o;
    return Objects.equals(this.errores, errores.errores);
  }
  @Override
  public int hashCode() {
    return Objects.hash(errores);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Errores {\n");
    
    sb.append("    errores: ").append(toIndentedString(errores)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
