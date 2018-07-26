/**
 * 
 */
package com.heyjson.validator.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


import org.json.JSONException;
import org.json.JSONObject;
/**
 * @author Vamsi
 *
 */
public class ParseJSON {

	public static JSONObject parseJSONFile(String filename) throws JSONException, IOException {
        String content = new String(Files.readAllBytes(Paths.get(filename)));
        return new JSONObject(content);
    }
}
