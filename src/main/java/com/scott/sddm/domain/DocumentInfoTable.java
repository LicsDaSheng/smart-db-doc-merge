package com.scott.sddm.domain;

import com.scott.sddm.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 文档信息表
 * Created by Scott on 2017/2/18.
 */
@Entity
@Setter
@Getter
public class DocumentInfoTable extends BaseEntity{

    public DocumentInfoTable(String name,String tableName,String tableDescription) {
        this.name=name;
        this.tableName=tableName;
        this.tableDescription=tableDescription;

    }

    /**
     * 文档名称
     */
    private String name;

    /**
     * 表名称
     */
    private String tableName;

    /**
     * 表描述
     */
    private String tableDescription;

    /**
     * 文档版本
     * 一个文档对应多个版本
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "documentInfoTable")
    private Set<TableVersion> versionList = new HashSet<>();

}
