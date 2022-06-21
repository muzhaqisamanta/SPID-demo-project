package service;

import entities.Spid;
import entities.enums.SpidStatus;

import java.util.ArrayList;
import java.util.List;

public class SpidService {

    List<Spid> listOfSpids = new ArrayList<>();

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
