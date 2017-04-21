package ru.mdimension.api;

import io.restassured.response.Response;
import org.springframework.stereotype.Service;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

/**
 * Created by aefimov on 21/04/2017.
 */
@Service
public class TranslateService {

	private static final String KEY = "";

	public Response translate(String text, String lang) {
		return given()
				.param("key", KEY)
				.param("text", text)
				.param("lang", lang)
				.expect().statusCode(SC_OK)
				.when()
				.get("https://translate.yandex.net/api/v1.5/tr.json/translate");
	}
}