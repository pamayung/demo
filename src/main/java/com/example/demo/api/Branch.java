package com.example.demo.api;

import com.example.demo.Util.Utils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("api/branch")
@RestController
public class Branch {

    @GetMapping("id/{id}")
    public ResponseEntity<String> getById(@PathVariable String id){

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("id", "string");
            jsonObject.put("name", "string");
            jsonObject.put("level", 0);
            jsonObject.put("parentName", "string");
            jsonObject.put("timezone", "string");
            jsonObject.put("ehomeId", "string");
            jsonObject.put("lastActive", 0);
        }
        catch (Exception e){
            e.printStackTrace();
            return Utils.setResponse(HttpStatus.INTERNAL_SERVER_ERROR, "");
        }

        return Utils.setResponse(HttpStatus.OK, jsonObject.toString());

    }

    @PostMapping("delete/{id}")
    public ResponseEntity<String> deteleById(@PathVariable String id){

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("message", "string");
            jsonObject.put("count", 0);
        }
        catch (Exception e){
            e.printStackTrace();
            return Utils.setResponse(HttpStatus.INTERNAL_SERVER_ERROR, "");
        }

        return Utils.setResponse(HttpStatus.OK, jsonObject.toString());
    }

    @PostMapping("save")
    public ResponseEntity<String> save(@RequestBody String body){

        JSONObject jsonObjectResponse = new JSONObject();
        try {
            JSONObject jsonObjectRequestBody = new JSONObject(body);
            String name = jsonObjectRequestBody.getString("name");
            String timezone = jsonObjectRequestBody.getString("timezone");

            jsonObjectResponse.put("id", "string");
            jsonObjectResponse.put("name", name);
            jsonObjectResponse.put("level", 0);
            jsonObjectResponse.put("parentName", "string");
            jsonObjectResponse.put("timezone", timezone);
            jsonObjectResponse.put("ehomeId", "string");
            jsonObjectResponse.put("lastActive", 0);
        }
        catch (Exception e){
            e.printStackTrace();
            return Utils.setResponse(HttpStatus.INTERNAL_SERVER_ERROR, "");
        }

        return Utils.setResponse(HttpStatus.OK, jsonObjectResponse.toString());
    }

    @GetMapping("all/level/{level}/{page}/{level}/{size}")
    public ResponseEntity<String> getAll(@PathVariable String level, @PathVariable String page, @PathVariable String size){

        JSONObject jsonObjectResponse = new JSONObject();
        try {

            JSONArray jsonArray = new JSONArray();
            jsonObjectResponse.put("totalPages", 0);
            jsonObjectResponse.put("totalElements", 0);

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", "string");
            jsonObject.put("name", "string");
            jsonObject.put("level", 0);
            jsonObject.put("parentName", "string");
            jsonObject.put("timezone", "string");
            jsonObject.put("ehomeId", "string");
            jsonObject.put("lastActive", 0);
            jsonArray.put(jsonObject);

            jsonObjectResponse.put("elements", jsonArray);
        }
        catch (Exception e){
            e.printStackTrace();
            return Utils.setResponse(HttpStatus.INTERNAL_SERVER_ERROR, "");
        }

        return Utils.setResponse(HttpStatus.OK, jsonObjectResponse.toString());

    }

    @GetMapping("all/children/{parentId}/{page}/{size}")
    public ResponseEntity<String> getChildren(@PathVariable String parentId, @PathVariable String page, @PathVariable String size){

        JSONObject jsonObjectResponse = new JSONObject();
        try {

            JSONArray jsonArray = new JSONArray();
            jsonObjectResponse.put("totalPages", 0);
            jsonObjectResponse.put("totalElements", 0);

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", "string");
            jsonObject.put("name", "string");
            jsonObject.put("level", 0);
            jsonObject.put("parentName", "string");
            jsonObject.put("timezone", "string");
            jsonObject.put("ehomeId", "string");
            jsonObject.put("lastActive", 0);
            jsonArray.put(jsonObject);

            jsonObjectResponse.put("elements", jsonArray);
        }
        catch (Exception e){
            e.printStackTrace();
            return Utils.setResponse(HttpStatus.INTERNAL_SERVER_ERROR, "");
        }

        return Utils.setResponse(HttpStatus.OK, jsonObjectResponse.toString());

    }

    @GetMapping("all/attendance/{page}/{size}")
    public ResponseEntity<String> getAttendance(@PathVariable String page, @PathVariable String size){

        JSONObject jsonObjectResponse = new JSONObject();
        try {

            JSONArray jsonArray = new JSONArray();
            jsonObjectResponse.put("totalPages", 0);
            jsonObjectResponse.put("totalElements", 0);

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", "string");
            jsonObject.put("name", "string");
            jsonObject.put("level", 0);
            jsonObject.put("parentName", "string");
            jsonObject.put("timezone", "string");
            jsonObject.put("ehomeId", "string");
            jsonObject.put("lastActive", 0);
            jsonArray.put(jsonObject);

            jsonObjectResponse.put("elements", jsonArray);
        }
        catch (Exception e){
            e.printStackTrace();
            return Utils.setResponse(HttpStatus.INTERNAL_SERVER_ERROR, "");
        }

        return Utils.setResponse(HttpStatus.OK, jsonObjectResponse.toString());

    }

    @PutMapping("edit/{id}")
    public ResponseEntity<String> edit(@RequestBody String body, @PathVariable String id){

        JSONObject jsonObjectResponse = new JSONObject();
        try {
            JSONObject jsonObjectRequestBody = new JSONObject(body);
            String name = jsonObjectRequestBody.getString("name");
            String timezone = jsonObjectRequestBody.getString("timezone");

            jsonObjectResponse.put("id", "string");
            jsonObjectResponse.put("name", name);
            jsonObjectResponse.put("level", 0);
            jsonObjectResponse.put("parentName", "string");
            jsonObjectResponse.put("timezone", timezone);
            jsonObjectResponse.put("ehomeId", "string");
            jsonObjectResponse.put("lastActive", 0);
        }
        catch (Exception e){
            e.printStackTrace();
            return Utils.setResponse(HttpStatus.INTERNAL_SERVER_ERROR, "");
        }

        return Utils.setResponse(HttpStatus.OK, jsonObjectResponse.toString());
    }

    @PostMapping("removeParent/{id}")
    public ResponseEntity<String> removeParent(@RequestBody String body, @PathVariable String id){

        JSONObject jsonObjectResponse = new JSONObject();
        try {
            JSONObject jsonObjectRequestBody = new JSONObject(body);
            String name = jsonObjectRequestBody.getString("name");
            String timezone = jsonObjectRequestBody.getString("timezone");

            jsonObjectResponse.put("id", "string");
            jsonObjectResponse.put("name", name);
            jsonObjectResponse.put("level", 0);
            jsonObjectResponse.put("parentName", "string");
            jsonObjectResponse.put("timezone", timezone);
            jsonObjectResponse.put("ehomeId", "string");
            jsonObjectResponse.put("lastActive", 0);
        }
        catch (Exception e){
            e.printStackTrace();
            return Utils.setResponse(HttpStatus.INTERNAL_SERVER_ERROR, "");
        }

        return Utils.setResponse(HttpStatus.OK, jsonObjectResponse.toString());
    }

    @PostMapping("repartent/{id}/{newParentId}")
    public ResponseEntity<String> repartent(@RequestBody String body, @PathVariable String id, @PathVariable String newParentId){

        JSONObject jsonObjectResponse = new JSONObject();
        try {
            JSONObject jsonObjectRequestBody = new JSONObject(body);
            String name = jsonObjectRequestBody.getString("name");
            String timezone = jsonObjectRequestBody.getString("timezone");

            jsonObjectResponse.put("id", "string");
            jsonObjectResponse.put("name", name);
            jsonObjectResponse.put("level", 0);
            jsonObjectResponse.put("parentName", "string");
            jsonObjectResponse.put("timezone", timezone);
            jsonObjectResponse.put("ehomeId", "string");
            jsonObjectResponse.put("lastActive", 0);
        }
        catch (Exception e){
            e.printStackTrace();
            return Utils.setResponse(HttpStatus.INTERNAL_SERVER_ERROR, "");
        }

        return Utils.setResponse(HttpStatus.OK, jsonObjectResponse.toString());
    }

    @PostMapping("saveParentId/{parentId}")
    public ResponseEntity<String> saveByParentId(@RequestBody String body, @PathVariable String parentId){

        JSONObject jsonObjectResponse = new JSONObject();
        try {
            JSONObject jsonObjectRequestBody = new JSONObject(body);
            String name = jsonObjectRequestBody.getString("name");
            String timezone = jsonObjectRequestBody.getString("timezone");

            jsonObjectResponse.put("id", "string");
            jsonObjectResponse.put("name", name);
            jsonObjectResponse.put("level", 0);
            jsonObjectResponse.put("parentName", "string");
            jsonObjectResponse.put("timezone", timezone);
            jsonObjectResponse.put("ehomeId", "string");
            jsonObjectResponse.put("lastActive", 0);
        }
        catch (Exception e){
            e.printStackTrace();
            return Utils.setResponse(HttpStatus.INTERNAL_SERVER_ERROR, "");
        }

        return Utils.setResponse(HttpStatus.OK, jsonObjectResponse.toString());
    }
}
