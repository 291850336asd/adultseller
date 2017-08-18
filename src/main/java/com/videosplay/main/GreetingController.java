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

    @CrossOrigin
    @RequestMapping("/getInfos")
    public String getInfo(){
        
        String datas = "{\"status\":\"OK\",\"code\":null,\"msg\":null,\"data\":[{\"id\":20,\"name\":\"环球时报\",\"authenIDs\":null,\"pdmiOrgId\":\"6a0dd2c003ef49109aa68f2b60bef6c0\",\"status\":0},{\"id\":18,\"name\":\"人民日报\",\"authenIDs\":null,\"pdmiOrgId\":\"b2c2ccd41f184481b070244d8b5dd039\",\"status\":0},{\"id\":21,\"name\":\"证券时报\",\"authenIDs\":null,\"pdmiOrgId\":\"209fb89c86b846aa8652d009d45d2bab\",\"status\":0},{\"id\":22,\"name\":\"人民日报媒体技术股份有限公司\",\"authenIDs\":null,\"pdmiOrgId\":\"5d045846925f4d6ea7dec6875c6f96b8\",\"status\":0},{\"id\":23,\"name\":\"南方报业集团\",\"authenIDs\":null,\"pdmiOrgId\":\"0fce85ca3f0c41b58b0ce2a7f99632a1\",\"status\":0},{\"id\":24,\"name\":\"人民日报社\",\"authenIDs\":null,\"pdmiOrgId\":\"5866adb35d5244739015fd2623f06d59\",\"status\":0},{\"id\":25,\"name\":\"福建日报\",\"authenIDs\":null,\"pdmiOrgId\":\"25361fc905f243e9b7c94f9542e25853\",\"status\":0},{\"id\":26,\"name\":\"新疆日报\",\"authenIDs\":null,\"pdmiOrgId\":\"578bbcb33871477c8462af68998fd72f\",\"status\":0},{\"id\":27,\"name\":\"大众日报\",\"authenIDs\":null,\"pdmiOrgId\":\"310e7d94360e411184557406ace67c82\",\"status\":0},{\"id\":28,\"name\":\"南方新闻网\",\"authenIDs\":null,\"pdmiOrgId\":\"8bc1b5f3d6aa4fceb0bf613a91614edc\",\"status\":0},{\"id\":31,\"name\":\"温州都市报\",\"authenIDs\":null,\"pdmiOrgId\":\"6595a5dcc5d741f5b8523d6fab866676\",\"status\":0},{\"id\":33,\"name\":\"全媒体采编技能培训班第一期\",\"authenIDs\":null,\"pdmiOrgId\":\"c37fd36d4a3843fa89d97329124e60bf\",\"status\":0},{\"id\":35,\"name\":\"中国农业银行\",\"authenIDs\":null,\"pdmiOrgId\":\"879565d0c5b3497eade84a389f808fdf\",\"status\":0},{\"id\":36,\"name\":\"成都传媒集团\",\"authenIDs\":null,\"pdmiOrgId\":\"d3574fddc3b5484b9fb60920ec155836\",\"status\":0},{\"id\":37,\"name\":\"行业对比\",\"authenIDs\":null,\"pdmiOrgId\":\"2cea151ab6aa41b38c18eb2156a0b8bd\",\"status\":0},{\"id\":39,\"name\":\"环球时报\",\"authenIDs\":null,\"pdmiOrgId\":\"0067c04dd64f41d8973e71d88bf9bd77\",\"status\":0},{\"id\":41,\"name\":\"秘书杂志\",\"authenIDs\":null,\"pdmiOrgId\":\"3f3a1964de0f4322b61f4888cbcb5736\",\"status\":0},{\"id\":42,\"name\":\"检察日报\",\"authenIDs\":null,\"pdmiOrgId\":\"e4bdeaac6668405393066691129b6cdf\",\"status\":0},{\"id\":44,\"name\":\"健康时报\",\"authenIDs\":null,\"pdmiOrgId\":\"55e2b1ddc0294a57831767868407af7b\",\"status\":0},{\"id\":45,\"name\":\"求是网\",\"authenIDs\":null,\"pdmiOrgId\":\"ac66a52b273341ec9e5dc0ccbdd7d15f\",\"status\":0},{\"id\":47,\"name\":\"生命时报\",\"authenIDs\":null,\"pdmiOrgId\":\"8e163c78387e475793c3a75ba8a03883\",\"status\":0},{\"id\":49,\"name\":\"北京正义网络传媒有限公司\",\"authenIDs\":null,\"pdmiOrgId\":\"9a1bed233bae420a96ff0463be2fe7bc\",\"status\":0},{\"id\":51,\"name\":\"演示机构\",\"authenIDs\":null,\"pdmiOrgId\":\"adb6df15e3c7481aaaf29997a3f3125f\",\"status\":0},{\"id\":53,\"name\":\"河南日报\",\"authenIDs\":null,\"pdmiOrgId\":\"11dbf2d1d02844c29a87ee16321f2251\",\"status\":0},{\"id\":54,\"name\":\"苏州广播电视总台\",\"authenIDs\":null,\"pdmiOrgId\":\"cb092c5220ca47a0860e8e098aa5b9c0\",\"status\":0},{\"id\":55,\"name\":\"内蒙古日报社\",\"authenIDs\":null,\"pdmiOrgId\":\"4432115b51444999a38871b508d0c351\",\"status\":0},{\"id\":56,\"name\":\"人民数据社\",\"authenIDs\":null,\"pdmiOrgId\":\"5030eac991534d51b689219d81150ea6\",\"status\":0}],\"time\":1503040016269,\"page\":null}";
        return  datas;
    }
}