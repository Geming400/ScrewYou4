package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.SpearMobsTrigger.TriggerInstance.class)
public class TriggerInstance_1655588077Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1253866961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1253866961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_520128101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(520128101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1693850818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693850818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(I)Z", cancellable = true)
    private void matches__1425458404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1425458404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "count()Ljava/util/Optional;", cancellable = true)
    private void count_1901049498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1901049498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1901049498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1901049498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spearMobs(I)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void spearMobs__1923014388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1923014388L))
            info.setReturnValue(null);
    }


}
