package com.munnachauhan.document.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Example controller ping message for document.
 *
 * @author Munna Chauhan
 */

@RestController
@RequestMapping("/document")
public class DocumentController {

    @Value("${document.message}")
    private String message;

    @Value("${application.shared.attribute}")
    private String shared;

    @GetMapping("/ping")
    private String getMessage() {
        return shared + " : " + message;
    }

}
