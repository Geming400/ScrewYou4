package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ChangeDimensionTrigger.TriggerInstance.class)
public class TriggerInstance170471465Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1555983724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1555983724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__964988510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964988510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_208734207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(208734207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void matches_1375111264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1375111264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "from()Ljava/util/Optional;", cancellable = true)
    private void from_415932887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415932887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "to()Ljava/util/Optional;", cancellable = true)
    private void to_415932887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415932887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_415932887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415932887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "changedDimensionFrom(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void changedDimensionFrom_332752148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(332752148L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "changedDimension(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void changedDimension__171312624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-171312624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "changedDimension()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void changedDimension_1444222864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1444222864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "changedDimensionTo(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void changedDimensionTo_332752148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(332752148L))
            info.setReturnValue(null);
    }


}
