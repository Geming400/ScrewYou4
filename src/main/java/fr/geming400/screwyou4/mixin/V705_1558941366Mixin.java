package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V705.class)
public class V705_1558941366Mixin {
        @Inject(at = @At("HEAD"), method = "registerTypes(Lcom/mojang/datafixers/schemas/Schema;Ljava/util/Map;Ljava/util/Map;)V", cancellable = true)
    private void registerTypes__394957996(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-394957996L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerEntities__503293719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503293719L))
            info.setReturnValue(null);
    }


}
