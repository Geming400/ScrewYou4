package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.PickedUpItemTrigger.TriggerInstance.class)
public class TriggerInstance172525629Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1558037888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558037888L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__962934346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-962934346L))
            info.setReturnValue("柇LO5%W[뢤Qr뾴 f/W]2$");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_210788371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(210788371L))
            info.setReturnValue(-253318522);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches__1610114872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610114872L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__1967415099(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1967415099L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_417987051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417987051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entity()Ljava/util/Optional;", cancellable = true)
    private void entity_417987051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417987051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_417987051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417987051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thrownItemPickedUpByPlayer(Ljava/util/Optional;Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void thrownItemPickedUpByPlayer__884241935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-884241935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thrownItemPickedUpByEntity(Ljava/util/Optional;Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void thrownItemPickedUpByEntity__884241935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-884241935L))
            info.setReturnValue(null);
    }


}
