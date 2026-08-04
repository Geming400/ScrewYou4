package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.JukeboxTicksSinceSongStartedFix.class)
public class JukeboxTicksSinceSongStartedFix799911045Mixin {
        @Inject(at = @At("HEAD"), method = "fixTag(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void fixTag__1587938620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1587938620L))
            info.setReturnValue(null);
    }


}
