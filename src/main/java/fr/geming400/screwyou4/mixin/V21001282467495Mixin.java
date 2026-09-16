package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V2100.class)
public class V21001282467495Mixin {
        @Inject(at = @At("HEAD"), method = "registerBlockEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerBlockEntities__1542313552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542313552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerEntities_619181527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(619181527L))
            info.setReturnValue(null);
    }


}
