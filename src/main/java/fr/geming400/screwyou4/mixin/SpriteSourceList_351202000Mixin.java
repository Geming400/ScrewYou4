package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.atlas.SpriteSourceList.class)
public class SpriteSourceList_351202000Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/texture/atlas/SpriteSourceList;", cancellable = true)
    private static void load__1609813638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1609813638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "list(Lnet/minecraft/server/packs/resources/ResourceManager;)Ljava/util/List;", cancellable = true)
    private void list__43425866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-43425866L))
            info.setReturnValue(null);
    }


}
