package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.Variant.SimpleModelState.class)
public class SimpleModelState2039567285Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__869887752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-869887752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_904107310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(904107310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2077830027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077830027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x()Lcom/mojang/math/Quadrant;", cancellable = true)
    private void x__580530353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-580530353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "z()Lcom/mojang/math/Quadrant;", cancellable = true)
    private void z__580530353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-580530353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()Lcom/mojang/math/Quadrant;", cancellable = true)
    private void y__580530353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-580530353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withUvLock(Z)Lnet/minecraft/client/renderer/block/dispatch/Variant$SimpleModelState;", cancellable = true)
    private void withUvLock__1519745325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519745325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withZ(Lcom/mojang/math/Quadrant;)Lnet/minecraft/client/renderer/block/dispatch/Variant$SimpleModelState;", cancellable = true)
    private void withZ_1195486948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1195486948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withX(Lcom/mojang/math/Quadrant;)Lnet/minecraft/client/renderer/block/dispatch/Variant$SimpleModelState;", cancellable = true)
    private void withX_1195486948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1195486948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withY(Lcom/mojang/math/Quadrant;)Lnet/minecraft/client/renderer/block/dispatch/Variant$SimpleModelState;", cancellable = true)
    private void withY_1195486948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1195486948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asModelState()Lnet/minecraft/client/renderer/block/dispatch/ModelState;", cancellable = true)
    private void asModelState__1531166566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1531166566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uvLock()Z", cancellable = true)
    private void uvLock_2077845868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077845868L))
            info.setReturnValue(null);
    }


}
