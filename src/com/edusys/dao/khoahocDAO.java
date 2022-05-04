/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.Jdbc.JdbcHelper;
import com.edusys.entity.KhoaHoc;
import com.edusys.entity.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO-PC
 */
public class khoahocDAO extends edusysDAO<KhoaHoc, String> {

    String INSERT_SQL = "INSERT INTO KhoaHoc(MaKH,MaCD,HocPhi,ThoiLuong,NgayKG,GhiChu,MaNV,NgayTao)VALUSE(?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE KhoaHoc SET MaCD=?,HocPhi=?,ThoiLuong=?,NgayKG=?,GhiChu=?,MaNV=?,NgayTao=?WHERE MaKH=?";
    String DELETE_SQL = "DELETE FROM KhoaHoc WHERE MaKH=?";
    String SELECT_ALL_SQL = "SELECT*FROM KhoaHoc";
    String SELECT_BY_ID_SQL = "SELECT*FROM KhoaHoc WHERE MaKH=?";

    @Override
    public void insert(KhoaHoc entity) {
        String sql
                = "INSERT INTO KhoaHoc (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV) VALUES (?, ?, ?, ?, ?, ?)";
        JdbcHelper.update(sql,
                entity.getMaCD(),
                entity.getHocPhi(),
                entity.getThoiLuong(),
                entity.getNgayKG(),
                entity.getGhiChu(),
                entity.getMaNV());
    }

    @Override
    public void update(KhoaHoc entity) {
        String sql = "UPDATE KhoaHoc SET MaCD=?, HocPhi=?, ThoiLuong=?, NgayKG=?, GhiChu=?, MaNV=? WHERE MaKH=?";
        JdbcHelper.update(sql,
                entity.getMaCD(),
                entity.getHocPhi(),
                entity.getThoiLuong(),
                entity.getNgayKG(),
                entity.getGhiChu(),
                entity.getMaNV(),
                entity.getMaKH());

    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<KhoaHoc> selectALL() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public KhoaHoc selectByID(String id) {
        List<KhoaHoc> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);

    }

    @Override
    protected List<KhoaHoc> selectBySQL(String sql, Object... args) {
        List<KhoaHoc> list = new ArrayList<KhoaHoc>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                KhoaHoc entity = new KhoaHoc();
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setMaCD(rs.getString("MaCD"));
                entity.setHocPhi(rs.getDouble("HocPhi"));
                entity.setThoiLuong(rs.getInt("ThoiLuong"));
                entity.setNgayKG(rs.getString("NgayKG"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayTao(rs.getString("NgayTao"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<KhoaHoc> selectByChuyenDe(String macd) {
        String sql = "SELECT * FROM KhoaHoc Where MaCD=?";
        return this.selectBySQL(sql, macd);
    }

    public KhoaHoc selectByIDInt(Integer id) {
        List<KhoaHoc> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<Integer> selectYear() {
        String sql = "SELECT DISTINCT YEAR(NgayKG) as year FROM KhoaHoc ORDER BY year DESC;";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
