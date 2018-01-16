package com.google.gwt.polymerdemo.polymerstubs;

import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public abstract class CoreDrawerPanel extends HTMLElement {

  @JsProperty public abstract void setForceNarrow(boolean narrow);
  
  // TODO(digi): Rename to isNarrow() when JsType parsing allows.
  @JsProperty public abstract boolean getNarrow();
  
  @JsProperty public abstract String getSelected();
  @JsProperty public abstract void setSelected(String selected);

  public abstract void closeDrawer();
  public abstract void openDrawer();
  public abstract void togglePanel();
}
