package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.model.SpecialBlockModelWrapper.Unbaked.class)
public class Unbaked1356392502Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_447766234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(447766234L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2126816027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126816027L))
            info.setReturnValue("lc,)-XuuXRe\u6737\u4A7A6H(a\u8F7D\u6800\"Xe%u_}/\u35A1F>\uA3CF[%n-\u4E5D[6RA$\u5BB4]?^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1913744593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1913744593L))
            info.setReturnValue(730947984);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/client/renderer/special/SpecialModelRenderer$Unbaked;", cancellable = true)
    private void model__1973931238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1973931238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation__1740037651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740037651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/block/model/BlockModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/block/model/BlockModel;", cancellable = true)
    private void bake__1332732764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1332732764L))
            info.setReturnValue(null);
    }


}
