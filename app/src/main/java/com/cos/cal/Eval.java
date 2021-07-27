package com.cos.cal;

import android.util.Log;

import com.sun.script.javascript.RhinoScriptEngine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Eval {

    private static final String TAG = "Eval";

    public static String cal(String result){
        Log.d(TAG, "cal: 실행됨");
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = new RhinoScriptEngine();
        try {
            return engine.eval(result).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
