package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.TextureSlots.class)
public class TextureSlots_698006656Mixin {
        @Inject(at = @At("HEAD"), method = "getMaterial(Ljava/lang/String;)Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private void getMaterial_404511183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(404511183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseTextureMap(Lcom/google/gson/JsonObject;)Lnet/minecraft/client/resources/model/sprite/TextureSlots$Data;", cancellable = true)
    private static void parseTextureMap__1323651895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1323651895L))
            info.setReturnValue(null);
    }


}
