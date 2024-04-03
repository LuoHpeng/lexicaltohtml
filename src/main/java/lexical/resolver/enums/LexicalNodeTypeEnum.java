package lexical.resolver.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author yangfeng
 * @version HtmlNodeTypeEnum.java create at 2024-01-28 16:04:24 by yangfeng
 * @since 1.0.0
 */
public enum LexicalNodeTypeEnum {

  /**
   *
   */
  ROOT("ROOT", "根结点"),

  /**
   *
   */
  TEXT("TEXT", "文本内容"),

  /**
   *
   */
  LINK("LINK", "链接内容"),

  /**
   *
   */
  IMAGE("IMAGE", "图片"),

  /**
   *
   */
  PARAGRAPH("PARAGRAPH", "段落"),

  /**
   *
   */
  TABLE("TABLE", "表格"),

  /**
   *
   */
  TABLE_ROW("TABLEROW", "表格-行"),

  /**
   *
   */
  TABLE_CELL("TABLECELL", "单元格"),
  /**
   *
   */
  VARIABLE("VARIABLE", "可以拖拽变动的"),

  ;

  private String code;


  private String desc;

  LexicalNodeTypeEnum(String code, String desc) {
    this.code = code;

    this.desc = desc;
  }

  public static LexicalNodeTypeEnum getByCode(String code) {
    if (StringUtils.isBlank(code)) {
      return null;
    }
    for (LexicalNodeTypeEnum value : values()) {
      if (StringUtils.equalsIgnoreCase(code, value.getCode())) {
        return value;
      }
    }
    return null;
  }

  public boolean codeEquals(String code) {
    if (StringUtils.isBlank(code)) {
      return false;
    }
    return StringUtils.equalsIgnoreCase(code, this.getCode());
  }

  /**
   * Getter method for property code
   *
   * @return property value of code
   */
  public String getCode() {
    return code;
  }

  public String getDesc() {
    return desc;
  }
}
