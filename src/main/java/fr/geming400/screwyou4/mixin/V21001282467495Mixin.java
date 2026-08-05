package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V2100.class)
public class V21001282467495Mixin {
        @Inject(at = @At("HEAD"), method = "registerBlockEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerBlockEntities__779767589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-779767589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerEntities__779767589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-779767589L))
            info.setReturnValue(null);
    }


}
