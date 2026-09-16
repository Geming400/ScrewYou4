package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.ExpirableValue.class)
public class ExpirableValue_1220955493Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value_217434544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(217434544L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_312329224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(312329224L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1991378521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1991378521L))
            info.setReturnValue("G+<W'L+<\u9DD8[\u307B<_\u6E5AGo5\u2F01XQs=Y&*$MVU\u94A0wt8}h\u0C80H\uFF77AiF?f5z50N3?fLG\u9E8C:qB-$'@r");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1778307583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1778307583L))
            info.setReturnValue(-474821918);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/lang/Object;)Lnet/minecraft/world/entity/ai/memory/ExpirableValue;", cancellable = true)
    private static void of__469176334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-469176334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/lang/Object;J)Lnet/minecraft/world/entity/ai/memory/ExpirableValue;", cancellable = true)
    private static void of__897978174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-897978174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1572604305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1572604305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timeToLive()Ljava/util/Optional;", cancellable = true)
    private void timeToLive_125833798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(125833798L))
            info.setReturnValue(null);
    }


}
