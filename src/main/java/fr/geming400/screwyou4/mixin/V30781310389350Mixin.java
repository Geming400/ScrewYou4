package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V3078.class)
public class V30781310389350Mixin {
        @Inject(at = @At("HEAD"), method = "registerEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerEntities__751845734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-751845734L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerBlockEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerBlockEntities__751845734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-751845734L))
            info.setReturnValue(null);
    }


}
