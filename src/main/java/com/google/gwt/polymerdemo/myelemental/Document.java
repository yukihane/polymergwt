package com.google.gwt.polymerdemo.myelemental;

import jsinterop.annotations.JsType;

@JsType
public interface Document extends Node {

  EventTarget getElementById(String id);
}