package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.gui.GuiSpriteScaling.NineSlice.Border.class)
public class Border982311671Mixin {
        @Inject(at = @At("HEAD"), method = "bottom()I", cancellable = true)
    private void bottom_320323986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(320323986L))
            info.setReturnValue(-964679249);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_73685403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(73685403L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1752735196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1752735196L))
            info.setReturnValue("\uB3EFjlmE7B)\u4E44LGsG+W_#x#U0sVNRH");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1539663762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539663762L))
            info.setReturnValue(1471923527);
    }

    @Inject(at = @At("HEAD"), method = "top()I", cancellable = true)
    private void top__36731736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-36731736L))
            info.setReturnValue(-805932250);
    }

    @Inject(at = @At("HEAD"), method = "left()I", cancellable = true)
    private void left__1623718602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623718602L))
            info.setReturnValue(-1482056568);
    }

    @Inject(at = @At("HEAD"), method = "right()I", cancellable = true)
    private void right__458364863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-458364863L))
            info.setReturnValue(1204111290);
    }


}
