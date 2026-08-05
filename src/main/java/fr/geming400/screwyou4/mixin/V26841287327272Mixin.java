package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V2684.class)
public class V26841287327272Mixin {
        @Inject(at = @At("HEAD"), method = "registerBlockEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerBlockEntities__774907812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-774907812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerTypes(Lcom/mojang/datafixers/schemas/Schema;Ljava/util/Map;Ljava/util/Map;)V", cancellable = true)
    private void registerTypes__666572089(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-666572089L))
            info.cancel();
    }


}
