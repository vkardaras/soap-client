package com.vasiliskardaras.soap_client;

import java.time.OffsetDateTime;

public record ErrorResponseModel(String message, OffsetDateTime timestamp) {
}
