package jp.co.dreamarts.bean;

import java.util.List;

/**
 * Created by Antony on 14-6-12.
 */
public class ResultPage {

    private List rows;
    private int total;

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
