package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V1125.class)
public class V11251253902731Mixin {
        @Inject(at = @At("HEAD"), method = "registerBlockEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerBlockEntities__808332353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-808332353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerTypes(Lcom/mojang/datafixers/schemas/Schema;Ljava/util/Map;Ljava/util/Map;)V", cancellable = true)
    private void registerTypes__699996630(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-699996630L))
            info.cancel();
    }


}
