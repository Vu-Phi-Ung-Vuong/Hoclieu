/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.Jdbc.JdbcHelper;
import com.edusys.entity.ChuyenDe;
import com.edusys.entity.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO-PC
 */
public class chuyendeDAO extends edusysDAO<ChuyenDe, String> {

    String INSERT_SQL = "INSERT INTO ChuyenDe(MaCD,TenCD,HocPhi,ThoiLuong,Hinh,MoTa)VALUSE(?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE ChuyenDe SET TenCD=?,HocPhi=?,ThoiLuong=?,Hinh=?,MoTa=?WHERE MaCD=?";
    String DELETE_SQL = "DELETE FROM ChuyenDe WHERE MaCD=?";
    String SELECT_ALL_SQL = "SELECT*FROM ChuyenDe";
    String SELECT_BY_ID_SQL = "SELECT*FROM ChuyenDe WHERE MaCD=?";

    @Override
    public void insert(ChuyenDe entity) {
        String sql = "INSERT INTO ChuyenDe (MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa) VALUES (?, ?, ?, ?, ?, ?)";
        JdbcHelper.update(INSERT_SQL,
                entity.getMaCD(), entity.getTenCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getHinh(), entity.getMoTa());

    }

    @Override
    public void update(ChuyenDe entity) {
        String sql = "UPDATE ChuyenDe SET TenCD=?, HocPhi=?, ThoiLuong=?, Hinh=?, MoTa=? WHERE MaCD=?";
        JdbcHelper.update(sql,
              entity.getTenCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getHinh(), entity.getMoTa(), entity.getMaCD());

    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<ChuyenDe> selectALL() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public ChuyenDe selectByID(String id) {
        List<ChuyenDe> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<ChuyenDe> selectBySQL(String sql, Object... args) {
        List<ChuyenDe> list = new ArrayList<ChuyenDe>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                ChuyenDe entity = new ChuyenDe();
                entity.setMaCD(rs.getString("MaCD"));
                entity.setTenCD(rs.getString("TenCD"));
                entity.setHocPhi(rs.getDouble("HocPhi"));
                entity.setThoiLuong(rs.getInt("ThoiLuong"));
                entity.setHinh(rs.getString("Hinh"));
                entity.setMoTa(rs.getString("MoTa"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
