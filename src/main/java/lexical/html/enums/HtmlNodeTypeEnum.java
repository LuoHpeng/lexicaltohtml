package lexical.html.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author lhp
 * @version HtmlNodeTypeEnum.java create at 2024-03-11 10:59:39 by lhp
 * @since 1.0.0
 */
public enum HtmlNodeTypeEnum {
  STRONG("STRONG", "strong 标签"),
  EM("EM", "em标签"),
  SPAN("SPAN", "span标签"),
  P("P", "p标签"),
  A("A", "a标签"),
  TH("TH", "th标签"),
  TD("TD", "td标签"),
  TR("TR", "tr标签"),
  TABLE("TABLE", "table标签"),

  ;


  private String code;

  private String desc;

  HtmlNodeTypeEnum(String code, String desc) {
    this.code = code;
    this.desc = desc;
  }

  public static HtmlNodeTypeEnum getByCode(String code) {
    if (StringUtils.isBlank(code)) {
      return null;
    }
    for (HtmlNodeTypeEnum value : values()) {
      if (StringUtils.equalsIgnoreCase(code, value.getCode())) {
        return value;
      }
    }
    return null;
  }


  public String getCode() {
    return code;
  }

  public String getDesc() {
    return desc;
  }
}
