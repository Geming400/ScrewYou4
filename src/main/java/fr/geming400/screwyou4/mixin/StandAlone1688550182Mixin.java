package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ListOperation.StandAlone.class)
public class StandAlone1688550182Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/util/List;", cancellable = true)
    private void value__254568377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-254568377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_779923914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779923914L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1835993589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1835993589L))
            info.setReturnValue("d\u347A+M\u6D29dsu+\uB87B$\u6E1C\uAC5D4}j%w8.AJ$(4ylP6\u3F03%Rf\"9Bqr7\u7AA23g:J`7X3J61ZFm1AVG%3i!b\u5C19<f/\uAD29?\u4C57\u8BA3\u3233A7O\u3727U='p\u222A8W{yeU)goA]\u8931.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2049065023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2049065023L))
            info.setReturnValue(-1414695605);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/List;)Ljava/util/List;", cancellable = true)
    private void apply_427240179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(427240179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;I)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__1180051524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1180051524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "operation()Lnet/minecraft/world/level/storage/loot/functions/ListOperation;", cancellable = true)
    private void operation_1776459421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1776459421L))
            info.setReturnValue(null);
    }


}
