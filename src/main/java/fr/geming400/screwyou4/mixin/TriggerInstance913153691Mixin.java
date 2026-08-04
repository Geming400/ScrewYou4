package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.TradeTrigger.TriggerInstance.class)
public class TriggerInstance913153691Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1996301346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1996301346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__222306284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-222306284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_951416433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(951416433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void matches_934694870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(934694870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__1226787037(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1226787037L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_1158615113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1158615113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "villager()Ljava/util/Optional;", cancellable = true)
    private void villager_1158615113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1158615113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1158615113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1158615113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tradedWithVillager()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void tradedWithVillager__2108062206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2108062206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tradedWithVillager(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void tradedWithVillager__789830745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-789830745L))
            info.setReturnValue(null);
    }


}
