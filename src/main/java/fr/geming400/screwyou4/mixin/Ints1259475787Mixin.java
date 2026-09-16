package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.MinMaxBounds.Ints.class)
public class Ints1259475787Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_350849519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(350849519L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2029899312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2029899312L))
            info.setReturnValue("(w98\u07060S\u2B6FWnwVO3?\u68DCQ(;jY\uB9DB` KR(k\u0270\u99DB:wA2V>erx\uA003<A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1816827878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816827878L))
            info.setReturnValue(1679902385);
    }

    @Inject(at = @At("HEAD"), method = "matches(I)Z", cancellable = true)
    private void matches__157376402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-157376402L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private void bounds_1687574483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1687574483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "between(II)Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private static void between__2109289367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2109289367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atMost(I)Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private static void atMost_390063008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(390063008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atLeast(I)Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private static void atLeast__2129536192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2129536192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matchesSqr(J)Z", cancellable = true)
    private void matchesSqr_1449357277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1449357277L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "exactly(I)Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private static void exactly__51608682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-51608682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromReader(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private static void fromReader__2073987480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073987480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "boundsSqr()Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private void boundsSqr__459728279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-459728279L))
            info.setReturnValue(null);
    }


}
