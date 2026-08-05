package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.narration.NarratableEntry.NarrationPriority.class)
public class NarrationPriority1989251998Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/narration/NarratableEntry$NarrationPriority;", cancellable = true)
    private static void values__1140738536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1140738536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/narration/NarratableEntry$NarrationPriority;", cancellable = true)
    private static void valueOf_1533823071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1533823071L))
            info.setReturnValue(net.minecraft.client.gui.narration.NarratableEntry.NarrationPriority.NONE);
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal__1643799729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643799729L))
            info.setReturnValue(true);
    }


}
