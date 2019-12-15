package com.taf;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

public final class JceUtil
{
  private static final byte[] a;
  private static final byte[] b;
  
  static
  {
    byte[] arrayOfByte1 = new byte[16];
    byte[] tmp6_5 = arrayOfByte1;
    tmp6_5[0] = 48;
    byte[] tmp11_6 = tmp6_5;
    tmp11_6[1] = 49;
    byte[] tmp16_11 = tmp11_6;
    tmp16_11[2] = 50;
    byte[] tmp21_16 = tmp16_11;
    tmp21_16[3] = 51;
    byte[] tmp26_21 = tmp21_16;
    tmp26_21[4] = 52;
    byte[] tmp31_26 = tmp26_21;
    tmp31_26[5] = 53;
    byte[] tmp36_31 = tmp31_26;
    tmp36_31[6] = 54;
    byte[] tmp42_36 = tmp36_31;
    tmp42_36[7] = 55;
    byte[] tmp48_42 = tmp42_36;
    tmp48_42[8] = 56;
    byte[] tmp54_48 = tmp48_42;
    tmp54_48[9] = 57;
    byte[] tmp60_54 = tmp54_48;
    tmp60_54[10] = 65;
    byte[] tmp66_60 = tmp60_54;
    tmp66_60[11] = 66;
    byte[] tmp72_66 = tmp66_60;
    tmp72_66[12] = 67;
    byte[] tmp78_72 = tmp72_66;
    tmp78_72[13] = 68;
    byte[] tmp84_78 = tmp78_72;
    tmp84_78[14] = 69;
    byte[] tmp90_84 = tmp84_78;
    tmp90_84[15] = 70;
    tmp90_84;
    byte[] arrayOfByte2 = new byte['Ā'];
    byte[] arrayOfByte3 = new byte['Ā'];
    int i = 0;
    while (i < 256)
    {
      arrayOfByte2[i] = arrayOfByte1[(i >>> 4)];
      arrayOfByte3[i] = arrayOfByte1[(i & 0xF)];
      i += 1;
    }
    a = arrayOfByte2;
    b = arrayOfByte3;
  }
  
  public static int compareTo(byte paramByte1, byte paramByte2)
  {
    if (paramByte1 < paramByte2) {
      return -1;
    }
    if (paramByte1 > paramByte2) {
      return 1;
    }
    return 0;
  }
  
  public static int compareTo(char paramChar1, char paramChar2)
  {
    if (paramChar1 < paramChar2) {
      return -1;
    }
    if (paramChar1 > paramChar2) {
      return 1;
    }
    return 0;
  }
  
  public static int compareTo(double paramDouble1, double paramDouble2)
  {
    if (paramDouble1 < paramDouble2) {
      return -1;
    }
    if (paramDouble1 > paramDouble2) {
      return 1;
    }
    return 0;
  }
  
  public static int compareTo(float paramFloat1, float paramFloat2)
  {
    if (paramFloat1 < paramFloat2) {
      return -1;
    }
    if (paramFloat1 > paramFloat2) {
      return 1;
    }
    return 0;
  }
  
  public static int compareTo(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2) {
      return -1;
    }
    if (paramInt1 > paramInt2) {
      return 1;
    }
    return 0;
  }
  
  public static int compareTo(long paramLong1, long paramLong2)
  {
    if (paramLong1 < paramLong2) {
      return -1;
    }
    if (paramLong1 > paramLong2) {
      return 1;
    }
    return 0;
  }
  
  public static <T extends Comparable<T>> int compareTo(T paramT1, T paramT2)
  {
    return paramT1.compareTo(paramT2);
  }
  
  public static <T extends Comparable<T>> int compareTo(List<T> paramList1, List<T> paramList2)
  {
    paramList1 = paramList1.iterator();
    paramList2 = paramList2.iterator();
    while ((paramList1.hasNext()) && (paramList2.hasNext()))
    {
      int i = ((Comparable)paramList1.next()).compareTo(paramList2.next());
      if (i != 0) {
        return i;
      }
    }
    return compareTo(paramList1.hasNext(), paramList2.hasNext());
  }
  
  public static int compareTo(short paramShort1, short paramShort2)
  {
    if (paramShort1 < paramShort2) {
      return -1;
    }
    if (paramShort1 > paramShort2) {
      return 1;
    }
    return 0;
  }
  
  public static int compareTo(boolean paramBoolean1, boolean paramBoolean2)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
  }
  
  public static int compareTo(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int j = 0;
    int i = 0;
    while ((j < paramArrayOfByte1.length) && (i < paramArrayOfByte2.length))
    {
      int k = compareTo(paramArrayOfByte1[j], paramArrayOfByte2[i]);
      if (k != 0) {
        return k;
      }
      j += 1;
      i += 1;
    }
    return compareTo(paramArrayOfByte1.length, paramArrayOfByte2.length);
  }
  
  public static int compareTo(char[] paramArrayOfChar1, char[] paramArrayOfChar2)
  {
    int j = 0;
    int i = 0;
    while ((j < paramArrayOfChar1.length) && (i < paramArrayOfChar2.length))
    {
      int k = compareTo(paramArrayOfChar1[j], paramArrayOfChar2[i]);
      if (k != 0) {
        return k;
      }
      j += 1;
      i += 1;
    }
    return compareTo(paramArrayOfChar1.length, paramArrayOfChar2.length);
  }
  
  public static int compareTo(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    int j = 0;
    int i = 0;
    while ((j < paramArrayOfDouble1.length) && (i < paramArrayOfDouble2.length))
    {
      int k = compareTo(paramArrayOfDouble1[j], paramArrayOfDouble2[i]);
      if (k != 0) {
        return k;
      }
      j += 1;
      i += 1;
    }
    return compareTo(paramArrayOfDouble1.length, paramArrayOfDouble2.length);
  }
  
  public static int compareTo(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    int j = 0;
    int i = 0;
    while ((j < paramArrayOfFloat1.length) && (i < paramArrayOfFloat2.length))
    {
      int k = compareTo(paramArrayOfFloat1[j], paramArrayOfFloat2[i]);
      if (k != 0) {
        return k;
      }
      j += 1;
      i += 1;
    }
    return compareTo(paramArrayOfFloat1.length, paramArrayOfFloat2.length);
  }
  
  public static int compareTo(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int j = 0;
    int i = 0;
    while ((j < paramArrayOfInt1.length) && (i < paramArrayOfInt2.length))
    {
      int k = compareTo(paramArrayOfInt1[j], paramArrayOfInt2[i]);
      if (k != 0) {
        return k;
      }
      j += 1;
      i += 1;
    }
    return compareTo(paramArrayOfInt1.length, paramArrayOfInt2.length);
  }
  
  public static int compareTo(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    int j = 0;
    int i = 0;
    while ((j < paramArrayOfLong1.length) && (i < paramArrayOfLong2.length))
    {
      int k = compareTo(paramArrayOfLong1[j], paramArrayOfLong2[i]);
      if (k != 0) {
        return k;
      }
      j += 1;
      i += 1;
    }
    return compareTo(paramArrayOfLong1.length, paramArrayOfLong2.length);
  }
  
  public static <T extends Comparable<T>> int compareTo(T[] paramArrayOfT1, T[] paramArrayOfT2)
  {
    int j = 0;
    int i = 0;
    while ((j < paramArrayOfT1.length) && (i < paramArrayOfT2.length))
    {
      int k = paramArrayOfT1[j].compareTo(paramArrayOfT2[i]);
      if (k != 0) {
        return k;
      }
      j += 1;
      i += 1;
    }
    return compareTo(paramArrayOfT1.length, paramArrayOfT2.length);
  }
  
  public static int compareTo(short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    int j = 0;
    int i = 0;
    while ((j < paramArrayOfShort1.length) && (i < paramArrayOfShort2.length))
    {
      int k = compareTo(paramArrayOfShort1[j], paramArrayOfShort2[i]);
      if (k != 0) {
        return k;
      }
      j += 1;
      i += 1;
    }
    return compareTo(paramArrayOfShort1.length, paramArrayOfShort2.length);
  }
  
  public static int compareTo(boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    int j = 0;
    int i = 0;
    while ((j < paramArrayOfBoolean1.length) && (i < paramArrayOfBoolean2.length))
    {
      int k = compareTo(paramArrayOfBoolean1[j], paramArrayOfBoolean2[i]);
      if (k != 0) {
        return k;
      }
      j += 1;
      i += 1;
    }
    return compareTo(paramArrayOfBoolean1.length, paramArrayOfBoolean2.length);
  }
  
  public static boolean equals(byte paramByte1, byte paramByte2)
  {
    return paramByte1 == paramByte2;
  }
  
  public static boolean equals(char paramChar1, char paramChar2)
  {
    return paramChar1 == paramChar2;
  }
  
  public static boolean equals(double paramDouble1, double paramDouble2)
  {
    return paramDouble1 == paramDouble2;
  }
  
  public static boolean equals(float paramFloat1, float paramFloat2)
  {
    return paramFloat1 == paramFloat2;
  }
  
  public static boolean equals(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public static boolean equals(long paramLong1, long paramLong2)
  {
    return paramLong1 == paramLong2;
  }
  
  public static boolean equals(Object paramObject1, Object paramObject2)
  {
    return paramObject1.equals(paramObject2);
  }
  
  public static boolean equals(short paramShort1, short paramShort2)
  {
    return paramShort1 == paramShort2;
  }
  
  public static boolean equals(boolean paramBoolean1, boolean paramBoolean2)
  {
    return paramBoolean1 == paramBoolean2;
  }
  
  public static String getHexdump(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.remaining();
    if (i == 0) {
      return "empty";
    }
    StringBuffer localStringBuffer = new StringBuffer(paramByteBuffer.remaining() * 3 - 1);
    int j = paramByteBuffer.position();
    int k = paramByteBuffer.get() & 0xFF;
    localStringBuffer.append((char)a[k]);
    localStringBuffer.append((char)b[k]);
    i -= 1;
    while (i > 0)
    {
      localStringBuffer.append(' ');
      k = paramByteBuffer.get() & 0xFF;
      localStringBuffer.append((char)a[k]);
      localStringBuffer.append((char)b[k]);
      i -= 1;
    }
    paramByteBuffer.position(j);
    return localStringBuffer.toString();
  }
  
  public static String getHexdump(byte[] paramArrayOfByte)
  {
    return getHexdump(ByteBuffer.wrap(paramArrayOfByte));
  }
  
  public static byte[] getJceBufArray(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte = new byte[paramByteBuffer.position()];
    System.arraycopy(paramByteBuffer.array(), 0, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
  
  public static int hashCode(byte paramByte)
  {
    return paramByte + 629;
  }
  
  public static int hashCode(char paramChar)
  {
    return paramChar + 'ɵ';
  }
  
  public static int hashCode(double paramDouble)
  {
    return hashCode(Double.doubleToLongBits(paramDouble));
  }
  
  public static int hashCode(float paramFloat)
  {
    return Float.floatToIntBits(paramFloat) + 629;
  }
  
  public static int hashCode(int paramInt)
  {
    return paramInt + 629;
  }
  
  public static int hashCode(long paramLong)
  {
    return (int)(paramLong ^ paramLong >> 32) + 629;
  }
  
  public static int hashCode(Object paramObject)
  {
    if (paramObject == null) {
      return 629;
    }
    if (paramObject.getClass().isArray())
    {
      if ((paramObject instanceof long[])) {
        return hashCode((long[])paramObject);
      }
      if ((paramObject instanceof int[])) {
        return hashCode((int[])paramObject);
      }
      if ((paramObject instanceof short[])) {
        return hashCode((short[])paramObject);
      }
      if ((paramObject instanceof char[])) {
        return hashCode((char[])paramObject);
      }
      if ((paramObject instanceof byte[])) {
        return hashCode((byte[])paramObject);
      }
      if ((paramObject instanceof double[])) {
        return hashCode((double[])paramObject);
      }
      if ((paramObject instanceof float[])) {
        return hashCode((float[])paramObject);
      }
      if ((paramObject instanceof boolean[])) {
        return hashCode((boolean[])paramObject);
      }
      if ((paramObject instanceof JceStruct[])) {
        return hashCode((JceStruct[])paramObject);
      }
      return hashCode((Object[])paramObject);
    }
    if ((paramObject instanceof JceStruct)) {
      return paramObject.hashCode();
    }
    return 629 + paramObject.hashCode();
  }
  
  public static int hashCode(short paramShort)
  {
    return paramShort + 629;
  }
  
  public static int hashCode(boolean paramBoolean)
  {
    return (paramBoolean ^ true) + true;
  }
  
  public static int hashCode(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return 629;
    }
    int j = 17;
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      j = j * 37 + paramArrayOfByte[i];
      i += 1;
    }
    return j;
  }
  
  public static int hashCode(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar == null) {
      return 629;
    }
    int j = 17;
    int i = 0;
    while (i < paramArrayOfChar.length)
    {
      j = j * 37 + paramArrayOfChar[i];
      i += 1;
    }
    return j;
  }
  
  public static int hashCode(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null) {
      return 629;
    }
    int j = 17;
    int i = 0;
    while (i < paramArrayOfDouble.length)
    {
      j = j * 37 + (int)(Double.doubleToLongBits(paramArrayOfDouble[i]) ^ Double.doubleToLongBits(paramArrayOfDouble[i]) >> 32);
      i += 1;
    }
    return j;
  }
  
  public static int hashCode(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == null) {
      return 629;
    }
    int j = 17;
    int i = 0;
    while (i < paramArrayOfFloat.length)
    {
      j = j * 37 + Float.floatToIntBits(paramArrayOfFloat[i]);
      i += 1;
    }
    return j;
  }
  
  public static int hashCode(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {
      return 629;
    }
    int j = 17;
    int i = 0;
    while (i < paramArrayOfInt.length)
    {
      j = j * 37 + paramArrayOfInt[i];
      i += 1;
    }
    return j;
  }
  
  public static int hashCode(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null) {
      return 629;
    }
    int j = 17;
    int i = 0;
    while (i < paramArrayOfLong.length)
    {
      j = j * 37 + (int)(paramArrayOfLong[i] ^ paramArrayOfLong[i] >> 32);
      i += 1;
    }
    return j;
  }
  
  public static int hashCode(JceStruct[] paramArrayOfJceStruct)
  {
    if (paramArrayOfJceStruct == null) {
      return 629;
    }
    int j = 17;
    int i = 0;
    while (i < paramArrayOfJceStruct.length)
    {
      j = j * 37 + paramArrayOfJceStruct[i].hashCode();
      i += 1;
    }
    return j;
  }
  
  public static int hashCode(short[] paramArrayOfShort)
  {
    if (paramArrayOfShort == null) {
      return 629;
    }
    int j = 17;
    int i = 0;
    while (i < paramArrayOfShort.length)
    {
      j = j * 37 + paramArrayOfShort[i];
      i += 1;
    }
    return j;
  }
  
  public static int hashCode(boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean == null) {
      return 629;
    }
    int j = 17;
    int i = 0;
    while (i < paramArrayOfBoolean.length)
    {
      j = j * 37 + (paramArrayOfBoolean[i] ^ 0x1);
      i += 1;
    }
    return j;
  }
  
  public static byte[] jce2Bytes(JceStruct paramJceStruct)
  {
    if (paramJceStruct == null) {
      return null;
    }
    try
    {
      JceOutputStream localJceOutputStream = JceSynchronizedPool.getInstance().acquireout();
      localJceOutputStream.setServerEncoding("UTF-8");
      paramJceStruct.writeTo(localJceOutputStream);
      paramJceStruct = localJceOutputStream.copyByteArray();
      JceSynchronizedPool.getInstance().releaseOut(localJceOutputStream);
      return paramJceStruct;
    }
    catch (Exception paramJceStruct)
    {
      paramJceStruct.printStackTrace();
    }
    return null;
  }
  
  public static <T extends JceStruct> T parseRawData(Class<T> paramClass, ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer != null)
    {
      if (paramByteBuffer.position() == 0) {
        return null;
      }
      try
      {
        paramClass = (JceStruct)paramClass.newInstance();
        paramByteBuffer = new JceInputStream(paramByteBuffer);
        paramByteBuffer.setServerEncoding("UTF-8");
        paramClass.readFrom(paramByteBuffer);
        return paramClass;
      }
      catch (Throwable paramClass)
      {
        paramClass.printStackTrace();
        return null;
      }
    }
    return null;
  }
  
  public static <T extends JceStruct> T parseRawData(Class<T> paramClass, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      if (paramArrayOfByte.length == 0) {
        return null;
      }
      try
      {
        paramClass = (JceStruct)paramClass.newInstance();
        paramArrayOfByte = new JceInputStream(paramArrayOfByte);
        paramArrayOfByte.setServerEncoding("UTF-8");
        paramClass.readFrom(paramArrayOfByte);
        return paramClass;
      }
      catch (Throwable paramClass)
      {
        paramClass.printStackTrace();
        return null;
      }
    }
    return null;
  }
  
  public static <T extends JceStruct> T parseRawDataThrows(Class<T> paramClass, byte[] paramArrayOfByte)
    throws InstantiationException, IllegalAccessException
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length != 0))
    {
      paramClass = (JceStruct)paramClass.newInstance();
      paramArrayOfByte = new JceInputStream(paramArrayOfByte);
      paramArrayOfByte.setServerEncoding("UTF-8");
      paramClass.readFrom(paramArrayOfByte);
      return paramClass;
    }
    return null;
  }
  
  public static byte[] wrapJceBytes(byte[] paramArrayOfByte)
  {
    Object localObject2 = null;
    if (paramArrayOfByte == null) {
      return null;
    }
    Object localObject1 = localObject2;
    try
    {
      JceOutputStream localJceOutputStream = JceSynchronizedPool.getInstance().acquireout();
      localObject1 = localObject2;
      localJceOutputStream.setServerEncoding("UTF-8");
      localObject1 = localObject2;
      localJceOutputStream.reserve(2);
      localObject1 = localObject2;
      localJceOutputStream.writeHead((byte)10, 0);
      localObject1 = localObject2;
      localJceOutputStream.reserve(paramArrayOfByte.length);
      localObject1 = localObject2;
      localJceOutputStream.getByteBuffer().put(paramArrayOfByte);
      localObject1 = localObject2;
      localJceOutputStream.reserve(2);
      localObject1 = localObject2;
      localJceOutputStream.writeHead((byte)11, 0);
      localObject1 = localObject2;
      paramArrayOfByte = getJceBufArray(localJceOutputStream.getByteBuffer());
      localObject1 = paramArrayOfByte;
      JceSynchronizedPool.getInstance().releaseOut(localJceOutputStream);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return (byte[])localObject1;
  }
}


/* Location:              C:\Users\Administrator\Desktop\学习资料\dex2jar\dex2jar-2.0\classes-dex2jar.jar!\com\taf\JceUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */