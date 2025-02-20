package guru.springframework.spring6webapp.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String getMessage() {
        return "Hello from Service!";
    }
}