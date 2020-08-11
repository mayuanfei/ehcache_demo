package lm.test.ehcache_demo.dao.pojo;

import lm.test.ehcache_demo.common.BaseEntity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "emp_info")
public class EmpInfo extends BaseEntity {
    /**
     * 这个表和微信中的通讯录是同步的
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 帐号。微信的唯一标识
     */
    private String userid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 英文姓名
     */
    @Column(name = "english_name")
    private String englishName;

    /**
     * 别名
     */
    private String alias;

    /**
     * 性别。1：男；2：女
     */
    private Integer gender;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 座机
     */
    private String telephone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 所属部门
     */
    private String department;

    /**
     * 所属部门全路径
     */
    private String depids;

    /**
     * 职务
     */
    private String position;

    /**
     *  是否为领导.0：不是领导；1：是领导
     */
    private Integer isleader;

    /**
     * 头像连接
     */
    private String avatar;

    /**
     * 员工个人二维码
     */
    @Column(name = "qr_code")
    private String qrCode;

    /**
     * 创建的日期
     */
    private Date ctm;

    /**
     * 获取这个表和微信中的通讯录是同步的
     *
     * @return id - 这个表和微信中的通讯录是同步的
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置这个表和微信中的通讯录是同步的
     *
     * @param id 这个表和微信中的通讯录是同步的
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取帐号。微信的唯一标识
     *
     * @return userid - 帐号。微信的唯一标识
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置帐号。微信的唯一标识
     *
     * @param userid 帐号。微信的唯一标识
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取英文姓名
     *
     * @return english_name - 英文姓名
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * 设置英文姓名
     *
     * @param englishName 英文姓名
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    /**
     * 获取别名
     *
     * @return alias - 别名
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 设置别名
     *
     * @param alias 别名
     */
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    /**
     * 获取性别。1：男；2：女
     *
     * @return gender - 性别。1：男；2：女
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别。1：男；2：女
     *
     * @param gender 性别。1：男；2：女
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取手机
     *
     * @return mobile - 手机
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机
     *
     * @param mobile 手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取座机
     *
     * @return telephone - 座机
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置座机
     *
     * @param telephone 座机
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取所属部门
     *
     * @return department - 所属部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置所属部门
     *
     * @param department 所属部门
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * 获取所属部门全路径
     *
     * @return depids - 所属部门全路径
     */
    public String getDepids() {
        return depids;
    }

    /**
     * 设置所属部门全路径
     *
     * @param depids 所属部门全路径
     */
    public void setDepids(String depids) {
        this.depids = depids == null ? null : depids.trim();
    }

    /**
     * 获取职务
     *
     * @return position - 职务
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置职务
     *
     * @param position 职务
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * 获取 是否为领导.0：不是领导；1：是领导
     *
     * @return isleader -  是否为领导.0：不是领导；1：是领导
     */
    public Integer getIsleader() {
        return isleader;
    }

    /**
     * 设置 是否为领导.0：不是领导；1：是领导
     *
     * @param isleader  是否为领导.0：不是领导；1：是领导
     */
    public void setIsleader(Integer isleader) {
        this.isleader = isleader;
    }

    /**
     * 获取头像连接
     *
     * @return avatar - 头像连接
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像连接
     *
     * @param avatar 头像连接
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * 获取员工个人二维码
     *
     * @return qr_code - 员工个人二维码
     */
    public String getQrCode() {
        return qrCode;
    }

    /**
     * 设置员工个人二维码
     *
     * @param qrCode 员工个人二维码
     */
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode == null ? null : qrCode.trim();
    }

    /**
     * 获取创建的日期
     *
     * @return ctm - 创建的日期
     */
    public Date getCtm() {
        return ctm;
    }

    /**
     * 设置创建的日期
     *
     * @param ctm 创建的日期
     */
    public void setCtm(Date ctm) {
        this.ctm = ctm;
    }
}