package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V3689.class)
public class V36891315961228Mixin {
        @Inject(at = @At("HEAD"), method = "registerBlockEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerBlockEntities__1508819819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1508819819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerEntities_652675260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652675260L))
            info.setReturnValue(null);
    }


}
