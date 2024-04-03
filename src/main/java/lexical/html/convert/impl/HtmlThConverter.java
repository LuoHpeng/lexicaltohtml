package lexical.html.convert.impl;

import io.micrometer.common.util.StringUtils;
import lexical.html.convert.AbstractHtmlNodeConverter;
import lexical.html.enums.HtmlNodeTypeEnum;
import lexical.html.enums.HtmlTagEnums;
import lexical.model.HtmlNode;

/**
 * @author lhp
 * @version HtmlThConverter.java create at 2024-03-11 13:32:21 by lhp
 * @since 1.0.0
 */
public class HtmlThConverter extends AbstractHtmlNodeConverter {

  @Override
  public HtmlNodeTypeEnum type() {
    return HtmlNodeTypeEnum.TH;
  }

  @Override
  public StringBuilder createLabelStart(StringBuilder builder, HtmlNode htmlNode) {
    builder.append(HtmlTagEnums.TAG_START.getCode()).append(htmlNode.getHtmlLabel());
    if (StringUtils.isNotEmpty(htmlNode.getClassSelector())) {
      builder.append(HtmlTagEnums.TAG_CLASS.getCode())
          .append(setProperty(htmlNode.getClassSelector()));
    }
    return builder.append(HtmlTagEnums.TAG_END.getCode());
  }

  @Override
  public StringBuilder createLabelEnd(StringBuilder builder, HtmlNode htmlNode) {
    return super.createLabelEnd(builder, htmlNode.getHtmlLabel());
  }
}
