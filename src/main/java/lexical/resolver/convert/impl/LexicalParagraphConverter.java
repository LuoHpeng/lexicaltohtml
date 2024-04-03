package lexical.resolver.convert.impl;

import io.micrometer.common.util.StringUtils;
import lexical.model.HtmlNode;
import lexical.model.RTFTextNode;
import lexical.resolver.convert.AbstractLexicalNodeConverter;
import lexical.resolver.enums.LexicalNodeTypeEnum;
import lexical.resolver.enums.LexicalTagEnum;

/**
 * @author lhp
 * @version LexicalParagraphConverter.java create at 2024-03-07 14:44:25 by lhp
 * @since 1.0.0
 */
public class LexicalParagraphConverter extends AbstractLexicalNodeConverter {

  @Override
  public LexicalNodeTypeEnum type() {
    return LexicalNodeTypeEnum.PARAGRAPH;
  }

  @Override
  public HtmlNode convertToHtmlNode(RTFTextNode rtfTextNode) {
    HtmlNode htmlNode = new HtmlNode();
    htmlNode.setHtmlLabel(LexicalTagEnum.P_LABEL.getCode());
    htmlNode.setDirection(rtfTextNode.getDirection());
    htmlNode.setClassSelector(LexicalTagEnum.CLASS_SELECTOR_PARAGRAPH.getCode());
    String style = "";
    if (StringUtils.isNotEmpty(rtfTextNode.getStyle())) {
      style = style.concat(rtfTextNode.getStyle()).concat(LexicalTagEnum.SEMICOLON.getCode());
    }
    if (StringUtils.isNotEmpty(rtfTextNode.getFormat())) {
      style = style.concat(LexicalTagEnum.TEXT_ALIGN.getCode()).concat(rtfTextNode.getFormat())
          .concat(LexicalTagEnum.SEMICOLON.getCode());
    }
    htmlNode.setStyle(style);
    return htmlNode;
  }
}
