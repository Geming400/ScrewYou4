package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.MultiVariantGenerator.Empty.class)
public class Empty953616266Mixin {
        @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;)Lnet/minecraft/client/data/models/blockstates/MultiVariantGenerator;", cancellable = true)
    private void with_984328617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984328617L))
            info.setReturnValue(null);
    }


}
