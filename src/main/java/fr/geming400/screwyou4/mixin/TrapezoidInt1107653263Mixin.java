package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.TrapezoidInt.class)
public class TrapezoidInt1107653263Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1801801774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1801801774L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__27807208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-27807208L))
            info.setReturnValue(":'Mra뭋AAU-OL<;gl@MM{}h(Cw4[*ᲂFo['4RAZUO細ThK#41qzVᳲe匑x8㹧Cks79cB6z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1145916005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1145916005L))
            info.setReturnValue(1033733441);
    }

    @Inject(at = @At("HEAD"), method = "of(III)Lnet/minecraft/util/valueproviders/TrapezoidInt;", cancellable = true)
    private static void of__596526032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-596526032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive_1145915509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1145915509L))
            info.setReturnValue(1236880860);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive_1145915509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1145915509L))
            info.setReturnValue(1236880860);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1451460309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1451460309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triangle(I)Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private static void triangle__1919419959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1919419959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void sample__599374315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-599374315L))
            info.setReturnValue(1083200494);
    }

    @Inject(at = @At("HEAD"), method = "plateau()I", cancellable = true)
    private void plateau_1145915509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1145915509L))
            info.setReturnValue(1236880860);
    }


}
