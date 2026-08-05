package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.gui.GuiSpriteScaling.Tile.class)
public class Tile619367477Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/resources/metadata/gui/GuiSpriteScaling$Type;", cancellable = true)
    private void type__1341421092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1341421092L))
            info.setReturnValue(net.minecraft.client.resources.metadata.gui.GuiSpriteScaling.Type.TILE);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2004879736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2004879736L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__516092498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-516092498L))
            info.setReturnValue("V/K\u4A46;}=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_657630219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(657630219L))
            info.setReturnValue(-332682703);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_657629723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(657629723L))
            info.setReturnValue(-129535283);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_657629723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(657629723L))
            info.setReturnValue(-129535283);
    }


}
