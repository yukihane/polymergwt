package com.google.gwt.polymerdemo.myelemental;

import jsinterop.annotations.JsType;

@JsType
public interface EventTarget {
  void addEventListener(String type, EventListener listener);
}
