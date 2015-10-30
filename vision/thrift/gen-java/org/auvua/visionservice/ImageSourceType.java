/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.auvua.visionservice;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * Enumerations
 */
public enum ImageSourceType implements org.apache.thrift.TEnum {
  IMAGE(0),
  VIDEO(1),
  DEVICE(2),
  STREAM(3);

  private final int value;

  private ImageSourceType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ImageSourceType findByValue(int value) { 
    switch (value) {
      case 0:
        return IMAGE;
      case 1:
        return VIDEO;
      case 2:
        return DEVICE;
      case 3:
        return STREAM;
      default:
        return null;
    }
  }
}