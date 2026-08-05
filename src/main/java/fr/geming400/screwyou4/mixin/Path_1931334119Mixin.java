package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.ComponentPath.Path.class)
public class Path_1931334119Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__978120919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-978120919L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_795874143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(795874143L))
            info.setReturnValue("80>oO$*1jJr|K*rᶔﷹ#c|iq/F#QOA'!jrJ8tM弿:J]O@T쒽Y.}Oޘ((]:JuK/oiw㱤p\"gow2u蒨N$QL&5F$iapJ^<*tD");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1969596860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1969596860L))
            info.setReturnValue(97284860);
    }

    @Inject(at = @At("HEAD"), method = "component()Lnet/minecraft/client/gui/components/events/GuiEventListener;", cancellable = true)
    private void component_2017499702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017499702L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "component()Lnet/minecraft/client/gui/components/events/ContainerEventHandler;", cancellable = true)
    private void component_1523561124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1523561124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "childPath()Lnet/minecraft/client/gui/ComponentPath;", cancellable = true)
    private void childPath__408577866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-408577866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leafComponent()Lnet/minecraft/client/gui/components/events/GuiEventListener;", cancellable = true)
    private void leafComponent_2017370742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017370742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyFocus(Z)V", cancellable = true)
    private void applyFocus__1134016349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1134016349L))
            info.cancel();
    }


}
