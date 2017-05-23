package com.papillon.dc.service;

import com.papillon.dc.dao.Offer;
import com.papillon.dc.dao.OfferDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by papillon on 5/17/2017.
 */
@Service("offerService")
public class OffersService {

    private OfferDAO offerDAO;

    @Autowired
    public void setOfferDAO(OfferDAO offerDAO) {
        this.offerDAO = offerDAO;
    }

    public List<Offer> getCurrent(){
        return offerDAO.getOffers();
    }

    public void create(Offer offer){
        offerDAO.create(offer);
    }

    public void throwTestException() {
        
    }
}
