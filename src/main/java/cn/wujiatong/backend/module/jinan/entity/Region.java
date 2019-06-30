package cn.wujiatong.backend.module.jinan.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author wujiatong
 * @since 2019-06-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private Long cityId;

    private Long parentId;

    private String remark;


}
