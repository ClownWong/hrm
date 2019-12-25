package cn.itsource.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页工具类
 * @param <T>
 */
public class PageList<T> {

    /*页数*/
    private Long total = 0L;
    private List<T> rows = new ArrayList<>();

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public PageList() {
    }

    public PageList(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }
}
