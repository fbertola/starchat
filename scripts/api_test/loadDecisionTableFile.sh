#!/usr/bin/env bash

PORT=${1:-8443}
INDEX_NAME=${2:-'index_getjenny_english_0'}
FILENAME=${3:-"$(readlink -e ../../doc/decision_table_starchat_doc.csv)"}
curl -k -v -H "Authorization: Basic $(echo -n 'test_user:p4ssw0rd' | base64)" \
 -X POST --form "csv=@${FILENAME}" "https://localhost:${PORT}/${INDEX_NAME}/decisiontable/upload_csv"

