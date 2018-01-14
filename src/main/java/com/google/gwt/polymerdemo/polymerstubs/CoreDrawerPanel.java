package com.google.gwt.polymerdemo.polymerstubs;

import com.google.gwt.polymerdemo.myelemental.HTMLElement;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true)
public interface CoreDrawerPanel extends HTMLElement {

  @JsProperty void setForceNarrow(boolean narrow);
  
  // TODO(digi): Rename to isNarrow() when JsType parsing allows.
  @JsProperty boolean getNarrow();
  
  @JsProperty String getSelected();
  @JsProperty void setSelected(String selected);

  void closeDrawer();
  void openDrawer();
  void togglePanel();
}
