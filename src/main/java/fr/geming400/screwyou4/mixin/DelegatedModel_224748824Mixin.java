package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.model.DelegatedModel.class)
public class DelegatedModel_224748824Mixin {
        @Inject(at = @At("HEAD"), method = "get()Lcom/google/gson/JsonElement;", cancellable = true)
    private void get_802625315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(802625315L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get()Ljava/lang/Object;", cancellable = true)
    private void get_2084070002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2084070002L))
            info.setReturnValue(null);
    }


}
