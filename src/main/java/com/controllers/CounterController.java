package com.controllers;


import com.models.Counter;
import com.repositories.CounterRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CounterController {

    private CounterRepository counterDao;

    public CounterController(@Qualifier("counter") CounterRepository counterDao){
        this.counterDao = counterDao;
    }

    @GetMapping("/")
    public String home(Model viewModel) {
        Counter counter = counterDao.getById(1L);
        System.out.println("counter.getCounter() = " + counter.getCounter());
        viewModel.addAttribute("counter",counter);
        return "home/home";

    }




}

