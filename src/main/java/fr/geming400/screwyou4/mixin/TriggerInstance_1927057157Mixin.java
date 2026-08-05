package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.UsedTotemTrigger.TriggerInstance.class)
public class TriggerInstance_1927057157Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__982397881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-982397881L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_791597181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791597181L))
            info.setReturnValue("旘ೠ#8sYgg2mgX1G8!tNa1쭿(㽍쾺Jyq%[胟6D&d鋙 I9p8Ui눔F F控IﬔMR킢+cg#쎟");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1965319898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965319898L))
            info.setReturnValue(-61251453);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void matches__633375008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-633375008L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item__2122448718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2122448718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__2122448718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2122448718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usedTotem(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void usedTotem_921792856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(921792856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usedTotem(Lnet/minecraft/advancements/predicates/ItemPredicate;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void usedTotem__1900712695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1900712695L))
            info.setReturnValue(null);
    }


}
