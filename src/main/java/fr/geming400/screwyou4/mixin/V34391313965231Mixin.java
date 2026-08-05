package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V3439.class)
public class V34391313965231Mixin {
        @Inject(at = @At("HEAD"), method = "sign(Lcom/mojang/datafixers/schemas/Schema;)Lcom/mojang/datafixers/types/templates/TypeTemplate;", cancellable = true)
    private static void sign_1497922945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497922945L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerBlockEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerBlockEntities__1510815816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1510815816L))
            info.setReturnValue(null);
    }


}
