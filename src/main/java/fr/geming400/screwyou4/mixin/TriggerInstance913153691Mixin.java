package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.TradeTrigger.TriggerInstance.class)
public class TriggerInstance913153691Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_4527423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(4527423L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1683577216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683577216L))
            info.setReturnValue("}/V?xZ\u1562b5o,n@7+&Lk");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1470505782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470505782L))
            info.setReturnValue(1177487557);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void matches__1857900669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857900669L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate_1173326797(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1173326797L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_114639452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114639452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tradedWithVillager(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void tradedWithVillager_1797890395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1797890395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tradedWithVillager()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void tradedWithVillager__467404106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-467404106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__317499350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-317499350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "villager()Ljava/util/Optional;", cancellable = true)
    private void villager_1013256079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013256079L))
            info.setReturnValue(null);
    }


}
