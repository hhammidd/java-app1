package com.hamidApp1.controller.merchant;

import com.hamidApp1.model.merchantFraud.BaseMerchantFraudToolBean;
import com.hamidApp1.model.merchantFraud.MerchantFraudToolOutputBean;
import com.hamidApp1.model.usersGis.UsersGis;
import com.hamidApp1.service.merchant.MerchantFToolService;

import com.hamidApp1.service.merchant.MerchantFraudToolService;
import com.hamidApp1.service.util.Constant;
import com.hamidApp1.service.util.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/merchantfraudtool")
public class MerchantFToolControllers {
    @Autowired
    private MerchantFraudToolService merchantService;

    @GetMapping(value = "/findall/{userCod}")
    public GenericResponse<MerchantFraudToolOutputBean> getAllMerchantFraud(@PathVariable final String userCod) throws SQLException{

        MerchantFraudToolOutputBean merchantOutputBean =  null;
        merchantOutputBean = merchantService.getAllMerchantFrauds(userCod);

                //Insert After talke the datas
        if(merchantService == null){
            return new GenericResponse<>(null,Constant.ERROR_MSG,Constant.ERROR);
        } else {
            return new GenericResponse<>(merchantOutputBean,Constant.SUCCESS_M,Constant.SUCCESS);
        }
    }

    @RequestMapping(value = "/{USER_COD}", method = RequestMethod.GET)
    public List<BaseMerchantFraudToolBean> getAll(@PathVariable("USER_COD") String USER_COD) {
        return merchantService.findByUserCode(USER_COD);
    }


}
