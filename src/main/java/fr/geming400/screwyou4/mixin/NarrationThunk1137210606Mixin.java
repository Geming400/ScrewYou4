package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.narration.NarrationThunk.class)
public class NarrationThunk1137210606Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_228583842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(228583842L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1694562201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1694562201L))
            info.setReturnValue(-1518185548);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljava/util/List;)Lnet/minecraft/client/gui/narration/NarrationThunk;", cancellable = true)
    private static void from__1188162876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1188162876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljava/lang/String;)Lnet/minecraft/client/gui/narration/NarrationThunk;", cancellable = true)
    private static void from__825110947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-825110947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/narration/NarrationThunk;", cancellable = true)
    private static void from__2135376409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2135376409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getText(Ljava/util/function/Consumer;)V", cancellable = true)
    private void getText_1010595374(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1010595374L))
            info.cancel();
    }


}
