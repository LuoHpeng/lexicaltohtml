package lexical.html.convert.impl;

import io.micrometer.common.util.StringUtils;
import lexical.html.convert.AbstractHtmlNodeConverter;
import lexical.html.enums.HtmlNodeTypeEnum;
import lexical.html.enums.HtmlTagEnums;
import lexical.model.HtmlNode;

/**
 * @author lhp
 * @version HtmlSpanConverter.java create at 2024-03-11 13:39:10 by lhp
 * @since 1.0.0
 */
public class HtmlSpanConverter extends AbstractHtmlNodeConverter {

  @Override
  public HtmlNodeTypeEnum type() {
    return HtmlNodeTypeEnum.SPAN;
  }

  @Override
  public StringBuilder createLabelStart(StringBuilder builder, HtmlNode htmlNode) {
    builder.append(HtmlTagEnums.TAG_START.getCode()).append(htmlNode.getHtmlLabel());
    if (StringUtils.isNotEmpty(htmlNode.getClassSelector())) {
      builder.append(HtmlTagEnums.TAG_CLASS.getCode())
          .append(super.setProperty(htmlNode.getClassSelector()));
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
