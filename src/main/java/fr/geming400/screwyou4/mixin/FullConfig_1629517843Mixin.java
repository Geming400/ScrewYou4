package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.trialspawner.TrialSpawner.FullConfig.class)
public class FullConfig_1629517843Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_720891574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720891574L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1895025929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1895025929L))
            info.setReturnValue("-\u4EAFG\uCAECd2f6M'+ZFl? ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2108097363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2108097363L))
            info.setReturnValue(1271089771);
    }

    @Inject(at = @At("HEAD"), method = "normal()Lnet/minecraft/core/Holder;", cancellable = true)
    private void normal__1927424441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1927424441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredPlayerRange()I", cancellable = true)
    private void requiredPlayerRange__1090472357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090472357L))
            info.setReturnValue(-370040790);
    }

    @Inject(at = @At("HEAD"), method = "ominous()Lnet/minecraft/core/Holder;", cancellable = true)
    private void ominous_1607832036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1607832036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "targetCooldownLength()I", cancellable = true)
    private void targetCooldownLength_88438038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(88438038L))
            info.setReturnValue(-379758132);
    }

    @Inject(at = @At("HEAD"), method = "overrideEntity(Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner$FullConfig;", cancellable = true)
    private void overrideEntity_782788496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(782788496L))
            info.setReturnValue(null);
    }


}
