package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.BuiltInBlockModels.Builder.class)
public class Builder_1787729029Mixin {
        @Inject(at = @At("HEAD"), method = "put(Lnet/minecraft/client/renderer/block/BuiltInBlockModels$ModelFactory;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void put__1646864388(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1646864388L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "put(Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void put__1936894243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1936894243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "put(Lnet/minecraft/client/renderer/block/BuiltInBlockModels$ModelFactory;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void put_2972154(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2972154L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "build()Ljava/util/Map;", cancellable = true)
    private void build_1290734142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290734142L))
            info.setReturnValue(null);
    }


}
