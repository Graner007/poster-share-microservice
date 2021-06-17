package com.codecool.poster.controller;

import com.codecool.poster.model.Share;
import com.codecool.poster.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping(path = "/share")
public class ShareController {

    @Autowired
    private ShareService shareService;

    @PostMapping(path = "/{postId}")
    public void share(@PathVariable(value = "postId") long postId,
            @RequestHeader("userId") long personId) {
        shareService.saveShare(personId, postId);
    }

    @DeleteMapping(path = "/{postId}")
    public void unShare(@PathVariable("postId") long postId,
                        @RequestHeader("userId") long personId) {
        shareService.deleteShare(personId, postId);
    }

    @GetMapping(path = "/shares-with-post")
    public ResponseEntity shares(@RequestParam(value = "request") Long[] postIds) { return shareService.findAllByPersonIdIn(Arrays.asList(postIds)); }
}
