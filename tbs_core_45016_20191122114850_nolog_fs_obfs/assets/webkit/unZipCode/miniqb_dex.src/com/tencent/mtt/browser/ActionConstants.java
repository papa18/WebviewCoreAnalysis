package com.tencent.mtt.browser;

public abstract interface ActionConstants
{
  public static final String ACTION_ASSIST = "android.intent.action.ASSIST";
  public static final String ACTION_BARCODE_SCAN = "com.tencent.mtt.zxing.SCAN";
  public static final String ACTION_BDTIPS_NETWORK = "com.tencent.QQBrowser.action.BDTIPS.network";
  public static final String ACTION_BRAND_INFO = "com.tencent.mtt.wifi.BRAND_INFO";
  public static final String ACTION_CALENDAR_DATA_REFRESH = "com.tencent.QQBrowser.action.calendar.REFRESH";
  public static final String ACTION_CALL_DONOTHING = "com.tencent.QQBrowser.action.DONOTHING";
  public static final String ACTION_CONSTELLATION_DATA_REFRESH = "com.tencent.QQBrowser.action.constellation.REFRESH";
  public static final String ACTION_CONSTELLATION_REFRESH_FAIL = "com.tencent.QQBrowser.action.constellation.REFRESH.FAIL";
  public static final String ACTION_DEEPLINK_JUMP_CANCEL = "com.tencent.mtt.action.jump_result_cancel";
  public static final String ACTION_DEEPLINK_JUMP_OK = "com.tencent.mtt.action.jump_result_ok";
  public static final String ACTION_DEVICE_LOGOUT = "device_logout";
  public static final String ACTION_DOWNLOAD_DISPACH = "com.tencent.QQBrowser.action.download.Dispatch";
  public static final String ACTION_DOWNLOAD_DISPACH_SHOW = "com.tencent.QQBrowser.action.download.Dispatch.show";
  public static final String ACTION_EXIT = "com.tencent.QQBrowser.action.EXIT";
  public static final String ACTION_EXTERNAL_QQBROWSER = "com.tencent.QQBrowser.action.VIEW";
  public static final String ACTION_FASTSPREAD = "com.tencent.QQBrowser.action.FASTSPREAD";
  public static final String ACTION_FLOATWINDOW_UPDATE_FAIL = "com.tencent.mtt.floatwindow.update.fail";
  public static final String ACTION_FLOATWINDOW_UPDATE_SUCCESS = "com.tencent.mtt.floatwindow.update.success";
  public static final String ACTION_FLOAT_WINDOW_HIDE = "com.tencent.mtt.floatwindow.HIDE";
  public static final String ACTION_FLOAT_WINDOW_SHOW = "com.tencent.mtt.floatwindow.SHOW";
  public static final String ACTION_FLOAT_WINDOW_UPDATE = "com.tencent.mtt.floatwindow.UPDATE";
  public static final String ACTION_FREQUENT_VISIT = "com.tencent.QQBrowser.action.frequentvisit";
  public static final String ACTION_GUID_CHANGED = "com.tencent.QQBrowser.action.guidchanged";
  public static final String ACTION_HOMEPAGE_ADDRESS_BAR_ANIMATION = "com.tencent.mtt.browser.homepage.SPLASH";
  public static final String ACTION_HOTWORD_DATA_REFRESH = "com.tencent.QQBrowser.action.hotword.REFRESH";
  public static final String ACTION_INTENT_PASSTHROUGH = "com.tencent.QQBrowser.action.INTENT_PASSTHROUGH";
  public static final String ACTION_KEEP_READING_OFF = "com.tencent.mtt.keepreading.OFF";
  public static final String ACTION_KEEP_READING_ON = "com.tencent.mtt.keepreading.ON";
  public static final String ACTION_LIFE_DATA_REFRESH = "com.tencent.QQBrowser.action.life.REFRESH";
  public static final String ACTION_LITE_APP_SCHEME = "mttlightapp://";
  public static final String ACTION_LITE_APP_WTLOGIN_SCHEME = "lappwtlogin://";
  public static final String ACTION_MAIN = "android.intent.action.MAIN";
  public static final String ACTION_NETPACKETCAPTURE = "com.tencent.QQBrowser.action.NETPACKETCAPTURE";
  public static final String ACTION_NOTI_HOTWORD_DATA_REFRESH = "com.tencent.QQBrowser.action.noti.hotword.REFRESH";
  public static final String ACTION_PLUGIN_REFRESH = "com.tencent.QQBrowser.action.REFRESH";
  public static final String ACTION_PLUGIN_UPPAY_MSG = "com.tencent.QQBrowser.action.qqbrowser.uppay";
  public static final String ACTION_PUSH_MSG = "com.tencent.QQBrowser.action.PUSHMSG";
  public static final String ACTION_REQ_WIFI_HEADS_UP = "com.tencent.mtt.wifi.HEADS_UP";
  public static final String ACTION_RESIENT_NOTIFICATION_CALENDAR_REFRESH = "com.tencent.QQBrowser.action.residentnotification.calendar.REFRESH";
  public static final String ACTION_RESIENT_NOTIFICATION_CLOSE = "com.tencent.QQBrowser.action.residentnotification.close";
  public static final String ACTION_RESIENT_NOTIFICATION_CLOSE_SERVICE = "com.tencent.QQBrowser.action.residentnotification.closeservice";
  public static final String ACTION_RESIENT_NOTIFICATION_REFRESH = "com.tencent.QQBrowser.action.residentnotification.REFRESH";
  public static final String ACTION_RESIENT_NOTIFICATION_REFRESH_HOTWORD = "com.tencent.QQBrowser.action.residentnotification.REFRESHHOTWORD";
  public static final String ACTION_RESIENT_NOTIFICATION_REFRESH_HOTWORDANDTIME = "com.tencent.QQBrowser.action.residentnotification.REFRESHHOTWORDTIME";
  public static final String ACTION_RESIENT_NOTIFICATION_RESTART = "com.tencent.QQBrowser.action.residentnotification.restart";
  public static final String ACTION_RESIENT_NOTIFICATION_SHOW = "com.tencent.QQBrowser.action.residentnotification.show";
  public static final String ACTION_RESIENT_NOTIFICATION_WEATHER_TIMER_RESTART = "com.tencent.QQBrowser.action.residentnotification.weather.timer.restart";
  public static final String ACTION_RESIENT_NOTIFICATION_WEATHER_TIMER_START = "com.tencent.QQBrowser.action.residentnotification.weather.timer.start";
  public static final String ACTION_RESIENT_NOTIFICATION_WEATHER_TIMER_STOP = "com.tencent.QQBrowser.action.residentnotification.weather.timer.stop";
  public static final String ACTION_SEARCH = "com.tencent.QQBrowser.action.SEARCH";
  public static final String ACTION_SEARCH_INPUT = "com.tencent.QQBrowser.action.SEARCHINPUT";
  public static final String ACTION_SHORT_CUT = "com.tencent.QQBrowser.action.SHORTCUT";
  public static final String ACTION_SHORT_CUT_4X = "com.tencent.qbx.action.SHORTCUT";
  public static final String ACTION_SHORT_CUT_4_70X = "com.tencent.qbx5.action.SHORTCUT";
  public static final String ACTION_SHOW_BDTIPS = "com.tencent.QQBrowser.action.BDTIPS";
  public static final String ACTION_SHOW_DOWNLOAD_WINDOW = "com.tencent.QQBrowser.action.SHOWDOWNLOAD";
  public static final String ACTION_SHOW_FILE_DIR = "com.tencent.QQBrowser.action.SHOWFILEDIR";
  public static final String ACTION_SHOW_VIDEO_DOWNLOAD_WINDOW = "com.tencent.QQBrowser.action.SHOWVIDEODOWNLOAD";
  public static final String ACTION_SWITCH_SKIN = "com.tencent.mtt.action.siwtch_skin";
  public static final String ACTION_SYS_HIDE_CONFIGURED_NETWORKS_CHANGE = "android.net.wifi.CONFIGURED_NETWORKS_CHANGE";
  public static final String ACTION_UPDATE_VERSION = "com.tencent.QQBrowser.action.UPDATE";
  public static final String ACTION_VIEW_IN_CURRENT = "com.tencent.QQBrowser.action.VIEW_IN_CURRENT";
  public static final String ACTION_VIEW_IN_FUNC_WND = "com.tencent.QQBrowser.action.VIEW_IN_FUNC_WND";
  public static final String ACTION_VIEW_IN_NEW = "com.tencent.QQBrowser.action.VIEW_IN_NEW";
  public static final String ACTION_VIEW_IN_VALID_WND = "com.tencent.QQBrowser.action.VIEW_IN_VALID_WND";
  public static final String ACTION_VOICE_ASISTANT = "com.tencent.QQBrowser.action.ASISTANT";
  public static final String ACTION_VOICE_COMMAND = "android.intent.action.VOICE_COMMAND";
  public static final String ACTION_VOICE_INPUT = "com.tencent.QQBrowser.action.VOICEINPUT";
  public static final String ACTION_VOICE_WIDGET = "com.tencent.QQBrowser.action.WIDGET";
  public static final String ACTION_WEATHER_DATA_REFRESH = "com.tencent.QQBrowser.action.weather.REFRESH";
  public static final String ACTION_WEATHER_DATA_REFRESH_FAIL = "com.tencent.QQBrowser.action.weather.REFRESH.FAIL";
  public static final String ACTION_WIDGET = "com.tencent.mtt.widget.active";
  public static final String ACTION_WIDGET_HOTWORD_REFRESH = "com.tencent.mtt.widget.hotword_refresh";
  public static final String ACTION_YIYA_ASSISTANT_VOICE_CHANGE = "com.tencent.mtt.yiya.assistant.voice.CHANGE";
  public static final String BROADCAST_PERMISSION = "com.tencent.mtt.broadcast";
  public static final String CMD_ID = "cmdID";
  public static final String CREATE_WHERE = "createWhere";
  public static final String EXTRA_APPID = "appid";
  public static final String EXTRA_BACK_URL = "back_url";
  public static final String EXTRA_DISABLE_LIGHTAPP_PUSH_SETTING = "dis_push_setting";
  public static final String EXTRA_DISABLE_WEBAPP_PUSH_SETTING = "dis_webapp_ps";
  public static final String EXTRA_IS_APP_MSG = "extra_is_app_msg";
  public static final String EXTRA_MSGID = "msgid";
  public static final String EXTRA_MSG_BOX_ID = "extra_msg_box_id";
  public static final String EXTRA_QRCODE_CHANNEL = "qrcode_channel";
  public static final String EXTRA_SEARCH_RECOG_NAME = "search_recog_name";
  public static final String EXTRA_WIFIWEBLOGIN = "wifilogin";
  public static final String FROM_SERVICE = "share_open_page";
  public static final String FROM_WHERE = "fromWhere";
  public static final String FS_NOTIFY_INFO = "notifyInfo";
  public static final String FS_SNIFFER_INFO = "snifferInfo";
  public static final String INTENT_EXTRA_QUARY = "quary";
  public static final String INTERNAL_BACK = "internal_back";
  public static final String LOGIN_TYPE = "login_type";
  public static final String PUSH_NOTIFICATION_URL_FLAG = "push_notification_url_flag";
  public static final String QB_EXT_PREFIX = "mttbrowser://";
  public static final String QB_GAME_PREFIX = "x5gameplayer://";
  public static final String SHARE_MSG_TYPE = "share_msg_type";
  public static final String SHARE_NOTIFY_TYPE = "share_open_type";
  public static final String SNIFFER_BIND_CODE = "sniffer_bind_code";
}


/* Location:              C:\Users\Administrator\Desktop\学习资料\dex2jar\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mtt\browser\ActionConstants.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */