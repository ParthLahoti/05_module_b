package com.example.indiaskills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ssrms")
public class ssrmController {
    @Autowired
    private SsrmRepository ssrmRepository;

    @GetMapping("/{id}")
    public id
}
