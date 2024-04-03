package lexical.html.enums;

/**
 * @author lhp
 * @version HtmlTagEnums.java create at 2024-04-01 18:53:00 by lhp
 * @since 1.0.0
 */
public enum HtmlTagEnums {

  TAG_START("<", "开始标签"),
  TAG_END(">", "结束标签"),
  TAG_START_SLASH("</", "开始标签带斜杠"),
  TAG_CLASS(" class=", "class选择器"),
  TAG_STYLE(" style=", "style样式选择器"),
  TAG_HREF(" href=", "href超链接"),
  TAG_REL(" rel=", "rel"),
  TAG_DIR(" dir=", "dir"),
  TAG_BR("<br/>", "br标签"),
  ;


  private String code;

  private String desc;

  HtmlTagEnums(String code, String desc) {
    this.code = code;
    this.desc = desc;
  }

  public String getCode() {
    return code;
  }

  public String getDesc() {
    return desc;
  }
}
