#!/usr/bin/env bash
echo ""

SIGNING_KEY_FILE=build/signing.key


# Check whether the given input is valid
if [ -z ${1+x} ]; then 
    echo "Version must be provided as an argument to the command"
    echo ""
    echo "USAGE: deploy.sh <sdk-version-number>"
    exit 1
fi

if [[ ! $1 =~ ^[0-9] ]]; then 
    echo "Version must start with a number. e.g. 3.1.0"
    echo ""
    echo "USAGE: deploy.sh <sdk-version-number>"
    exit 1
fi

# Check env variables
if [ -z ${OSSRH_USERNAME+x} ]; then 
    echo "Abort. This script assumes that the following env var is set: 'OSSRH_USERNAME'"
    exit 1
fi
if [ -z ${OSSRH_PASSWORD+x} ]; then 
    echo "Abort. This script assumes that the following env var is set: 'OSSRH_PASSWORD'"
    exit 1
fi
if [ -z ${GPG_KEYNAME+x} ]; then 
    echo "Abort. This script assumes that the following env var is set: 'GPG_KEYNAME'"
    exit 1
fi
if [ -z ${GPG_PASSPHRASE+x} ]; then 
    echo "Abort. This script assumes that the following env var is set: 'GPG_PASSPHRASE'"
    exit 1
fi

# Check whether the signing key has been put into the correct directory
if [ ! -f "$SIGNING_KEY_FILE" ]; then
    echo "$SIGNING_KEY_FILE does not exist."
fi

echo "Publishing version '$1'"


gpg --version
gpg --fast-import $SIGNING_KEY_FILE

mvn clean

mvn versions:set -DnewVersion=$1 -DgenerateBackupPoms=false

mvn deploy --settings ./build/.travis.settings.xml -DskipTests -P central

echo ""
echo "===================================="
echo "Successfully published version '$1'"
echo "===================================="
echo ""