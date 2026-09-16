package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.AbstractScrollArea.ScrollbarSettings.class)
public class ScrollbarSettings1505224627Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_596598359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(596598359L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2019319144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2019319144L))
            info.setReturnValue("}V`d\u4C04JSd@f\uA3B4=F\u758BmT1,\uF965Hl/2,z)S\"'N|Hig{n!\u78E1Yp.9a/0\uAB84+0bG\u93E9k\u70FDiDpD$\u19C6V\u0625\u24FC; =w7j\uF938\"']BY=Qpl\uB7BAq");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2062576718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2062576718L))
            info.setReturnValue(-349512514);
    }

    @Inject(at = @At("HEAD"), method = "scrollRate()I", cancellable = true)
    private void scrollRate__48886676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-48886676L))
            info.setReturnValue(681573686);
    }

    @Inject(at = @At("HEAD"), method = "resizingScrollbar()Z", cancellable = true)
    private void resizingScrollbar_491646421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(491646421L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "scrollbarWidth()I", cancellable = true)
    private void scrollbarWidth_1225860697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1225860697L))
            info.setReturnValue(253206497);
    }

    @Inject(at = @At("HEAD"), method = "disabledScrollerSprite()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void disabledScrollerSprite__1182441163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1182441163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scrollbarMinHeight()I", cancellable = true)
    private void scrollbarMinHeight_32448230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(32448230L))
            info.setReturnValue(1196414553);
    }

    @Inject(at = @At("HEAD"), method = "scrollerSprite()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void scrollerSprite_623194009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(623194009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backgroundSprite()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void backgroundSprite_1268417933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1268417933L))
            info.setReturnValue(null);
    }


}
