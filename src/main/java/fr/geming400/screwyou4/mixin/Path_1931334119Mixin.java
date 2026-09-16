package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.ComponentPath.Path.class)
public class Path_1931334119Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1022707850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1022707850L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1593209653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1593209653L))
            info.setReturnValue(" nF\u49DE\uCA9E)\u4AE2$cYJ9,=\uB448mKVq0fb\u0D0EES{%hWWW,KH\uB76AI7[p\uAB0EqW^cW\u012CB64\uCF91MsAiZ\u2951Cz9Ly\"&69U9?usc\u0C99H!gfcHbWOF@\uD774y/{]WqIUG");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1806281087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1806281087L))
            info.setReturnValue(1170818697);
    }

    @Inject(at = @At("HEAD"), method = "component()Lnet/minecraft/client/gui/components/events/GuiEventListener;", cancellable = true)
    private void component_2037286105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2037286105L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "component()Lnet/minecraft/client/gui/components/events/ContainerEventHandler;", cancellable = true)
    private void component_1911158241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1911158241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leafComponent()Lnet/minecraft/client/gui/components/events/GuiEventListener;", cancellable = true)
    private void leafComponent__1417610473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1417610473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "childPath()Lnet/minecraft/client/gui/ComponentPath;", cancellable = true)
    private void childPath_214870679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(214870679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyFocus(Z)V", cancellable = true)
    private void applyFocus__836767955(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-836767955L))
            info.cancel();
    }


}
