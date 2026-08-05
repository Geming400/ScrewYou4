package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.CuboidModelElement.class)
public class CuboidModelElement_332284967Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1717797225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717797225L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__803175009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803175009L))
            info.setReturnValue("S42@f62xHHK㒟4)'rx0\"SNⳈ@W謝pGl-)!n|Il<yP#;q!]I.45BY-u+Lm=\"EVZI!}7P]QL5L9qXQ7'q(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_370547708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370547708L))
            info.setReturnValue(413644074);
    }

    @Inject(at = @At("HEAD"), method = "from()Lorg/joml/Vector3fc;", cancellable = true)
    private void from_878229671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(878229671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "to()Lorg/joml/Vector3fc;", cancellable = true)
    private void to_878229671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(878229671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shade()Z", cancellable = true)
    private void shade_370563549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370563549L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "lightEmission()I", cancellable = true)
    private void lightEmission_370547212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370547212L))
            info.setReturnValue(296680408);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lnet/minecraft/client/resources/model/cuboid/CuboidRotation;", cancellable = true)
    private void rotation__848463929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848463929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "faces()Ljava/util/Map;", cancellable = true)
    private void faces__1672338674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1672338674L))
            info.setReturnValue(null);
    }


}
