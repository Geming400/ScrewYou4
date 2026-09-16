package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.geometry.BakedQuad.class)
public class BakedQuad_176844524Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__731781745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-731781745L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_947268048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947268048L))
            info.setReturnValue("fwa_0\uA964$iM1LLcj]Y\uB3044G{}<1tK%YWSaQV)5$T0d3Owfwm`\uCFAEUv ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_734196614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(734196614L))
            info.setReturnValue(-806030412);
    }

    @Inject(at = @At("HEAD"), method = "position(I)Lorg/joml/Vector3fc;", cancellable = true)
    private void position_956181834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(956181834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "direction()Lnet/minecraft/core/Direction;", cancellable = true)
    private void direction__294152395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-294152395L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "position0()Lorg/joml/Vector3fc;", cancellable = true)
    private void position0__565368173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-565368173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packedUV3()J", cancellable = true)
    private void packedUV3_1486983832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1486983832L))
            info.setReturnValue(4368788410769013028L);
    }

    @Inject(at = @At("HEAD"), method = "position2()Lorg/joml/Vector3fc;", cancellable = true)
    private void position2__424819563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-424819563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "position3()Lorg/joml/Vector3fc;", cancellable = true)
    private void position3_1792938390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1792938390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packedUV0()J", cancellable = true)
    private void packedUV0_1401096379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1401096379L))
            info.setReturnValue(2155969146918348651L);
    }

    @Inject(at = @At("HEAD"), method = "position1()Lorg/joml/Vector3fc;", cancellable = true)
    private void position1_1652389780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1652389780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packedUV2()J", cancellable = true)
    private void packedUV2_1458354681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458354681L))
            info.setReturnValue(-8382973009018982320L);
    }

    @Inject(at = @At("HEAD"), method = "packedUV1()J", cancellable = true)
    private void packedUV1_1429725530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1429725530L))
            info.setReturnValue(18768048385296556L);
    }

    @Inject(at = @At("HEAD"), method = "materialInfo()Lnet/minecraft/client/resources/model/geometry/BakedQuad$MaterialInfo;", cancellable = true)
    private void materialInfo__1396353334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1396353334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packedUV(I)J", cancellable = true)
    private void packedUV_1202539364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1202539364L))
            info.setReturnValue(-6351882280947719936L);
    }


}
