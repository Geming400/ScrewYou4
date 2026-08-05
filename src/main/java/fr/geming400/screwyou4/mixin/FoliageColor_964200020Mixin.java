package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.FoliageColor.class)
public class FoliageColor_964200020Mixin {
        @Inject(at = @At("HEAD"), method = "get(DD)I", cancellable = true)
    private static void get__179455055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-179455055L))
            info.setReturnValue(-162881708);
    }

    @Inject(at = @At("HEAD"), method = "init([I)V", cancellable = true)
    private static void init_483645516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(483645516L))
            info.cancel();
    }


}
