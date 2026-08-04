package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.gui.GuiSpriteScaling.NineSlice.class)
public class NineSlice1839483613Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/resources/metadata/gui/GuiSpriteScaling$Type;", cancellable = true)
    private void type__121304956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-121304956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1069971424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1069971424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_704023638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704023638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1877746355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1877746355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_1877745859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1877745859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stretchInner()Z", cancellable = true)
    private void stretchInner_1877762196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1877762196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "border()Lnet/minecraft/client/resources/metadata/gui/GuiSpriteScaling$NineSlice$Border;", cancellable = true)
    private void border_998475406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(998475406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_1877745859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1877745859L))
            info.setReturnValue(null);
    }


}
