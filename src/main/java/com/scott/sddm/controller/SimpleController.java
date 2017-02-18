package com.scott.sddm.controller;

import com.scott.sddm.domain.DocumentInfoTable;
import com.scott.sddm.reponsitory.DocumentInfoTanleRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Scott on 2017/2/18.
 */
@Controller
@RequestMapping(name = "/tableManager")
public class SimpleController {

    @Autowired
    DocumentInfoTanleRep documentInfoTanleRep;

    @RequestMapping("/save")
    public String saveTable(@RequestBody DocumentInfoTable documentInfoTable, ModelMap model){
         documentInfoTanleRep.save(documentInfoTable);
        return "table_list";
    }

    @RequestMapping("/findAll")
    public String findAll(ModelMap model){
        model.put("table",documentInfoTanleRep.findAll());
        return "table_list";
    }
}
