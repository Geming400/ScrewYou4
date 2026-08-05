package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.timeline.AttributeTrack.class)
public class AttributeTrack1721732463Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1187722574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1187722574L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_586272488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586272488L))
            info.setReturnValue("'n");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1759995205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1759995205L))
            info.setReturnValue(-1662097740);
    }

    @Inject(at = @At("HEAD"), method = "modifier()Lnet/minecraft/world/attribute/modifier/AttributeModifier;", cancellable = true)
    private void modifier__901797378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-901797378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCodec(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void createCodec_1565814987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1565814987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bakeSampler(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/core/Holder;Ljava/util/Optional;Lnet/minecraft/world/clock/ClockManager;)Lnet/minecraft/world/timeline/AttributeTrackSampler;", cancellable = true)
    private void bakeSampler__1257653209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1257653209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validatePeriod(Lnet/minecraft/world/timeline/AttributeTrack;I)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void validatePeriod__1309190428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1309190428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "argumentTrack()Lnet/minecraft/util/KeyframeTrack;", cancellable = true)
    private void argumentTrack_588338873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(588338873L))
            info.setReturnValue(null);
    }


}
