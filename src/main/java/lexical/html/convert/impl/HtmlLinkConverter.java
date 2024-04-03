package lexical.html.convert.impl;

import io.micrometer.common.util.StringUtils;
import lexical.html.convert.AbstractHtmlNodeConverter;
import lexical.html.enums.HtmlNodeTypeEnum;
import lexical.html.enums.HtmlTagEnums;
import lexical.model.HtmlNode;

/**
 * @author lhp
 * @version HtmlLinkConverter.java create at 2024-03-11 11:11:16 by lhp
 * @since 1.0.0
 */
public class HtmlLinkConverter extends AbstractHtmlNodeConverter {

  @Override
  public HtmlNodeTypeEnum type() {
    return HtmlNodeTypeEnum.A;
  }

  @Override
  public StringBuilder createLabelStart(StringBuilder builder, HtmlNode htmlNode) {
    builder.append(HtmlTagEnums.TAG_START.getCode()).append(htmlNode.getHtmlLabel());
    if (StringUtils.isNotEmpty(htmlNode.getHref())) {
      builder.append(HtmlTagEnums.TAG_HREF.getCode()).append(super.setProperty(htmlNode.getHref()));
    }
    if (StringUtils.isNotEmpty(htmlNode.getRelation())) {
      builder.append(HtmlTagEnums.TAG_REL.getCode())
          .append(super.setProperty(htmlNode.getRelation()));
    }
    if (StringUtils.isNotEmpty(htmlNode.getClassSelector())) {
      builder.append(HtmlTagEnums.TAG_CLASS.getCode())
          .append(super.setProperty(htmlNode.getClassSelector()));
    }
    if (StringUtils.isNotEmpty(htmlNode.getDirection())) {
      builder.append(HtmlTagEnums.TAG_DIR.getCode())
          .append(super.setProperty(htmlNode.getDirection()));
    }
    return builder.append(HtmlTagEnums.TAG_END.getCode());
  }

  @Override
  public StringBuilder createLabelEnd(StringBuilder builder, HtmlNode htmlNode) {
    return super.createLabelEnd(builder, htmlNode.getHtmlLabel());
  }
}
