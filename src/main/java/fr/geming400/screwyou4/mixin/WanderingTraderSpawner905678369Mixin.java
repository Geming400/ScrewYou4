package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.npc.wanderingtrader.WanderingTraderSpawner.class)
public class WanderingTraderSpawner905678369Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;Z)V", cancellable = true)
    private void tick__328358902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-328358902L))
            info.cancel();
    }


}
