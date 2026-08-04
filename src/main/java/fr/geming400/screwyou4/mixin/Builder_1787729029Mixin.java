package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.BuiltInBlockModels.Builder.class)
public class Builder_1787729029Mixin {
        @Inject(at = @At("HEAD"), method = "put(Lnet/minecraft/client/renderer/block/BuiltInBlockModels$ModelFactory;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void put_630093611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(630093611L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "put(Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void put__470819186(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-470819186L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "put(Lnet/minecraft/client/renderer/block/BuiltInBlockModels$ModelFactory;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void put_1605374955(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1605374955L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "build()Ljava/util/Map;", cancellable = true)
    private void build__216894612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-216894612L))
            info.setReturnValue(null);
    }


}
