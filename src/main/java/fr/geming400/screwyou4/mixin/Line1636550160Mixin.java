package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives.Line.class)
public class Line1636550160Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1272904877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1272904877L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_501090185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(501090185L))
            info.setReturnValue("ణU`>$qq쐻;Ki甉 RkwdbY羄Au_,Q㹓䍗模(썖bc豈GaRMJmV轇-'[`U@c*kq嬔n#BsjNZIrz@%⬼cSz^*갍DW-*FFo4i]!+C]l4txm빽'Ww8t");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1674812902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1674812902L))
            info.setReturnValue(1050428202);
    }

    @Inject(at = @At("HEAD"), method = "end()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void end__1560687607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1560687607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void start__1560687607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1560687607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_1674812406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1674812406L))
            info.setReturnValue(1253575621);
    }

    @Inject(at = @At("HEAD"), method = "width()F", cancellable = true)
    private void width_1674809523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1674809523L))
            info.setReturnValue(6.503936E8F);
    }


}
