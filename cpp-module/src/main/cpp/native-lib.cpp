#include <jni.h>
#include <string>

#include "libfoo.h"

extern "C" {
    JNIEXPORT jstring JNICALL
    Java_com_example_cppmodule_GoModule_reverse(JNIEnv* env, jobject, jstring str) {
        const char* cstr = env->GetStringUTFChars(str, 0);
        char* cout = reverse(const_cast<char*>(cstr));
        jstring out = env->NewStringUTF(cout);
        env->ReleaseStringUTFChars(str, cstr);
        free(cout);
        return out;
    }
}
