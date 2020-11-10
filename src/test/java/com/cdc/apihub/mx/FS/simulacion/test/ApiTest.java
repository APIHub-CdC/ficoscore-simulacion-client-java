package com.cdc.apihub.mx.FS.simulacion.test;

import com.cdc.apihub.mx.FS.simulacion.client.ApiClient;
import com.cdc.apihub.mx.FS.simulacion.client.ApiException;
import com.cdc.apihub.mx.FS.simulacion.client.api.FSApi;
import com.cdc.apihub.mx.FS.simulacion.client.model.*;

import okhttp3.OkHttpClient;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());
    private final FSApi api = new FSApi();

    private ApiClient apiClient;
    private String xApiKey = "your_api_key";
    private String url = "the_url";

    @Before()
    public void setUp() {
        this.apiClient = api.getApiClient();
         this.apiClient.setBasePath(url);
         OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
         apiClient.setHttpClient(okHttpClient);
    }
    
    @Test
    public void getReporteTest() throws ApiException {

        Peticion peticion = new Peticion();

        peticion.setFolio("123456");

        Persona persona = new Persona();
        persona.setNombres("JUAN");
        persona.setApellidoPaterno("SESENTAYDOS");
        persona.setApellidoMaterno("PRUEBA");
        persona.setFechaNacimiento("1965-08-09");
        persona.setRFC("SEPJ650809JG1");

        Domicilio domicilio = new Domicilio();
        domicilio.setDireccion("PASADISO ENCONTRADO 58");
        domicilio.setColoniaPoblacion("MONTEVIDEO");
        domicilio.setCiudad("CIUDAD DE MÉXICO");
        domicilio.setCP("07730");
        domicilio.setDelegacionMunicipio("GUSTAVO A MADERO");
        domicilio.setEstado(CatalogoEstados.CDMX);

        persona.setDomicilio(domicilio);

        peticion.setPersona(persona);

        try {
            Respuesta response = api.getReporte(xApiKey, peticion);

            Assert.assertTrue(response != null);
            if(response != null) {
                logger.info(response.toString());
            }
        } catch (ApiException e) {
            logger.info(e.getResponseBody());
        }
    }
    
}
