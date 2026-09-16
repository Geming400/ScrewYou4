package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.UnbakedCuboidGeometry.class)
public class UnbakedCuboidGeometry1551707264Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_643080996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(643080996L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1972836507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1972836507L))
            info.setReturnValue("*U\u1A37kC\uD3FD!\u2BE4=\u17D1!z(#wMyxC_|\uA814fyTcI\u29B4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2109059355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109059355L))
            info.setReturnValue(278466406);
    }

    @Inject(at = @At("HEAD"), method = "elements()Ljava/util/List;", cancellable = true)
    private void elements__593315289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-593315289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Ljava/util/List;Lnet/minecraft/client/resources/model/sprite/TextureSlots;Lnet/minecraft/client/resources/model/ModelBaker;Lnet/minecraft/client/renderer/block/dispatch/ModelState;Lnet/minecraft/client/resources/model/ModelDebugName;)Lnet/minecraft/client/resources/model/geometry/QuadCollection;", cancellable = true)
    private static void bake_903591126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(903591126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/resources/model/sprite/TextureSlots;Lnet/minecraft/client/resources/model/ModelBaker;Lnet/minecraft/client/renderer/block/dispatch/ModelState;Lnet/minecraft/client/resources/model/ModelDebugName;)Lnet/minecraft/client/resources/model/geometry/QuadCollection;", cancellable = true)
    private void bake__1169276435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1169276435L))
            info.setReturnValue(null);
    }


}
