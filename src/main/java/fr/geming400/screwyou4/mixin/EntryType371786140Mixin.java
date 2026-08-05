package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldSelectionList.EntryType.class)
public class EntryType371786140Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$EntryType;", cancellable = true)
    private static void values_383761330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(383761330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$EntryType;", cancellable = true)
    private static void valueOf__2115726481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2115726481L))
            info.setReturnValue(net.minecraft.client.gui.screens.worldselection.WorldSelectionList.EntryType.SINGLEPLAYER);
    }


}
