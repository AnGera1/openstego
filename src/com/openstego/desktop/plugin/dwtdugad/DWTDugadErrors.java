/*
 * Steganography utility to hide messages into cover files
 * Author: Samir Vaidya (mailto:syvaidya@gmail.com)
 * Copyright (c) 2007-2017 Samir Vaidya
 */

package com.openstego.desktop.plugin.dwtdugad;

import com.openstego.desktop.OpenStegoException;

/**
 * Class to store error codes for DWT Xie plugin
 */
public class DWTDugadErrors {
    /**
     * Error Code - No cover file given
     */
    public static final int ERR_NO_COVER_FILE = 1;

    /**
     * Error Code - Invalid signature file provided
     */
    public static final int ERR_SIG_NOT_VALID = 2;

    /*
     * Initialize the error code - message key map
     */
    static {
        OpenStegoException.addErrorCode(DWTDugadPlugin.NAMESPACE, ERR_NO_COVER_FILE, "err.cover.missing");
        OpenStegoException.addErrorCode(DWTDugadPlugin.NAMESPACE, ERR_SIG_NOT_VALID, "err.signature.invalid");
    }
}
