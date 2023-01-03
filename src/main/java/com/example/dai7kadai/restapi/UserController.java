package com.example.dai7kadai.restapi;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;

@RestController
public class UserController {


    @GetMapping("/user")
    public CreateForm createForm(@RequestParam(value = "name", defaultValue = "name") String name,
                                 @RequestParam(value = "birthday", defaultValue = "0000") String birthday) {
        return new CreateForm(String.format(name), String.format(birthday));
    }

    @PostMapping("/user")
    public ResponseEntity<Map<String, String>> create(@RequestBody @Validated CreateForm form, UriComponentsBuilder uriBuilder) {
        URI url = uriBuilder.path("/names/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body(Map.of("message", "name successfully created"));

    }

    @PatchMapping("/user/{id}")
    public ResponseEntity<Map<String, String>> update(@PathVariable("id") int id, @RequestBody @Validated UpdateForm form) {
        return ResponseEntity.ok(Map.of("message", "name successfully updated"));
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Map<String, String>> delete(@PathVariable("id") int id) {
        return ResponseEntity.ok(Map.of("message", "name successfully deleted"));
    }
}




