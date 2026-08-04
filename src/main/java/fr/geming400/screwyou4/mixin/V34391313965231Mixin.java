package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V3439.class)
public class V34391313965231Mixin {
        @Inject(at = @At("HEAD"), method = "sign(Lcom/mojang/datafixers/schemas/Schema;)Lcom/mojang/datafixers/types/templates/TypeTemplate;", cancellable = true)
    private static void sign__1434587004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1434587004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerBlockEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerBlockEntities__748269853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748269853L))
            info.setReturnValue(null);
    }


}
