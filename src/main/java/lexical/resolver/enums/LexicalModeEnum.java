package lexical.resolver.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author lhp
 * @version LexicalModeEnum.java create at 2024-03-07 11:44:53 by lhp
 * @since 1.0.0
 */
public enum LexicalModeEnum {

  NORMAL(0, "NORMAL", "标准的"),
  TOKEN(1, "TOKEN", "TOKEN"),
  SEGMENTED(2, "SEGMENTED", "TOKEN"),

  ;

  private int number;

  private String code;

  private String desc;

  LexicalModeEnum(int number, String code, String desc) {
    this.number = number;
    this.code = code;
    this.desc = desc;
  }

  public static LexicalModeEnum getModeByNUmber(int num) {
    for (LexicalModeEnum value : LexicalModeEnum.values()) {
      if (value.getNumber() == num) {
        return value;
      }
    }
    return null;
  }

  public static LexicalModeEnum getModeByCode(String code) {
    for (LexicalModeEnum value : LexicalModeEnum.values()) {
      if (StringUtils.equals(code, value.getCode())) {
        return value;
      }
    }
    return null;
  }


  public int getNumber() {
    return number;
  }

  public String getCode() {
    return code;
  }

  public String getDesc() {
    return desc;
  }
}
