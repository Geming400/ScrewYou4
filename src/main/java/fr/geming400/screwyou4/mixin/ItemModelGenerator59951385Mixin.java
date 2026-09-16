package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.ItemModelGenerator.class)
public class ItemModelGenerator59951385Mixin {
        @Inject(at = @At("HEAD"), method = "textureSlots()Lnet/minecraft/client/resources/model/sprite/TextureSlots$Data;", cancellable = true)
    private void textureSlots_788868601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788868601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "guiLight()Lnet/minecraft/client/resources/model/UnbakedModel$GuiLight;", cancellable = true)
    private void guiLight_2030296282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2030296282L))
            info.setReturnValue(net.minecraft.client.resources.model.UnbakedModel.GuiLight.SIDE);
    }

    @Inject(at = @At("HEAD"), method = "geometry()Lnet/minecraft/client/resources/model/geometry/UnbakedGeometry;", cancellable = true)
    private void geometry__687823580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-687823580L))
            info.setReturnValue(null);
    }


}
