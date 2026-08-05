package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives.Text.class)
public class Text1862201609Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1047253428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1047253428L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_726741634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726741634L))
            info.setReturnValue("Ya&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1900464351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1900464351L))
            info.setReturnValue(-1044647275);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void pos__1335036158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1335036158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "text()Ljava/lang/String;", cancellable = true)
    private void text_726741138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726741138L))
            info.setReturnValue(".GUxu᧪WN}i鞅");
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/gizmos/TextGizmo$Style;", cancellable = true)
    private void style__125962529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-125962529L))
            info.setReturnValue(null);
    }


}
