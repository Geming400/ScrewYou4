package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives.TriangleFan.class)
public class TriangleFan1304712569Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1604742468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1604742468L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_169252594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(169252594L))
            info.setReturnValue("_5\uB6ABfLTTz\u2B6DVS0Gb8Jtv(vt)\uD660_ \u5E77ZbYCJlRKt?\u723Bcv\u4480g:|V*\uFB5AM^I9Zo}E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1342975311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342975311L))
            info.setReturnValue(-726644425);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_1342974815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342974815L))
            info.setReturnValue(-523497006);
    }

    @Inject(at = @At("HEAD"), method = "points()[Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void points_270546969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(270546969L))
            info.setReturnValue(null);
    }


}
