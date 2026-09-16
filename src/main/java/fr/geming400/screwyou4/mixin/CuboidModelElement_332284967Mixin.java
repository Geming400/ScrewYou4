package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.CuboidModelElement.class)
public class CuboidModelElement_332284967Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__576341302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-576341302L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1102708491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102708491L))
            info.setReturnValue("y7OSDnm\u5A1EE?\uB5F3Ik23&f?//s\uA98D\u5932&JDiicO*JE6jvB\uB0EAC\uB446IjZrNwO\u1DA8\u0631B!tk\uC642\uFB33%5\u7793\u32E5txzwrQi>%G;9Y\u096FhnY");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_889637057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889637057L))
            info.setReturnValue(128762844);
    }

    @Inject(at = @At("HEAD"), method = "from()Lorg/joml/Vector3fc;", cancellable = true)
    private void from__1014566319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1014566319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "to()Lorg/joml/Vector3fc;", cancellable = true)
    private void to_1539556898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539556898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shade()Z", cancellable = true)
    private void shade__1048846384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1048846384L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lnet/minecraft/client/resources/model/cuboid/CuboidRotation;", cancellable = true)
    private void rotation__11823291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-11823291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "faces()Ljava/util/Map;", cancellable = true)
    private void faces_763327896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(763327896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightEmission()I", cancellable = true)
    private void lightEmission__184438929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-184438929L))
            info.setReturnValue(-1416648161);
    }


}
