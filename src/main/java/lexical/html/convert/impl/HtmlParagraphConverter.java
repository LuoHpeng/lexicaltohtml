package lexical.html.convert.impl;

import io.micrometer.common.util.StringUtils;
import lexical.html.convert.AbstractHtmlNodeConverter;
import lexical.html.enums.HtmlNodeTypeEnum;
import lexical.html.enums.HtmlTagEnums;
import lexical.model.HtmlNode;

/**
 * @author lhp
 * @version HtmlParagraphConverter.java create at 2024-03-11 12:36:37 by lhp
 * @since 1.0.0
 */
public class HtmlParagraphConverter extends AbstractHtmlNodeConverter {

  @Override
  public HtmlNodeTypeEnum type() {
    return HtmlNodeTypeEnum.P;
  }

  @Override
  public StringBuilder createLabelStart(StringBuilder builder, HtmlNode htmlNode) {
    builder.append(HtmlTagEnums.TAG_START.getCode()).append(htmlNode.getHtmlLabel());
    if (StringUtils.isNotEmpty(htmlNode.getClassSelector())) {
      builder.append(HtmlTagEnums.TAG_CLASS.getCode())
          .append(setProperty(htmlNode.getClassSelector()));
    }
    if (StringUtils.isNotEmpty(htmlNode.getDirection())) {
      builder.append(HtmlTagEnums.TAG_DIR.getCode()).append(setProperty(htmlNode.getDirection()));
    }
    if (StringUtils.isNotEmpty(htmlNode.getStyle())) {
      builder.append(HtmlTagEnums.TAG_STYLE.getCode())
          .append(super.setProperty(htmlNode.getStyle()));
    }
    return builder.append(HtmlTagEnums.TAG_END.getCode());
  }

  @Override
  public StringBuilder createLabelEnd(StringBuilder builder, HtmlNode htmlNode) {
    return super.createLabelEnd(builder, htmlNode.getHtmlLabel());
  }
}
