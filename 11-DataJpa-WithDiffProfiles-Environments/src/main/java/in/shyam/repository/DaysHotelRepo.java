package in.shyam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shyam.entity.DaysHotel;
import in.shyam.entity.DaysHotelCPK;

public interface DaysHotelRepo extends JpaRepository<DaysHotel, DaysHotelCPK> {

}
