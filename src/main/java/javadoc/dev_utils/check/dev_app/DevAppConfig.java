package javadoc.dev_utils.check.dev_app;

import javadoc.Utils;
import javadoc.dev_utils.check.dev.ICheckConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * detail: DevAppConfig 代码检测分析配置
 * @author Ttt
 */
final class DevAppConfig implements ICheckConfig {

    /**
     * 获取忽略指定方法注释配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreAnnotateMap() {
        Map<String, ArrayList<String>> ignoreAnnotateMap = new HashMap<>();
        ignoreAnnotateMap.put("ActivityUtils.ResultActivity", Utils.asList("onCreate","onActivityResult","onDestroy"));
        ignoreAnnotateMap.put("AutoFocusAssist.AutoFocusTask", Utils.asList("doInBackground"));
        ignoreAnnotateMap.put("Base64.Coder", Utils.asList("maxOutputSize"));
        ignoreAnnotateMap.put("Base64.Decoder", Utils.asList("maxOutputSize"));
        ignoreAnnotateMap.put("Base64.Encoder", Utils.asList("maxOutputSize","process"));
        ignoreAnnotateMap.put("ColorUtils.ColorInfo", Utils.asList("toString"));
        ignoreAnnotateMap.put("ColorUtils.ColorInfo.ColorParser", Utils.asList("handleColor"));
        ignoreAnnotateMap.put("ContentResolverUtils.MediaQueryInfo", Utils.asList("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreAnnotateMap.put("ContentResolverUtils.MediaQueryInfoUri", Utils.asList("getSelection","getSelectionArgs"));
        ignoreAnnotateMap.put("ContentResolverUtils.MediaQueryUri", Utils.asList("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreAnnotateMap.put("DevCache.xFileOutputStream", Utils.asList("close"));
        ignoreAnnotateMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asList("doInBackground"));
        ignoreAnnotateMap.put("InactivityTimerAssist.PowerStateReceiver", Utils.asList("onReceive"));
        ignoreAnnotateMap.put("JCLogUtils", Utils.asList("d","e","e","e","i","xml","dTag","eTag","eTag","eTag","iTag","xmlTag"));
        ignoreAnnotateMap.put("KeyValueBean", Utils.asList("toString"));
        ignoreAnnotateMap.put("LogPrintUtils", Utils.asList("d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreAnnotateMap.put("PreferenceImpl.ComparatorImpl", Utils.asList("compare"));
        ignoreAnnotateMap.put("ROMUtils.RomInfo", Utils.asList("toString"));
        ignoreAnnotateMap.put("ScreenSensorAssist.OrientationSensorChangeListener", Utils.asList("onAccuracyChanged","onSensorChanged"));
        ignoreAnnotateMap.put("ScreenSensorAssist.OrientationSensorListener", Utils.asList("onAccuracyChanged","onSensorChanged"));
        ignoreAnnotateMap.put("SpannableStringUtils.CustomBulletSpan", Utils.asList("getLeadingMargin","drawLeadingMargin"));
        ignoreAnnotateMap.put("SpannableStringUtils.CustomDynamicDrawableSpan", Utils.asList("getDrawable","getSize","draw","getCachedDrawable"));
        ignoreAnnotateMap.put("SpannableStringUtils.CustomImageSpan", Utils.asList("getDrawable"));
        ignoreAnnotateMap.put("SpannableStringUtils.CustomLineHeightSpan", Utils.asList("chooseHeight"));
        ignoreAnnotateMap.put("SpannableStringUtils.CustomQuoteSpan", Utils.asList("getLeadingMargin","drawLeadingMargin"));
        ignoreAnnotateMap.put("SpannableStringUtils.CustomTypefaceSpan", Utils.asList("updateDrawState","updateMeasureState","apply"));
        ignoreAnnotateMap.put("SpannableStringUtils.ShaderSpan", Utils.asList("updateDrawState"));
        ignoreAnnotateMap.put("SpannableStringUtils.ShadowSpan", Utils.asList("updateDrawState"));
        ignoreAnnotateMap.put("SpannableStringUtils.SpaceSpan", Utils.asList("getSize","draw"));
        ignoreAnnotateMap.put("SpannableStringUtils.VerticalAlignSpan", Utils.asList("getSize","draw"));
        ignoreAnnotateMap.put("ToastFactory.BaseToast", Utils.asList("setView","setText"));
        ignoreAnnotateMap.put("ToastFactory.NotificationToast", Utils.asList("show","cancel"));
        ignoreAnnotateMap.put("ToastFactory.SafeToast.SafeHandler", Utils.asList("handleMessage","dispatchMessage"));
        ignoreAnnotateMap.put("ToastFactory.ToastHelper", Utils.asList("handleMessage"));
        ignoreAnnotateMap.put("ToastTintUtils.SafeHandler", Utils.asList("handleMessage","dispatchMessage"));
        ignoreAnnotateMap.put("ToastUtils.SafeHandler", Utils.asList("handleMessage","dispatchMessage"));
        ignoreAnnotateMap.put("TypeUtils.ParameterizedTypeImpl", Utils.asList("getActualTypeArguments","getOwnerType","getRawType","equals","hashCode"));
        ignoreAnnotateMap.put("WifiVo", Utils.asList("describeContents","writeToParcel"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreFinalMap() {
        Map<String, ArrayList<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("ActivityUtils.ResultActivity", Utils.asList("onCreate","onActivityResult"));
        ignoreFinalMap.put("AutoFocusAssist", Utils.asList("onAutoFocus"));
        ignoreFinalMap.put("AutoFocusAssist.AutoFocusTask", Utils.asList("doInBackground"));
        ignoreFinalMap.put("Base64", Utils.asList("decode","decode","decode","encodeToString","encodeToString","encode","encode"));
        ignoreFinalMap.put("Base64.Decoder", Utils.asList("maxOutputSize","process"));
        ignoreFinalMap.put("Base64.Encoder", Utils.asList("maxOutputSize","process"));
        ignoreFinalMap.put("Base64Cipher", Utils.asList("decrypt","encrypt"));
        ignoreFinalMap.put("BitmapUtils", Utils.asList("combineToCenter","combineToSameSize","combineToSameSize"));
        ignoreFinalMap.put("CameraSizeAssist", Utils.asList("setPreviewSize","setPictureSize","calcPreviewSize","calcPictureSize","calcVideoSize"));
        ignoreFinalMap.put("CameraUtils", Utils.asList("initCamera","open"));
        ignoreFinalMap.put("ColorUtils.ColorInfo", Utils.asList("RGBtoHSB"));
        ignoreFinalMap.put("ColorUtils.ColorInfo.ColorParser", Utils.asList("handleColor"));
        ignoreFinalMap.put("ContentResolverUtils.MediaQueryInfo", Utils.asList("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreFinalMap.put("ContentResolverUtils.MediaQueryInfoUri", Utils.asList("getSelection","getSelectionArgs"));
        ignoreFinalMap.put("ContentResolverUtils.MediaQueryUri", Utils.asList("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreFinalMap.put("CrashUtils", Utils.asList("init","uncaughtException","handleException"));
        ignoreFinalMap.put("DevMediaManager", Utils.asList("onError","onVideoSizeChanged","onPrepared","onCompletion","onBufferingUpdate","onSeekComplete"));
        ignoreFinalMap.put("DevVideoPlayerControl", Utils.asList("surfaceChanged","surfaceCreated","surfaceDestroyed","onBufferingUpdate","onError","onVideoSizeChanged"));
        ignoreFinalMap.put("IToastImpl", Utils.asList("filter","handlerContent"));
        ignoreFinalMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asList("doInBackground"));
        ignoreFinalMap.put("InactivityTimerAssist.PowerStateReceiver", Utils.asList("onReceive"));
        ignoreFinalMap.put("LocationUtils.CustomLocationListener", Utils.asList("onLocationChanged","onStatusChanged","onProviderEnabled","onProviderDisabled"));
        ignoreFinalMap.put("LoggerPrinter", Utils.asList("logHeaderContent"));
        ignoreFinalMap.put("NetWorkUtils", Utils.asList("isAvailableByPing"));
        ignoreFinalMap.put("PermissionUtils.PermissionActivity", Utils.asList("onCreate","onRequestPermissionsResult"));
        ignoreFinalMap.put("PreferenceImpl.ComparatorImpl", Utils.asList("compare"));
        ignoreFinalMap.put("ScreenSensorAssist.OrientationSensorChangeListener", Utils.asList("onAccuracyChanged","onSensorChanged"));
        ignoreFinalMap.put("ScreenSensorAssist.OrientationSensorListener", Utils.asList("onAccuracyChanged","onSensorChanged"));
        ignoreFinalMap.put("SnackbarUtils.StyleBuilder", Utils.asList("setRootGravity","setRootCornerRadius","setRootBackgroundTintColor","setRootBackground","setRootMargin","setRootAlpha","setTextGravity","setTextColor","setTextSize","setTextMaxLines","setTextEllipsize","setTextTypeface","setTextPadding","setActionGravity","setActionColor","setActionSize","setActionPadding","setActionCornerRadius","setActionBackgroundTintColor","setActionBackground"));
        ignoreFinalMap.put("SpannableStringUtils.VerticalAlignSpan", Utils.asList("getSize","draw"));
        ignoreFinalMap.put("ToastFactory.BaseToast", Utils.asList("setView","setText"));
        ignoreFinalMap.put("ToastFactory.SafeToast.SafeHandler", Utils.asList("handleMessage","dispatchMessage"));
        ignoreFinalMap.put("ToastFactory.ToastHelper", Utils.asList("handleMessage"));
        ignoreFinalMap.put("ToastTintUtils", Utils.asList("newToastView","inflaterView"));
        ignoreFinalMap.put("ToastTintUtils.SafeHandler", Utils.asList("handleMessage","dispatchMessage"));
        ignoreFinalMap.put("ToastUtils", Utils.asList("newToastText","newToastView","handlerToastRes","handlerToastStr"));
        ignoreFinalMap.put("ToastUtils.SafeHandler", Utils.asList("handleMessage","dispatchMessage"));
        ignoreFinalMap.put("TypeUtils.ParameterizedTypeImpl", Utils.asList("equals"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreStaticMap() {
        Map<String, ArrayList<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("ActivityUtils", Utils.asList("getActivityStacks","addActivity","removeActivity","removeActivity","currentActivity","finishActivity","existActivitys","finishActivity","finishActivity","finishAllActivityToIgnore","finishAllActivityToIgnore","finishAllActivity","exitApplication","restartApplication"));
        ignoreStaticMap.put("ActivityUtils.ResultActivity", Utils.asList("onCreate","onActivityResult","onDestroy"));
        ignoreStaticMap.put("AliasMethod", Utils.asList("next"));
        ignoreStaticMap.put("AnalysisRecordUtils.FileInfo", Utils.asList("getStoragePath","getFileName","getFileFunction","getFileIntervalTime","getFolderName","isHandler","setHandler","getLogPath","getIntervalTimeFolder"));
        ignoreStaticMap.put("ApkInfoItem", Utils.asList("getAppInfoBean","getListKeyValues","getAppMD5","getAppSHA1","getAppSHA256","getMinSdkVersion","getTargetSdkVersion","getApkLength","getX509Certificate","getNotBefore","getNotAfter","isEffective","getCertPrincipal","getCertVersion","getCertSigalgname","getCertSigalgoid","getCertSerialnumber","getCertDercode"));
        ignoreStaticMap.put("AppInfoBean", Utils.asList("getAppPackName","getAppName","getAppIcon","getAppType","getVersionCode","getVersionName","getFirstInstallTime","getLastUpdateTime","getSourceDir","getApkSize"));
        ignoreStaticMap.put("AppInfoItem", Utils.asList("getAppInfoBean","getListKeyValues","getAppMD5","getAppSHA1","getAppSHA256","getMinSdkVersion","getTargetSdkVersion","getApkLength","getX509Certificate","getNotBefore","getNotAfter","isEffective","getCertPrincipal","getCertVersion","getCertSigalgname","getCertSigalgoid","getCertSerialnumber","getCertDercode"));
        ignoreStaticMap.put("AsyncExecutor", Utils.asList("shutdownNow","execute","postResult","postCancel","execute"));
        ignoreStaticMap.put("AutoFocusAssist", Utils.asList("isAutoFocus","setAutoFocus","onAutoFocus","autoFocusAgainLater","start","stop","cancelOutstandingTask"));
        ignoreStaticMap.put("AutoFocusAssist.AutoFocusTask", Utils.asList("doInBackground"));
        ignoreStaticMap.put("Averager", Utils.asList("add","clear","size","getAverage","print"));
        ignoreStaticMap.put("Base64.Decoder", Utils.asList("maxOutputSize","process"));
        ignoreStaticMap.put("Base64.Encoder", Utils.asList("maxOutputSize","process"));
        ignoreStaticMap.put("Base64Cipher", Utils.asList("decrypt","encrypt"));
        ignoreStaticMap.put("BeepVibrateAssist", Utils.asList("shouldBeep","streamUpdate","isPlayBeep","isVibrate","setVibrate","setVibrate","setMediaPlayer","playBeepSoundAndVibrate","close"));
        ignoreStaticMap.put("CameraAssist", Utils.asList("openDriver","closeDriver","startPreview","stopPreview","freeCameraResource","getCameraResolution","getPreviewSize","getCameraSizeAssist","getCamera","setCamera","setPreviewNotify","setAutoFocus","isPreviewing","setAutoInterval","setFlashlightOn","setFlashlightOff","isFlashlightOn"));
        ignoreStaticMap.put("CameraSizeAssist", Utils.asList("getCamera","setPreviewSize","setPreviewSize","getPreviewSize","getPreviewSize","getPreviewSize","getPreviewSize","setPictureSize","setPictureSize","getPictureSize","getPictureSize","getPictureSize","getPictureSize","getPictureSize","getPictureSize","getVideoSize","getVideoSize","getVideoSize","getVideoSize","getVideoSize","getVideoSize","calcPreviewSize","calcPictureSize","calcVideoSize"));
        ignoreStaticMap.put("ClickUtils.ClickAssist", Utils.asList("isFastDoubleClick","isFastDoubleClick","isFastDoubleClick","isFastDoubleClick","isFastDoubleClick","initConfig","putConfig","removeConfig","getConfigTime","removeRecord","clearRecord","setIntervalTime","reset"));
        ignoreStaticMap.put("CollectionUtils.ArrayWithTypeToken", Utils.asList("put","get","create","newInstance","newInstance"));
        ignoreStaticMap.put("ColorUtils.ColorInfo", Utils.asList("getKey","getValue","getValueParser","getValueColor","getAlpha","getRed","getGreen","getBlue","getGrayLevel","getHue","getSaturation","getBrightness","toString","priConvert"));
        ignoreStaticMap.put("ColorUtils.ColorInfo.ColorParser", Utils.asList("handleColor"));
        ignoreStaticMap.put("ContentResolverUtils.MediaQueryInfo", Utils.asList("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreStaticMap.put("ContentResolverUtils.MediaQueryInfoUri", Utils.asList("getSelection","getSelectionArgs"));
        ignoreStaticMap.put("ContentResolverUtils.MediaQueryUri", Utils.asList("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreStaticMap.put("CoordinateUtils.Direction", Utils.asList("getValue"));
        ignoreStaticMap.put("CrashUtils", Utils.asList("init","uncaughtException","handleException"));
        ignoreStaticMap.put("DefaultToastStyle", Utils.asList("getGravity","getXOffset","getYOffset","getHorizontalMargin","getVerticalMargin","getZ","getCornerRadius","getBackgroundTintColor","getBackground","getTextColor","getTextSize","getMaxLines","getEllipsize","getTypeface","getPadding"));
        ignoreStaticMap.put("DevCache", Utils.asList("put","put","getAsString","put","put","getAsJSONObject","put","put","getAsJSONArray","put","get","getAsBinary","getAsObject","put","put","getAsBitmap","put","put","getAsDrawable","file","remove","clear"));
        ignoreStaticMap.put("DevCache.xFileOutputStream", Utils.asList("close"));
        ignoreStaticMap.put("DevCacheManager", Utils.asList("calculateCacheSizeAndCacheCount","put","get","newFile","remove","clear","removeNext","calculateSize"));
        ignoreStaticMap.put("DevHelper", Utils.asList("viewHelper","devHelper","postRunnable","postRunnable","postRunnable","postRunnable","removeRunnable","startTimer","closeTimer","recycle","saveBitmapToSDCardJPEG","saveBitmapToSDCardJPEG","saveBitmapToSDCardJPEG","saveBitmapToSDCardJPEG","saveBitmapToSDCardPNG","saveBitmapToSDCardPNG","saveBitmapToSDCardPNG","saveBitmapToSDCardPNG","saveBitmapToSDCardWEBP","saveBitmapToSDCardWEBP","saveBitmapToSDCardWEBP","saveBitmapToSDCardWEBP","saveBitmapToSDCard","saveBitmapToSDCard","addTextChangedListener","removeTextChangedListener","setKeyListener","setKeyListener","setKeyListener","record","cleanAppCache","cleanAppFiles","cleanAppDbs","cleanAppDbByName","cleanAppSp","cleanAppSp","cleanCache","cleanCustomDir","cleanCustomDir","cleanApplicationData","copyText","copyUri","copyIntent","notifyMediaStore","notifyMediaStore","showDialog","closeDialog","closeDialogs","closeDialog","closeDialogs","closePopupWindow","closePopupWindows","autoCloseDialog","autoCloseDialog","autoClosePopupWindow","openKeyboard","openKeyboard","openKeyboard","openKeyboard","openKeyboard","openKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyBoardSpecial","closeKeyBoardSpecial","closeKeyBoardSpecial","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","judgeView","registerSoftInputChangedListener","registerSoftInputChangedListener2","applyLanguage","applyLanguage","setOnClicks","setOnLongClicks","setOnTouchs","addTouchArea","addTouchArea","cancelAllNotification","cancelNotification","cancelNotification","notifyNotification","notifyNotification","saveAssetsFormFile","saveRawFormFile","setWindowSecure","setFullScreen","setFullScreenNoTitle","setLandscape","setPortrait","toggleScreenOrientation","forceGetViewSize","vibrate","vibrate","cancel","closeIO","closeIOQuietly","getNetTime","getNetTime","waitForEndAsyn","waitForEnd","setAnimationListener"));
        ignoreStaticMap.put("DevMediaManager", Utils.asList("createMedia","destroyMedia","bindListener","setAudioStreamType","playPrepareRaw","playPrepareRaw","playPrepareAssets","playPrepareAssets","playPrepare","playPrepare","playPrepare","isPlaying","pause","stop","onError","onVideoSizeChanged","onPrepared","onCompletion","onBufferingUpdate","onSeekComplete","setMeidaListener","isNullMediaPlayer","isNotNullMediaPlayer","getMediaPlayer","setMediaPlayer","setTAG","getVolume","setVolume","clearMediaPlayerData","getPlayRawId","getPlayUri","getVideoWidth","getVideoHeight","getCurrentPosition","getDuration","getPlayPercent"));
        ignoreStaticMap.put("DevThreadPool", Utils.asList("getThreads","getCalcThreads","execute","execute","execute","shutdown","shutdownNow","isShutdown","isTerminated","awaitTermination","submit","submit","submit","invokeAll","invokeAll","invokeAny","invokeAny","schedule","schedule","scheduleWithFixedRate","scheduleWithFixedDelay"));
        ignoreStaticMap.put("DevVideoPlayerControl", Utils.asList("resetOperate","surfaceChanged","surfaceCreated","surfaceDestroyed","onPrepared","onCompletion","onBufferingUpdate","onSeekComplete","onError","onVideoSizeChanged","setMediaListener","pausePlayer","stopPlayer","startPlayer","startPlayer","startPlayer","getSurfaceview","isPlaying","isPlaying","isAutoPlay","setAutoPlay","getPlayUri","getVideoWidth","getVideoHeight","getCurrentPosition","getDuration","getPlayPercent"));
        ignoreStaticMap.put("FileBreadthFirstSearchUtils", Utils.asList("setSearchHandler","getQueueSameTimeNumber","setQueueSameTimeNumber","isRunning","stop","isStop","getStartTime","getEndTime","getDelayTime","setDelayTime","query","queryFile","whileQueue"));
        ignoreStaticMap.put("FileBreadthFirstSearchUtils.FileItem", Utils.asList("put"));
        ignoreStaticMap.put("FileDepthFirstSearchUtils", Utils.asList("setSearchHandler","isRunning","stop","isStop","getStartTime","getEndTime","query","queryFile"));
        ignoreStaticMap.put("FileUtils.FileList", Utils.asList("getFile","getSubFiles"));
        ignoreStaticMap.put("FlashlightUtils", Utils.asList("register","unregister","setFlashlightOn","setFlashlightOn","setFlashlightOff","setFlashlightOff","isFlashlightOn","isFlashlightOn"));
        ignoreStaticMap.put("IToastImpl", Utils.asList("reset","setIsHandler","setNullText","setTextLength","init","style","defaultStyle","getToastStyle","initStyle","initToastFilter","setView","show","show","show","show","cancel","filter","handlerContent","getThreadToastStyle","createView","priShowToastText","newToastText","priShowToastView","newToastView"));
        ignoreStaticMap.put("ImageUtils.ImageType", Utils.asList("getValue"));
        ignoreStaticMap.put("InactivityTimerAssist", Utils.asList("onPause","onResume","onDestroy","start","cancel"));
        ignoreStaticMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asList("doInBackground"));
        ignoreStaticMap.put("InactivityTimerAssist.PowerStateReceiver", Utils.asList("onReceive"));
        ignoreStaticMap.put("KeyValueBean", Utils.asList("getKey","getValue","toString"));
        ignoreStaticMap.put("KeyguardUtils", Utils.asList("isKeyguardLocked","isKeyguardSecure","inKeyguardRestrictedInputMode","getKeyguardManager","setKeyguardManager","disableKeyguard","reenableKeyguard","release","getKeyguardLock","setKeyguardLock"));
        ignoreStaticMap.put("LocationUtils.CustomLocationListener", Utils.asList("onLocationChanged","onStatusChanged","onProviderEnabled","onProviderDisabled"));
        ignoreStaticMap.put("LoggerPrinter", Utils.asList("other","getLogConfig","init","init","d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag","isPrintLog","checkLogLevel","finalLogPrinter","logHandle","logHandle","logHandle","logHeaderContent","logTopBorder","logBottomBorder","logDivider","logContent","createMessage","getSimpleClassName","getStackOffset","getThreadLogConfig"));
        ignoreStaticMap.put("NotificationUtils.VibratePattern", Utils.asList("isEmpty"));
        ignoreStaticMap.put("PathUtils.AppExternalPath", Utils.asList("getAppDataPath","getAppDataDir","getAppDataPath","getAppDataDir","getAppCachePath","getAppCacheDir","getAppCachePath","getAppCacheDir","getExternalFilesPath","getExternalFilesDir","getAppFilesPath","getAppFilesDir","getAppFilesPath","getAppFilesDir","getAppMusicPath","getAppMusicDir","getAppPodcastsPath","getAppPodcastsDir","getAppRingtonesPath","getAppRingtonesDir","getAppAlarmsPath","getAppAlarmsDir","getAppNotificationsPath","getAppNotificationsDir","getAppPicturesPath","getAppPicturesDir","getAppMoviesPath","getAppMoviesDir","getAppDownloadPath","getAppDownloadDir","getAppDCIMPath","getAppDCIMDir","getAppDocumentsPath","getAppDocumentsDir","getAppAudiobooksPath","getAppAudiobooksDir","getAppObbPath","getAppObbDir"));
        ignoreStaticMap.put("PathUtils.InternalPath", Utils.asList("getRootPath","getRootDirectory","getDataPath","getDataDirectory","getDownloadCachePath","getDownloadCacheDirectory","getAppDataPath","getAppDataDir","getAppDataPath","getAppDataDir","getAppCachePath","getAppCacheDir","getAppCachePath","getAppCacheDir","getAppCodeCachePath","getAppCodeCacheDir","getAppDbsPath","getAppDbsDir","getAppDbPath","getAppDbFile","getAppFilesPath","getAppFilesDir","getAppFilesPath","getAppFilesDir","getAppSpPath","getAppSpDir","getAppSpPath","getAppSpFile","getAppNoBackupFilesPath","getAppNoBackupFilesDir","getAppMusicPath","getAppMusicDir","getAppPodcastsPath","getAppPodcastsDir","getAppRingtonesPath","getAppRingtonesDir","getAppAlarmsPath","getAppAlarmsDir","getAppNotificationsPath","getAppNotificationsDir","getAppPicturesPath","getAppPicturesDir","getAppMoviesPath","getAppMoviesDir","getAppDownloadPath","getAppDownloadDir","getAppDCIMPath","getAppDCIMDir","getAppDocumentsPath","getAppDocumentsDir","getAppAudiobooksPath","getAppAudiobooksDir"));
        ignoreStaticMap.put("PathUtils.SDCardPath", Utils.asList("isSDCardEnable","getSDCardFile","getSDCardPath","getSDCardFile","getSDCardPath","getExternalStoragePublicPath","getExternalStoragePublicDir","getMusicPath","getMusicDir","getPodcastsPath","getPodcastsDir","getRingtonesPath","getRingtonesDir","getAlarmsPath","getAlarmsDir","getNotificationsPath","getNotificationsDir","getPicturesPath","getPicturesDir","getMoviesPath","getMoviesDir","getDownloadPath","getDownloadDir","getDCIMPath","getDCIMDir","getDocumentsPath","getDocumentsDir","getAudiobooksPath","getAudiobooksDir"));
        ignoreStaticMap.put("PermissionUtils", Utils.asList("callBack","setRequestPermissionsResult","request","request","onRequestPermissionsResultCommon","checkPermissions","requestCallback","getPermissionsStatus"));
        ignoreStaticMap.put("PermissionUtils.PermissionActivity", Utils.asList("onCreate","onRequestPermissionsResult"));
        ignoreStaticMap.put("PhoneUtils.TeleInfo", Utils.asList("printInfo"));
        ignoreStaticMap.put("PowerManagerUtils", Utils.asList("isScreenOn","turnScreenOn","turnScreenOff","getWakeLock","setWakeLock","getPowerManager","setPowerManager"));
        ignoreStaticMap.put("PreferenceImpl", Utils.asList("put","getValue","put","putAll","putAll","putAll","get","getAll","getAll","remove","removeAll","removeAll","contains","clear","getInt","getFloat","getLong","getBoolean","getString","getSet"));
        ignoreStaticMap.put("PreferenceImpl.ComparatorImpl", Utils.asList("compare"));
        ignoreStaticMap.put("ROMUtils.RomInfo", Utils.asList("getName","getVersion","toString"));
        ignoreStaticMap.put("ReflectUtils", Utils.asList("newInstance","newInstance","getArgsType","sortConstructors","newInstance","field","field","getField","getAccessibleField","unwrap","setEnumVal","method","method","method","exactMethod","similarMethod","sortMethods","isSimilarSignature","match","accessible","proxy","property","type","wrapper","get","hashCode","equals","toString"));
        ignoreStaticMap.put("ScreenSensorAssist", Utils.asList("init","start","stop","isPortrait","isAllowChange"));
        ignoreStaticMap.put("ScreenSensorAssist.OrientationSensorChangeListener", Utils.asList("onAccuracyChanged","onSensorChanged"));
        ignoreStaticMap.put("ScreenSensorAssist.OrientationSensorListener", Utils.asList("onAccuracyChanged","onSensorChanged"));
        ignoreStaticMap.put("ShapeUtils", Utils.asList("getDrawable","setDrawable"));
        ignoreStaticMap.put("ShapeUtils.Builder", Utils.asList("build","setRadius","setRadiusLeft","setRadiusLeft","setRadiusRight","setRadiusRight","setCornerRadii","setColor","setColor","setStroke","setStroke","setStroke","setSize","setPadding","getOrientation"));
        ignoreStaticMap.put("ShellUtils.CommandResult", Utils.asList("isSuccess","isSuccess2","isSuccess3","isSuccess4"));
        ignoreStaticMap.put("SnackbarUtils", Utils.asList("getStyle","setStyle","getSnackbar","getSnackbarView","getTextView","getActionButton","addView","addView","setCallback","setAction","setAction","setAction","setAction","dismiss","dismiss","showShort","showLong","showIndefinite","showShort","showLong","showIndefinite","priShow","setSnackbarStyle","setSnackbarStyle","getShadowMargin","setShadowMargin","isAutoCalc","setAutoCalc","clearLocations","above","bellow","setSnackbarLocation"));
        ignoreStaticMap.put("SnackbarUtils.StyleBuilder", Utils.asList("getRootGravity","setRootGravity","getRootCornerRadius","setRootCornerRadius","getRootBackgroundTintColor","setRootBackgroundTintColor","getRootBackground","setRootBackground","getRootMargin","setRootMargin","getRootAlpha","setRootAlpha","getTextGravity","setTextGravity","getTextColor","setTextColor","getTextSize","setTextSize","getTextMaxLines","setTextMaxLines","getTextEllipsize","setTextEllipsize","getTextTypeface","setTextTypeface","getTextPadding","setTextPadding","getActionGravity","setActionGravity","getActionColor","setActionColor","getActionSize","setActionSize","getActionPadding","setActionPadding","getActionCornerRadius","setActionCornerRadius","getActionBackgroundTintColor","setActionBackgroundTintColor","getActionBackground","setActionBackground"));
        ignoreStaticMap.put("SpannableStringUtils", Utils.asList("setFlag","setForegroundColor","setBackgroundColor","setLineHeight","setLineHeight","setQuoteColor","setQuoteColor","setLeadingMargin","setBullet","setBullet","setFontSize","setFontSize","setFontProportion","setFontXProportion","setStrikethrough","setUnderline","setSuperscript","setSubscript","setBold","setItalic","setBoldItalic","setFontFamily","setTypeface","setHorizontalAlign","setVerticalAlign","setClickSpan","setUrl","setBlur","setShader","setShadow","setSpans","append","appendLine","appendLine","appendImage","appendImage","appendImage","appendImage","appendImage","appendImage","appendSpace","appendSpace","get","create","apply","applyLast","updateCharCharSequence","updateImage","updateSpace","setDefault"));
        ignoreStaticMap.put("SpannableStringUtils.CustomBulletSpan", Utils.asList("getLeadingMargin","drawLeadingMargin"));
        ignoreStaticMap.put("SpannableStringUtils.CustomImageSpan", Utils.asList("getDrawable"));
        ignoreStaticMap.put("SpannableStringUtils.CustomLineHeightSpan", Utils.asList("chooseHeight"));
        ignoreStaticMap.put("SpannableStringUtils.CustomQuoteSpan", Utils.asList("getLeadingMargin","drawLeadingMargin"));
        ignoreStaticMap.put("SpannableStringUtils.CustomTypefaceSpan", Utils.asList("updateDrawState","updateMeasureState","apply"));
        ignoreStaticMap.put("SpannableStringUtils.ShaderSpan", Utils.asList("updateDrawState"));
        ignoreStaticMap.put("SpannableStringUtils.ShadowSpan", Utils.asList("updateDrawState"));
        ignoreStaticMap.put("SpannableStringUtils.SpaceSpan", Utils.asList("getSize","draw"));
        ignoreStaticMap.put("SpannableStringUtils.VerticalAlignSpan", Utils.asList("getSize","draw"));
        ignoreStaticMap.put("TimeAverager", Utils.asList("start","end","endAndRestart","average","print","clear"));
        ignoreStaticMap.put("TimeCounter", Utils.asList("start","durationRestart","duration","getStartTime"));
        ignoreStaticMap.put("TimeKeeper", Utils.asList("waitForEndAsyn","waitForEnd"));
        ignoreStaticMap.put("TimerManager.TimerTask", Utils.asList("start","close","startTimer","closeTimer","isRunTimer","getTriggerNumber","getTriggerLimit","isTriggerEnd","isInfinite","setHandler","setNotifyWhat","setNotifyObject","setTime","setTriggerLimit"));
        ignoreStaticMap.put("ToastFactory.BaseToast", Utils.asList("setView","setText","findTextView","isEmptyMessageView","getMessageView"));
        ignoreStaticMap.put("ToastFactory.NotificationToast", Utils.asList("show","cancel"));
        ignoreStaticMap.put("ToastFactory.SafeToast.SafeHandler", Utils.asList("handleMessage","dispatchMessage"));
        ignoreStaticMap.put("ToastFactory.ToastHelper", Utils.asList("handleMessage","show","cancel"));
        ignoreStaticMap.put("ToastTintUtils.DefaultStyle", Utils.asList("getTextColor","getTextSize","getBackgroundTintColor","getBackground","getMaxLines","getEllipsize","getTypeface","getTintIconColor","isTintIcon"));
        ignoreStaticMap.put("ToastTintUtils.ErrorStyle", Utils.asList("getBackgroundTintColor","isTintIcon"));
        ignoreStaticMap.put("ToastTintUtils.InfoStyle", Utils.asList("getBackgroundTintColor","isTintIcon"));
        ignoreStaticMap.put("ToastTintUtils.NormalStyle", Utils.asList("getBackgroundTintColor","isTintIcon"));
        ignoreStaticMap.put("ToastTintUtils.SafeHandler", Utils.asList("handleMessage","dispatchMessage"));
        ignoreStaticMap.put("ToastTintUtils.SuccessStyle", Utils.asList("getBackgroundTintColor","isTintIcon"));
        ignoreStaticMap.put("ToastTintUtils.WarningStyle", Utils.asList("getBackgroundTintColor","isTintIcon"));
        ignoreStaticMap.put("ToastUtils.SafeHandler", Utils.asList("handleMessage","dispatchMessage"));
        ignoreStaticMap.put("TypeUtils.ParameterizedTypeImpl", Utils.asList("getActualTypeArguments","getOwnerType","getRawType","equals","hashCode"));
        ignoreStaticMap.put("ViewHelper", Utils.asList("viewHelper","devHelper","postRunnable","postRunnable","postRunnable","postRunnable","removeRunnable","setHint","setText","setTexts","setHtmlText","setHtmlTexts","setHintTextColor","setHintTextColor","setHintTextColors","setHintTextColors","setTextColor","setTextColor","setTextColors","setTextColors","setTypeface","setTextSizeByPx","setTextSizeBySp","setTextSizeByDp","setTextSizeByIn","setTextSize","setTextSizes","clearFlags","setBold","setBold","setBold","setUnderlineText","setUnderlineText","setStrikeThruText","setStrikeThruText","setLetterSpacing","setLineSpacing","setLineSpacingAndMultiplier","setTextScaleX","setIncludeFontPadding","setInputType","setImeOptions","setLines","setMaxLines","setMinLines","setMaxEms","setMinEms","setEms","setEllipsize","setAutoLinkMask","setAllCaps","setTextGravity","setText","insert","insert","setMaxLength","setMaxLengthAndText","setCursorVisible","setSelectionToTop","setSelectionToBottom","setSelection","setTransformationMethod","setTransformationMethod","setTransformationMethod","addTextChangedListener","removeTextChangedListener","setKeyListener","setKeyListener","setKeyListener","setAdjustViewBounds","setMaxHeight","setMaxWidth","setBackground","setBackgroundColor","setBackgroundResource","setBackgroundTintList","setBackgroundTintMode","setForeground","setForegroundGravity","setForegroundTintList","setForegroundTintMode","setImageBitmap","setImageDrawable","setImageResource","setImageMatrix","setImageTintList","setImageTintMode","setScaleType","setColorFilter","setColorFilter","setColorFilter","setColorFilter","setBackgroundResources","setBackgroundResources","setImageResources","setImageResources","setImageBitmaps","setImageBitmaps","setImageDrawables","setImageDrawables","setScaleTypes","setScaleTypes","setWidthHeight","setWidthHeight","setWidth","setWidth","setHeight","setHeight","setMinimumHeight","setMinimumWidth","setAlpha","setTag","scrollTo","scrollBy","setDescendantFocusability","setOverScrollMode","setHorizontalScrollBarEnabled","setVerticalScrollBarEnabled","setScrollContainer","setNextFocusForwardId","setNextFocusDownId","setNextFocusLeftId","setNextFocusRightId","setNextFocusUpId","setRotation","setRotationX","setRotationY","setScaleX","setScaleY","setTextAlignment","setTextDirection","setPivotX","setPivotY","setTranslationX","setTranslationY","setLayerType","requestLayout","requestFocus","clearFocus","requestLayoutParent","setClipChildren","setLayoutParams","setFocusableInTouchMode","setFocusable","toggleFocusable","setSelected","toggleSelected","setEnabled","toggleEnabled","setClickable","toggleClickable","setLongClickable","toggleLongClickable","setVisibility","setVisibility","setVisibilitys","setVisibilitys","toggleVisibilitys","toggleVisibilitys","toggleVisibilitys","reverseVisibilitys","reverseVisibilitys","reverseVisibilitys","reverseVisibilitys","removeSelfFromParent","setLayoutGravity","setMarginLeft","setMarginLeft","setMarginTop","setMarginTop","setMarginRight","setMarginRight","setMarginBottom","setMarginBottom","setMargin","setMargin","setMargin","setMargin","setMargin","setMargin","setPaddingLeft","setPaddingLeft","setPaddingTop","setPaddingTop","setPaddingRight","setPaddingRight","setPaddingBottom","setPaddingBottom","setPadding","setPadding","setPadding","setPadding","setPadding","setPadding","setCompoundDrawablePadding","setCompoundDrawablesByLeft","setCompoundDrawablesByTop","setCompoundDrawablesByRight","setCompoundDrawablesByBottom","setCompoundDrawables","setCompoundDrawablesWithIntrinsicBoundsByLeft","setCompoundDrawablesWithIntrinsicBoundsByTop","setCompoundDrawablesWithIntrinsicBoundsByRight","setCompoundDrawablesWithIntrinsicBoundsByBottom","setCompoundDrawablesWithIntrinsicBounds","addRule","addRule","removeRule","addRules","addRules","removeRules","setAnimation","clearAnimation","startAnimation","setOnClicks","setOnLongClicks","setOnTouchs","addTouchArea","addTouchArea","smoothScrollToPosition","scrollToPosition","smoothScrollToTop","scrollToTop","smoothScrollToBottom","scrollToBottom","smoothScrollTo","smoothScrollBy","fullScroll"));
        ignoreStaticMap.put("WifiHotUtils", Utils.asList("stratWifiAp","closeWifiAp","getWifiApState","getWifiApConfiguration","setWifiApConfiguration","isOpenWifiAp","closeWifiApCheck","isConnectHot","getHotspotServiceIp","getHotspotAllotIp","getConnectHotspotMsg","getHotspotSplitIpMask","intToString","getApWifiSSID","getApWifiPwd","setOnWifiAPListener"));
        ignoreStaticMap.put("WifiUtils", Utils.asList("isOpenWifi","openWifi","closeWifi","toggleWifiEnabled","getWifiState","startScan","getConfiguration","getWifiList","getWifiInfo","isExists","isExists","quickConnWifi","quickConnWifi","removeWifiConfig","disconnectWifi","setStaticWifiConfig","setStaticWifiConfig","inetAddressToInt","setDNS","setGateway","setIpAddress","setStaticIpConfig","getField","getDeclaredField","setEnumField","setValueField"));
        ignoreStaticMap.put("WifiVo", Utils.asList("describeContents","writeToParcel"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreParamMap() {
        Map<String, ArrayList<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("ActivityUtils.ResultActivity", Utils.asList("onCreate","onActivityResult"));
        ignoreParamMap.put("AutoFocusAssist.AutoFocusTask", Utils.asList("doInBackground"));
        ignoreParamMap.put("Base64.Coder", Utils.asList("process","maxOutputSize"));
        ignoreParamMap.put("Base64.Decoder", Utils.asList("maxOutputSize","process"));
        ignoreParamMap.put("Base64.Encoder", Utils.asList("maxOutputSize","process"));
        ignoreParamMap.put("ClassUtils", Utils.asList("getClass","getClass"));
        ignoreParamMap.put("ColorUtils.ColorInfo.ColorParser", Utils.asList("handleColor"));
        ignoreParamMap.put("ContentResolverUtils.MediaQueryInfo", Utils.asList("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreParamMap.put("ContentResolverUtils.MediaQueryInfoUri", Utils.asList("getSelection","getSelectionArgs"));
        ignoreParamMap.put("ContentResolverUtils.MediaQueryUri", Utils.asList("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreParamMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asList("doInBackground"));
        ignoreParamMap.put("InactivityTimerAssist.PowerStateReceiver", Utils.asList("onReceive"));
        ignoreParamMap.put("JCLogUtils", Utils.asList("d","e","e","e","i","xml","dTag","eTag","eTag","eTag","iTag","xmlTag"));
        ignoreParamMap.put("LogPrintUtils", Utils.asList("d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreParamMap.put("PreferenceImpl.ComparatorImpl", Utils.asList("compare"));
        ignoreParamMap.put("ScreenSensorAssist.OrientationSensorChangeListener", Utils.asList("onAccuracyChanged","onSensorChanged"));
        ignoreParamMap.put("ScreenSensorAssist.OrientationSensorListener", Utils.asList("onAccuracyChanged","onSensorChanged"));
        ignoreParamMap.put("SpannableStringUtils.CustomBulletSpan", Utils.asList("getLeadingMargin","drawLeadingMargin"));
        ignoreParamMap.put("SpannableStringUtils.CustomDynamicDrawableSpan", Utils.asList("getSize","draw"));
        ignoreParamMap.put("SpannableStringUtils.CustomLineHeightSpan", Utils.asList("chooseHeight"));
        ignoreParamMap.put("SpannableStringUtils.CustomQuoteSpan", Utils.asList("getLeadingMargin","drawLeadingMargin"));
        ignoreParamMap.put("SpannableStringUtils.CustomTypefaceSpan", Utils.asList("updateDrawState","updateMeasureState","apply"));
        ignoreParamMap.put("SpannableStringUtils.ShaderSpan", Utils.asList("updateDrawState"));
        ignoreParamMap.put("SpannableStringUtils.ShadowSpan", Utils.asList("updateDrawState"));
        ignoreParamMap.put("SpannableStringUtils.SpaceSpan", Utils.asList("getSize","draw"));
        ignoreParamMap.put("SpannableStringUtils.VerticalAlignSpan", Utils.asList("getSize","draw"));
        ignoreParamMap.put("ToastFactory.BaseToast", Utils.asList("setView","setText"));
        ignoreParamMap.put("ToastFactory.SafeToast.SafeHandler", Utils.asList("handleMessage","dispatchMessage"));
        ignoreParamMap.put("ToastFactory.ToastHelper", Utils.asList("handleMessage"));
        ignoreParamMap.put("ToastTintUtils.SafeHandler", Utils.asList("handleMessage","dispatchMessage"));
        ignoreParamMap.put("ToastUtils.SafeHandler", Utils.asList("handleMessage","dispatchMessage"));
        ignoreParamMap.put("TypeUtils.ParameterizedTypeImpl", Utils.asList("equals"));
        ignoreParamMap.put("WifiVo", Utils.asList("writeToParcel"));

        return ignoreParamMap;
    }

    /**
     * 获取忽略指定方法 @return 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreReturnMap() {
        Map<String, ArrayList<String>> ignoreReturnMap = new HashMap<>();
        ignoreReturnMap.put("BarUtils", Utils.asList("setStatusBarColor","setStatusBarColor","setStatusBarColor","setStatusBarColor"));
        ignoreReturnMap.put("Base64", Utils.asList("decode","decode","decode","encodeToString","encodeToString","encode","encode"));

        return ignoreReturnMap;
    }

    /**
     * 获取忽略指定方法非 public 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreUnPublicMap() {
        Map<String, ArrayList<String>> ignoreUnPublicMap = new HashMap<>();
        ignoreUnPublicMap.put("ActivityUtils.ResultActivity", Utils.asList("start","onCreate","onActivityResult","onDestroy"));
        ignoreUnPublicMap.put("ActivityUtils.ResultCallback", Utils.asList("onStartActivityForResult","onActivityResult"));
        ignoreUnPublicMap.put("AnalysisRecordUtils", Utils.asList("saveLogRecord","splitLog","handlerDeviceInfo"));
        ignoreUnPublicMap.put("AnalysisRecordUtils.CallBack", Utils.asList("callback"));
        ignoreUnPublicMap.put("ApkInfoItem", Utils.asList("obtain"));
        ignoreUnPublicMap.put("AppInfoBean", Utils.asList("obtain"));
        ignoreUnPublicMap.put("AppInfoItem", Utils.asList("obtain"));
        ignoreUnPublicMap.put("AsyncExecutor", Utils.asList("postResult","postCancel"));
        ignoreUnPublicMap.put("AsyncExecutor.Worker", Utils.asList("doInBackground","onPostExecute","onCanceled","abort"));
        ignoreUnPublicMap.put("AutoFocusAssist", Utils.asList("autoFocusAgainLater","cancelOutstandingTask"));
        ignoreUnPublicMap.put("AutoFocusAssist.AutoFocusTask", Utils.asList("doInBackground"));
        ignoreUnPublicMap.put("BarUtils", Utils.asList("addMarginTopEqualStatusBarHeight","subtractMarginTopEqualStatusBarHeight","applyStatusBarColor","applyStatusBarColor","hideStatusBarView","hideStatusBarView","showStatusBarView","createStatusBarView"));
        ignoreUnPublicMap.put("BeepVibrateAssist", Utils.asList("shouldBeep","streamUpdate"));
        ignoreUnPublicMap.put("CameraAssist", Utils.asList("freeCameraResource"));
        ignoreUnPublicMap.put("CameraAssist.PreviewNotify", Utils.asList("stopPreviewNotify","startPreviewNotify"));
        ignoreUnPublicMap.put("CameraSizeAssist", Utils.asList("calcPreviewSize","calcPictureSize","calcVideoSize"));
        ignoreUnPublicMap.put("CapturePictureUtils", Utils.asList("snapshotByRecyclerView_GridLayoutManager","snapshotByRecyclerView_LinearLayoutManager","snapshotByRecyclerView_StaggeredGridLayoutManager","canvasBitmap"));
        ignoreUnPublicMap.put("CollectionUtils.ArrayWithTypeToken", Utils.asList("newInstance","newInstance"));
        ignoreUnPublicMap.put("ColorUtils", Utils.asList("priParseColor"));
        ignoreUnPublicMap.put("ColorUtils.ColorInfo", Utils.asList("priConvert","RGBtoHSB"));
        ignoreUnPublicMap.put("ColorUtils.ColorInfo.Parser", Utils.asList("handleColor"));
        ignoreUnPublicMap.put("ConvertUtils", Utils.asList("toDigit","toHexChars","toHexString"));
        ignoreUnPublicMap.put("CoordinateUtils", Utils.asList("transformLat","transformLng","rad"));
        ignoreUnPublicMap.put("CrashUtils", Utils.asList("handleException"));
        ignoreUnPublicMap.put("CrashUtils.CrashCatchListener", Utils.asList("handleException","uncaughtException"));
        ignoreUnPublicMap.put("Decrypt", Utils.asList("decrypt"));
        ignoreUnPublicMap.put("DevCache", Utils.asList("myPid","getCachePath"));
        ignoreUnPublicMap.put("DevCacheManager", Utils.asList("calculateCacheSizeAndCacheCount","put","get","newFile","remove","clear","removeNext","calculateSize"));
        ignoreUnPublicMap.put("DevCacheUtils", Utils.asList("isDue","isDue","newStringWithDateInfo","newByteArrayWithDateInfo","createDateInfo","clearDateInfo","clearDateInfo","hasDateInfo","getDateInfoFromDate","indexOf","copyOfRange","bitmapToByte","byteToBitmap","drawableToBitmap","bitmapToDrawable"));
        ignoreUnPublicMap.put("DevMediaManager", Utils.asList("createMedia","destroyMedia","bindListener","clearMediaPlayerData"));
        ignoreUnPublicMap.put("DevMediaManager.MediaListener", Utils.asList("onPrepared","onCompletion","onBufferingUpdate","onSeekComplete","onError","onVideoSizeChanged"));
        ignoreUnPublicMap.put("DevVideoPlayerControl", Utils.asList("resetOperate"));
        ignoreUnPublicMap.put("DeviceUtils", Utils.asList("getMacAddressByWifiInfo","getMacAddressByNetworkInterface","getMacAddressByInetAddress","getInetAddress","getMacAddressByFile"));
        ignoreUnPublicMap.put("Encrypt", Utils.asList("encrypt"));
        ignoreUnPublicMap.put("EncryptUtils", Utils.asList("base64Encode","base64Decode"));
        ignoreUnPublicMap.put("FileBreadthFirstSearchUtils", Utils.asList("queryFile","whileQueue"));
        ignoreUnPublicMap.put("FileBreadthFirstSearchUtils.FileItem", Utils.asList("put"));
        ignoreUnPublicMap.put("FileBreadthFirstSearchUtils.SearchHandler", Utils.asList("isHandlerFile","isAddToList","OnEndListener"));
        ignoreUnPublicMap.put("FileDepthFirstSearchUtils", Utils.asList("queryFile"));
        ignoreUnPublicMap.put("FileDepthFirstSearchUtils.SearchHandler", Utils.asList("isHandlerFile","isAddToList","OnEndListener"));
        ignoreUnPublicMap.put("FileRecordUtils.CallBack", Utils.asList("callback"));
        ignoreUnPublicMap.put("FileUtils", Utils.asList("copyFolder"));
        ignoreUnPublicMap.put("FileUtils.OnReplaceListener", Utils.asList("onReplace"));
        ignoreUnPublicMap.put("HandlerUtils.OnEndListener", Utils.asList("onEnd"));
        ignoreUnPublicMap.put("HttpURLConnectionUtils", Utils.asList("reqNetTime"));
        ignoreUnPublicMap.put("HttpURLConnectionUtils.CallBack", Utils.asList("onResponse","onFail"));
        ignoreUnPublicMap.put("HttpURLConnectionUtils.TimeCallBack", Utils.asList("onResponse","onFail"));
        ignoreUnPublicMap.put("IDCardUtils", Utils.asList("converCharToInt","validateDateSmllerThenNow","isNumber"));
        ignoreUnPublicMap.put("IPreference", Utils.asList("put","putAll","putAll","putAll","get","getAll","getAll","remove","removeAll","removeAll","contains","clear","getInt","getFloat","getLong","getBoolean","getString","getSet"));
        ignoreUnPublicMap.put("IPrinter", Utils.asList("other","getLogConfig","init","init","d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreUnPublicMap.put("IToast.Filter", Utils.asList("filter","handlerContent"));
        ignoreUnPublicMap.put("IToast.Operate", Utils.asList("reset","setIsHandler","setNullText","setTextLength","init","style","defaultStyle","getToastStyle","initStyle","initToastFilter","setView","show","show","show","show","cancel"));
        ignoreUnPublicMap.put("IToast.Style", Utils.asList("getGravity","getXOffset","getYOffset","getHorizontalMargin","getVerticalMargin","getZ","getCornerRadius","getBackgroundTintColor","getBackground","getTextColor","getTextSize","getMaxLines","getEllipsize","getTypeface","getPadding"));
        ignoreUnPublicMap.put("IToastImpl", Utils.asList("getThreadToastStyle","createView","priShowToastText","newToastText","priShowToastView","newToastView"));
        ignoreUnPublicMap.put("ImageConvertUtils.BMP", Utils.asList("addBMPImageHeader","addBMPImageInfosHeader","addBMP_ARGB_8888"));
        ignoreUnPublicMap.put("ImageViewUtils", Utils.asList("getImageViewFieldValue"));
        ignoreUnPublicMap.put("InactivityTimerAssist", Utils.asList("start","cancel"));
        ignoreUnPublicMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asList("doInBackground"));
        ignoreUnPublicMap.put("JCLogUtils", Utils.asList("isEmpty","printLog","createMessage","splitErrorMessage"));
        ignoreUnPublicMap.put("JCLogUtils.Print", Utils.asList("printLog"));
        ignoreUnPublicMap.put("KeyBoardUtils", Utils.asList("getContentViewInvisibleHeight"));
        ignoreUnPublicMap.put("KeyBoardUtils.OnSoftInputChangedListener", Utils.asList("onSoftInputChanged"));
        ignoreUnPublicMap.put("LocationUtils", Utils.asList("getCriteria"));
        ignoreUnPublicMap.put("LocationUtils.OnLocationChangeListener", Utils.asList("getLastKnownLocation","onLocationChanged","onStatusChanged"));
        ignoreUnPublicMap.put("LogPrintUtils", Utils.asList("isEmpty","printLog","createMessage","splitErrorMessage"));
        ignoreUnPublicMap.put("LoggerPrinter", Utils.asList("isPrintLog","checkLogLevel","finalLogPrinter","logHandle","logHandle","logHandle","logHeaderContent","logTopBorder","logBottomBorder","logDivider","logContent","createMessage","getSimpleClassName","getStackOffset","getThreadLogConfig"));
        ignoreUnPublicMap.put("NumberUtils", Utils.asList("numberToCHNNumber","thousandConvertCHN"));
        ignoreUnPublicMap.put("PermissionUtils", Utils.asList("onRequestPermissionsResultCommon","isGranted","checkPermissions","requestCallback","getPermissionsStatus"));
        ignoreUnPublicMap.put("PermissionUtils.PermissionActivity", Utils.asList("start","onCreate"));
        ignoreUnPublicMap.put("PermissionUtils.PermissionCallBack", Utils.asList("onGranted","onDenied"));
        ignoreUnPublicMap.put("PreferenceImpl", Utils.asList("put","getValue"));
        ignoreUnPublicMap.put("ROMUtils", Utils.asList("isRightRom","getManufacturer","getBrand","getRomVersion","getSystemProperty","getSystemPropertyByShell","getSystemPropertyByStream","getSystemPropertyByReflect","_getRomInfo"));
        ignoreUnPublicMap.put("ReflectUtils", Utils.asList("forName","forName","getArgsType","sortConstructors","newInstance","getField","getAccessibleField","unwrap","method","exactMethod","similarMethod","sortMethods","isSimilarSignature","match","accessible","property","wrapper"));
        ignoreUnPublicMap.put("ScreenSensorAssist", Utils.asList("init"));
        ignoreUnPublicMap.put("ShellUtils", Utils.asList("consumeInputStream"));
        ignoreUnPublicMap.put("ShortCutUtils", Utils.asList("getAuthority","getAuthorityFromPermission","getAuthorityFromPermission"));
        ignoreUnPublicMap.put("SignaturesUtils", Utils.asList("loadCertificates"));
        ignoreUnPublicMap.put("SizeUtils.onGetSizeListener", Utils.asList("onGetSize"));
        ignoreUnPublicMap.put("SnackbarUtils", Utils.asList("priShow","clearLocations","setSnackbarLocation"));
        ignoreUnPublicMap.put("SpannableStringUtils", Utils.asList("apply","applyLast","updateCharCharSequence","updateImage","updateSpace","setDefault","getContext"));
        ignoreUnPublicMap.put("SpannableStringUtils.CustomDynamicDrawableSpan", Utils.asList("getCachedDrawable"));
        ignoreUnPublicMap.put("SpannableStringUtils.CustomTypefaceSpan", Utils.asList("apply"));
        ignoreUnPublicMap.put("TimeKeeper.OnEndCallback", Utils.asList("onEnd"));
        ignoreUnPublicMap.put("TimerManager.TimerTask", Utils.asList("start","close"));
        ignoreUnPublicMap.put("ToastFactory", Utils.asList("getWindowManager"));
        ignoreUnPublicMap.put("ToastFactory.BaseToast", Utils.asList("findTextView"));
        ignoreUnPublicMap.put("ToastFactory.ToastHelper", Utils.asList("show","cancel"));
        ignoreUnPublicMap.put("ToastTintUtils", Utils.asList("showToastView","newToastView","inflaterView","reflectToastHandler"));
        ignoreUnPublicMap.put("ToastTintUtils.Filter", Utils.asList("filter","handlerContent"));
        ignoreUnPublicMap.put("ToastTintUtils.Style", Utils.asList("getTextColor","getTextSize","getBackgroundTintColor","getBackground","getMaxLines","getEllipsize","getTypeface","getTintIconColor","isTintIcon"));
        ignoreUnPublicMap.put("ToastUtils", Utils.asList("priShowToastText","handlerToastRes","handlerToastStr","reflectToastHandler"));
        ignoreUnPublicMap.put("ToastUtils.Filter", Utils.asList("filter","handlerContent"));
        ignoreUnPublicMap.put("UriUtils", Utils.asList("getFilePathByUri"));
        ignoreUnPublicMap.put("WifiHotUtils", Utils.asList("intToString"));
        ignoreUnPublicMap.put("WifiHotUtils.OnWifiAPListener", Utils.asList("onStarted","onStopped","onFailed"));
        ignoreUnPublicMap.put("WifiUtils", Utils.asList("setStaticWifiConfig","setStaticWifiConfig","inetAddressToInt","setDNS","setGateway","setIpAddress","setStaticIpConfig","getField","getDeclaredField","setEnumField","setValueField"));
        ignoreUnPublicMap.put("ZipUtils", Utils.asList("zipFile","unzipChildFile"));

        return ignoreUnPublicMap;
    }

    /**
     * 获取忽略无修饰符变量处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreModifierVariableMap() {
        Map<String, ArrayList<String>> ignoreModifierVariableMap = new HashMap<>();
        ignoreModifierVariableMap.put("Base64", Utils.asList("        int tailLen;"));
        ignoreModifierVariableMap.put("Base64.Encoder", Utils.asList("    int tailLen;"));

        return ignoreModifierVariableMap;
    }

    /**
     * 获取忽略指定方法 return void 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreReturnVoidMap() {
        Map<String, ArrayList<String>> ignoreReturnVoidMap = new HashMap<>();
        ignoreReturnVoidMap.put("ADBUtils", Utils.asList("sendEventSlide - void"));
        ignoreReturnVoidMap.put("AccessibilityUtils", Utils.asList("setService - void","printAccessibilityEvent - void","printAccessibilityEvent - void"));
        ignoreReturnVoidMap.put("ActivityUtils.ResultCallback", Utils.asList("onActivityResult - void"));
        ignoreReturnVoidMap.put("AnalysisRecordUtils", Utils.asList("init - void","setCallBack - void","setHandler - void","setAppendSpace - void","setLogFolderName - void","setLogStoragePath - void"));
        ignoreReturnVoidMap.put("AnalysisRecordUtils.CallBack", Utils.asList("callback - void"));
        ignoreReturnVoidMap.put("AppInfoUtils", Utils.asList("printAppPermission - void"));
        ignoreReturnVoidMap.put("AsyncExecutor", Utils.asList("shutdownNow - void","postCancel - void"));
        ignoreReturnVoidMap.put("AsyncExecutor.Worker", Utils.asList("onPostExecute - void","onCanceled - void","abort - void"));
        ignoreReturnVoidMap.put("AutoFocusAssist", Utils.asList("setFocusModes - void","setAutoFocus - void","onAutoFocus - void","autoFocusAgainLater - void","start - void","stop - void","cancelOutstandingTask - void"));
        ignoreReturnVoidMap.put("BarUtils", Utils.asList("addMarginTopEqualStatusBarHeight - void","subtractMarginTopEqualStatusBarHeight - void","hideStatusBarView - void","hideStatusBarView - void","showStatusBarView - void"));
        ignoreReturnVoidMap.put("BeepVibrateAssist", Utils.asList("streamUpdate - void","close - void"));
        ignoreReturnVoidMap.put("BigDecimalUtils", Utils.asList("setScale - void","setRoundingMode - void"));
        ignoreReturnVoidMap.put("CameraAssist", Utils.asList("closeDriver - void","startPreview - void","stopPreview - void","freeCameraResource - void"));
        ignoreReturnVoidMap.put("CameraAssist.PreviewNotify", Utils.asList("stopPreviewNotify - void","startPreviewNotify - void"));
        ignoreReturnVoidMap.put("CameraUtils", Utils.asList("freeCameraResource - void"));
        ignoreReturnVoidMap.put("CapturePictureUtils", Utils.asList("setBitmapConfig - void","setBackgroundColor - void","setPaint - void","enableSlowWholeDocumentDraw - void"));
        ignoreReturnVoidMap.put("ClickUtils", Utils.asList("setGlobalIntervalTime - void","remove - void"));
        ignoreReturnVoidMap.put("CloseUtils", Utils.asList("closeIO - void","closeIOQuietly - void"));
        ignoreReturnVoidMap.put("CollectionUtils.ArrayWithTypeToken", Utils.asList("put - void","newInstance - void","newInstance - void"));
        ignoreReturnVoidMap.put("ColorUtils", Utils.asList("setParser - void","sortGray - void","sortHSB - void"));
        ignoreReturnVoidMap.put("ColorUtils.ColorInfo", Utils.asList("priConvert - void"));
        ignoreReturnVoidMap.put("ConvertUtils", Utils.asList("bytesBitwiseAND - void"));
        ignoreReturnVoidMap.put("CrashUtils", Utils.asList("init - void","uncaughtException - void"));
        ignoreReturnVoidMap.put("CrashUtils.CrashCatchListener", Utils.asList("handleException - void","uncaughtException - void"));
        ignoreReturnVoidMap.put("DevCache", Utils.asList("clear - void"));
        ignoreReturnVoidMap.put("DevCacheManager", Utils.asList("calculateCacheSizeAndCacheCount - void","put - void","clear - void"));
        ignoreReturnVoidMap.put("DevCommonUtils", Utils.asList("sleepOperate - void","sleepOperate - void"));
        ignoreReturnVoidMap.put("DevLogger", Utils.asList("init - void","d - void","e - void","e - void","e - void","w - void","i - void","v - void","wtf - void","json - void","xml - void","dTag - void","eTag - void","eTag - void","eTag - void","wTag - void","iTag - void","vTag - void","wtfTag - void","jsonTag - void","xmlTag - void"));
        ignoreReturnVoidMap.put("DevMediaManager", Utils.asList("createMedia - void","destroyMedia - void","pause - void","stop - void","onVideoSizeChanged - void","onPrepared - void","onCompletion - void","onBufferingUpdate - void","onSeekComplete - void","clearMediaPlayerData - void"));
        ignoreReturnVoidMap.put("DevMediaManager.MediaListener", Utils.asList("onPrepared - void","onCompletion - void","onBufferingUpdate - void","onSeekComplete - void","onVideoSizeChanged - void"));
        ignoreReturnVoidMap.put("DevMediaManager.MediaSet", Utils.asList("setMediaConfig - void"));
        ignoreReturnVoidMap.put("DevThreadManager", Utils.asList("initConfig - void","putConfig - void","removeConfig - void"));
        ignoreReturnVoidMap.put("DevThreadPool", Utils.asList("execute - void","execute - void","execute - void","shutdown - void"));
        ignoreReturnVoidMap.put("DevToast", Utils.asList("reset - void","setIsHandler - void","setNullText - void","setTextLength - void","init - void","initStyle - void","initToastFilter - void","setView - void","show - void","show - void","show - void","show - void","cancel - void"));
        ignoreReturnVoidMap.put("DevVideoPlayerControl", Utils.asList("resetOperate - void","surfaceChanged - void","surfaceCreated - void","surfaceDestroyed - void","onPrepared - void","onCompletion - void","onBufferingUpdate - void","onSeekComplete - void","onVideoSizeChanged - void","pausePlayer - void","stopPlayer - void","startPlayer - void","startPlayer - void","startPlayer - void"));
        ignoreReturnVoidMap.put("DialogUtils.DialogListener", Utils.asList("onLeftButton - void","onRightButton - void","onDismiss - void"));
        ignoreReturnVoidMap.put("DialogUtils.MultiChoiceListener", Utils.asList("onMultiChoiceItems - void","onPositiveButton - void","onCancel - void","onDismiss - void"));
        ignoreReturnVoidMap.put("DialogUtils.SingleChoiceListener", Utils.asList("onSingleChoiceItems - void","onPositiveButton - void","onCancel - void","onDismiss - void"));
        ignoreReturnVoidMap.put("DialogUtils.ViewDialogListener", Utils.asList("onPositiveButton - void","onCancel - void","onDismiss - void"));
        ignoreReturnVoidMap.put("EditTextUtils.DevTextWatcher", Utils.asList("beforeTextChanged - void","onTextChanged - void","afterTextChanged - void"));
        ignoreReturnVoidMap.put("FileBreadthFirstSearchUtils", Utils.asList("stop - void","query - void","queryFile - void","whileQueue - void"));
        ignoreReturnVoidMap.put("FileBreadthFirstSearchUtils.SearchHandler", Utils.asList("OnEndListener - void"));
        ignoreReturnVoidMap.put("FileDepthFirstSearchUtils", Utils.asList("stop - void","query - void","queryFile - void"));
        ignoreReturnVoidMap.put("FileDepthFirstSearchUtils.SearchHandler", Utils.asList("OnEndListener - void"));
        ignoreReturnVoidMap.put("FileIOUtils", Utils.asList("setBufferSize - void"));
        ignoreReturnVoidMap.put("FileRecordUtils", Utils.asList("setInsertInfo - void","setCallBack - void"));
        ignoreReturnVoidMap.put("FileRecordUtils.CallBack", Utils.asList("callback - void"));
        ignoreReturnVoidMap.put("HandlerUtils", Utils.asList("postRunnable - void","postRunnable - void","postRunnable - void","postRunnable - void","removeRunnable - void"));
        ignoreReturnVoidMap.put("HandlerUtils.OnEndListener", Utils.asList("onEnd - void"));
        ignoreReturnVoidMap.put("HttpURLConnectionUtils", Utils.asList("doGetAsyn - void","doPostAsyn - void","request - void","getNetTime - void","getNetTime - void","reqNetTime - void"));
        ignoreReturnVoidMap.put("HttpURLConnectionUtils.CallBack", Utils.asList("onResponse - void","onFail - void"));
        ignoreReturnVoidMap.put("HttpURLConnectionUtils.TimeCallBack", Utils.asList("onResponse - void","onFail - void"));
        ignoreReturnVoidMap.put("IPreference", Utils.asList("put - void","putAll - void","putAll - void","putAll - void","remove - void","removeAll - void","removeAll - void","clear - void"));
        ignoreReturnVoidMap.put("IPrinter", Utils.asList("init - void","d - void","e - void","e - void","e - void","w - void","i - void","v - void","wtf - void","json - void","xml - void","dTag - void","eTag - void","eTag - void","eTag - void","wTag - void","iTag - void","vTag - void","wtfTag - void","jsonTag - void","xmlTag - void"));
        ignoreReturnVoidMap.put("IToast.Operate", Utils.asList("reset - void","setIsHandler - void","setNullText - void","setTextLength - void","init - void","initStyle - void","initToastFilter - void","setView - void","show - void","show - void","show - void","show - void","cancel - void"));
        ignoreReturnVoidMap.put("IToastImpl", Utils.asList("reset - void","setIsHandler - void","setNullText - void","setTextLength - void","init - void","initStyle - void","initToastFilter - void","setView - void","show - void","show - void","show - void","show - void","cancel - void","priShowToastText - void","priShowToastView - void"));
        ignoreReturnVoidMap.put("InactivityTimerAssist", Utils.asList("onPause - void","onResume - void","onDestroy - void","start - void","cancel - void"));
        ignoreReturnVoidMap.put("JCLogUtils", Utils.asList("setPrintLog - void","setControlPrintLog - void","printLog - void","setPrint - void"));
        ignoreReturnVoidMap.put("JCLogUtils.Print", Utils.asList("printLog - void"));
        ignoreReturnVoidMap.put("KeyBoardUtils", Utils.asList("setDelayMillis - void","judgeView - void","fixSoftInputLeaks - void"));
        ignoreReturnVoidMap.put("KeyBoardUtils.OnSoftInputChangedListener", Utils.asList("onSoftInputChanged - void"));
        ignoreReturnVoidMap.put("LanguageUtils", Utils.asList("putSupportLanguage - void","removeSupportLanguage - void"));
        ignoreReturnVoidMap.put("LocationUtils.CustomLocationListener", Utils.asList("onLocationChanged - void","onStatusChanged - void","onProviderEnabled - void","onProviderDisabled - void"));
        ignoreReturnVoidMap.put("LocationUtils.OnLocationChangeListener", Utils.asList("getLastKnownLocation - void","onLocationChanged - void","onStatusChanged - void"));
        ignoreReturnVoidMap.put("LogPrintUtils", Utils.asList("setPrintLog - void","printLog - void"));
        ignoreReturnVoidMap.put("LoggerPrinter", Utils.asList("init - void","d - void","e - void","e - void","e - void","w - void","i - void","v - void","wtf - void","json - void","xml - void","dTag - void","eTag - void","eTag - void","eTag - void","wTag - void","iTag - void","vTag - void","wtfTag - void","jsonTag - void","xmlTag - void","finalLogPrinter - void","logHandle - void","logHandle - void","logHandle - void","logHeaderContent - void","logTopBorder - void","logBottomBorder - void","logDivider - void","logContent - void"));
        ignoreReturnVoidMap.put("PermissionUtils", Utils.asList("request - void","request - void","onRequestPermissionsResultCommon - void","onRequestPermissionsResult - void","notifyPermissionsChange - void","requestCallback - void","getPermissionsStatus - void"));
        ignoreReturnVoidMap.put("PermissionUtils.PermissionActivity", Utils.asList("start - void","onCreate - void","onRequestPermissionsResult - void"));
        ignoreReturnVoidMap.put("PermissionUtils.PermissionCallBack", Utils.asList("onGranted - void","onDenied - void"));
        ignoreReturnVoidMap.put("PreferenceImpl", Utils.asList("put - void","put - void","putAll - void","putAll - void","putAll - void","remove - void","removeAll - void","removeAll - void","clear - void"));
        ignoreReturnVoidMap.put("ProcessUtils", Utils.asList("kill - void","kill - void"));
        ignoreReturnVoidMap.put("ReflectUtils", Utils.asList("sortConstructors - void","sortMethods - void"));
        ignoreReturnVoidMap.put("ScreenSensorAssist", Utils.asList("init - void"));
        ignoreReturnVoidMap.put("SharedUtils", Utils.asList("init - void","put - void","putAll - void","putAll - void","putAll - void","remove - void","removeAll - void","removeAll - void","clear - void"));
        ignoreReturnVoidMap.put("SizeUtils.onGetSizeListener", Utils.asList("onGetSize - void"));
        ignoreReturnVoidMap.put("SnackbarUtils", Utils.asList("dismiss - void","dismiss - void","showShort - void","showLong - void","showIndefinite - void","showShort - void","showLong - void","showIndefinite - void","priShow - void","clearLocations - void","setSnackbarLocation - void"));
        ignoreReturnVoidMap.put("SpannableStringUtils", Utils.asList("apply - void","applyLast - void","updateCharCharSequence - void","updateImage - void","updateSpace - void","setDefault - void"));
        ignoreReturnVoidMap.put("TimeKeeper", Utils.asList("waitForEndAsyn - void","waitForEnd - void"));
        ignoreReturnVoidMap.put("TimeKeeper.OnEndCallback", Utils.asList("onEnd - void"));
        ignoreReturnVoidMap.put("TimerManager.TimerTask", Utils.asList("start - void","close - void"));
        ignoreReturnVoidMap.put("ToastFactory.ToastHelper", Utils.asList("show - void","cancel - void"));
        ignoreReturnVoidMap.put("ToastTintUtils", Utils.asList("reset - void","setToastFilter - void","setIsHandler - void","setNullText - void","setUseConfig - void","setGravity - void","setMargin - void","setNormalStyle - void","setInfoStyle - void","setWarningStyle - void","setErrorStyle - void","setSuccessStyle - void","normal - void","normal - void","normal - void","normal - void","normal - void","normal - void","normal - void","normal - void","info - void","info - void","info - void","info - void","info - void","info - void","info - void","info - void","warning - void","warning - void","warning - void","warning - void","warning - void","warning - void","warning - void","warning - void","error - void","error - void","error - void","error - void","error - void","error - void","error - void","error - void","success - void","success - void","success - void","success - void","success - void","success - void","success - void","success - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","showToastView - void","reflectToastHandler - void"));
        ignoreReturnVoidMap.put("ToastUtils", Utils.asList("reset - void","setToastFilter - void","setIsHandler - void","setNullText - void","setUseConfig - void","setGravity - void","setMargin - void","showShort - void","showShort - void","showShort - void","showShort - void","showLong - void","showLong - void","showLong - void","showLong - void","showToast - void","showToast - void","showToast - void","showToast - void","showShortNew - void","showShortNew - void","showShortNew - void","showShortNew - void","showLongNew - void","showLongNew - void","showLongNew - void","showLongNew - void","showToastNew - void","showToastNew - void","showToastNew - void","showToastNew - void","priShowToastText - void","showToastView - void","showToastView - void","showToastView - void","showToastView - void","showToastView - void","handlerToastRes - void","handlerToastStr - void","reflectToastHandler - void"));
        ignoreReturnVoidMap.put("WifiHotUtils.OnWifiAPListener", Utils.asList("onStarted - void","onStopped - void","onFailed - void"));
        ignoreReturnVoidMap.put("WifiUtils", Utils.asList("setDNS - void","setGateway - void","setIpAddress - void","setStaticIpConfig - void","setEnumField - void","setValueField - void"));

        return ignoreReturnVoidMap;
    }

    /**
     * 忽略注释间距异常文件
     * @param map {@link HashMap}
     */
    @Override
    public void ignoreAnnotationSpaceMap(Map<String, String> map) {
        map.remove("AliasMethod.java");
        map.remove("Base64.java");

    }
}