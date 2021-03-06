package com.xiaomi.infra.pegasus.spark;

public class FDSConfig extends HDFSConfig {

  String bucketName;
  String endPoint;
  String accessKey;
  String accessSecret;

  public FDSConfig(
      String accessKey, String accessSecret, String bucketName, String endPoint, String port) {
    super("fds://" + accessKey + ":" + accessSecret + "@" + bucketName + "." + endPoint, port);
    this.accessKey = accessKey;
    this.accessSecret = accessSecret;
    this.bucketName = bucketName;
    this.endPoint = endPoint;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  public void setEndPoint(String endPoint) {
    this.endPoint = endPoint;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public void setAccessSecret(String accessSecret) {
    this.accessSecret = accessSecret;
  }

  public String getBucketName() {
    return bucketName;
  }

  public String getEndPoint() {
    return endPoint;
  }

  public String getAccessKey() {
    return accessKey;
  }

  public String getAccessSecret() {
    return accessSecret;
  }
}
