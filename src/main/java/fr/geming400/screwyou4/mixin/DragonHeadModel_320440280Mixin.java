package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.skull.DragonHeadModel.class)
public class DragonHeadModel_320440280Mixin {
        @Inject(at = @At("HEAD"), method = "createHeadLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createHeadLayer__393691885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-393691885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1706077158(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1706077158L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/model/object/skull/SkullModelBase$State;)V", cancellable = true)
    private void setupAnim__871637789(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-871637789L))
            info.cancel();
    }


}
