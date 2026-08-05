package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.slime.SmallSulfurCubeModel.class)
public class SmallSulfurCubeModel650118374Mixin {
        @Inject(at = @At("HEAD"), method = "createOuterBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createOuterBodyLayer_1943692498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1943692498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createInnerBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createInnerBodyLayer__555330921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-555330921L))
            info.setReturnValue(null);
    }


}
