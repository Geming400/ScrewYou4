package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.ModelPart.Polygon.class)
public class Polygon_553445028Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1938957286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1938957286L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__582014948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-582014948L))
            info.setReturnValue("G3?Z\u44E3D\uC0DAz\u50C5RHx\u6110&&I+-\u9AB9?i{Q122x1'^`(n,ZSyg)#8\u2BEE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_591707769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(591707769L))
            info.setReturnValue(-397737);
    }

    @Inject(at = @At("HEAD"), method = "normal()Lorg/joml/Vector3fc;", cancellable = true)
    private void normal_1099389732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1099389732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vertices()[Lnet/minecraft/client/model/geom/ModelPart$Vertex;", cancellable = true)
    private void vertices__407291071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-407291071L))
            info.setReturnValue(null);
    }


}
