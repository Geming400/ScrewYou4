package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.TextureSlots.class)
public class TextureSlots_698006656Mixin {
        @Inject(at = @At("HEAD"), method = "parseTextureMap(Lcom/google/gson/JsonObject;)Lnet/minecraft/client/resources/model/sprite/TextureSlots$Data;", cancellable = true)
    private static void parseTextureMap_1316563101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1316563101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaterial(Ljava/lang/String;)Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private void getMaterial_1665016498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1665016498L))
            info.setReturnValue(null);
    }


}
