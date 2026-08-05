package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.narration.NarrationThunk.class)
public class NarrationThunk1137210606Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1772244927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772244927L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1175472852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1175472852L))
            info.setReturnValue(-1694629445);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljava/util/List;)Lnet/minecraft/client/gui/narration/NarrationThunk;", cancellable = true)
    private static void from__1820201554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820201554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljava/lang/String;)Lnet/minecraft/client/gui/narration/NarrationThunk;", cancellable = true)
    private static void from_1671075527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671075527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/narration/NarrationThunk;", cancellable = true)
    private static void from__1734136495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1734136495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getText(Ljava/util/function/Consumer;)V", cancellable = true)
    private void getText_1818227019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1818227019L))
            info.cancel();
    }


}
