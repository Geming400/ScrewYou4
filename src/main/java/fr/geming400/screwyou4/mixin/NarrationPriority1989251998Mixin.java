package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.narration.NarratableEntry.NarrationPriority.class)
public class NarrationPriority1989251998Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/narration/NarratableEntry$NarrationPriority;", cancellable = true)
    private static void values__1239454598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1239454598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/narration/NarratableEntry$NarrationPriority;", cancellable = true)
    private static void valueOf_2042777911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042777911L))
            info.setReturnValue(net.minecraft.client.gui.narration.NarratableEntry.NarrationPriority.NONE);
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal_2027530581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2027530581L))
            info.setReturnValue(false);
    }


}
