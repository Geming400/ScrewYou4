package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ConsumeItemTrigger.TriggerInstance.class)
public class TriggerInstance119051696Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1504563955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1504563955L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1016408279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1016408279L))
            info.setReturnValue("=꺚/k#c啴ር0;5Bn[Q#>z%kfy|ORMG/BG|3-␀Qk5Mwpꋚ-HG2,-u슗s,GDNe C2*FfoSqഎ/475n&hsK轮|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_157314438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(157314438L))
            info.setReturnValue(-1292954032);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void matches_1853586828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1853586828L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_364513118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(364513118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_364513118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(364513118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usedItem(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void usedItem__1589901186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1589901186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usedItem()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void usedItem_1392803095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1392803095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usedItem(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void usedItem__886212604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-886212604L))
            info.setReturnValue(null);
    }


}
