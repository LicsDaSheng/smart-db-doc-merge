package com.scott.sddm.domain;

import com.scott.sddm.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * 表版本
 * Created by Scott on 2017/2/18.
 */
@Entity
public class TableVersion extends BaseEntity {

    /**
     * 表格版本
     */
    private String tableVersion;

    /**
     * 版本状态 1:使用 0:未使用
     */
    private String versionStatus;

    /**
     * 对应的页面模板
     */
    private String ftlTemplate;

    /**
     * 对应word模板
     */
    private String wordTemplate;

    @ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, optional = true)
    @JoinColumn(name = "table_id")
    private DocumentInfoTable documentInfoTable;

    /**
     * 版本表格的字段
     * 一个版本的表格会有多个字段
     */
    @OneToMany(mappedBy = "tableVersion", fetch= FetchType.EAGER)
    private List<TableColumn> columnList;

}
