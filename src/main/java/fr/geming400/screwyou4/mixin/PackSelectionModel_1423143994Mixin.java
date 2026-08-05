package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.packs.PackSelectionModel.class)
public class PackSelectionModel_1423143994Mixin {
        @Inject(at = @At("HEAD"), method = "commit()V", cancellable = true)
    private void commit_1461418732(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1461418732L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUnselected()Ljava/util/stream/Stream;", cancellable = true)
    private void getUnselected_1212437678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1212437678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findNewPacks()V", cancellable = true)
    private void findNewPacks_1461418732(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1461418732L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelected()Ljava/util/stream/Stream;", cancellable = true)
    private void getSelected_1212437678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1212437678L))
            info.setReturnValue(null);
    }


}
