package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.UnbakedModel.GuiLight.class)
public class GuiLight_805662094Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/resources/model/UnbakedModel$GuiLight;", cancellable = true)
    private static void values__1300417948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1300417948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/resources/model/UnbakedModel$GuiLight;", cancellable = true)
    private static void valueOf_1500933985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1500933985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getByName(Ljava/lang/String;)Lnet/minecraft/client/resources/model/UnbakedModel$GuiLight;", cancellable = true)
    private static void getByName_1500933985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1500933985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightLikeBlock()Z", cancellable = true)
    private void lightLikeBlock_843940676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843940676L))
            info.setReturnValue(null);
    }


}
