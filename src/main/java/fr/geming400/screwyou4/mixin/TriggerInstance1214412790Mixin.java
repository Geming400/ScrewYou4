package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.EnterBlockTrigger.TriggerInstance.class)
public class TriggerInstance1214412790Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1695042247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1695042247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_78952815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(78952815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1252675532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252675532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void matches_1069123804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069123804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "state()Ljava/util/Optional;", cancellable = true)
    private void state_1459874212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1459874212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Ljava/util/Optional;", cancellable = true)
    private void block_1459874212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1459874212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entersBlock(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entersBlock_1638215333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1638215333L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1459874212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1459874212L))
            info.setReturnValue(null);
    }


}
