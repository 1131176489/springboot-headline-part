package cg.top.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @TableName news_type
 */

@Data
public class Type implements Serializable {
    private Integer tid;

    private String tname;

    private Integer version;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}