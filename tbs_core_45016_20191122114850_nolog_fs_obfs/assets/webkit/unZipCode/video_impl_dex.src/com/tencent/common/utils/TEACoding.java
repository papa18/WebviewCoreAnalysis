package com.tencent.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class TEACoding
{
  private static Random jdField_a_of_type_JavaUtilRandom = new Random();
  private int jdField_a_of_type_Int;
  private boolean jdField_a_of_type_Boolean;
  private byte[] jdField_a_of_type_ArrayOfByte;
  private int jdField_b_of_type_Int;
  private byte[] jdField_b_of_type_ArrayOfByte;
  private int jdField_c_of_type_Int;
  private byte[] jdField_c_of_type_ArrayOfByte;
  private int jdField_d_of_type_Int;
  private byte[] jdField_d_of_type_ArrayOfByte;
  private int e;
  
  public TEACoding(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length == 16))
    {
      this.jdField_a_of_type_Boolean = true;
      this.jdField_d_of_type_ArrayOfByte = paramArrayOfByte;
      return;
    }
    throw new IllegalArgumentException("Key length must be 16!");
  }
  
  private int a()
  {
    return jdField_a_of_type_JavaUtilRandom.nextInt();
  }
  
  private void a()
  {
    byte[] arrayOfByte;
    for (this.jdField_c_of_type_Int = 0;; this.jdField_c_of_type_Int += 1)
    {
      i = this.jdField_c_of_type_Int;
      if (i >= 8) {
        break;
      }
      if (this.jdField_a_of_type_Boolean)
      {
        arrayOfByte = this.jdField_a_of_type_ArrayOfByte;
        arrayOfByte[i] = ((byte)(arrayOfByte[i] ^ this.jdField_b_of_type_ArrayOfByte[i]));
      }
      else
      {
        arrayOfByte = this.jdField_a_of_type_ArrayOfByte;
        arrayOfByte[i] = ((byte)(arrayOfByte[i] ^ this.jdField_c_of_type_ArrayOfByte[(this.jdField_b_of_type_Int + i)]));
      }
    }
    System.arraycopy(a(this.jdField_a_of_type_ArrayOfByte), 0, this.jdField_c_of_type_ArrayOfByte, this.jdField_a_of_type_Int, 8);
    for (this.jdField_c_of_type_Int = 0;; this.jdField_c_of_type_Int = (i + 1))
    {
      i = this.jdField_c_of_type_Int;
      if (i >= 8) {
        break;
      }
      arrayOfByte = this.jdField_c_of_type_ArrayOfByte;
      int j = this.jdField_a_of_type_Int + i;
      arrayOfByte[j] = ((byte)(arrayOfByte[j] ^ this.jdField_b_of_type_ArrayOfByte[i]));
    }
    System.arraycopy(this.jdField_a_of_type_ArrayOfByte, 0, this.jdField_b_of_type_ArrayOfByte, 0, 8);
    int i = this.jdField_a_of_type_Int;
    this.jdField_b_of_type_Int = i;
    this.jdField_a_of_type_Int = (i + 8);
    this.jdField_c_of_type_Int = 0;
    this.jdField_a_of_type_Boolean = false;
  }
  
  private boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i;
    for (this.jdField_c_of_type_Int = 0;; this.jdField_c_of_type_Int = (i + 1))
    {
      i = this.jdField_c_of_type_Int;
      if (i >= 8) {
        break;
      }
      if (this.e + i >= paramInt2) {
        return true;
      }
      byte[] arrayOfByte = this.jdField_b_of_type_ArrayOfByte;
      arrayOfByte[i] = ((byte)(arrayOfByte[i] ^ paramArrayOfByte[(this.jdField_a_of_type_Int + paramInt1 + i)]));
    }
    this.jdField_b_of_type_ArrayOfByte = b(this.jdField_b_of_type_ArrayOfByte);
    if (this.jdField_b_of_type_ArrayOfByte == null) {
      return false;
    }
    this.e += 8;
    this.jdField_a_of_type_Int += 8;
    this.jdField_c_of_type_Int = 0;
    return true;
  }
  
  private byte[] a(byte[] paramArrayOfByte)
  {
    int i = 16;
    for (;;)
    {
      long l1;
      long l2;
      long l4;
      long l5;
      long l6;
      long l7;
      long l3;
      try
      {
        l1 = getUnsignedInt(paramArrayOfByte, 0, 4);
        l2 = getUnsignedInt(paramArrayOfByte, 4, 4);
        l4 = getUnsignedInt(this.jdField_d_of_type_ArrayOfByte, 0, 4);
        l5 = getUnsignedInt(this.jdField_d_of_type_ArrayOfByte, 4, 4);
        l6 = getUnsignedInt(this.jdField_d_of_type_ArrayOfByte, 8, 4);
        l7 = getUnsignedInt(this.jdField_d_of_type_ArrayOfByte, 12, 4);
        l3 = 0L;
      }
      catch (IOException paramArrayOfByte)
      {
        DataOutputStream localDataOutputStream;
        continue;
      }
      paramArrayOfByte = new ByteArrayOutputStream(8);
      localDataOutputStream = new DataOutputStream(paramArrayOfByte);
      localDataOutputStream.writeInt((int)l1);
      localDataOutputStream.writeInt((int)l2);
      localDataOutputStream.close();
      paramArrayOfByte = paramArrayOfByte.toByteArray();
      return paramArrayOfByte;
      return null;
      while (i > 0)
      {
        l3 = l3 + 2654435769L & 0xFFFFFFFF;
        l1 = l1 + ((l2 << 4) + l4 ^ l2 + l3 ^ (l2 >>> 5) + l5) & 0xFFFFFFFF;
        l2 = l2 + ((l1 << 4) + l6 ^ l1 + l3 ^ (l1 >>> 5) + l7) & 0xFFFFFFFF;
        i -= 1;
      }
    }
  }
  
  private byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 16;
    for (;;)
    {
      long l2;
      long l1;
      long l4;
      long l5;
      long l6;
      long l7;
      long l3;
      try
      {
        l2 = getUnsignedInt(paramArrayOfByte, paramInt, 4);
        l1 = getUnsignedInt(paramArrayOfByte, paramInt + 4, 4);
        l4 = getUnsignedInt(this.jdField_d_of_type_ArrayOfByte, 0, 4);
        l5 = getUnsignedInt(this.jdField_d_of_type_ArrayOfByte, 4, 4);
        l6 = getUnsignedInt(this.jdField_d_of_type_ArrayOfByte, 8, 4);
        l7 = getUnsignedInt(this.jdField_d_of_type_ArrayOfByte, 12, 4);
        l3 = 3816266640L;
        paramInt = i;
      }
      catch (IOException paramArrayOfByte)
      {
        DataOutputStream localDataOutputStream;
        continue;
      }
      paramArrayOfByte = new ByteArrayOutputStream(8);
      localDataOutputStream = new DataOutputStream(paramArrayOfByte);
      localDataOutputStream.writeInt((int)l2);
      localDataOutputStream.writeInt((int)l1);
      localDataOutputStream.close();
      paramArrayOfByte = paramArrayOfByte.toByteArray();
      return paramArrayOfByte;
      return null;
      while (paramInt > 0)
      {
        l1 = l1 - ((l2 << 4) + l6 ^ l2 + l3 ^ (l2 >>> 5) + l7) & 0xFFFFFFFF;
        l2 = l2 - ((l1 << 4) + l4 ^ l1 + l3 ^ (l1 >>> 5) + l5) & 0xFFFFFFFF;
        l3 = l3 - 2654435769L & 0xFFFFFFFF;
        paramInt -= 1;
      }
    }
  }
  
  private byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.jdField_a_of_type_ArrayOfByte = new byte[8];
    this.jdField_b_of_type_ArrayOfByte = new byte[8];
    this.jdField_c_of_type_Int = 1;
    this.jdField_d_of_type_Int = 0;
    this.jdField_b_of_type_Int = 0;
    this.jdField_a_of_type_Int = 0;
    this.jdField_a_of_type_Boolean = true;
    this.jdField_c_of_type_Int = ((paramInt2 + 10) % 8);
    int i = this.jdField_c_of_type_Int;
    if (i != 0) {
      this.jdField_c_of_type_Int = (8 - i);
    }
    this.jdField_c_of_type_ArrayOfByte = new byte[this.jdField_c_of_type_Int + paramInt2 + 10];
    this.jdField_a_of_type_ArrayOfByte[0] = ((byte)(a() & 0xF8 | this.jdField_c_of_type_Int));
    i = 1;
    int j;
    for (;;)
    {
      j = this.jdField_c_of_type_Int;
      if (i > j) {
        break;
      }
      this.jdField_a_of_type_ArrayOfByte[i] = ((byte)(a() & 0xFF));
      i += 1;
    }
    this.jdField_c_of_type_Int = (j + 1);
    i = 0;
    while (i < 8)
    {
      this.jdField_b_of_type_ArrayOfByte[i] = 0;
      i += 1;
    }
    this.jdField_d_of_type_Int = 1;
    byte[] arrayOfByte;
    for (;;)
    {
      i = paramInt1;
      j = paramInt2;
      if (this.jdField_d_of_type_Int > 2) {
        break;
      }
      i = this.jdField_c_of_type_Int;
      if (i < 8)
      {
        arrayOfByte = this.jdField_a_of_type_ArrayOfByte;
        this.jdField_c_of_type_Int = (i + 1);
        arrayOfByte[i] = ((byte)(a() & 0xFF));
        this.jdField_d_of_type_Int += 1;
      }
      if (this.jdField_c_of_type_Int == 8) {
        a();
      }
    }
    while (j > 0)
    {
      int k = this.jdField_c_of_type_Int;
      paramInt2 = i;
      paramInt1 = j;
      if (k < 8)
      {
        arrayOfByte = this.jdField_a_of_type_ArrayOfByte;
        this.jdField_c_of_type_Int = (k + 1);
        arrayOfByte[k] = paramArrayOfByte[i];
        paramInt1 = j - 1;
        paramInt2 = i + 1;
      }
      i = paramInt2;
      j = paramInt1;
      if (this.jdField_c_of_type_Int == 8)
      {
        a();
        i = paramInt2;
        j = paramInt1;
      }
    }
    this.jdField_d_of_type_Int = 1;
    for (;;)
    {
      paramInt1 = this.jdField_d_of_type_Int;
      if (paramInt1 > 7) {
        break;
      }
      paramInt2 = this.jdField_c_of_type_Int;
      if (paramInt2 < 8)
      {
        paramArrayOfByte = this.jdField_a_of_type_ArrayOfByte;
        this.jdField_c_of_type_Int = (paramInt2 + 1);
        paramArrayOfByte[paramInt2] = 0;
        this.jdField_d_of_type_Int = (paramInt1 + 1);
      }
      if (this.jdField_c_of_type_Int == 8) {
        a();
      }
    }
    return this.jdField_c_of_type_ArrayOfByte;
  }
  
  private byte[] b(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0);
  }
  
  private byte[] b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int k = 0;
    this.jdField_b_of_type_Int = 0;
    this.jdField_a_of_type_Int = 0;
    Object localObject1 = new byte[paramInt1 + 8];
    if (paramInt2 % 8 == 0)
    {
      if (paramInt2 < 16) {
        return null;
      }
      this.jdField_b_of_type_ArrayOfByte = a(paramArrayOfByte, paramInt1);
      Object localObject2 = this.jdField_b_of_type_ArrayOfByte;
      if (localObject2 == null) {
        return null;
      }
      this.jdField_c_of_type_Int = (localObject2[0] & 0x7);
      int m = paramInt2 - this.jdField_c_of_type_Int - 10;
      if (m < 0) {
        return null;
      }
      int i = paramInt1;
      while (i < localObject1.length)
      {
        localObject1[i] = 0;
        i += 1;
      }
      this.jdField_c_of_type_ArrayOfByte = new byte[m];
      this.jdField_b_of_type_Int = 0;
      this.jdField_a_of_type_Int = 8;
      this.e = 8;
      this.jdField_c_of_type_Int += 1;
      this.jdField_d_of_type_Int = 1;
      int n;
      int j;
      for (;;)
      {
        n = this.jdField_d_of_type_Int;
        j = k;
        localObject2 = localObject1;
        i = m;
        if (n > 2) {
          break;
        }
        i = this.jdField_c_of_type_Int;
        if (i < 8)
        {
          this.jdField_c_of_type_Int = (i + 1);
          this.jdField_d_of_type_Int = (n + 1);
        }
        if (this.jdField_c_of_type_Int == 8)
        {
          if (!a(paramArrayOfByte, paramInt1, paramInt2)) {
            return null;
          }
          localObject1 = paramArrayOfByte;
        }
      }
      while (i != 0)
      {
        n = this.jdField_c_of_type_Int;
        m = j;
        k = i;
        if (n < 8)
        {
          this.jdField_c_of_type_ArrayOfByte[j] = ((byte)(localObject2[(this.jdField_b_of_type_Int + paramInt1 + n)] ^ this.jdField_b_of_type_ArrayOfByte[n]));
          m = j + 1;
          k = i - 1;
          this.jdField_c_of_type_Int = (n + 1);
        }
        j = m;
        i = k;
        if (this.jdField_c_of_type_Int == 8)
        {
          this.jdField_b_of_type_Int = (this.jdField_a_of_type_Int - 8);
          if (!a(paramArrayOfByte, paramInt1, paramInt2)) {
            return null;
          }
          localObject2 = paramArrayOfByte;
          j = m;
          i = k;
        }
      }
      this.jdField_d_of_type_Int = 1;
      while (this.jdField_d_of_type_Int < 8)
      {
        i = this.jdField_c_of_type_Int;
        if (i < 8)
        {
          if ((localObject2[(this.jdField_b_of_type_Int + paramInt1 + i)] ^ this.jdField_b_of_type_ArrayOfByte[i]) != 0) {
            return null;
          }
          this.jdField_c_of_type_Int = (i + 1);
        }
        localObject1 = localObject2;
        if (this.jdField_c_of_type_Int == 8)
        {
          this.jdField_b_of_type_Int = this.jdField_a_of_type_Int;
          if (!a(paramArrayOfByte, paramInt1, paramInt2)) {
            return null;
          }
          localObject1 = paramArrayOfByte;
        }
        this.jdField_d_of_type_Int += 1;
        localObject2 = localObject1;
      }
      return this.jdField_c_of_type_ArrayOfByte;
    }
    return null;
  }
  
  public static long getUnsignedInt(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 > 8) {
      paramInt2 = paramInt1 + 8;
    } else {
      paramInt2 += paramInt1;
    }
    long l = 0L;
    while (paramInt1 < paramInt2)
    {
      l = l << 8 | paramArrayOfByte[paramInt1] & 0xFF;
      paramInt1 += 1;
    }
    return 0xFFFFFFFF & l | l >>> 32;
  }
  
  public byte[] decode(byte[] paramArrayOfByte)
  {
    return b(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public byte[] decodeFromBase64Str(String paramString)
  {
    try
    {
      paramString = decode(Base64.decode(paramString));
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public byte[] decodeFromHexStr(String paramString)
  {
    return decode(ByteUtils.hexStringToByte(paramString));
  }
  
  public byte[] encode(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public String encode2HexBase64(byte[] paramArrayOfByte)
  {
    return Base64.encode(encode(paramArrayOfByte));
  }
  
  public String encode2HexStr(byte[] paramArrayOfByte)
  {
    return ByteUtils.byteToHexString(encode(paramArrayOfByte));
  }
}


/* Location:              C:\Users\Administrator\Desktop\学习资料\dex2jar\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\common\utils\TEACoding.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */