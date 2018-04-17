//
// Created by 雷浩 on 2018/2/2.
//

#ifndef FFMPEGMUSICDEMO_LOG_H
#define FFMPEGMUSICDEMO_LOG_H

#include <android/log.h>

#define LOGI(FORMAT, ...) __android_log_print(ANDROID_LOG_INFO,"Mark",FORMAT,##__VA_ARGS__)
#define LOGE(FORMAT, ...) __android_log_print(ANDROID_LOG_ERROR,"Mark",FORMAT,##__VA_ARGS__)

#endif //FFMPEGMUSICDEMO_LOG_H
