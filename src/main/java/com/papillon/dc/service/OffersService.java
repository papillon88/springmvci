package com.papillon.dc.service;

import com.papillon.dc.dao.Offer;
import com.papillon.dc.dao.OfferDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by papillon on 5/17/2017.
 */
@Service("offerService")
public class OffersService {

    private OfferDao offerDao;

    @Autowired
    public void setOfferDao(OfferDao offerDao) {
        this.offerDao = offerDao;
    }

    public List<Offer> getCurrent(){
        return offerDao.getOffers();
    }

    public void create(Offer offer){
        offerDao.create(offer);
    }

    public void throwTestException() {

        offerDao.getOffer(9999);

    }
}
