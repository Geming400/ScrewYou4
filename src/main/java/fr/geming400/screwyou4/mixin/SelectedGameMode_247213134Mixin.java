package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldCreationUiState.SelectedGameMode.class)
public class SelectedGameMode_247213134Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/screens/worldselection/WorldCreationUiState$SelectedGameMode;", cancellable = true)
    private static void values__999002541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-999002541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/worldselection/WorldCreationUiState$SelectedGameMode;", cancellable = true)
    private static void valueOf_1572197100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1572197100L))
            info.setReturnValue(net.minecraft.client.gui.screens.worldselection.WorldCreationUiState.SelectedGameMode.HARDCORE);
    }

    @Inject(at = @At("HEAD"), method = "getInfo()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getInfo__882946812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882946812L))
            info.setReturnValue(null);
    }


}
