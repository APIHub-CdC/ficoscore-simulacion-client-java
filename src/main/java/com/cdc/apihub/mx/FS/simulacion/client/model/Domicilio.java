package com.cdc.apihub.mx.FS.simulacion.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.FS.simulacion.client.model.CatalogoEstados;
import com.cdc.apihub.mx.FS.simulacion.client.model.CatalogoTipoAsentamiento;
import com.cdc.apihub.mx.FS.simulacion.client.model.CatalogoTipoDomicilio;
import java.io.IOException;
@ApiModel(description = "Datos del domicilio de la persona a consultar")


public class Domicilio {
  @SerializedName("direccion")
  private String direccion = null;
  @SerializedName("coloniaPoblacion")
  private String coloniaPoblacion = null;
  @SerializedName("delegacionMunicipio")
  private String delegacionMunicipio = null;
  @SerializedName("ciudad")
  private String ciudad = null;
  @SerializedName("estado")
  private CatalogoEstados estado = null;
  @SerializedName("CP")
  private String CP = null;
  @SerializedName("fechaResidencia")
  private String fechaResidencia = null;
  @SerializedName("numeroTelefono")
  private String numeroTelefono = null;
  @SerializedName("tipoDomicilio")
  private CatalogoTipoDomicilio tipoDomicilio = null;
  @SerializedName("tipoAsentamiento")
  private CatalogoTipoAsentamiento tipoAsentamiento = null;
  @SerializedName("fechaRegistroDomicilio")
  private String fechaRegistroDomicilio = null;
  @SerializedName("tipoAltaDomicilio")
  private Integer tipoAltaDomicilio = null;
  @SerializedName("idDomicilio")
  private String idDomicilio = null;
  public Domicilio direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }
   
  @ApiModelProperty(example = "HIDALGO 32", required = true, value = "Reportar el nombre de la calle, número exterior, número interior. Deben considerarse avenida,cerrada, manzana, lote, edificio,departamento etc. Debe contener por lo menos dos cadenas de caracteres para que el registro sea válido, de lo contrario el registro será rechazado.")
  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
  public Domicilio coloniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
    return this;
  }
   
  @ApiModelProperty(example = "CENTRO", required = true, value = "Reportar la colonia a la cual pertenece la dirección contenida en el elemento dirección.")
  public String getColoniaPoblacion() {
    return coloniaPoblacion;
  }
  public void setColoniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
  }
  public Domicilio delegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
    return this;
  }
   
  @ApiModelProperty(example = "LA BARCA", value = "Reportar la delegación o municipio a la cual pertenece la dirección contenida en el elemento Dirección.")
  public String getDelegacionMunicipio() {
    return delegacionMunicipio;
  }
  public void setDelegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
  }
  public Domicilio ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }
   
  @ApiModelProperty(example = "BENITO JUAREZ", required = true, value = "Reportar la ciudad a la cual pertenece la dirección contenida en el elemento Dirección.")
  public String getCiudad() {
    return ciudad;
  }
  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }
  public Domicilio estado(CatalogoEstados estado) {
    this.estado = estado;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public CatalogoEstados getEstado() {
    return estado;
  }
  public void setEstado(CatalogoEstados estado) {
    this.estado = estado;
  }
  public Domicilio CP(String CP) {
    this.CP = CP;
    return this;
  }
   
  @ApiModelProperty(example = "47917", value = "El código postal reportado debeestar compuesto por 5 dígitos. Para que el código postal sea válido deberá corresponder al estado reportado.")
  public String getCP() {
    return CP;
  }
  public void setCP(String CP) {
    this.CP = CP;
  }
  public Domicilio fechaResidencia(String fechaResidencia) {
    this.fechaResidencia = fechaResidencia;
    return this;
  }
   
  @ApiModelProperty(example = "2018-12-21", value = "Debe de reportarse la fecha desde cuando el consumidor vive en la  dirección reportada.")
  public String getFechaResidencia() {
    return fechaResidencia;
  }
  public void setFechaResidencia(String fechaResidencia) {
    this.fechaResidencia = fechaResidencia;
  }
  public Domicilio numeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
    return this;
  }
   
  @ApiModelProperty(example = "5512345678", value = "Debe de contener una longitud mínima de 5 caracteres. Cada carácter debe ser un número de 0-9, si se ingresa cualquier otro carácter el registro será rechazado.")
  public String getNumeroTelefono() {
    return numeroTelefono;
  }
  public void setNumeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
  }
  public Domicilio tipoDomicilio(CatalogoTipoDomicilio tipoDomicilio) {
    this.tipoDomicilio = tipoDomicilio;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoTipoDomicilio getTipoDomicilio() {
    return tipoDomicilio;
  }
  public void setTipoDomicilio(CatalogoTipoDomicilio tipoDomicilio) {
    this.tipoDomicilio = tipoDomicilio;
  }
  public Domicilio tipoAsentamiento(CatalogoTipoAsentamiento tipoAsentamiento) {
    this.tipoAsentamiento = tipoAsentamiento;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoTipoAsentamiento getTipoAsentamiento() {
    return tipoAsentamiento;
  }
  public void setTipoAsentamiento(CatalogoTipoAsentamiento tipoAsentamiento) {
    this.tipoAsentamiento = tipoAsentamiento;
  }
  public Domicilio fechaRegistroDomicilio(String fechaRegistroDomicilio) {
    this.fechaRegistroDomicilio = fechaRegistroDomicilio;
    return this;
  }
   
  @ApiModelProperty(example = "2018-12-20", value = "Fecha en la cual se registró el domicilio.")
  public String getFechaRegistroDomicilio() {
    return fechaRegistroDomicilio;
  }
  public void setFechaRegistroDomicilio(String fechaRegistroDomicilio) {
    this.fechaRegistroDomicilio = fechaRegistroDomicilio;
  }
  public Domicilio tipoAltaDomicilio(Integer tipoAltaDomicilio) {
    this.tipoAltaDomicilio = tipoAltaDomicilio;
    return this;
  }
   
  @ApiModelProperty(value = "Los valores posibles: 0 = Alta de crédito 1 = Consulta expediente")
  public Integer getTipoAltaDomicilio() {
    return tipoAltaDomicilio;
  }
  public void setTipoAltaDomicilio(Integer tipoAltaDomicilio) {
    this.tipoAltaDomicilio = tipoAltaDomicilio;
  }
  public Domicilio idDomicilio(String idDomicilio) {
    this.idDomicilio = idDomicilio;
    return this;
  }
   
  @ApiModelProperty(example = "316110890", value = "Identificador único del domicilio")
  public String getIdDomicilio() {
    return idDomicilio;
  }
  public void setIdDomicilio(String idDomicilio) {
    this.idDomicilio = idDomicilio;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Domicilio domicilio = (Domicilio) o;
    return Objects.equals(this.direccion, domicilio.direccion) &&
        Objects.equals(this.coloniaPoblacion, domicilio.coloniaPoblacion) &&
        Objects.equals(this.delegacionMunicipio, domicilio.delegacionMunicipio) &&
        Objects.equals(this.ciudad, domicilio.ciudad) &&
        Objects.equals(this.estado, domicilio.estado) &&
        Objects.equals(this.CP, domicilio.CP) &&
        Objects.equals(this.fechaResidencia, domicilio.fechaResidencia) &&
        Objects.equals(this.numeroTelefono, domicilio.numeroTelefono) &&
        Objects.equals(this.tipoDomicilio, domicilio.tipoDomicilio) &&
        Objects.equals(this.tipoAsentamiento, domicilio.tipoAsentamiento) &&
        Objects.equals(this.fechaRegistroDomicilio, domicilio.fechaRegistroDomicilio) &&
        Objects.equals(this.tipoAltaDomicilio, domicilio.tipoAltaDomicilio) &&
        Objects.equals(this.idDomicilio, domicilio.idDomicilio);
  }
  @Override
  public int hashCode() {
    return Objects.hash(direccion, coloniaPoblacion, delegacionMunicipio, ciudad, estado, CP, fechaResidencia, numeroTelefono, tipoDomicilio, tipoAsentamiento, fechaRegistroDomicilio, tipoAltaDomicilio, idDomicilio);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Domicilio {\n");
    
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    coloniaPoblacion: ").append(toIndentedString(coloniaPoblacion)).append("\n");
    sb.append("    delegacionMunicipio: ").append(toIndentedString(delegacionMunicipio)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    CP: ").append(toIndentedString(CP)).append("\n");
    sb.append("    fechaResidencia: ").append(toIndentedString(fechaResidencia)).append("\n");
    sb.append("    numeroTelefono: ").append(toIndentedString(numeroTelefono)).append("\n");
    sb.append("    tipoDomicilio: ").append(toIndentedString(tipoDomicilio)).append("\n");
    sb.append("    tipoAsentamiento: ").append(toIndentedString(tipoAsentamiento)).append("\n");
    sb.append("    fechaRegistroDomicilio: ").append(toIndentedString(fechaRegistroDomicilio)).append("\n");
    sb.append("    tipoAltaDomicilio: ").append(toIndentedString(tipoAltaDomicilio)).append("\n");
    sb.append("    idDomicilio: ").append(toIndentedString(idDomicilio)).append("\n");
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
