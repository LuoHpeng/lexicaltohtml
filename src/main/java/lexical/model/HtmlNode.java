package lexical.model;

import java.util.List;

/**
 * @author lhp
 * @version HtmlNode.java create at 2024-03-07 11:28:18 by lhp
 * @since 1.0.0
 */
public class HtmlNode {

  /**
   * html标签
   */
  private String htmlLabel;

  /**
   * 类选择器
   */
  private String classSelector;
  /**
   * id选择器
   */
  private String idSelector;
  /**
   * 标签样式
   */
  private String style;
  /**
   * 可拖拽的
   */
  private String draggable;
  /**
   * 标签内容
   */
  private String context;
  /**
   * 方向 对应dir
   */
  private String direction;

  private String text;
  /**
   * 对应 rel
   */
  private String relation;

  private String href;

  private String colSpan;

  private String rowSpan;

  private String backgroundColor;

  private List<HtmlNode> htmlNodes;

  public String getColSpan() {
    return colSpan;
  }

  public void setColSpan(String colSpan) {
    this.colSpan = colSpan;
  }

  public String getRowSpan() {
    return rowSpan;
  }

  public void setRowSpan(String rowSpan) {
    this.rowSpan = rowSpan;
  }

  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public String getRelation() {
    return relation;
  }

  public void setRelation(String relation) {
    this.relation = relation;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public List<HtmlNode> getHtmlNodes() {
    return htmlNodes;
  }

  public void setHtmlNodes(List<HtmlNode> htmlNodes) {
    this.htmlNodes = htmlNodes;
  }

  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public String getDraggable() {
    return draggable;
  }

  public void setDraggable(String draggable) {
    this.draggable = draggable;
  }

  public String getClassSelector() {
    return classSelector;
  }

  public void setClassSelector(String classSelector) {
    this.classSelector = classSelector;
  }

  public String getIdSelector() {
    return idSelector;
  }

  public void setIdSelector(String idSelector) {
    this.idSelector = idSelector;
  }

  public String getHtmlLabel() {
    return htmlLabel;
  }

  public void setHtmlLabel(String htmlLabel) {
    this.htmlLabel = htmlLabel;
  }

  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }

  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }
}
