package com.controllers;

/**
 * Created by ankur on 12/7/17.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.entities.User;
import com.servicesapi.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/")
public class MainController {

    @Autowired
    private RegisterService registerService;

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getHomePage() {
        ModelAndView view = new ModelAndView("welcome");
        return view;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public @ResponseBody ModelAndView getSaved(@ModelAttribute User user, BindingResult bindingResult) {
        //Map<String, Object> map = new HashMap<String, Object>();
        ModelAndView model = new ModelAndView();
        if(registerService.save(user)){
            model.setViewName("welcome");
        }
        /*if (bindingResult.hasErrors()) {
            model.setViewName("hello");
            List<String> messages = new ArrayList<String>();
            for (Object object : bindingResult.getAllErrors()) {
                if (object instanceof FieldError) {
                    FieldError fieldError = (FieldError) object;
                    messages.add(messageSource.getMessage(fieldError, null));
                }
            }
            System.out.println("Date " + user.getDob());
            model.addObject("errorMesg", messages);
            System.out.println("Error");
            return model;
        }
        System.out.println("Date " + user.getDob());
        model.addObject("userData", user);
        */
        return model;

/*        if (registerService.save(user)) {
            map.put("status", "200");
            map.put("message", "Your record have been saved successfully");
        }

        return
                map;*/

    }

/*    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> getAll(User user) {
        Map<String, Object> map = new HashMap<String, Object>();

        List<User> list = registerService.list();

        if (list != null) {
            map.put("status", "200");
            map.put("message", "Data found");
            map.put("data", list);
        } else {
            map.put("status", "404");
            map.put("message", "Data not found");

        }

        return map;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> delete(User users) {
        Map<String, Object> map = new HashMap<String, Object>();

        if (registerService.delete(users)) {
            map.put("status", "200");
            map.put("message", "Your record have been deleted successfully");
        }

        return map;
    }*/
}
