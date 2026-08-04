package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetFireworkExplosionFunction.class)
public class SetFireworkExplosionFunction1781337586Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__777775986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-777775986L))
            info.setReturnValue(null);
    }


}
