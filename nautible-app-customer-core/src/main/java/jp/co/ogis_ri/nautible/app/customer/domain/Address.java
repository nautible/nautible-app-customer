package jp.co.ogis_ri.nautible.app.customer.domain;

import java.util.Objects;

/**
 * 住所ドメイン
 */
public class Address {
    /** 郵便番号 */
    private String zipCode = null;
    /** 住所１ */
    private String address1 = null;
    /** 住所２ */
    private String address2 = null;

    /**
     * 郵便番号を設定する
     * @param zipCode 郵便番号
     * @return {@link Address}
     */
    public Address zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * 郵便番号を取得する
     * @return 郵便番号
    **/
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 郵便番号を設定する
     * @param zipCode 郵便番号
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * 住所１を設定する
     * @param address1 住所１
     * @return {@link Address}
     */
    public Address address1(String address1) {
        this.address1 = address1;
        return this;
    }

    /**
     * 住所１を取得する
     * @return 住所１
    **/
    public String getAddress1() {
        return address1;
    }

    /**
     * 住所１を設定する
     * @param 住所１
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * 住所２を設定する
     * @param address2 住所２
     * @return {@link Address}
     */
    public Address address2(String address2) {
        this.address2 = address2;
        return this;
    }

    /**
     * 住所２を取得する
     * @return 住所２
    **/
    public String getAddress2() {
        return address2;
    }

    /**
     * 住所２を設定する
     * @param 住所２
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(this.zipCode, address.zipCode) &&
                Objects.equals(this.address1, address.address1) &&
                Objects.equals(this.address2, address.address2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zipCode, address1, address2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Address {\n");

        sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
        sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
        sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
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
