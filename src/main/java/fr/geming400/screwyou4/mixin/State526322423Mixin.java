package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.book.BookModel.State.class)
public class State526322423Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1911834682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1911834682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__609137552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609137552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_564585165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(564585165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forAnimation(FFFF)Lnet/minecraft/client/model/object/book/BookModel$State;", cancellable = true)
    private static void forAnimation__1484807940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1484807940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pageFlip1()F", cancellable = true)
    private void pageFlip1_564581786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(564581786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pageFlip2()F", cancellable = true)
    private void pageFlip2_564581786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(564581786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openness()F", cancellable = true)
    private void openness_564581786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(564581786L))
            info.setReturnValue(null);
    }


}
