package com.example.repository;

import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import com.example.model.*;

@Repository
public interface RueckRepository extends JpaRepository<Rueck, Long> {
	
	
}