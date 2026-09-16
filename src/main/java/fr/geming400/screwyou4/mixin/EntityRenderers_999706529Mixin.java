package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.EntityRenderers.class)
public class EntityRenderers_999706529Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/client/renderer/entity/EntityRendererProvider;)V", cancellable = true)
    private static void register_1290785273(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1290785273L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAvatarRenderers(Lnet/minecraft/client/renderer/entity/EntityRendererProvider$Context;)Ljava/util/Map;", cancellable = true)
    private static void createAvatarRenderers_219623456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(219623456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateRegistrations()Z", cancellable = true)
    private static void validateRegistrations_745499499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(745499499L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createEntityRenderers(Lnet/minecraft/client/renderer/entity/EntityRendererProvider$Context;)Ljava/util/Map;", cancellable = true)
    private static void createEntityRenderers_1067931350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067931350L))
            info.setReturnValue(null);
    }


}
