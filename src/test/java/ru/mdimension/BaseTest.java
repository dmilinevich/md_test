package ru.mdimension;

import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.mdimension.api.TranslateService;
import ru.mdimension.dto.Translate;

/**
 * Created by aefimov on 21/04/2017.
 */
public class BaseTest {

	@Autowired
	private TranslateService translateService = new TranslateService();

	@Test
	public void Yandex_trans() {
		Response response = translateService.translate("Home","en-ru");
        Translate translate = response.getBody().as(Translate.class);
		Assert.assertTrue(translate.getText().size()==1, "Wrong number of words");
		Assert.assertEquals(translate.getText().get(0), "Дома", "Incorrect translation");
	}
}
