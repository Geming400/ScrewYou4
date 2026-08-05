package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.SpriteLoader.class)
public class SpriteLoader_1858650972Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/renderer/texture/TextureAtlas;)Lnet/minecraft/client/renderer/texture/SpriteLoader;", cancellable = true)
    private static void create_1866067302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866067302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadAndStitch(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/resources/Identifier;ILjava/util/concurrent/Executor;Ljava/util/Set;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void loadAndStitch_1794924803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1794924803L))
            info.setReturnValue(null);
    }


}
