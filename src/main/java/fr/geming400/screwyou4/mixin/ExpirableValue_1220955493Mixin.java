package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.ExpirableValue.class)
public class ExpirableValue_1220955493Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__1214819585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1214819585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1688499545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1688499545L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_85495021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85495021L))
            info.setReturnValue("E{-+6dKj>wzv\u6F4732sg^#\uBEF8[m$j(*$,I&\"\u9F4APH[\u4E1C$ceV\u0384O.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1259218234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1259218234L))
            info.setReturnValue(-1346316655);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/lang/Object;)Lnet/minecraft/world/entity/ai/memory/ExpirableValue;", cancellable = true)
    private static void of_893649449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(893649449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/lang/Object;J)Lnet/minecraft/world/entity/ai/memory/ExpirableValue;", cancellable = true)
    private static void of__1600051861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1600051861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timeToLive()Ljava/util/Optional;", cancellable = true)
    private void timeToLive_1466416914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466416914L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1704633467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1704633467L))
            info.setReturnValue(null);
    }


}
