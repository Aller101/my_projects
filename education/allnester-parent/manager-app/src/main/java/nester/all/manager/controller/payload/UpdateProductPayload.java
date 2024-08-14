/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package nester.all.manager.controller.payload;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 *
 * @author alekseynesterov
 */
public record UpdateProductPayload(
        @NotNull(message = "{catalogue.products.update.errors.title_is_null}")
        @Size(min = 2, max = 30, message = "{catalogue.products.update.errors.title_size_invalid}")
        String title,
        @Size(max = 200, message = "{catalogue.products.update.errors.details_size_invalid}")
        String details) {

}
