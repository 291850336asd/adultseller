package com.videosplay.main;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.videosplay.main.test.business.Customers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController{

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    JdbcTemplate jdbcTemplate;
    @CrossOrigin
    @RequestMapping("/greeting")
    @Transactional
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {

        log.info("333333333333");
        log.error("à1111111111");
        log.warn("2222222222");
        RowMapper<Customers> personMapper = new BeanPropertyRowMapper<Customers>(Customers.class);
        List<Customers> info = jdbcTemplate.query("select * from customers", personMapper);
         System.out.print(info.get(0).getId());
        // //测试事务
//        String queryStr = "UPDATE videos SET play_count = 200 where video_id = " + 1;
//        jdbcTemplate.update(queryStr);
//
//        int i = 1;
//        i = i/0;
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    @CrossOrigin
    @RequestMapping("/getallinfos")
    public InfosData getInfos(){
        return  new InfosData();
    }
}