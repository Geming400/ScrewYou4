package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.skull.PiglinHeadModel.class)
public class PiglinHeadModel_1272751624Mixin {
        @Inject(at = @At("HEAD"), method = "createHeadModel()Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createHeadModel__1405516375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1405516375L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.MeshDefinition());
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1636578794(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1636578794L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/model/object/skull/SkullModelBase$State;)V", cancellable = true)
    private void setupAnim_80673555(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(80673555L))
            info.cancel();
    }


}
