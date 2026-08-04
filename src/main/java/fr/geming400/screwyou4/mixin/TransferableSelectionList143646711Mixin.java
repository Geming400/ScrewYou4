package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.packs.TransferableSelectionList.class)
public class TransferableSelectionList143646711Mixin {
        @Inject(at = @At("HEAD"), method = "getRowWidth()I", cancellable = true)
    private void getRowWidth_181908957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181908957L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__772989003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-772989003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateList(Ljava/util/stream/Stream;Lnet/minecraft/client/gui/screens/packs/PackSelectionModel$EntryBase;)V", cancellable = true)
    private void updateList__2003688605(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2003688605L))
            info.cancel();
    }


}
