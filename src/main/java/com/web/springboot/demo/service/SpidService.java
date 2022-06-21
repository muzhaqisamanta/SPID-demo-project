package com.web.springboot.demo.service;

import com.web.springboot.demo.entities.Spid;
import com.web.springboot.demo.entities.enums.SpidStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SpidService {


    public List<Spid> listOfSpids = new ArrayList<>();

    public Spid addSpid(Spid spid) {
        Spid savedSpid = new Spid(
                spid.getId(),
                spid.getDescription(),
                spid.getUser()
        );
        listOfSpids.add(savedSpid);
        return savedSpid;

    }
    public static void editSpid(Spid spid, SpidStatus status){
        spid.setStatus(status);
    }

}
