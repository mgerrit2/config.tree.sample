package com.config.tree.sample.controller;

import com.config.tree.sample.service.MySecretService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/secret")
public class SecretController {

    private final MySecretService secretSv;

    @GetMapping(value = "" ,
            produces = {
                    MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_PROBLEM_JSON_VALUE,
                    MediaType.TEXT_HTML_VALUE
            }
    )
    public ResponseEntity<String> getSecret(){

        var result = secretSv.getMailSecret();

        return ResponseEntity.ok(result);
    }

}
