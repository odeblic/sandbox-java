#include <jni.h>
#include <stdio.h>

#include "native.h"


JNIEXPORT void JNICALL Java_fr_odeblic_CWrapper_saySomething (JNIEnv * env, jobject obj)
{
  //const char * nstr = (*env)->GetStringUTFChars(env, jstr, 0);
  //(*env)->ReleaseStringUTFChars(env, chaine1, jstr);
  puts("Hi from the native code !");
}


JNIEXPORT jstring JNICALL Java_fr_odeblic_CWrapper_getMessage (JNIEnv * env, jobject obj)
{
  return (*env)->NewStringUTF(env, "Native greetings...");
}


JNIEXPORT jint JNICALL Java_fr_odeblic_CWrapper_getId (JNIEnv * env, jobject obj)
{
  return 12345;
}

