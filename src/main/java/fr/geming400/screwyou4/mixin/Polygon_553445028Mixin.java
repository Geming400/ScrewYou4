package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.ModelPart.Polygon.class)
public class Polygon_553445028Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__355181241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-355181241L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1323868552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1323868552L))
            info.setReturnValue("y-EtxS8\u8B93nh3Jqq\u6FC5m.<|oQbz\u34BBwTpXk53D)-1wMzY>9\u83C5\u2A86p(/d;Lv\"AvfJ:>`\uFCF8]G|XRi?nr^Hr[\"`r5_6/9Ul\u5B2Em-`O/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1110797118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1110797118L))
            info.setReturnValue(755430729);
    }

    @Inject(at = @At("HEAD"), method = "normal()Lorg/joml/Vector3fc;", cancellable = true)
    private void normal__1850764533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1850764533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vertices()[Lnet/minecraft/client/model/geom/ModelPart$Vertex;", cancellable = true)
    private void vertices_598445864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(598445864L))
            info.setReturnValue(null);
    }


}
