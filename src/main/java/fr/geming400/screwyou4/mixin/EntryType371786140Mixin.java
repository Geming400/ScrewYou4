package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldSelectionList.EntryType.class)
public class EntryType371786140Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$EntryType;", cancellable = true)
    private static void values_547718992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(547718992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$EntryType;", cancellable = true)
    private static void valueOf__598154601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-598154601L))
            info.setReturnValue(net.minecraft.client.gui.screens.worldselection.WorldSelectionList.EntryType.SINGLEPLAYER);
    }


}
