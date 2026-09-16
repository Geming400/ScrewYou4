package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.MinMaxBounds.Doubles.class)
public class Doubles61232897Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__847393371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-847393371L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_831656422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831656422L))
            info.setReturnValue("s\uA2F1\u36F2lMb\u6B28Y:CX5s\u2C22\u299C?*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_618584988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(618584988L))
            info.setReturnValue(-222104698);
    }

    @Inject(at = @At("HEAD"), method = "matches(D)Z", cancellable = true)
    private void matches__1360236897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1360236897L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private void bounds_489331593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(489331593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "between(DD)Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private static void between_1054864351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054864351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atMost(D)Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private static void atMost__359541427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-359541427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atLeast(D)Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private static void atLeast_1404123565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1404123565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromReader(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private static void fromReader_409927904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409927904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matchesSqr(D)Z", cancellable = true)
    private void matchesSqr_245573261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(245573261L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "boundsSqr()Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private void boundsSqr__1657971169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657971169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exactly(D)Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private static void exactly_1578936727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578936727L))
            info.setReturnValue(null);
    }


}
