package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.InteractionResult.SwingSource.class)
public class SwingSource_1313238610Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/InteractionResult$SwingSource;", cancellable = true)
    private static void values__1707238047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707238047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/InteractionResult$SwingSource;", cancellable = true)
    private static void valueOf_1262837700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262837700L))
            info.setReturnValue(net.minecraft.world.InteractionResult.SwingSource.NONE);
    }


}
