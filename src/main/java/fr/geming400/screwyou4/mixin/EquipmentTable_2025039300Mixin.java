package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EquipmentTable.class)
public class EquipmentTable_2025039300Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1116413031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116413031L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1499504472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1499504472L))
            info.setReturnValue("\uFD96&\u8E51QoRK\u30C8\u505DqHw}\u80C0C=X;tDU,\uCEF5:o'=XO\u7E3F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1712575906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1712575906L))
            info.setReturnValue(166607748);
    }

    @Inject(at = @At("HEAD"), method = "lootTable()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void lootTable_1719848878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1719848878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slotDropChances()Ljava/util/Map;", cancellable = true)
    private void slotDropChances__1097099655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1097099655L))
            info.setReturnValue(null);
    }


}
