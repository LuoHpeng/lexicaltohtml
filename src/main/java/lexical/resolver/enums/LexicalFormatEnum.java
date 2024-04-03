package lexical.resolver.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author lhp
 * @version LexicalFormatEnum.java create at 2024-03-07 16:39:14 by lhp
 * @since 1.0.0
 */
public enum LexicalFormatEnum {

  BOLD("1", "y9-bold", "加粗"),
  ITALIC("2", "y9-italic", "斜体"),
  STRIKETHROUGH("4", "y9-strikethrough", "删除线，中划线"),
  UNDERLINE("8", "y9-underline", "下划线"),
  UNDERLINE_STRIKETHROUGH("12", "y9-underline-strikethrough", "下划线加中划线"),


  LEFT("LEFT", "left", "左对齐"),
  RIGHT("RIGHT", "right", "右对齐"),
  CENTER("CENTER", "center", "居中对齐"),
  JUSTIFY("JUSTIFY", "justify", "两端对齐"),

  ;


  private String number;

  private String code;

  private String desc;

  public static LexicalFormatEnum getFormatEnum(String number) {
    for (LexicalFormatEnum value : LexicalFormatEnum.values()) {
      if (StringUtils.equals(value.number, number)) {
        return value;
      }
    }
    return null;
  }

  LexicalFormatEnum(String number, String code, String desc) {
    this.number = number;
    this.code = code;
    this.desc = desc;
  }

  public String getNumber() {
    return number;
  }

  public String getCode() {
    return code;
  }

  public String getDesc() {
    return desc;
  }
}
