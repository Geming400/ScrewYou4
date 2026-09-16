package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ItemDurabilityTrigger.TriggerInstance.class)
public class TriggerInstance1282161647Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_373535379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(373535379L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2052585172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2052585172L))
            info.setReturnValue("Ls\uBAD4!xH5 1/E\u11CA4;%dF\uC573kYzBHuq=\u6E09JI\u8306\uFF72Pd#\u0F93M\u271F+f\uAD35'vgHR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1839513738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1839513738L))
            info.setReturnValue(-453773244);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;I)Z", cancellable = true)
    private void matches_804453901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(804453901L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "delta()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void delta_1143075141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143075141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_483647408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(483647408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "durability()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void durability_2041668244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041668244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "changedDurability(Ljava/util/Optional;Ljava/util/Optional;Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void changedDurability__1674847242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1674847242L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "changedDurability(Ljava/util/Optional;Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void changedDurability__436307707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-436307707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_51508606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(51508606L))
            info.setReturnValue(null);
    }


}
