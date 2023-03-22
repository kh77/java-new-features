package com.example.java15.multilinestring;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MultilineStringExample {

    public static void main(String[] args) throws JSONException, IOException {
        htmlAsTextBlock();
        testJsonResponse();
    }


    public static void htmlAsTextBlock() {
        String html = "<html>\n" +
                "  <head>\n" +
                "    <title>Text Blocks</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <p>I am inside a text block...</p>\n" +
                "  </body>\n" +
                "</html>";

        System.out.println(html);

        String htmlTextBlock = """
                <html>
                  <head>
                    <title>Text Blocks</title>
                  </head>
                  <body>
                    <p>I am inside a text block...</p>
                  </body>
                </html>""";
        System.out.println(htmlTextBlock);
        System.out.println("Are 2 strings equal : " + html.equals(htmlTextBlock));
    }


    public static void testJsonResponse() throws JSONException, IOException {

        var path = Path.of("src/main/resources/matchresult.json");
        var objectMapper = new ObjectMapper();
        var matchResult = objectMapper.readValue(Files.readString(path), Employee.class);

        String expectedMatchResultJson = ""
                + "{\n"
                + "  \"id\":101,\n"
                + "  \"date\":\"2021-08-08\",\n"
                + "  \"name\":\"Mark\"\n"
                + "}";

        JSONAssert.assertEquals(expectedMatchResultJson, objectMapper.writeValueAsString(matchResult), false);

    }
}
