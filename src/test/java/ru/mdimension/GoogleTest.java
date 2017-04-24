package ru.mdimension;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

    private Translate translate = TranslateOptions.getDefaultInstance().getService();

    @Test
    public void GoogleTest_NG () {

        Translation translation =
                translate.translate(
                        "The home",
                        TranslateOption.sourceLanguage("en"),
                        TranslateOption.targetLanguage("ru"));

        Assert.assertEquals(translation.getTranslatedText(), "Дом", "Incorrect translation");
    }
}
