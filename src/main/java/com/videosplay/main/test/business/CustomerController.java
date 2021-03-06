package com.videosplay.main.test.business;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.videosplay.main.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * Created by sunmeng on 17/7/4.
 */
@Controller    // This means that this class is a Controller
@RequestMapping(path="/customer") // This means URL's start with /demo (after Application path)
public class CustomerController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private CustomersRepository userRepository;

    @CrossOrigin
    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody String addNewUser (@RequestParam String firstname
            , @RequestParam String lastname, @RequestParam int age) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Customers n = new Customers();
        n.setFirstname(firstname);
        n.setLastname(lastname);
        n.setAge(age);
        userRepository.save(n);
        return "Saved";
    }

    @CrossOrigin
    @GetMapping(path="/all")
    public @ResponseBody ResonseData getAllUsers() {
        // This returns a JSON or XML with the users
        ResonseData<Iterable<Customers>> dataInfos= new ResonseData<Iterable<Customers>>();
        dataInfos.setCode(200);
        dataInfos.setData(userRepository.findAll());
        return dataInfos;
    }

    @CrossOrigin
    @PostMapping(path = "/update",consumes ="application/json")
    public @ResponseBody boolean updateCustomer(@RequestParam int id){
        Customers customers = userRepository.findOne(id);
        if(customers != null){
            userRepository.delete(customers);
            return true;
        }else{
            return false;
        }

    }

    @CrossOrigin
    @PostMapping(path = "/update11")
    public @ResponseBody ResonseData<UserTest> updateCustomerByJson(@RequestBody String request){
        pritln(request);
        ResonseData<UserTest> resonseData = new ResonseData<UserTest>();
       try {
           ObjectMapper objectMapper = new ObjectMapper();
           RequestData<Greeting> data = (RequestData<Greeting>)objectMapper.readValue(request, RequestData.class);
           pritln(data);
           resonseData.setCode(200);
           resonseData.setMessage("sucess");
           UserTest userTest = new UserTest();
           userTest.setName("long");
           resonseData.setData(userTest);
       }catch (IOException e){
           resonseData.setCode(400);
           resonseData.setData(null);
       }
        pritln(resonseData);
        return resonseData;
    }


    @CrossOrigin
    @PostMapping(path = "/update22")
    public @ResponseBody boolean updateCustomerByJsonFormData(@RequestParam int type, @RequestParam String requestCode, @RequestParam String data){
        pritln(data);
        return true;
    }

    private void pritln(Object o){
        System.out.println(o.toString());
    }
}
