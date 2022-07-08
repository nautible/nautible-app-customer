package jp.co.ogis_ri.nautible.app.customer.domain;

import java.util.Objects;

/**
 * 顧客ドメイン
 */
public class Customer {
    /** id */
    private Integer id = null;
    /** 名前 */
    private String name = null;
    /** 年齢 */
    private Integer age = null;
    /** 電話番号 */
    private String tel;
    /** 住所 */
    private Address address = null;

    /**
     * Idを設定する
     * @param id Id
     * @return {@link Customer}
     */
    public Customer id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Idを取得する
     * @return Id
    **/
    public Integer getId() {
        return id;
    }

    /**
     * Idを設定する
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 名称を設定する
     * @param name 名称
     * @return {@link Customer}
     */
    public Customer name(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称を取得する
     * @return name 名称
    **/
    public String getName() {
        return name;
    }

    /**
     * 名称を設定する
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 年齢を設定する
     * @param age 年齢
     * @return {@link Customer}
     */
    public Customer age(Integer age) {
        this.age = age;
        return this;
    }

    /**
     * 年齢を取得する
     * @return age 年齢
    **/
    public Integer getAge() {
        return age;
    }

    /**
     * 年齢を設定する
     * @param age 年齢
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 住所を設定する
     * @param address {@link Address}
     * @return {@link Customer}
     */
    public Customer address(Address address) {
        this.address = address;
        return this;
    }

    /**
     * 電話番号を設定する
     * @param tel 電話番号
     * @return {@link Customer}
     */
    public Customer tel(String tel) {
        this.tel = tel;
        return this;
    }

    /**
     * 電話番号を取得する
     * @return 電話番号
     */
    public String getTel() {
        return tel;
    }

    /**
     * 電話番号を設定する
     * @param tel 電話番号
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 住所を取得する
     * @return address 住所
    **/
    public Address getAddress() {
        return address;
    }

    /**
     * 住所を設定する
     * @param address 住所
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Customer customer = (Customer) o;
        return Objects.equals(this.id, customer.id) &&
                Objects.equals(this.name, customer.name) &&
                Objects.equals(this.age, customer.age) &&
                Objects.equals(this.tel, customer.tel) &&
                Objects.equals(this.address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Customer {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    age: ").append(toIndentedString(age)).append("\n");
        sb.append("    tel: ").append(toIndentedString(tel)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
