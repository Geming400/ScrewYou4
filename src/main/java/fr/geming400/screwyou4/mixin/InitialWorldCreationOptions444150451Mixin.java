package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.InitialWorldCreationOptions.class)
public class InitialWorldCreationOptions444150451Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__464475817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-464475817L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1214573976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1214573976L))
            info.setReturnValue("\u3DEA&TE\u34C5Vt\u12DEImpM=OH!''A\u2B53}\uA3F7\u93DD puE.'\u1F0F}\u08E9B?D52-K}-Rw9\uBBD8wIUa \u04EAh0Q&0.V>\u2C16U=NXQF)4dDCF:.8\u8071Rx&]w|9tK");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1001502542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1001502542L))
            info.setReturnValue(1812982100);
    }

    @Inject(at = @At("HEAD"), method = "selectedGameMode()Lnet/minecraft/client/gui/screens/worldselection/WorldCreationUiState$SelectedGameMode;", cancellable = true)
    private void selectedGameMode_1952796552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952796552L))
            info.setReturnValue(net.minecraft.client.gui.screens.worldselection.WorldCreationUiState.SelectedGameMode.SURVIVAL);
    }

    @Inject(at = @At("HEAD"), method = "flatLevelPreset()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void flatLevelPreset__1648018214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1648018214L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameRuleOverwrites()Lnet/minecraft/world/level/gamerules/GameRuleMap;", cancellable = true)
    private void gameRuleOverwrites_375629369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(375629369L))
            info.setReturnValue(null);
    }


}
