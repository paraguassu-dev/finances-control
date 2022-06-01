package com.api.financescontrol.repositories;

import com.api.financescontrol.models.Incoming;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IncomingRepository extends JpaRepository<Incoming, UUID> {
}
