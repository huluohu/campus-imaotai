package com.oddfar.campus.huluwa.enums;


public enum PlatformEnum {
    HANG_LV_QIAN_GOU("001b2b3ebc9a30200a3a6a09dc8486d8", "472c92f5348b210f2ba413d6aeaf0114", "wx936aa5357931e226", "航旅黔购"),
    XIN_LIAN_HUI_GOU("1608466d96bddacb530a8fa9a9428d14", "2e95d1a0b3ac14d5cf01b106314443bb", "wxded2e7e6d60ac09d", "新联惠购"),
    KONG_GANG_LE_GOU("92bed99d5e7be7fb8c96ecda53b4dbab", "5af09450fca0e81e4fab74230ab8f849", "wx613ba8ea6a002aa8", "空港乐购"),
    GUI_LV_YOU_PIN("00670fb03584fbf44dd6b136e534f495", "0d65f24dbe2bc1ede3c3ceeb96ef71bb", "wx61549642d715f361", "贵旅优品"),
    ZUN_HANG_CHU_SHAN("39414a3d423249ffb2fec95915fd9ac6", "634143d4f5b08349fa83d92366e19fc1", "wx624149b74233c99a", "遵航出山"),
    GUI_YAN_QIAN_PIN("c1ea3cdb3b2043cff6c166fe62d2eee4", "ebb346c5c2b3cbcefd46b8e95fbb0f35", "wx5508e31ffe9366b8", "贵盐黔品"),
    LE_LV_SHANG_CHENG("84c66207be801649790a7130a57345fc", "24283e695ce8f0aa4b5ff91976ac15f9", "wx821fb4d8604ed4d6", "乐旅商城"),
    YI_LU_QIAN_XUN("5e159cc23daa1708e2cbf89073ffd866", "ec7a5c5d99a57a5e3c797d8518e5fabd", "wxee0ce83ab4b26f9c", "驿路黔寻");


    private String ak;

    private String sk;

    private String appId;

    private String desc;

    PlatformEnum(String ak, String sk, String appId, String desc) {
        this.ak = ak;
        this.sk = sk;
        this.appId = appId;
        this.desc = desc;
    }

    public String getAk() {
        return this.ak;
    }

    public String getSk() {
        return this.sk;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getDesc() {
        return this.desc;
    }
}
