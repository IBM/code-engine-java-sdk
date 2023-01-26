#!/usr/bin/env bash

gpg --version
gpg --fast-import build/signing.key

mvn versions:set -DnewVersion=2.0.3 -DgenerateBackupPoms=false

mvn deploy --settings ./build/.travis.settings.xml -DskipTests -P central