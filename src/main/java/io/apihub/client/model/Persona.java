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
import io.apihub.client.model.CatalogoEstadoCivil;
import io.apihub.client.model.CatalogoResidencia;
import io.apihub.client.model.CatalogoSexo;
import io.apihub.client.model.Domicilio;
import java.io.IOException;
@ApiModel(description = "Datos generales de la persona a consultar.")


public class Persona {
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("apellidoAdicional")
  private String apellidoAdicional = null;
  @SerializedName("nombres")
  private String nombres = null;
  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;
  @SerializedName("RFC")
  private String RFC = null;
  @SerializedName("CURP")
  private String CURP = null;
  @SerializedName("nacionalidad")
  private String nacionalidad = null;
  @SerializedName("residencia")
  private CatalogoResidencia residencia = null;
  @SerializedName("estadoCivil")
  private CatalogoEstadoCivil estadoCivil = null;
  @SerializedName("sexo")
  private CatalogoSexo sexo = null;
  @SerializedName("claveElectorIFE")
  private String claveElectorIFE = null;
  @SerializedName("numeroDependientes")
  private Integer numeroDependientes = null;
  @SerializedName("fechaDefuncion")
  private String fechaDefuncion = null;
  @SerializedName("domicilio")
  private Domicilio domicilio = null;
  public Persona apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }
   
  @ApiModelProperty(example = "PRUEBA", required = true, value = "Reportar el Apellido Paterno completo, no usar abreviaturas o iniciales")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }
  public Persona apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }
   
  @ApiModelProperty(example = "CUATRO", required = true, value = "Cuando solo se reporte un Apellido, este debe ser puesto en Apellido Paterno y el ApellidoMaterno contendrá \"NO PROPORCIONADO\".")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }
  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }
  public Persona apellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
    return this;
  }
   
  @ApiModelProperty(value = "Puede utilizarse para reporta el Apellido de casada.")
  public String getApellidoAdicional() {
    return apellidoAdicional;
  }
  public void setApellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
  }
  public Persona nombres(String nombres) {
    this.nombres = nombres;
    return this;
  }
   
  @ApiModelProperty(example = "JUAN", required = true, value = "Reportar Primer Nombre, Segundo Nombre o Nombres compuestos del consumidor. No se aceptan abreviaciones")
  public String getNombres() {
    return nombres;
  }
  public void setNombres(String nombres) {
    this.nombres = nombres;
  }
  public Persona fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }
   
  @ApiModelProperty(example = "1980-01-04", required = true, value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto yyyy-MM-dd)")
  public String getFechaNacimiento() {
    return fechaNacimiento;
  }
  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }
  public Persona RFC(String RFC) {
    this.RFC = RFC;
    return this;
  }
   
  @ApiModelProperty(example = "PUAC800104", value = "RFC con homoclave de la persona")
  public String getRFC() {
    return RFC;
  }
  public void setRFC(String RFC) {
    this.RFC = RFC;
  }
  public Persona CURP(String CURP) {
    this.CURP = CURP;
    return this;
  }
   
  @ApiModelProperty(example = "SAZR010101HCMLNS09", value = "CURP de la persona, emitida por RENAPO")
  public String getCURP() {
    return CURP;
  }
  public void setCURP(String CURP) {
    this.CURP = CURP;
  }
  public Persona nacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
    return this;
  }
   
  @ApiModelProperty(value = "Debe contener la clave de la nacionalidad del consumidor.")
  public String getNacionalidad() {
    return nacionalidad;
  }
  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }
  public Persona residencia(CatalogoResidencia residencia) {
    this.residencia = residencia;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoResidencia getResidencia() {
    return residencia;
  }
  public void setResidencia(CatalogoResidencia residencia) {
    this.residencia = residencia;
  }
  public Persona estadoCivil(CatalogoEstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoEstadoCivil getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(CatalogoEstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
  }
  public Persona sexo(CatalogoSexo sexo) {
    this.sexo = sexo;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoSexo getSexo() {
    return sexo;
  }
  public void setSexo(CatalogoSexo sexo) {
    this.sexo = sexo;
  }
  public Persona claveElectorIFE(String claveElectorIFE) {
    this.claveElectorIFE = claveElectorIFE;
    return this;
  }
   
  @ApiModelProperty(value = "La clave de elector que se encuentra en el IFE/INE.")
  public String getClaveElectorIFE() {
    return claveElectorIFE;
  }
  public void setClaveElectorIFE(String claveElectorIFE) {
    this.claveElectorIFE = claveElectorIFE;
  }
  public Persona numeroDependientes(Integer numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
    return this;
  }
   
  @ApiModelProperty(value = "Se debe de reportar el número de Dependientes Económicos del Consumidor.")
  public Integer getNumeroDependientes() {
    return numeroDependientes;
  }
  public void setNumeroDependientes(Integer numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
  }
  public Persona fechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
    return this;
  }
   
  @ApiModelProperty(example = "9999-01-01", value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto yyyy-MM-dd)")
  public String getFechaDefuncion() {
    return fechaDefuncion;
  }
  public void setFechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
  }
  public Persona domicilio(Domicilio domicilio) {
    this.domicilio = domicilio;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public Domicilio getDomicilio() {
    return domicilio;
  }
  public void setDomicilio(Domicilio domicilio) {
    this.domicilio = domicilio;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Persona persona = (Persona) o;
    return Objects.equals(this.apellidoPaterno, persona.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, persona.apellidoMaterno) &&
        Objects.equals(this.apellidoAdicional, persona.apellidoAdicional) &&
        Objects.equals(this.nombres, persona.nombres) &&
        Objects.equals(this.fechaNacimiento, persona.fechaNacimiento) &&
        Objects.equals(this.RFC, persona.RFC) &&
        Objects.equals(this.CURP, persona.CURP) &&
        Objects.equals(this.nacionalidad, persona.nacionalidad) &&
        Objects.equals(this.residencia, persona.residencia) &&
        Objects.equals(this.estadoCivil, persona.estadoCivil) &&
        Objects.equals(this.sexo, persona.sexo) &&
        Objects.equals(this.claveElectorIFE, persona.claveElectorIFE) &&
        Objects.equals(this.numeroDependientes, persona.numeroDependientes) &&
        Objects.equals(this.fechaDefuncion, persona.fechaDefuncion) &&
        Objects.equals(this.domicilio, persona.domicilio);
  }
  @Override
  public int hashCode() {
    return Objects.hash(apellidoPaterno, apellidoMaterno, apellidoAdicional, nombres, fechaNacimiento, RFC, CURP, nacionalidad, residencia, estadoCivil, sexo, claveElectorIFE, numeroDependientes, fechaDefuncion, domicilio);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Persona {\n");
    
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    apellidoAdicional: ").append(toIndentedString(apellidoAdicional)).append("\n");
    sb.append("    nombres: ").append(toIndentedString(nombres)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
    sb.append("    CURP: ").append(toIndentedString(CURP)).append("\n");
    sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
    sb.append("    residencia: ").append(toIndentedString(residencia)).append("\n");
    sb.append("    estadoCivil: ").append(toIndentedString(estadoCivil)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    claveElectorIFE: ").append(toIndentedString(claveElectorIFE)).append("\n");
    sb.append("    numeroDependientes: ").append(toIndentedString(numeroDependientes)).append("\n");
    sb.append("    fechaDefuncion: ").append(toIndentedString(fechaDefuncion)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
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
