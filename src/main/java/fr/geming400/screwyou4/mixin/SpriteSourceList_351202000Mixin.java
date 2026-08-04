package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.atlas.SpriteSourceList.class)
public class SpriteSourceList_351202000Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/texture/atlas/SpriteSourceList;", cancellable = true)
    private static void load__1467711084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1467711084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "list(Lnet/minecraft/server/packs/resources/ResourceManager;)Ljava/util/List;", cancellable = true)
    private void list_13913240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(13913240L))
            info.setReturnValue(null);
    }


}
