package ru.vk.vkanalysisproject.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorType {
    UNEXPECTED_ERROR(HttpStatus.BAD_REQUEST, "Неожиданная ошибка"),
    VALIDATION_ERROR(HttpStatus.BAD_REQUEST, "Ошибка валидации"),

    ENTITY_NOT_FOUND(HttpStatus.NOT_FOUND, "Не найдено"),
    ENTITY_ALREADY_EXISTS(HttpStatus.BAD_REQUEST, "Уже существует"),
    INCORRECT_PARAMETERS(HttpStatus.BAD_REQUEST, "Некорректные параметры"),
    ACCESS_DENIED(HttpStatus.FORBIDDEN, "Доступ запрещен"),
    HAS_DEPENDENT(HttpStatus.BAD_REQUEST, "Связанная сущность"),
    MEDIA_UPLOAD_ERROR(HttpStatus.BAD_REQUEST, "Ошибка загрузки"),
    MEDIA_DOWNLOAD_ERROR(HttpStatus.BAD_REQUEST, "Ошибка выгрузки");

    private final HttpStatus status;
    private final String title;
}
