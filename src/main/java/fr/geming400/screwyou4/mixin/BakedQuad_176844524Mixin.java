package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.geometry.BakedQuad.class)
public class BakedQuad_176844524Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1562356782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1562356782L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__958615452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-958615452L))
            info.setReturnValue("R(s{\"DCwR@!a*HtKb\uB892pRF\uB1E6Yq\u452ATa15{U\u35DAz d(k;Ab\u8529m7b+b/q\"+l \u560Eqi_\uB419hgvm\u4BD7},Ydm%w]Tw:la]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_215107265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(215107265L))
            info.setReturnValue(-1207721300);
    }

    @Inject(at = @At("HEAD"), method = "position(I)Lorg/joml/Vector3fc;", cancellable = true)
    private void position_1322538579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1322538579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "direction()Lnet/minecraft/core/Direction;", cancellable = true)
    private void direction__586010762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-586010762L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "position0()Lorg/joml/Vector3fc;", cancellable = true)
    private void position0_722789228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(722789228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packedUV(I)J", cancellable = true)
    private void packedUV_1390749963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390749963L))
            info.setReturnValue(-6480373605632280667L);
    }

    @Inject(at = @At("HEAD"), method = "packedUV2()J", cancellable = true)
    private void packedUV2_215107730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(215107730L))
            info.setReturnValue(-3034217796264345231L);
    }

    @Inject(at = @At("HEAD"), method = "packedUV3()J", cancellable = true)
    private void packedUV3_215107730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(215107730L))
            info.setReturnValue(-3034217796264345231L);
    }

    @Inject(at = @At("HEAD"), method = "position3()Lorg/joml/Vector3fc;", cancellable = true)
    private void position3_722789228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(722789228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packedUV0()J", cancellable = true)
    private void packedUV0_215107730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(215107730L))
            info.setReturnValue(-3034217796264345231L);
    }

    @Inject(at = @At("HEAD"), method = "packedUV1()J", cancellable = true)
    private void packedUV1_215107730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(215107730L))
            info.setReturnValue(-3034217796264345231L);
    }

    @Inject(at = @At("HEAD"), method = "position1()Lorg/joml/Vector3fc;", cancellable = true)
    private void position1_722789228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(722789228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "position2()Lorg/joml/Vector3fc;", cancellable = true)
    private void position2_722789228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(722789228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "materialInfo()Lnet/minecraft/client/resources/model/geometry/BakedQuad$MaterialInfo;", cancellable = true)
    private void materialInfo_1876490901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1876490901L))
            info.setReturnValue(null);
    }


}
