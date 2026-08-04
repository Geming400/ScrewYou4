package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.effect.MobEffects.class)
public class MobEffects1154320466Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void bootstrap__1717277276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1717277276L))
            info.setReturnValue(null);
    }


}
