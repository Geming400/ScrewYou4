package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.BlockEntityRenderers.class)
public class BlockEntityRenderers_269226142Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/world/level/block/entity/BlockEntityType;Lnet/minecraft/client/renderer/blockentity/BlockEntityRendererProvider;)V", cancellable = true)
    private static void register__2089993053(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2089993053L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createEntityRenderers(Lnet/minecraft/client/renderer/blockentity/BlockEntityRendererProvider$Context;)Ljava/util/Map;", cancellable = true)
    private static void createEntityRenderers_1147656352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1147656352L))
            info.setReturnValue(null);
    }


}
