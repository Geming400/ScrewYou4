package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.FilledBucketTrigger.TriggerInstance.class)
public class TriggerInstance1581677823Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_673051555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(673051555L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1942865948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1942865948L))
            info.setReturnValue("[\u1535(H9:+3Q-jang%Jw\u8528;\uBFE6\"DM5qxr+2t$8ca\uBFAC..Hx gkU[\u85C0hLo\uC31ELmn&<#A-gnMRf\u0E39");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2139029914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139029914L))
            info.setReturnValue(-278326199);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void matches__1344106232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1344106232L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_783163584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(783163584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_351024782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(351024782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filledBucket(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void filledBucket_1194154425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1194154425L))
            info.setReturnValue(null);
    }


}
