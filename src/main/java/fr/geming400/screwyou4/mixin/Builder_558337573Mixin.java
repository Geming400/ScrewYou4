package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldSelectionList.Builder.class)
public class Builder_558337573Mixin {
        @Inject(at = @At("HEAD"), method = "filter(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$Builder;", cancellable = true)
    private void filter_1349971144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349971144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList;", cancellable = true)
    private void build_1608313919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1608313919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width(I)Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$Builder;", cancellable = true)
    private void width__765514117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-765514117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "oldList(Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList;)Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$Builder;", cancellable = true)
    private void oldList__1996384687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1996384687L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height(I)Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$Builder;", cancellable = true)
    private void height_40395066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(40395066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uploadWorld()Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$Builder;", cancellable = true)
    private void uploadWorld_492994987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(492994987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onEntrySelect(Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$Builder;", cancellable = true)
    private void onEntrySelect_1012389217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012389217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onEntryInteract(Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$Builder;", cancellable = true)
    private void onEntryInteract_1845551911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1845551911L))
            info.setReturnValue(null);
    }


}
