#!/bin/sh

export PATH=${PATH}:/usr/bin/qt5

export QT_QPA_PLATFORM=eglfs

export QT_QPA_EGLFS_PHYSICAL_WIDTH=155
export QT_QPA_EGLFS_PHYSICAL_HEIGHT=86

export QT_QUICK_CONTROLS_STYLE=flat

export QT_QPA_FONTDIR=/usr/share/fonts/truetype

if [ -z "${XDG_RUNTIME_DIR}" ]; then
    export XDG_RUNTIME_DIR=/tmp/user/${UID}

    if [ ! -d ${XDG_RUNTIME_DIR} ]; then
        mkdir -p ${XDG_RUNTIME_DIR}
    fi
fi