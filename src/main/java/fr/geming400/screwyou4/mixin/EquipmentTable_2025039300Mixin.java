package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EquipmentTable.class)
public class EquipmentTable_2025039300Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__884415738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-884415738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_889579324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889579324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2063302041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063302041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lootTable()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void lootTable__1461436684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1461436684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slotDropChances()Ljava/util/Map;", cancellable = true)
    private void slotDropChances_20415659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(20415659L))
            info.setReturnValue(null);
    }


}
