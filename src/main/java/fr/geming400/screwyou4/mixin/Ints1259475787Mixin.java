package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.MinMaxBounds.Ints.class)
public class Ints1259475787Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1649979250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1649979250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_124015812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(124015812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1297738529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1297738529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(I)Z", cancellable = true)
    private void matches__1821570693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1821570693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private void bounds__76328664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-76328664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "between(II)Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private static void between__1619879567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619879567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atMost(I)Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private static void atMost_1962511306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1962511306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exactly(I)Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private static void exactly_1962511306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1962511306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromReader(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private static void fromReader__1623237285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623237285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atLeast(I)Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private static void atLeast_1962511306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1962511306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "boundsSqr()Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private void boundsSqr__76328664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-76328664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matchesSqr(J)Z", cancellable = true)
    private void matchesSqr__1820647172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820647172L))
            info.setReturnValue(null);
    }


}
