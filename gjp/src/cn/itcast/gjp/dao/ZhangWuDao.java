package cn.itcast.gjp.dao;

import cn.itcast.gjp.domain.ZhangWu;
import org.apache.commons.dbutils.QueryRunner;
import cn.itcast.gjp.tools.JDBCUtils;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class ZhangWuDao {
    private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
    public List<ZhangWu> selectAll(){
        String sql = "SELECT * FROM gjp_zhangwu";
        try {
            return qr.query(sql, new BeanListHandler<>(ZhangWu.class));
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("failed when search all");
        }
    }
    public List<ZhangWu> select(String startDate, String endDate){
        String sql = "SELECT * FROM gjp_zhangwu WHERE createtime BETWEEN ? AND ?";
        Object[] params = {startDate, endDate};
        try {
            return qr.query(sql, new BeanListHandler<>(ZhangWu.class), params);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("failed when search");
        }
    }
    public void addZhangWu(ZhangWu zw){
        String sql = "INSERT INTO gjp_zhangwu (flname, money, zhanghu, createtime, description) VALUES (?,?,?,?,?)";
        Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhanghu(),zw.getCreatetime(),zw.getDescription()};
        try {
            qr.update(sql, params);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("failed when add");

        }
    }
    public void editZhangWu(ZhangWu zw){
        String sql = "UPDATE gjp_zhangwu SET flname = ?,money = ?, zhanghu = ?, createtime = ?, description = ? WHERE zwid = ?";
        Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhanghu(),zw.getCreatetime(),zw.getDescription(),zw.getZwid()};
        try {
            qr.update(sql, params);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("failed when edit");

        }
    }
    public void deleteZhangWu(int zwid){
        String sql = "DELETE FROM gjp_zhangwu WHERE zwid = ?";
        try {
            qr.update(sql, zwid);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("failed when delete");
        }
    }
}
