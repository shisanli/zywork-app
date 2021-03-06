package top.zywork.enums;

/**
 * 加密算法枚举类<br/>
 * 创建于2017-08-15<br/>
 *
 * @author 王振宇
 * @version 1.0
 */
public enum HashAlgorithmEnum {

    MD5("MD5"),
    SHA1("SHA-1"),
    SHA256("SHA-256"),
    SHA384("SHA-384"),
    SHA512("SHA-512");

    private String value;

    HashAlgorithmEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
