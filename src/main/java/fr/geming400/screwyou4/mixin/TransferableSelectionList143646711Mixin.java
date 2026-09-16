package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.packs.TransferableSelectionList.class)
public class TransferableSelectionList143646711Mixin {
        @Inject(at = @At("HEAD"), method = "updateList(Ljava/util/stream/Stream;Lnet/minecraft/client/gui/screens/packs/PackSelectionModel$EntryBase;)V", cancellable = true)
    private void updateList__266275588(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-266275588L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_112593080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112593080L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRowWidth()I", cancellable = true)
    private void getRowWidth__1649574501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1649574501L))
            info.setReturnValue(-399814846);
    }


}
