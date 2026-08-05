package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.Tool.Rule.class)
public class Rule_1973192174Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__936262864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-936262864L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_837732198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(837732198L))
            info.setReturnValue("/\u74244MT{c\u9DEB)r\uABA6\u676E\u6205Y\u0D96A *f9:l<\u97E9\u4E1BKwO*89?i'D!.S{Q$JW8j");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2011454915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2011454915L))
            info.setReturnValue(777831198);
    }

    @Inject(at = @At("HEAD"), method = "blocks()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void blocks__701822079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-701822079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "speed()Ljava/util/Optional;", cancellable = true)
    private void speed__2076313701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2076313701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deniesDrops(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/item/component/Tool$Rule;", cancellable = true)
    private static void deniesDrops__1778953261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1778953261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "correctForDrops()Ljava/util/Optional;", cancellable = true)
    private void correctForDrops__2076313701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2076313701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minesAndDrops(Lnet/minecraft/core/HolderSet;F)Lnet/minecraft/world/item/component/Tool$Rule;", cancellable = true)
    private static void minesAndDrops_2127642727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127642727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideSpeed(Lnet/minecraft/core/HolderSet;F)Lnet/minecraft/world/item/component/Tool$Rule;", cancellable = true)
    private static void overrideSpeed_2127642727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127642727L))
            info.setReturnValue(null);
    }


}
