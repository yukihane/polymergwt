package com.google.gwt.polymerdemo.polymerstubs;

import elemental2.dom.Event;
import elemental2.dom.EventInit;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public abstract class CoreResponsiveChangeEvent extends Event {


  public CoreResponsiveChangeEvent(String type, EventInit eventInitDict) {
    // This call is only here for java compilation purpose.
    super((String) null, (EventInit) null);
  }

  public CoreResponsiveChangeEvent(String type) {
    // This call is only here for java compilation purpose.
    super((String) null, (EventInit) null);
  }

  @JsProperty
  public abstract Detail getDetail();

  @JsType(isNative=true)
  public interface Detail {
    // TODO(digi): Fix JsProperty bean parsing to allow this to be renamed isNarrow.
    @JsProperty boolean getNarrow();
  }

  interface Handler {
    void onCoreResponsiveChange(CoreResponsiveChangeEvent event);
  }
}
