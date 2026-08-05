package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.BlockEntityRenderers.class)
public class BlockEntityRenderers_269226142Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/world/level/block/entity/BlockEntityType;Lnet/minecraft/client/renderer/blockentity/BlockEntityRendererProvider;)V", cancellable = true)
    private static void register__112840250(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-112840250L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createEntityRenderers(Lnet/minecraft/client/renderer/blockentity/BlockEntityRendererProvider$Context;)Ljava/util/Map;", cancellable = true)
    private static void createEntityRenderers_1122508593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1122508593L))
            info.setReturnValue(null);
    }


}
