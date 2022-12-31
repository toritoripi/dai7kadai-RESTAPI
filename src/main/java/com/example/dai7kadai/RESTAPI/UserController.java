package com.example.dai7kadai.RESTAPI;

import org.jetbrains.annotations.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;

@Validated
@RestController
public class UserController {


    @GetMapping("/user")
    public CreateForm createForm(@RequestParam(value = "name", defaultValue = "name") String name,
                                 @RequestParam(value = "birthday", defaultValue = "0000") String birthday,
                                 @RequestParam(value = "id", defaultValue = "0000") String id) {

        return new CreateForm(String.format(name), String.format(birthday), String.format(id));
    }


    @PostMapping("/user")
    public ResponseEntity<Map<String, String>> createTopic(CreateForm form, @NotNull UriComponentsBuilder uriComponentsBuilder) {
        URI uri = uriComponentsBuilder.path("/user/id")
                .build()
                .toUri();

        return ResponseEntity.created(uri).body(Map.of("message", "name successfully created"));
    }

    @PatchMapping("/user/{id}")
    public ResponseEntity<Map<String, String>> editTopic(@PathVariable @NotNull Integer id, @NotNull CreateForm form) {

        return ResponseEntity.ok(Map.of("message", "name successfully updated"));
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Map<String, String>> deleteTopic(@PathVariable Integer id) {
        return ResponseEntity.ok(Map.of("message", "name successfully deleted"));
    }
}

