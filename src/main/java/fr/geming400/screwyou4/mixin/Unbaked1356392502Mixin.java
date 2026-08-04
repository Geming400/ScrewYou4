package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.model.SpecialBlockModelWrapper.Unbaked.class)
public class Unbaked1356392502Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1553062535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1553062535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_220932527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(220932527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1394655244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1394655244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/client/renderer/special/SpecialModelRenderer$Unbaked;", cancellable = true)
    private void model__222349071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-222349071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation_1601853924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1601853924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/block/model/BlockModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/block/model/BlockModel;", cancellable = true)
    private void bake_1954482955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1954482955L))
            info.setReturnValue(null);
    }


}
