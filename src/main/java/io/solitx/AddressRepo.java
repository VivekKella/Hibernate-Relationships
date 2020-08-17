package io.solitx;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, UUID> {

}
