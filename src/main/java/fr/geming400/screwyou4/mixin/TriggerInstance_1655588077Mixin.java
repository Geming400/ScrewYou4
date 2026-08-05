package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.SpearMobsTrigger.TriggerInstance.class)
public class TriggerInstance_1655588077Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_746961808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(746961808L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1868955695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1868955695L))
            info.setReturnValue("NVAz\uB970F>fmV\uF9F34Jk_p/-\u71EC;I< E5F8prp!-XqDe)P4@#[Lmq #\u7C43is2Cx'!z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2082027129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082027129L))
            info.setReturnValue(-1402035502);
    }

    @Inject(at = @At("HEAD"), method = "matches(I)Z", cancellable = true)
    private void matches_238735887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(238735887L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "count()Ljava/util/Optional;", cancellable = true)
    private void count__1188525399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1188525399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_424935035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(424935035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spearMobs(I)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void spearMobs_1680399352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1680399352L))
            info.setReturnValue(null);
    }


}
