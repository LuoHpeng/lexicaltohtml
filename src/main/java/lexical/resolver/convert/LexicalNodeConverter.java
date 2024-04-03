package lexical.resolver.convert;

import lexical.model.HtmlNode;
import lexical.model.RTFTextNode;
import lexical.resolver.enums.LexicalNodeTypeEnum;

/**
 * @author lhp
 * @version LexicalNodeConverter.java create at 2024-03-07 13:56:32 by lhp
 * @since 1.0.0
 */
public interface LexicalNodeConverter {

  /**
   * 类型
   *
   * @return
   */
  LexicalNodeTypeEnum type();

  /**
   * 转换方法
   *
   * @param rtfTextNode
   * @return
   */
  HtmlNode convertToHtmlNode(RTFTextNode rtfTextNode);

}
