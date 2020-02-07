package io.apihub.client.api;

import io.apihub.client.ApiClient;
import io.apihub.client.ApiException;
import io.apihub.client.model.*;
import okhttp3.OkHttpClient;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class FicoScoreApiTest {

    private Logger logger = LoggerFactory.getLogger(FicoScoreApiTest.class.getName());
    private final FicoScoreApi api = new FicoScoreApi();

    private ApiClient apiClient = null;

    @Before()
    public void setUp() {

        this.apiClient = api.getApiClient();
        this.apiClient.setBasePath("the_url");
        OkHttpClient insecureClient = ApiClient.getClientNoSSLVerification();
        OkHttpClient okHttpClient = insecureClient.newBuilder()
                .readTimeout(60, TimeUnit.SECONDS)
                .build();
        apiClient.setHttpClient(okHttpClient);
    }
    
    @Test
    public void getReporteTest() throws ApiException {
        String xApiKey = "kCxyo6Z8TXXOo0Mw8Lodv2cKTNu6b7KG";

        Peticion peticion = new Peticion();

        peticion.setFolio("1235");

        Persona persona = new Persona();
        persona.setNombres("Erick");
        persona.setApellidoPaterno("OLIVOS");
        persona.setApellidoMaterno("JIMENEZ");
        persona.setFechaNacimiento("13-05-1966");
        persona.setRFC("CUPU800825569");

        Domicilio domicilio = new Domicilio();
        domicilio.setDireccion("san joaquin");
        domicilio.setColoniaPoblacion("el arenal");
        domicilio.setCiudad("mexico");
        domicilio.setCP("12345");
        domicilio.setDelegacionMunicipio("iztapalapa");
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
