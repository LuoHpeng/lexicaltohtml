package lexical.html.convert;

import lexical.html.enums.HtmlTagEnums;

/**
 * @author lhp
 * @version AbstractLexicalNodeConverter.java create at 2024-03-11 10:58:07 by lhp
 * @since 1.0.0
 */
public abstract class AbstractHtmlNodeConverter implements HtmlNodeConverter {


  public StringBuilder createLabelEnd(StringBuilder builder, String label) {
    return builder.append(HtmlTagEnums.TAG_START_SLASH.getCode()).append(label)
        .append(HtmlTagEnums.TAG_END.getCode());
  }

  public String setProperty(String property) {
    return "\"" + property + "\"";
  }

}
