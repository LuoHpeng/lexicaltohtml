package lexical.resolver.convert;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lexical.resolver.enums.LexicalFormatEnum;
import lexical.resolver.enums.LexicalTagEnum;

/**
 * @author lhp
 * @version AbstractLexicalNodeConverter.java create at 2024-03-07 13:58:09 by lhp
 * @since 1.0.0
 */
public abstract class AbstractLexicalNodeConverter implements LexicalNodeConverter {


  public static final Pattern compile = Pattern.compile("^\\d+");


  /**
   * 类选择器中同时包含 y9-strikethrough y9-underline 转成 y9-underline-strikethrough
   *
   * @param formatNumber
   * @return
   */
  public static String convert2ClassSelectorFromNumber(List<Integer> formatNumber) {
    String result = " ";
    if (formatNumber.contains(Integer.valueOf(LexicalFormatEnum.STRIKETHROUGH.getNumber()))
        && formatNumber.contains(Integer.valueOf(LexicalFormatEnum.UNDERLINE.getNumber()))) {
      result = result.concat(LexicalFormatEnum.UNDERLINE_STRIKETHROUGH.getCode())
          .concat(" ");
      formatNumber.remove(Integer.valueOf(LexicalFormatEnum.STRIKETHROUGH.getNumber()));
      formatNumber.remove(Integer.valueOf(LexicalFormatEnum.UNDERLINE.getNumber()));
    }
    for (Integer integer : formatNumber) {
      LexicalFormatEnum lexicalFormatEnum = LexicalFormatEnum.getFormatEnum(
          String.valueOf(integer));
      if (lexicalFormatEnum != null) {
        result = result.concat(lexicalFormatEnum.getCode()).concat(" ");
      }
    }
    return result;
  }

  public static List<Integer> analyticValue(int sum) {
    List<Integer> powers = new ArrayList<>();
    // 从最大的2的n次方开始尝试减去
    // 假设int为32位，标签类型不到20个
    for (int i = 20; i >= 0; i--) {
      // 如果当前位是1，说明需要减去2的i次方
      if ((sum & (1 << i)) != 0) {
        // 减去2的i次方
        sum -= (1 << i);
        // 添加这个2的n次方到列表中
        powers.add(1 << i);
      }
    }
    return powers;
  }

  public static String getHtmlLabel(String format) {
    int parseInt = Integer.parseInt(format);
    //bold 判读是否是加粗
    int bold = Integer.parseInt(LexicalFormatEnum.BOLD.getNumber());
    if ((parseInt & bold) > 0) {
      return LexicalTagEnum.STRONG_LABEL.getCode();
    }
    int italic = Integer.parseInt(LexicalFormatEnum.ITALIC.getNumber());
    if ((parseInt & italic) > 0) {
      return LexicalTagEnum.EM_LABEL.getCode();
    }
    return LexicalTagEnum.SPAN_LABEL.getCode();
  }

  public static boolean isAllDigits(String format) {
    Matcher matcher = compile.matcher(format);
    return matcher.matches();
  }


}
