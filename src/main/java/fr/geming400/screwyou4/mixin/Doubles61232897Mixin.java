package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.MinMaxBounds.Doubles.class)
public class Doubles61232897Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1446745156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1446745156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1074227078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1074227078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_99495639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(99495639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(D)Z", cancellable = true)
    private void matches_1270536108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1270536108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private void bounds__1274571554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274571554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "between(DD)Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private static void between__351753769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-351753769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atMost(D)Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private static void atMost__760593181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-760593181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exactly(D)Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private static void exactly__760593181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-760593181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromReader(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private static void fromReader__1653747443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1653747443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atLeast(D)Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private static void atLeast__760593181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-760593181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "boundsSqr()Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private void boundsSqr__1274571554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274571554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matchesSqr(D)Z", cancellable = true)
    private void matchesSqr_1270536108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1270536108L))
            info.setReturnValue(null);
    }


}
