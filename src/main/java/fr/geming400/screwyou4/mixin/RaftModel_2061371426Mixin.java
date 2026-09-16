package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.boat.RaftModel.class)
public class RaftModel_2061371426Mixin {
        @Inject(at = @At("HEAD"), method = "createRaftModel()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createRaftModel__2002605651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2002605651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createChestRaftModel()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createChestRaftModel__387733724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-387733724L))
            info.setReturnValue(null);
    }


}
