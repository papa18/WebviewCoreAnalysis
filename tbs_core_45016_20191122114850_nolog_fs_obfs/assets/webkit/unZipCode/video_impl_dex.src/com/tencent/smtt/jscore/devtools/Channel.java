package com.tencent.smtt.jscore.devtools;

public abstract interface Channel
{
  public abstract void onDisconnect();
  
  public abstract void onMessage(String paramString);
}


/* Location:              C:\Users\Administrator\Desktop\学习资料\dex2jar\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\smtt\jscore\devtools\Channel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */