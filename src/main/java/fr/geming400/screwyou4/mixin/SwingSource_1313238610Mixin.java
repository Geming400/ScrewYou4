package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.InteractionResult.SwingSource.class)
public class SwingSource_1313238610Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/InteractionResult$SwingSource;", cancellable = true)
    private static void values_1028746371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1028746371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/InteractionResult$SwingSource;", cancellable = true)
    private static void valueOf__909530724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-909530724L))
            info.setReturnValue(net.minecraft.world.InteractionResult.SwingSource.NONE);
    }


}
