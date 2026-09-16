package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V4071.class)
public class V40711339011774Mixin {
        @Inject(at = @At("HEAD"), method = "registerBlockEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerBlockEntities__1485769273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1485769273L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerEntities_675725806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(675725806L))
            info.setReturnValue(null);
    }


}
