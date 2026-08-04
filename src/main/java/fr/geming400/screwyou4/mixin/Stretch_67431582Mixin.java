package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.gui.GuiSpriteScaling.Stretch.class)
public class Stretch_67431582Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/resources/metadata/gui/GuiSpriteScaling$Type;", cancellable = true)
    private void type__1893356988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1893356988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1452943840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452943840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1068028394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1068028394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_105694323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(105694323L))
            info.setReturnValue(null);
    }


}
