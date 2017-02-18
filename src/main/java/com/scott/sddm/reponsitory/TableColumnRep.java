package com.scott.sddm.reponsitory;

import com.scott.sddm.domain.TableColumn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Scott on 2017/2/18.
 */
@Repository
public interface TableColumnRep extends JpaRepository<TableColumn, String> {
}
