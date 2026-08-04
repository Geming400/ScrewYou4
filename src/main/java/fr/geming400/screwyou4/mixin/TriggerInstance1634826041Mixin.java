package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.LootTableTrigger.TriggerInstance.class)
public class TriggerInstance1634826041Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1274628996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274628996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_499366066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(499366066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1673088783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1673088783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void matches_1822499188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822499188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lootTableUsed(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void lootTableUsed_1797106724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1797106724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lootTable()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void lootTable__1851649942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1851649942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1880287463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1880287463L))
            info.setReturnValue(null);
    }


}
