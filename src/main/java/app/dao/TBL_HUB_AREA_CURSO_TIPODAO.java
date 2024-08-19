package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*;


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("app-TBL_HUB_AREA_CURSO_TIPODAO")
@Transactional(transactionManager="app-TransactionManager")
public interface TBL_HUB_AREA_CURSO_TIPODAO extends JpaRepository<TBL_HUB_AREA_CURSO_TIPO, java.lang.String> {

}
