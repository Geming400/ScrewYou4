package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.EntityRenderers.class)
public class EntityRenderers_999706529Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/client/renderer/entity/EntityRendererProvider;)V", cancellable = true)
    private static void register__1508649668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1508649668L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAvatarRenderers(Lnet/minecraft/client/renderer/entity/EntityRendererProvider$Context;)Ljava/util/Map;", cancellable = true)
    private static void createAvatarRenderers__30654715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-30654715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createEntityRenderers(Lnet/minecraft/client/renderer/entity/EntityRendererProvider$Context;)Ljava/util/Map;", cancellable = true)
    private static void createEntityRenderers__30654715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-30654715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateRegistrations()Z", cancellable = true)
    private static void validateRegistrations_1037985359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1037985359L))
            info.setReturnValue(false);
    }


}
