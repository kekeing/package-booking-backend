package com.example.backendbymyself.Service;


import com.example.backendbymyself.Modle.PackageInfo;
import com.example.backendbymyself.Responsity.PackageInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PackageInfoService {
    @Autowired
    private PackageInfoRepository packageInfoRepository;

    public List<PackageInfo> findAll(){return packageInfoRepository.findAll();}
    public void savePackageInfo(PackageInfo packageInfo){packageInfoRepository.save(packageInfo);}
    public void deletePackageInfo(PackageInfo packageInfo){packageInfoRepository.delete(packageInfo);}
    public PackageInfo findPackageInfoByWaybillNumber(String waybillNumber){return packageInfoRepository.findByWaybillNumber(waybillNumber);}
}
