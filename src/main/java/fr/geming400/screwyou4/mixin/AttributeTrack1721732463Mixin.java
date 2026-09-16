package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.timeline.AttributeTrack.class)
public class AttributeTrack1721732463Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_813106195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813106195L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1802811308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1802811308L))
            info.setReturnValue("\u0E17zrfQ\u70D7D\uD792EPX]\u333Dz t`KU2(|dfe.XpUh$P%<^|#}h$}=qGB/\u5DB9q{o\u559788U<C4\uD4E5sx\uA7B8O");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2015882742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2015882742L))
            info.setReturnValue(-333187616);
    }

    @Inject(at = @At("HEAD"), method = "modifier()Lnet/minecraft/world/attribute/modifier/AttributeModifier;", cancellable = true)
    private void modifier_1713389205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1713389205L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCodec(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void createCodec_1673269061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1673269061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "argumentTrack()Lnet/minecraft/util/KeyframeTrack;", cancellable = true)
    private void argumentTrack_149081287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149081287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bakeSampler(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/core/Holder;Ljava/util/Optional;Lnet/minecraft/world/clock/ClockManager;)Lnet/minecraft/world/timeline/AttributeTrackSampler;", cancellable = true)
    private void bakeSampler__1895485992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1895485992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validatePeriod(Lnet/minecraft/world/timeline/AttributeTrack;I)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void validatePeriod_1431234189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1431234189L))
            info.setReturnValue(null);
    }


}
