package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.InitialWorldCreationOptions.class)
public class InitialWorldCreationOptions444150451Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1829662710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1829662710L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__691309524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-691309524L))
            info.setReturnValue("4RyWT\u2130Fo\uCD23X6=\u91E6Hg4MN\uB910\u8F9E\uC40D$GTCW\u1318WK]X3-T>d#|$|unNh[W;]R/`{3i)E\u5589\u1EC5/\u893E9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_482413193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482413193L))
            info.setReturnValue(-1024330362);
    }

    @Inject(at = @At("HEAD"), method = "gameRuleOverwrites()Lnet/minecraft/world/level/gamerules/GameRuleMap;", cancellable = true)
    private void gameRuleOverwrites__709502097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-709502097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flatLevelPreset()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void flatLevelPreset_1252641764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252641764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectedGameMode()Lnet/minecraft/client/gui/screens/worldselection/WorldCreationUiState$SelectedGameMode;", cancellable = true)
    private void selectedGameMode_420696568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(420696568L))
            info.setReturnValue(net.minecraft.client.gui.screens.worldselection.WorldCreationUiState.SelectedGameMode.DEBUG);
    }


}
