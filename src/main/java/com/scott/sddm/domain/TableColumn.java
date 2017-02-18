package com.scott.sddm.domain;

import com.scott.sddm.base.BaseEntity;

import javax.persistence.*;

/**
 * 表格字段
 * Created by Scott on 2017/2/18.
 */
@Entity
public class TableColumn extends BaseEntity {

    /**
     * 字段描述
     */
    private String columnDescription;

    /**
     * 字段名
     */
    private String columnName;

    /**
     * 字段类型
     */
    private String  dbType;

    /**
     * 字段扩展信息
     */
    private String expandInfo;

    /**
     * 对应表格版本
     */
    @ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, optional = true)
    @JoinColumn(name = "version_id")
    private TableVersion tableVersion;
}
