package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.UnbakedModel.GuiLight.class)
public class GuiLight_805662094Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/resources/model/UnbakedModel$GuiLight;", cancellable = true)
    private static void values__1459402366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1459402366L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/resources/model/UnbakedModel$GuiLight;", cancellable = true)
    private static void valueOf__22300535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-22300535L))
            info.setReturnValue(net.minecraft.client.resources.model.UnbakedModel.GuiLight.FRONT);
    }

    @Inject(at = @At("HEAD"), method = "getByName(Ljava/lang/String;)Lnet/minecraft/client/resources/model/UnbakedModel$GuiLight;", cancellable = true)
    private static void getByName__87942183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-87942183L))
            info.setReturnValue(net.minecraft.client.resources.model.UnbakedModel.GuiLight.SIDE);
    }

    @Inject(at = @At("HEAD"), method = "lightLikeBlock()Z", cancellable = true)
    private void lightLikeBlock__97833852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-97833852L))
            info.setReturnValue(true);
    }


}
