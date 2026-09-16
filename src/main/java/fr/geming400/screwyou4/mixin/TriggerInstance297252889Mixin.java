package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.DefaultBlockInteractionTrigger.TriggerInstance.class)
public class TriggerInstance297252889Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__611373379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-611373379L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1067676414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067676414L))
            info.setReturnValue("tpR?\u4A4D>TE\u6EA3%\u8F6A,YReHONK\u46D8D$SKlkW*tD46hE?R2q(:#MScHM.Lk,>oO'qW<pC6[D5y\u1174N^B2LM0\uCBE6/ZcO[YrVL0-}Y\u0DBBI\uB88A:tV.?\"7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_854604980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(854604980L))
            info.setReturnValue(1781488052);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches_1011322076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011322076L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate_557425995(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(557425995L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "location()Ljava/util/Optional;", cancellable = true)
    private void location__895337860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-895337860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__933400152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-933400152L))
            info.setReturnValue(null);
    }


}
