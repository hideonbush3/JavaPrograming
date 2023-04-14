package hideonbush3.project.sungjuk.dao;

import hideonbush3.project.sungjuk.model.SungJukVO;

import java.util.List;

public interface SungJukV3DAO {
    boolean saveSungJuk(SungJukVO sj);

    List<SungJukVO> loadSungJuk();
}
