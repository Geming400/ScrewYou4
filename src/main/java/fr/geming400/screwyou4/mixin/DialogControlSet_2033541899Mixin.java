package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.dialog.DialogControlSet.class)
public class DialogControlSet_2033541899Mixin {
        @Inject(at = @At("HEAD"), method = "createActionButton(Lnet/minecraft/server/dialog/ActionButton;)Lnet/minecraft/client/gui/components/Button$Builder;", cancellable = true)
    private void createActionButton_1344750886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1344750886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addInput(Lnet/minecraft/server/dialog/Input;Ljava/util/function/Consumer;)V", cancellable = true)
    private void addInput_1350627426(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1350627426L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bindAction(Ljava/util/Optional;)Ljava/util/function/Supplier;", cancellable = true)
    private void bindAction__1403406329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1403406329L))
            info.setReturnValue(null);
    }


}
