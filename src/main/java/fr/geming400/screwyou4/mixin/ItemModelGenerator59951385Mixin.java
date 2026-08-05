package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.ItemModelGenerator.class)
public class ItemModelGenerator59951385Mixin {
        @Inject(at = @At("HEAD"), method = "textureSlots()Lnet/minecraft/client/resources/model/sprite/TextureSlots$Data;", cancellable = true)
    private void textureSlots_1992519187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1992519187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "guiLight()Lnet/minecraft/client/resources/model/UnbakedModel$GuiLight;", cancellable = true)
    private void guiLight_1337390143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1337390143L))
            info.setReturnValue(net.minecraft.client.resources.model.UnbakedModel.GuiLight.FRONT);
    }

    @Inject(at = @At("HEAD"), method = "geometry()Lnet/minecraft/client/resources/model/geometry/UnbakedGeometry;", cancellable = true)
    private void geometry_153832150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153832150L))
            info.setReturnValue(null);
    }


}
