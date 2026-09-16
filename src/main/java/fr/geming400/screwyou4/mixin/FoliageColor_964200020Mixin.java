package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.FoliageColor.class)
public class FoliageColor_964200020Mixin {
        @Inject(at = @At("HEAD"), method = "get(DD)I", cancellable = true)
    private static void get__807247973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-807247973L))
            info.setReturnValue(-167546940);
    }

    @Inject(at = @At("HEAD"), method = "init([I)V", cancellable = true)
    private static void init_139043132(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(139043132L))
            info.cancel();
    }


}
