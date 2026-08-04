package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.DialogAction.class)
public class DialogAction_1647144102Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/dialog/DialogAction;", cancellable = true)
    private static void values__1993449481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1993449481L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/dialog/DialogAction;", cancellable = true)
    private static void valueOf__1794715084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1794715084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_511683630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511683630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "willUnpause()Z", cancellable = true)
    private void willUnpause_1685422684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1685422684L))
            info.setReturnValue(null);
    }


}
