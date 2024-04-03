package lexical.resolver.enums;

/**
 * @author lhp
 * @version LexicalTagEnum.java create at 2024-04-01 19:21:18 by lhp
 * @since 1.0.0
 */
public enum LexicalTagEnum {

  STRONG_LABEL("strong", "strong 标签"),
  EM_LABEL("em", "em 标签"),
  SPAN_LABEL("span", "span 标签"),
  P_LABEL("p", "p 标签"),
  A_LABEL("a", "a 标签"),
  TH_LABEL("th", "th 标签"),
  TD_LABEL("td", "td 标签"),
  TR_LABEL("tr", "tr 标签"),
  TABLE_LABEL("table", "table 标签"),
  TEXT_ALIGN("text-align:", "text-align: 属性"),
  CLASS_SELECTOR_PARAGRAPH("paragraph", "段落"),
  CLASS_SELECTOR_VARIABLE("y9-variable", "属性"),
  CLASS_SELECTOR_LINK("y9-link", "超链接"),
  CLASS_SELECTOR_TABLE("y9-rich-table", "表格"),
  CLASS_SELECTOR_TABLE_CELL("y9-rich-table-cell", "单元格"),
  CLASS_SELECTOR_TABLE_HEADER("y9-rich-table-header", "表头"),
  SPACE(" ", "空格"),
  SEMICOLON(";", "分号"),
  COLOR("color:", "颜色标签"),
  FONT_SIZE("font-size:", "字体"),

  ;

  private String code;

  private String desc;

  LexicalTagEnum(String code, String desc) {
    this.code = code;
    this.desc = desc;
  }

  public java.lang.String getCode() {
    return code;
  }

  public java.lang.String getDesc() {
    return desc;
  }
}
