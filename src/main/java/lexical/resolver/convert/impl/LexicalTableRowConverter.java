package lexical.resolver.convert.impl;

import lexical.model.HtmlNode;
import lexical.model.RTFTextNode;
import lexical.resolver.convert.AbstractLexicalNodeConverter;
import lexical.resolver.enums.LexicalNodeTypeEnum;
import lexical.resolver.enums.LexicalTagEnum;

/**
 * @author lhp
 * @version LexicalTableRowConverter.java create at 2024-03-08 15:37:03 by lhp
 * @since 1.0.0
 */
public class LexicalTableRowConverter extends AbstractLexicalNodeConverter {

  @Override
  public LexicalNodeTypeEnum type() {
    return LexicalNodeTypeEnum.TABLE_ROW;
  }

  @Override
  public HtmlNode convertToHtmlNode(RTFTextNode rtfTextNode) {
    HtmlNode htmlNode = new HtmlNode();

    htmlNode.setHtmlLabel(LexicalTagEnum.TR_LABEL.getCode());
    htmlNode.setDirection(rtfTextNode.getDirection());

    return htmlNode;
  }
}
