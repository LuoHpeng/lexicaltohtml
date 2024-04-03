package lexical.resolver.convert.impl;

import lexical.model.HtmlNode;
import lexical.model.RTFTextNode;
import lexical.resolver.convert.AbstractLexicalNodeConverter;
import lexical.resolver.enums.LexicalNodeTypeEnum;
import lexical.resolver.enums.LexicalTagEnum;

/**
 * @author lhp
 * @version LexicalLinkConverter.java create at 2024-03-08 13:53:44 by lhp
 * @since 1.0.0
 */
public class LexicalLinkConverter extends AbstractLexicalNodeConverter {

  @Override
  public LexicalNodeTypeEnum type() {
    return LexicalNodeTypeEnum.LINK;
  }

  @Override
  public HtmlNode convertToHtmlNode(RTFTextNode rtfTextNode) {
    HtmlNode htmlNode = new HtmlNode();
    htmlNode.setHtmlLabel(LexicalTagEnum.A_LABEL.getCode());
    htmlNode.setDirection(rtfTextNode.getDirection());
    htmlNode.setRelation(rtfTextNode.getRel());
    htmlNode.setClassSelector(LexicalTagEnum.CLASS_SELECTOR_LINK.getCode());
    htmlNode.setHref(rtfTextNode.getUrl());

    return htmlNode;
  }
}
