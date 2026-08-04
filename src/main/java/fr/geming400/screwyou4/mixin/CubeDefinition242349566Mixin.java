package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.builders.CubeDefinition.class)
public class CubeDefinition242349566Mixin {
        @Inject(at = @At("HEAD"), method = "bake(II)Lnet/minecraft/client/model/geom/ModelPart$Cube;", cancellable = true)
    private void bake__1661327534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1661327534L))
            info.setReturnValue(null);
    }


}
