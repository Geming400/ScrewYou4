package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives.Line.class)
public class Line1636550160Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_727923892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(727923892L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1887993611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1887993611L))
            info.setReturnValue(";U\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2101065045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2101065045L))
            info.setReturnValue(-1988152697);
    }

    @Inject(at = @At("HEAD"), method = "end()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void end__480215730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-480215730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void start_663493735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663493735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color__1421766029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1421766029L))
            info.setReturnValue(813002825);
    }

    @Inject(at = @At("HEAD"), method = "width()F", cancellable = true)
    private void width__3600723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-3600723L))
            info.setReturnValue(3.20101E7F);
    }


}
