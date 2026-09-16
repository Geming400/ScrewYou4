package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives.TriangleFan.class)
public class TriangleFan1304712569Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_396086301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(396086301L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2075136094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2075136094L))
            info.setReturnValue("T\u87D5!A\u75AE\uF9FDrX\u672D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1862064660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862064660L))
            info.setReturnValue(-359756574);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color__1753603620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1753603620L))
            info.setReturnValue(-1803701280);
    }

    @Inject(at = @At("HEAD"), method = "points()[Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void points_1298079612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298079612L))
            info.setReturnValue(null);
    }


}
