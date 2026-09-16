package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.gui.GuiSpriteScaling.Tile.class)
public class Tile619367477Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/resources/metadata/gui/GuiSpriteScaling$Type;", cancellable = true)
    private void type_386602338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(386602338L))
            info.setReturnValue(net.minecraft.client.resources.metadata.gui.GuiSpriteScaling.Type.STRETCH);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__289258791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-289258791L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1389791002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1389791002L))
            info.setReturnValue("I}_+]<;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1176719568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1176719568L))
            info.setReturnValue(-1670667686);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__1020780523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1020780523L))
            info.setReturnValue(-1422781128);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height__465981100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-465981100L))
            info.setReturnValue(-1041422529);
    }


}
