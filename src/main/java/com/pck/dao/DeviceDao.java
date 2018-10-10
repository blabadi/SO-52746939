package com.pck.dao;

import com.pck.Device.Device;
import com.pck.dao.repositories.IDeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DeviceDao
{
    @Autowired
    IDeviceRepository iDeviceRepository;

    public Device saveDevice(Device device) {
        return iDeviceRepository.save(device);
    }
}