package com.example.backendbymyself.Controller;

import com.example.backendbymyself.Modle.PackageInfo;
import com.example.backendbymyself.Service.PackageInfoService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "package")
public class PackageInfoController {
    @Autowired
    private PackageInfoService packageInfoService;

    @PostMapping(value = "")
    public void addPackageInfo(@RequestBody PackageInfo packageInfo){
        packageInfoService.savePackageInfo(packageInfo);
    }

    @GetMapping(value = "")
    public List<PackageInfo> getAllPackageInfo(){
        return packageInfoService.findAll();
    }

    @GetMapping(value = "/way")
    public PackageInfo findPackageInfoByWaybillNumber(@RequestParam("waybillNumber") String waybillNumber){
        return  packageInfoService.findPackageInfoByWaybillNumber(waybillNumber);
    }
    @PutMapping(value = "")
    public void updatePostdate(@RequestBody PackageInfo packageInfo,@RequestParam("postdate") String postdate){
        packageInfo.setPostdate(postdate);
    }
}
