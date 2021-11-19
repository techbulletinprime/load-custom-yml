package com.yaml.load;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YamlReaderController {
    @Value("${india.telengana}")
    private String abbr;

    @GetMapping("/getvalue")
    public String getValue() {
        return abbr;
    }
}
