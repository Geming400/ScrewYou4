package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldSelectionList.Builder.class)
public class Builder_558337573Mixin {
        @Inject(at = @At("HEAD"), method = "filter(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$Builder;", cancellable = true)
    private void filter__856768688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-856768688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList;", cancellable = true)
    private void build__1048976431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1048976431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width(I)Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$Builder;", cancellable = true)
    private void width_142452609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(142452609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "oldList(Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList;)Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$Builder;", cancellable = true)
    private void oldList__1502534804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502534804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height(I)Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$Builder;", cancellable = true)
    private void height_142452609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(142452609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onEntryInteract(Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$Builder;", cancellable = true)
    private void onEntryInteract__291921488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-291921488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onEntrySelect(Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$Builder;", cancellable = true)
    private void onEntrySelect__291921488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-291921488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uploadWorld()Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$Builder;", cancellable = true)
    private void uploadWorld_1495799194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495799194L))
            info.setReturnValue(null);
    }


}
