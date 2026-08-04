package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.HitboxRenderState.class)
public class HitboxRenderState1720520901Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1188934136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1188934136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_585060926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(585060926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1758783643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758783643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x1()D", cancellable = true)
    private void x1_1758778342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758778342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y1()D", cancellable = true)
    private void y1_1758778342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758778342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "z1()D", cancellable = true)
    private void z1_1758778342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758778342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "z0()D", cancellable = true)
    private void z0_1758778342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758778342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "red()F", cancellable = true)
    private void red_1758780264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758780264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x0()D", cancellable = true)
    private void x0_1758778342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758778342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y0()D", cancellable = true)
    private void y0_1758778342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758778342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blue()F", cancellable = true)
    private void blue_1758780264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758780264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "green()F", cancellable = true)
    private void green_1758780264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758780264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offsetX()F", cancellable = true)
    private void offsetX_1758780264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758780264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offsetY()F", cancellable = true)
    private void offsetY_1758780264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758780264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offsetZ()F", cancellable = true)
    private void offsetZ_1758780264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758780264L))
            info.setReturnValue(null);
    }


}
