package com.smartthings.security.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Joe Grandja
 */
@RestController
@RequestMapping("/messages")
public class MessagesController {

    @RequestMapping(method = RequestMethod.GET)
    public String[] getMessages() {
        String[] messages = new String[] {"Message 1", "Message 2", "Message 3"};

        return messages;
    }
}