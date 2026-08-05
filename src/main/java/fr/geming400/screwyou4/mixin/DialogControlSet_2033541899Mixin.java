package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.dialog.DialogControlSet.class)
public class DialogControlSet_2033541899Mixin {
        @Inject(at = @At("HEAD"), method = "createActionButton(Lnet/minecraft/server/dialog/ActionButton;)Lnet/minecraft/client/gui/components/Button$Builder;", cancellable = true)
    private void createActionButton_564560386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(564560386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addInput(Lnet/minecraft/server/dialog/Input;Ljava/util/function/Consumer;)V", cancellable = true)
    private void addInput_1451520619(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1451520619L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bindAction(Ljava/util/Optional;)Ljava/util/function/Supplier;", cancellable = true)
    private void bindAction__1037007110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1037007110L))
            info.setReturnValue(null);
    }


}
