package com.pck.dao.repositories;

import com.pck.Device.Device;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeviceRepository extends CrudRepository<Device, Long> {
}
