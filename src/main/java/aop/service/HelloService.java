package aop.service;

import aop.dto.*;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
public class HelloService {
    @SneakyThrows
    public Dto getMessage(){
        Thread.sleep(new Random().nextInt(1000));
        return new Dto("Hello World");
    }
}
