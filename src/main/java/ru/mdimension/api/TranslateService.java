package ru.mdimension.api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.springframework.stereotype.Service;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

/**
 * Created by aefimov on 21/04/2017.
 */
@Service
public class TranslateService {

	private static final String KEY = "trnsl.1.1.20170424T081847Z.cf40243a313306af.901d3104cd0156985dd5559c3ef071d6fdcdd225";

	public Response translate(String text, String lang) {
		return given()
                .contentType(ContentType.JSON)
				.param("key", KEY)
				.param("text", text)
				.param("lang", lang)
				.expect().statusCode(SC_OK)
				.when()
				.get("https://translate.yandex.net/api/v1.5/tr.json/translate");
	}
}