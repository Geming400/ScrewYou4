package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.breeze.LongJump.class)
public class LongJump_2002508128Mixin {
        @Inject(at = @At("HEAD"), method = "canRun(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/monster/breeze/Breeze;)Z", cancellable = true)
    private static void canRun__517299025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-517299025L))
            info.setReturnValue(null);
    }


}
