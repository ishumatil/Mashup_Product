//package com.stackroute.questionserviceengine.service;
//
//public class ReceiverServiceImpl {
//
//    // This is the old onStart method that will be called on the pre-2.0
//// platform.  On 2.0 or later we override onStartCommand() so this
//// method will not be called.
//    @Override
//    public void onStart(Intent intent, int startId) {
//        handleCommand(intent);
//    }
//
//    @Override
//    public int onStartCommand(Intent intent, int flags, int startId) {
//        handleCommand(intent);
//        // We want this service to continue running until it is explicitly
//        // stopped, so return sticky.
//        return START_STICKY;
//    }
//
//    private void handleCommand(Intent intent) {
//        // should this be getStringExtra instead?
//        int i = intent.getIntExtra(SENSRO_STRING, -1);
//    }