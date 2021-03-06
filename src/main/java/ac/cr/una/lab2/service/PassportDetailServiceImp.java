/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.lab2.service;

import ac.cr.una.lab2.dao.passportDetailDao;
import ac.cr.una.lab2.model.PassportDetail;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author MACJuanJara
 */
@Service
public class PassportDetailServiceImp implements PassportDetailService {

    @Autowired
    private passportDetailDao passportDetailDao;
    
    @Transactional
    @Override
    public void add(PassportDetail passport) {
        passportDetailDao.add(passport);
    }

    @Transactional(readOnly = true)
    @Override
    public List<PassportDetail> listPassports() {
       return passportDetailDao.listPassports();
    }

    @Override
    public PassportDetail getById(Long idPassport) {
        return passportDetailDao.getById(idPassport);
    }

    @Override
    public PassportDetail update(Long idPassport, PassportDetail passport) {
        PassportDetail passportPersisted = passportDetailDao.update(idPassport, passport);

        return passportPersisted;
    }

    @Override
    public boolean deleteById(Long idPassport) {
        return passportDetailDao.deleteById(idPassport);
    }

}
