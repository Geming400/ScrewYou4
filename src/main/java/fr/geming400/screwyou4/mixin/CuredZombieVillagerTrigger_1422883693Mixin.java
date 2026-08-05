package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.CuredZombieVillagerTrigger.class)
public class CuredZombieVillagerTrigger_1422883693Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/monster/zombie/Zombie;Lnet/minecraft/world/entity/npc/villager/Villager;)V", cancellable = true)
    private void trigger_696501728(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(696501728L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__381825848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381825848L))
            info.setReturnValue(null);
    }


}
