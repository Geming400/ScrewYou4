package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V1460.class)
public class V14601256787653Mixin {
        @Inject(at = @At("HEAD"), method = "registerEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerEntities__805447431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-805447431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerTypes(Lcom/mojang/datafixers/schemas/Schema;Ljava/util/Map;Ljava/util/Map;)V", cancellable = true)
    private void registerTypes__697111708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-697111708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerBlockEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerBlockEntities__805447431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-805447431L))
            info.setReturnValue(null);
    }


}
