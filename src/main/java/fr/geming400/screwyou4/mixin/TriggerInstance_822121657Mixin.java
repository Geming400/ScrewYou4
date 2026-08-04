package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ShotCrossbowTrigger.TriggerInstance.class)
public class TriggerInstance_822121657Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2087333381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2087333381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__313338319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-313338319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_860384398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(860384398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void matches__1738310508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1738310508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_1067583078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067583078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1067583078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067583078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shotCrossbow(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void shotCrossbow__183142644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-183142644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shotCrossbow(Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void shotCrossbow__436749042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-436749042L))
            info.setReturnValue(null);
    }


}
