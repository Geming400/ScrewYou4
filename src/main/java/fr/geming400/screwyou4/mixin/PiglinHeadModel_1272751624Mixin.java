package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.skull.PiglinHeadModel.class)
public class PiglinHeadModel_1272751624Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1956400168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1956400168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/model/object/skull/SkullModelBase$State;)V", cancellable = true)
    private void setupAnim__1056298459(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1056298459L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createHeadModel()Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createHeadModel__1163780804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163780804L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.MeshDefinition());
    }


}
