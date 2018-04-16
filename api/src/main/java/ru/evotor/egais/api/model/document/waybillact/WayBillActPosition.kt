package ru.evotor.egais.api.model.document.waybillact

import java.math.BigDecimal
import java.util.*

/**
 * Позиция акта разногласий для товарно-транспортной накладной
 *
 * @property uuid Уникальный идентификатор
 * @property wayBillActUuid Уникальный идентификатор акта разногласий
 * @property identity Идентификатор позиции внутри накладной
 * @property informF2RegId Регистрационный номер записи справки Б
 * @property realQuantity Количество фактическое
 */
data class WayBillActPosition(
        val uuid: UUID,
        var wayBillActUuid: UUID,
        var identity: String,
        var informF2RegId: String?,
        var realQuantity: BigDecimal
)