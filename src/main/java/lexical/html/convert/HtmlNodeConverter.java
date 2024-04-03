package lexical.html.convert;

import lexical.html.enums.HtmlNodeTypeEnum;
import lexical.model.HtmlNode;

/**
 * @author lhp
 * @version LexicalNodeConverter.java create at 2024-03-11 10:59:00 by lhp
 * @since 1.0.0
 */
public interface HtmlNodeConverter {

  /**
   * 标签类型
   *
   * @return
   */
  HtmlNodeTypeEnum type();

  /**
   * 生成标签前缀
   *
   * @param builder
   * @param htmlNode
   * @param fontFamily
   * @return
   */
  StringBuilder createLabelStart(StringBuilder builder, HtmlNode htmlNode);

  /**
   * 生成标签后缀
   *
   * @param builder
   * @param htmlNode
   * @return
   */
  StringBuilder createLabelEnd(StringBuilder builder, HtmlNode htmlNode);
}
