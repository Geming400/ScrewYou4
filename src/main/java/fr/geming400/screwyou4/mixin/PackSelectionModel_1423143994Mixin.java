package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.packs.PackSelectionModel.class)
public class PackSelectionModel_1423143994Mixin {
        @Inject(at = @At("HEAD"), method = "commit()V", cancellable = true)
    private void commit__1412924395(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1412924395L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelected()Ljava/util/stream/Stream;", cancellable = true)
    private void getSelected_1560906301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1560906301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUnselected()Ljava/util/stream/Stream;", cancellable = true)
    private void getUnselected__613192508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-613192508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findNewPacks()V", cancellable = true)
    private void findNewPacks_1397195321(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1397195321L))
            info.cancel();
    }


}
