package com.google.gwt.polymerdemo.myelemental;

import jsinterop.annotations.JsType;

@JsType(isNative=true)
public interface EventTarget {
  void addEventListener(String type, EventListener listener);
}
