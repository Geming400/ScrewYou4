package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.UnbakedCuboidGeometry.class)
public class UnbakedCuboidGeometry1551707264Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1357747773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1357747773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_416247289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(416247289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1589970006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589970006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "elements()Ljava/util/List;", cancellable = true)
    private void elements__1116923216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116923216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Ljava/util/List;Lnet/minecraft/client/resources/model/sprite/TextureSlots;Lnet/minecraft/client/resources/model/ModelBaker;Lnet/minecraft/client/renderer/block/dispatch/ModelState;Lnet/minecraft/client/resources/model/ModelDebugName;)Lnet/minecraft/client/resources/model/geometry/QuadCollection;", cancellable = true)
    private static void bake__244029361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-244029361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/resources/model/sprite/TextureSlots;Lnet/minecraft/client/resources/model/ModelBaker;Lnet/minecraft/client/renderer/block/dispatch/ModelState;Lnet/minecraft/client/resources/model/ModelDebugName;)Lnet/minecraft/client/resources/model/geometry/QuadCollection;", cancellable = true)
    private void bake__1916336282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1916336282L))
            info.setReturnValue(null);
    }


}
