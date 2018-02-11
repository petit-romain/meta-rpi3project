DESCRIPTION = "Basic project PI image"
LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES += "splash ssh-server-dropbear"

CONNECTIVITY_INSTALL += " \
	dnsmasq \
	hostapd \
	wpa-supplicant \
	wpa-supplicant-passphrase \
	iw \
"

MQTT_INSTALL += " \
	mosquitto \
	mosquitto-clients \
	libmosquitto1 \
	libmosquittopp1 \
	qmqtt \
"

IMAGE_INSTALL += " \	
	openssh-sftp-server \
	${CONNECTIVITY_INSTALL} \
	${MQTT_INSTALL} \
"

export IMAGE_BASENAME = "rpi3project-base-image"
